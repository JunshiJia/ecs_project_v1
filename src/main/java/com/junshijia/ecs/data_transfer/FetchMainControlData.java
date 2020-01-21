package com.junshijia.ecs.data_transfer;

import com.junshijia.ecs.domain.AnyOneSecData2DB;
import com.junshijia.ecs.domain.OneSecData2DB_old;
import com.junshijia.ecs.domain.UpdateData2DB_old;
import com.junshijia.ecs.status.TurbineStatus;
import com.junshijia.ecs.util.EcsUtils;
import com.serotonin.modbus4j.BatchRead;
import com.serotonin.modbus4j.BatchResults;
import com.serotonin.modbus4j.ModbusFactory;
import com.serotonin.modbus4j.ModbusMaster;
import com.serotonin.modbus4j.exception.ErrorResponseException;
import com.serotonin.modbus4j.exception.ModbusInitException;
import com.serotonin.modbus4j.exception.ModbusTransportException;
import com.serotonin.modbus4j.ip.IpParameters;

import org.apache.log4j.Logger;


import java.util.Set;

public class FetchMainControlData {
    //log
    private Logger log;
    //turbine status
    private TurbineStatus status;
    //modbus para
    private IpParameters ipParameters;
    private ModbusFactory factory;
    private ModbusMaster master;
    private BatchRead<Integer> updateBatch;
    private BatchRead<Integer> oneSecBatch;
    private BatchRead<Integer> anyOneSecBatch;
    //address ip port
    private int port;
    private String ip;
    private int id;
    //encoding set
    private Set<String> updateSet;
    private Set<String> oneSecSet;
    private Set<String> anyOneSecSet;
    //domain
    private UpdateData2DB_old DBUpdateData;
    private OneSecData2DB_old oneSecData;
    private AnyOneSecData2DB anyOneSecData;

    public FetchMainControlData() {
    }

    public FetchMainControlData(Set<String> updateSet,Set<String> oneSecSet,Set<String> anyOneSecSet) {
        this.DBUpdateData = new UpdateData2DB_old();
        this.oneSecData = new OneSecData2DB_old();
        this.anyOneSecData = new AnyOneSecData2DB();
        this.updateSet = updateSet;
        this.oneSecSet = oneSecSet;
        this.anyOneSecSet = anyOneSecSet;
        this.log = Logger.getLogger(FetchMainControlData.class);
        this.setIpPortAdd();
        this.ipParameters = new IpParameters();
        ipParameters.setHost(this.ip);
        ipParameters.setPort(this.port);
        this.factory = new ModbusFactory();
        this.status = new TurbineStatus();
    }

    private void setMasterAndInit(){
        this.master = factory.createTcpMaster(this.ipParameters, true);
        this.master.setTimeout(4000);
        this.master.setRetries(1);
        this.updateBatch = new BatchRead<>();
        this.oneSecBatch = new BatchRead<>();
        this.anyOneSecBatch = new BatchRead<>();
        boolean flag = true;
        while(flag) {
            try {
                this.master.init();
                flag = false;
            } catch (ModbusInitException e) {
                log.error("main control connection init error, wait 5min and re-init...");
                try {
                    Thread.sleep(300000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    private void setIpPortAdd(){
        this.ip = "127.0.0.1";
        this.port = 9876;
        this.id = 1;
    }

    public void readFromSlave2Domain() {
        boolean flag = true;
        this.setMasterAndInit();
        //1.add batch locator
        this.updateBatch = EcsUtils.addBatchLocator(this.updateBatch, this.updateSet);
        this.oneSecBatch = EcsUtils.addBatchLocator(this.oneSecBatch,this.oneSecSet);
        this.anyOneSecBatch = EcsUtils.addBatchLocator(this.anyOneSecBatch,this.anyOneSecSet);

        //2.read modbus data 2 map/list
        while (flag) {
            try {
                BatchResults<Integer> updateResults = this.master.send(this.updateBatch);
                BatchResults<Integer> anyOneSecResults = this.master.send(this.anyOneSecBatch);
                EcsUtils.writeData2Domain(this.updateSet, updateResults, this.DBUpdateData);
                EcsUtils.writeData2Domain(this.anyOneSecSet, anyOneSecResults, this.anyOneSecData);

                //此处应该判断主状态
                this.status.setStatusCode(this.DBUpdateData.getC300219().intValue());
                if (!this.status.isRunning()) {
                    BatchResults<Integer> oneSecResults = this.master.send(this.oneSecBatch);
                    EcsUtils.writeData2Domain(this.oneSecSet, oneSecResults, this.oneSecData);
                }

                flag = false;
            } catch (ModbusTransportException | ErrorResponseException e) {
                log.error("Main control connection error, wait 5min and re-connect...");
                try {
                    Thread.sleep(300000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                this.setMasterAndInit();
            } finally {
                this.master.destroy();
            }
        }
    }

    public TurbineStatus getStatus() {
        return status;
    }

    //程序出口
    public UpdateData2DB_old getDBUpdateData() {
        return DBUpdateData;
    }

    public OneSecData2DB_old getOneSecData() {
        return oneSecData;
    }

    public AnyOneSecData2DB getAnyOneSecData() {
        return anyOneSecData;
    }
}

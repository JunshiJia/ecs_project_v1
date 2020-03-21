package com.junshijia.ecs.data_transfer;

import com.junshijia.ecs.domain.AnyOneSecData2DB;
import com.junshijia.ecs.domain.OneSecData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.domain.UpdateData2DB;
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

import java.util.Map;

public class FetchMainControlData {
    //log
    private Logger log;
    //turbine status
    private TurbineStatus status;
    //modbus para
    private IpParameters ipParameters;
    private ModbusFactory factory;
    private ModbusMaster master;
    //batch and count
    private BatchRead<Integer> batch;
    private int oneSecCount;
    private int anyOneCount;
    private int tenMinCount;
    private BatchResults<Integer> results;
    //address ip port
    private int port;
    private String ip;
    private int id;
    //encoding map
    private Map<String, Integer> updateMap;
    private Map<String, Integer> oneSecMap;
    private Map<String, Integer> anyOneSecMap;
    private Map<String, Integer> tenMinMap;
    //domain
    private UpdateData2DB updateData;
    private OneSecData2DB oneSecData;
    private AnyOneSecData2DB anyOneSecData;
    private TenMinMemory tenMinMemory;
    //field names
    private String[] fieldNames;

    public FetchMainControlData(String ip, Map<String, Integer> updateMap, Map<String, Integer> oneSecMap,
                                Map<String, Integer> anyOneSecMap, Map<String, Integer> tenMinMap) {
        //domains
        this.updateData = new UpdateData2DB();
        this.oneSecData = new OneSecData2DB();
        this.anyOneSecData = new AnyOneSecData2DB();
        this.tenMinMemory = new TenMinMemory();
        //外部的maps
        this.updateMap = updateMap;
        this.oneSecMap = oneSecMap;
        this.anyOneSecMap = anyOneSecMap;
        this.tenMinMap = tenMinMap;
        //log
        this.log = Logger.getLogger(FetchMainControlData.class);
        //通讯信息
        this.setIpPortAdd(ip);
        this.ipParameters = new IpParameters();
        this.ipParameters.setHost(this.ip);
        this.ipParameters.setPort(this.port);
        this.factory = new ModbusFactory();
        this.fieldNames = EcsUtils.getFiledNames(tenMinMemory);
        this.batch = new BatchRead<>();
        this.addBatch();
        this.setMasterAndInit();
        this.status = new TurbineStatus();
    }

    private void setIpPortAdd(String ip){
        this.ip = ip;
        //this.ip = "127.0.0.1";
        this.port = 715;
        this.id = 1;
    }

    private void addBatch(){
        int count = 0;
        EcsUtils.addBatchLocator(this.batch, this.updateMap, count);

        count = this.updateMap.size();
        EcsUtils.addBatchLocator(this.batch, this.oneSecMap, count);

        count += this.oneSecMap.size();
        EcsUtils.addBatchLocator(this.batch, this.anyOneSecMap, count);

        count += this.anyOneSecMap.size();
        EcsUtils.addBatchLocator(this.batch, this.tenMinMap, count);

        this.oneSecCount = this.updateMap.size();
        this.anyOneCount = oneSecCount+this.oneSecMap.size();
        this.tenMinCount = anyOneCount+this.anyOneSecMap.size();
    }

    public void setMasterAndInit(){
        this.master = factory.createTcpMaster(this.ipParameters, true);
        this.master.setTimeout(4000);
        this.master.setRetries(1);

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

    public void readFromSlave2Domain() {
        boolean flag;
        //2.read modbus data 2 map/list
        flag = true;
        while (flag) {
            try {
                this.results = this.master.send(this.batch);
                //any1s + update + memoryData
                EcsUtils.writeData2Domain(this.updateMap, results, this.updateData,0);
                EcsUtils.writeData2Domain(this.anyOneSecMap, results, this.anyOneSecData, anyOneCount);
                EcsUtils.writeData2List(this.fieldNames, results, this.tenMinMemory, tenMinCount);
                //应该判断主状态,是否需要存1s
                this.status.setStatusCode(this.updateData.getHMI_IReg110().intValue());
                if (!this.status.isRunning()) {
                    EcsUtils.writeData2Domain(this.oneSecMap, results, this.oneSecData, oneSecCount);
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
            }
        }
    }

    public void readFromSlave2DomainThrow() throws ErrorResponseException, ModbusTransportException {
        boolean flag;
        //2.read modbus data 2 map/list
        flag = true;
        while (flag) {
            this.results = this.master.send(this.batch);
            //any1s + update + memoryData
            EcsUtils.writeData2Domain(this.updateMap, results, this.updateData,0);
            EcsUtils.writeData2Domain(this.anyOneSecMap, results, this.anyOneSecData, anyOneCount);
            EcsUtils.writeData2List(this.fieldNames, results, this.tenMinMemory, tenMinCount);
            //应该判断主状态,是否需要存1s
            this.status.setStatusCode(this.updateData.getHMI_IReg110().intValue());
            //if (!this.status.isRunning()) {
                EcsUtils.writeData2Domain(this.oneSecMap, results, this.oneSecData, oneSecCount);
            //}
            flag = false;
        }
    }

    public void renewMemory(){
        this.tenMinMemory = new TenMinMemory();
    }

    //程序出口
    public UpdateData2DB getUpdateData() {
        return updateData;
    }

    public OneSecData2DB getOneSecData() {
        return oneSecData;
    }

    public AnyOneSecData2DB getAnyOneSecData() {
        return anyOneSecData;
    }

    public TenMinMemory getTenMinMemoryData() {
        return tenMinMemory;
    }

    public String[] getFieldNames() {
        return fieldNames;
    }

    public boolean isStatusBool() {
        return this.status.isRunning();
    }
}

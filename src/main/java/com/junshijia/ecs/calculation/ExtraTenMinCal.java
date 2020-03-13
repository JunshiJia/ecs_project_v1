package com.junshijia.ecs.calculation;

import com.junshijia.ecs.domain.ExtraTenData2DB;
import com.junshijia.ecs.domain.OneSecData2DB;
import com.junshijia.ecs.domain.TenMinMemory;
import com.junshijia.ecs.domain.UpdateData2DB;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.math3.stat.StatUtils;

import java.util.Collections;
import java.util.Date;

public class ExtraTenMinCal {
    private ExtraTenData2DB data;
    //10 min data 2 db
    private TenMinMemory memoryData;
    private UpdateData2DB updateData;
    private OneSecData2DB oneSecData;
    //用于电量模块计算
    private float recordData[];
    //外部数据
    private int turbineArea;
    private int[] idealPower;

    public ExtraTenMinCal() {
        //1.风轮面积
        this.turbineArea = 100;
        this.idealPower = new int[30];
        for(int i = 0; i < 30; i++){
            idealPower[i] = i;
        }
    }

    public void InitData(ExtraTenData2DB data, UpdateData2DB updateData, OneSecData2DB oneSecData){
        //外部数据
        this.data = data;
        this.updateData = updateData;
        this.oneSecData = oneSecData;
        this.record();
    }

    public void setDataTenMinLaterAndCalculate(TenMinMemory memory, UpdateData2DB updateData, OneSecData2DB oneSecData){
        this.memoryData = memory;
        this.updateData = updateData;
        this.oneSecData = oneSecData;
        this.calculate();
    }
    public void calculate(){
        double value;
        //A3 A44-A46
        value = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg203List()));
        this.data.setA3(this.calBin(value));
        this.data.setA44((float)value);
        this.data.setA45(Collections.min(this.memoryData.getHMI_IReg203List()));
        this.data.setA46(Collections.max(this.memoryData.getHMI_IReg203List()));
        //A4 v = vavg(pavg/1.293)^1/3
        double airDensity = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg199List()));
        //标准空气密度折算后风速
        double v;
        v = value*Math.pow(airDensity/1.293,1d/3);
        this.data.setA4(this.calBin(value));
        //A5
        value = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg206List()));
        this.data.setA5(this.calBin(value));
        //A6
        this.data.setA6(this.updateData.isHMI_Disc910());
        //A7
        this.data.setA7((float)StatUtils.mean(
                EcsUtils.floatList2DoubleArray(
                        this.memoryData.getHMI_IReg1422List())));
        //A8 需要外部资源
        this.setA8();
        //A9-A12 10分钟之后
        this.data.setA9(this.oneSecData.getHMI_IReg153()-this.recordData[0]);
        this.data.setA10(this.updateData.getHMI_IReg1407()-this.recordData[1]);
        this.data.setA11(this.updateData.getHMI_IReg118()-this.recordData[2]);
        this.data.setA12(this.updateData.getHMI_IReg1408()-this.recordData[3]);
        //A13 需要外部资源
        this.calCp(airDensity,v);
        //A28-A43
        this.setA28to43();
        //A47-62
        this.setA47to62();
        //A79 A80
        this.data.setA79(this.updateData.getHMI_IReg199());
        this.data.setA80(this.updateData.getHMI_IReg216());
        //time
        this.data.setA1(new Date());
    }

    private Float calBin(double value){
        int inter;
        double rest;
        inter = (int)value;
        rest = value - inter;
        if(rest < 0.25){
            rest = 0;
        }else if(rest >=0.75){
            rest = 1;
        }else {
            rest = 0.5;
        }
        return (float)(rest+inter);
    }
    //a9-a12 10分钟之前
    private void record(){
        this.recordData = new float[4];
        this.recordData[0] = this.oneSecData.getHMI_IReg153();
        this.recordData[1] = this.updateData.getHMI_IReg1407();
        this.recordData[2] = this.updateData.getHMI_IReg118();
        this.recordData[3] = this.updateData.getHMI_IReg1408();
    }
    //算cp
    private void calCp(double ro,double v){
        this.data.setA13((float)((2*this.data.getA7())/(ro*this.turbineArea*Math.pow(v,3))));
    }

    //算理论功率,需要改
    private void setA8(){
        try {
            float f = this.data.getA4();
            this.data.setA8((float)this.idealPower[1]);
        } catch (Exception e) {
            System.out.println("A8 error...");
            this.data.setA8(0F);
        }
    }
    //设置a28-a43
    private void setA28to43(){
        //每次加22.5度
        double value = StatUtils.mean(EcsUtils.floatList2DoubleArray(this.memoryData.getHMI_IReg155List()));
        if(value >= -11.25 && value < 11.25){
            this.data.setA28(true);
        }else if(value >= 11.25 && value < 33.75){
            this.data.setA29(true);
        }else if(value >= 33.75 && value < 56.25){
            this.data.setA30(true);
        }else if(value >= 56.25 && value < 78.75){
            this.data.setA31(true);
        }else if(value >= 78.75 && value < 101.25){
            this.data.setA32(true);
        }else if(value >= 101.25 && value < 123.75){
            this.data.setA33(true);
        }else if(value >= 123.75 && value < 146.25){
            this.data.setA34(true);
        }else if(value >= 146.25 && value < 168.75){
            this.data.setA35(true);
        }else if(value >= 168.75 && value < -168.75){
            this.data.setA36(true);
        }else if(value >= -168.75 && value < -146.25){
            this.data.setA37(true);
        }else if(value >= -146.25 && value < -123.75){
            this.data.setA38(true);
        }else if(value >= -123.75 && value < -101.25){
            this.data.setA39(true);
        }else if(value >= -101.25 && value < -78.75){
            this.data.setA40(true);
        }else if(value >= -78.75 && value < -56.25){
            this.data.setA41(true);
        }else if(value >= -56.25 && value < -33.75){
            this.data.setA42(true);
        }else if(value >= -33.75 && value < -11.25) {
            this.data.setA43(true);
        }else{
            System.out.println("degree error...");
        }
    }

    private void setA47to62(){
        float value = this.data.getA7()/this.turbineArea;
        if(this.data.getA28()){
            this.data.setA47(value);
        }else if(this.data.getA29()){
            this.data.setA48(value);
        }else if(this.data.getA30()){
            this.data.setA49(value);
        }else if(this.data.getA31()){
            this.data.setA50(value);
        }else if(this.data.getA32()){
            this.data.setA51(value);
        }else if(this.data.getA33()){
            this.data.setA52(value);
        }else if(this.data.getA34()){
            this.data.setA53(value);
        }else if(this.data.getA35()){
            this.data.setA54(value);
        }else if(this.data.getA36()){
            this.data.setA55(value);
        }else if(this.data.getA37()){
            this.data.setA56(value);
        }else if(this.data.getA38()){
            this.data.setA57(value);
        }else if(this.data.getA39()){
            this.data.setA58(value);
        }else if(this.data.getA40()){
            this.data.setA59(value);
        }else if(this.data.getA41()){
            this.data.setA60(value);
        }else if(this.data.getA42()){
            this.data.setA61(value);
        }else if(this.data.getA43()){
            this.data.setA62(value);
        }else{
            System.out.println("degree error2...");
        }
    }
    //出口
    public ExtraTenData2DB getData2DB() {
        return data;
    }
}

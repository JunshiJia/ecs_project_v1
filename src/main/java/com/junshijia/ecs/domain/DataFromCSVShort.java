package com.junshijia.ecs.domain;

/**
 * @author jjs
 * 从csv类型的点表获取的信息的实体类，一个类对应一行数据
 */
public class DataFromCSVShort {

    private Integer mainControlAddress;

    private String enCoding;
    private boolean update;
    private boolean storageOneSec;
    private boolean anyOneSec;
    private boolean andTenMin;
    private boolean maxTenMin;
    private boolean numberMaxTenMin;
    private boolean meanTenMin;
    private boolean minTenMin;
    private boolean stdDevTenMin;
    private boolean onFlowTenMin;
    private boolean maxTenSec;
    private boolean minTenSec;
    private boolean meanTenSec;
    private boolean edgeDetect;

    public DataFromCSVShort() {
    }

    public boolean isEdgeDetect() {
        return edgeDetect;
    }

    public void setEdgeDetect(boolean edgeDetect) {
        this.edgeDetect = edgeDetect;
    }

    public Integer getMainControlAddress() {
        return mainControlAddress;
    }

    public void setMainControlAddress(Integer mainControlAddress) {
        this.mainControlAddress = mainControlAddress;
    }

    public String getEnCoding() {
        return enCoding;
    }

    public void setEnCoding(String enCoding) {
        this.enCoding = enCoding;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public boolean isStorageOneSec() {
        return storageOneSec;
    }

    public void setStorageOneSec(boolean storageOneSec) {
        this.storageOneSec = storageOneSec;
    }

    public boolean isAnyOneSec() {
        return anyOneSec;
    }

    public void setAnyOneSec(boolean anyOneSec) {
        this.anyOneSec = anyOneSec;
    }

    public boolean isAndTenMin() {
        return andTenMin;
    }

    public void setAndTenMin(boolean andTenMin) {
        this.andTenMin = andTenMin;
    }

    public boolean isMaxTenMin() {
        return maxTenMin;
    }

    public void setMaxTenMin(boolean maxTenMin) {
        this.maxTenMin = maxTenMin;
    }

    public boolean isNumberMaxTenMin() {
        return numberMaxTenMin;
    }

    public void setNumberMaxTenMin(boolean numberMaxTenMin) {
        this.numberMaxTenMin = numberMaxTenMin;
    }

    public boolean isMeanTenMin() {
        return meanTenMin;
    }

    public void setMeanTenMin(boolean meanTenMin) {
        this.meanTenMin = meanTenMin;
    }

    public boolean isMinTenMin() {
        return minTenMin;
    }

    public void setMinTenMin(boolean minTenMin) {
        this.minTenMin = minTenMin;
    }

    public boolean isStdDevTenMin() {
        return stdDevTenMin;
    }

    public void setStdDevTenMin(boolean stdDevTenMin) {
        this.stdDevTenMin = stdDevTenMin;
    }

    public boolean isOnFlowTenMin() {
        return onFlowTenMin;
    }

    public void setOnFlowTenMin(boolean onFlowTenMin) {
        this.onFlowTenMin = onFlowTenMin;
    }

    public boolean isMaxTenSec() {
        return maxTenSec;
    }

    public void setMaxTenSec(boolean maxTenSec) {
        this.maxTenSec = maxTenSec;
    }

    public boolean isMinTenSec() {
        return minTenSec;
    }

    public void setMinTenSec(boolean minTenSec) {
        this.minTenSec = minTenSec;
    }

    public boolean isMeanTenSec() {
        return meanTenSec;
    }

    public void setMeanTenSec(boolean meanTenSec) {
        this.meanTenSec = meanTenSec;
    }

    @Override
    public String toString() {
        return "DataFromCSVShort{" +
                "mainControlAddress=" + mainControlAddress +
                ", enCoding='" + enCoding + '\'' +
                ", update=" + update +
                ", storageOneSec=" + storageOneSec +
                ", anyOneSec=" + anyOneSec +
                ", andTenMin=" + andTenMin +
                ", maxTenMin=" + maxTenMin +
                ", numberMaxTenMin=" + numberMaxTenMin +
                ", meanTenMin=" + meanTenMin +
                ", minTenMin=" + minTenMin +
                ", stdDevTenMin=" + stdDevTenMin +
                ", onFlowTenMin=" + onFlowTenMin +
                ", maxTenSec=" + maxTenSec +
                ", minTenSec=" + minTenSec +
                ", meanTenSec=" + meanTenSec +
                ", edgeDetect=" + edgeDetect +
                '}';
    }
}

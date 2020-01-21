package com.junshijia.ecs.status;

public class TurbineStatus {

    private boolean isRunning;
    private int statusCode;

    public TurbineStatus() {
    }

    private void process(){
        if(statusCode <= 38 && statusCode >= 34){
            isRunning = true;
        }else{
            isRunning = false;
        }
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
        this.process();
    }

    public boolean isRunning() {
        return isRunning;
    }
}
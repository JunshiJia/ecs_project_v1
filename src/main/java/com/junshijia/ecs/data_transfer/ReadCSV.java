package com.junshijia.ecs.data_transfer;

import com.junshijia.ecs.domain.DataFromCSVShort;
import com.junshijia.ecs.util.EcsUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ReadCSV {
    private List<DataFromCSVShort> dataList;
    private Set<String> updateSet;
    private Set<String> oneSecSet;
    private Set<String> anyOneSecSet;
    private Set<String> edgeSet;
    private Set<String> tenMinSet;
    private Set<String> tenSecSet;


    public ReadCSV() {
        //整个大表的list
        this.dataList = new ArrayList<>();
        //各个子表的set
        this.updateSet = new LinkedHashSet<>();
        this.oneSecSet = new LinkedHashSet<>();
        this.anyOneSecSet = new LinkedHashSet<>();
        this.edgeSet = new LinkedHashSet<>();
        this.tenMinSet = new LinkedHashSet<>();
        this.tenSecSet = new LinkedHashSet<>();

        this.getData();
    }

    private void getData(){
        String[] values = null;
        String test = null;
        DataFromCSVShort data = null;
        boolean flag;
        boolean flag2 = false;
        try (
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream("ecs.csv"), StandardCharsets.UTF_8))
        ) {
            //跳过第一行，也就是表头
            String line = br.readLine();
            //从第二行开始
            while ((line = br.readLine()) != null) {
                flag = true;
                values = line.split(",");
                //System.out.println(Arrays.asList(values));
                while(flag) {
                    try {
                        flag2 = EcsUtils.isAlpha(values[0]);
                        flag = false;
                    } catch (Exception e) {
                        line = br.readLine();
                        if(line == null){
                            flag2 = false;
                            break;
                        }
                        values = line.split(",");
                    }
                }
                //System.out.println(line);
                if(flag2){
                    data = new DataFromCSVShort();
                    data.setMainControlAddress(Integer.parseInt(values[1]));
                    data.setEnCoding(values[2]);
                    if(values[5].equals("1")){data.setUpdate(true);}
                    if(values[7].equals("1")){data.setStorageOneSec(true);}
                    if(values[8].equals("1")){data.setAnyOneSec(true);}
                    if(values[9].equals("1")){data.setAndTenMin(true);}
                    if(values[10].equals("1")){data.setNumberMaxTenMin(true);}
                    if(values[11].equals("1")){data.setMeanTenMin(true);}
                    if(values[12].equals("1")){data.setMaxTenMin(true);}
                    if(values[13].equals("1")){data.setMinTenMin(true);}
                    if(values[14].equals("1")){data.setStdDevTenMin(true);}
                    if(values[15].equals("1")){data.setOnFlowTenMin(true);}
                    if(values[16].equals("1")){data.setMeanTenSec(true);}
                    if(values[17].equals("1")){data.setMaxTenSec(true);}
                    if(values[18].equals("1")){data.setMinTenSec(true);}
                    if(values[19].equals("1")){data.setEdgeDetect(true);}


                    //add to update set
                    if(data.isUpdate()){
                        this.updateSet.add(data.getEnCoding());
                    }
                    //add to oneSec set
                    if(data.isStorageOneSec()){
                        this.oneSecSet.add(data.getEnCoding());
                    }
                    //add anyOneSec set
                    if(data.isAnyOneSec()){
                        this.anyOneSecSet.add(data.getEnCoding());
                    }
                    //add to edge set
                    if(data.isEdgeDetect()){
                        this.edgeSet.add(data.getEnCoding());
                    }

                    //add to ten sec set
                    if(data.isMaxTenSec() || data.isMeanTenSec()){
                        if(data.getEnCoding().charAt(0)!='a' && data.getEnCoding().charAt(0)!='b') {
                            this.tenSecSet.add(data.getEnCoding());
                        }
                    }

                    //add to ten min set
                    if(data.isAndTenMin() || data.isMaxTenMin() || data.isMeanTenMin() || data.isMinTenMin()
                            || data.isNumberMaxTenMin() || data.isOnFlowTenMin() || data.isStdDevTenMin()){
                        this.tenMinSet.add(data.getEnCoding());
                    }

                    //add to big list
                    this.dataList.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<DataFromCSVShort> getDataList() {
        return dataList;
    }

    public Set<String> getUpdateSet() {
        return updateSet;
    }

    public Set<String> getOneSecSet() {
        return oneSecSet;
    }

    public Set<String> getAnyOneSecSet() {
        return anyOneSecSet;
    }

    public Set<String> getEdgeSet() {
        return edgeSet;
    }

    public Set<String> getTenMinSet() {
        return tenMinSet;
    }

    public Set<String> getTenSecSet() {
        return tenSecSet;
    }
}

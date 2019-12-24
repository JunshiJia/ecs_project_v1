package com.junshijia.read_csv;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.DataFromCSVShort;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class ReadCsv {
    @Test
    public void ReadCsvTest1(){
        ReadCSV read = new ReadCSV();
        List<DataFromCSVShort> list = read.getDataList();
        for(DataFromCSVShort data : list){
            System.out.println(data.toString());
        }

    }

    @Test
    public void ReadCsvTest2(){

    }

    @Test
    public void ReadCsvTest3(){
        ReadCSV read = new ReadCSV();
        Set<String> tenMinSet = read.getTenMinSet();
        for(String data : tenMinSet){
            System.out.println(data);
        }
    }
}

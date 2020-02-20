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
        ReadCSV read = new ReadCSV();
        Set<String> tenMinSet = read.getTenMinSet();
        Set<String> meanSet = read.getMeanSet();
        Set<String> stdDivSet = read.getStdDivSet();
        for(String data : tenMinSet){
            System.out.println(data);
        }
        System.out.println(tenMinSet.size());
        for(String data : meanSet){
            System.out.println(data);
        }
        System.out.println(meanSet.size());
        for(String data : stdDivSet){
            System.out.println(data);
        }
        System.out.println(stdDivSet.size());
        System.out.println(read.getTenMinMemorySet().size());
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

package com.junshijia.read_csv;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.domain.DataFromCSVShort;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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


    }

    @Test
    public void ReadCsvTest3(){
        ReadCSV read = new ReadCSV();
        Map map = read.getUpdateMap();
        Iterator<Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        System.out.println(map.size());
        while (entries.hasNext()) {
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println("Key: "+ entry.getKey()+ " Value: "+entry.getValue());
        }
    }
}

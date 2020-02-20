package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TenMinMemoryGen {
    private Set<String> memoryDataSet;

    public TenMinMemoryGen() {
        //读取配置获得列表
        ReadCSV read = new ReadCSV();
        this.memoryDataSet = read.getTenMinMemorySet();
        //写出到文件
        try {
            this.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile() throws IOException {
        //需要写出的文件目录
        File pojoFile = new File("src/main/java/com/junshijia/ecs/domain/TenMinMemory.java");
        //覆盖原文件
        if(pojoFile.exists()){
            pojoFile.delete();
        }
        //开头
        FileUtils.write(pojoFile,"package com.junshijia.ecs.domain;\r\n\n","UTF-8",true);
        FileUtils.write(pojoFile,"public class TenMinMemory{\r\n\n","UTF-8",true);
        //属性
        for(String enCoding : this.memoryDataSet){
            if(enCoding.charAt(4)=='C' || enCoding.charAt(4)=='D'){
                System.out.println("not possible");
            }
            else if(enCoding.charAt(4)=='H' || enCoding.charAt(4)=='I'){
                FileUtils.write(pojoFile,"\tprivate List<Float> " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
        }
        //构造器
        FileUtils.write(pojoFile, "\tpublic TenMinMemory() {\n", "UTF-8", true);
        for (String enCoding : this.memoryDataSet) {
            if (enCoding.charAt(4) == 'H' || enCoding.charAt(4) == 'I') {
                    FileUtils.write(pojoFile, "\t\tthis."+EcsUtils.deleteChar(enCoding)+" = new ArrayList<>();\n", "UTF-8", true);
            }
        }
        FileUtils.write(pojoFile, "\t}\n", "UTF-8", true);
        //结尾
        FileUtils.write(pojoFile,"}\n","UTF-8",true);
    }
}

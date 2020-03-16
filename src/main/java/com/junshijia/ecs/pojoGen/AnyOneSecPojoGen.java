package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class AnyOneSecPojoGen {
    private Set<String> anyOneSecSet;

    public AnyOneSecPojoGen() {
        //读取配置获得列表
        ReadCSV read = new ReadCSV();
        this.anyOneSecSet = read.getAnyOneSecSet();
        //写出到文件
        try {
            this.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile() throws IOException {
        //需要写出的文件目录
        File pojoFile = new File("src/main/java/com/junshijia/ecs/domain/AnyOneSecData2DB.java");
        //覆盖原文件
        if(pojoFile.exists()){
            pojoFile.delete();
        }
        //开头
        FileUtils.write(pojoFile,"package com.junshijia.ecs.domain;\r\n\n","UTF-8",true);
        FileUtils.write(pojoFile,"@Entity\n@Table(name=\"one_sec_any\")\n","UTF-8",true);
        FileUtils.write(pojoFile,"public class AnyOneSecData2DB{\r\n\n","UTF-8",true);
        //写id
        FileUtils.write(pojoFile,"\t@Id\n" + "\t@GeneratedValue(strategy = GenerationType.AUTO)\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate int id;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate Date time;\n","UTF-8",true);
        //写其他属性
        for(String enCoding : this.anyOneSecSet){
            if(enCoding.charAt(4)=='C' || enCoding.charAt(4)=='D'){
                FileUtils.write(pojoFile,"\t@Column(name=\"`"+enCoding+"`\")\n","UTF-8",true);
                FileUtils.write(pojoFile,"\tprivate boolean " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
            else if(enCoding.charAt(4)=='H' || enCoding.charAt(4)=='I'){
                FileUtils.write(pojoFile,"\t@Column(name=\"`"+enCoding+"`\")\n","UTF-8",true);
                FileUtils.write(pojoFile,"\tprivate Float " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
        }
        //结尾
        FileUtils.write(pojoFile,"}\n","UTF-8",true);
    }
}

package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class UpdatePojoGen {

    private Set<String> updateSet;

    public UpdatePojoGen() {
        //读取配置获得列表
        ReadCSV read = new ReadCSV();
        this.updateSet = read.getUpdateSet();
        //写出到文件
        try {
            this.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile() throws IOException {
        //需要写出的文件目录
        File pojoFile = new File("src/main/java/com/junshijia/ecs/domain/UpdateData2DB.java");
        //开头
        FileUtils.write(pojoFile,"package com.junshijia.ecs.domain;\r\n\n","UTF-8",true);
        FileUtils.write(pojoFile,"public class UpdateData2DB{\r\n\n","UTF-8",true);
        //写id
        FileUtils.write(pojoFile,"\tprivate int id;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate int wtId;\n","UTF-8",true);
        //写其他属性
        for(String enCoding : this.updateSet){
            if(enCoding.charAt(0)=='a' || enCoding.charAt(0)=='b'){
                FileUtils.write(pojoFile,"\tprivate boolean " + enCoding + ";\n","UTF-8",true);
            }
            else if(enCoding.charAt(0)=='c' || enCoding.charAt(0)=='d'){
                FileUtils.write(pojoFile,"\tprivate Float " + enCoding + ";\n","UTF-8",true);
            }
        }
        //结尾
        FileUtils.write(pojoFile,"}\n","UTF-8",true);
    }
}

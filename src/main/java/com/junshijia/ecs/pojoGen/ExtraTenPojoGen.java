package com.junshijia.ecs.pojoGen;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ExtraTenPojoGen {


    public ExtraTenPojoGen() {
        //写出到文件
        try {
            this.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile() throws IOException {
        //需要写出的文件目录
        File pojoFile = new File("src/main/java/com/junshijia/ecs/domain/ExtraTenData2DB.java");
        //覆盖原文件
        if(pojoFile.exists()){
            pojoFile.delete();
        }
        //开头
        FileUtils.write(pojoFile,"package com.junshijia.ecs.domain;\r\n\n","UTF-8",true);
        FileUtils.write(pojoFile,"@Entity\n","UTF-8",true);
        FileUtils.write(pojoFile,"public class ExtraTenData2DB{\r\n\n","UTF-8",true);
        //写id
        FileUtils.write(pojoFile,"\t@Id\n" + "\t@GeneratedValue(strategy = GenerationType.AUTO)\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate int id;\n","UTF-8",true);

        FileUtils.write(pojoFile,"\tprivate Date A1;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate String A2;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate Float A3;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate Float A4;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate Float A5;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate Boolean A6;\n","UTF-8",true);
        //写其他属性
        for(int i = 7; i <= 27; i++ ){
            FileUtils.write(pojoFile,"\tprivate Float A" + i + ";\n","UTF-8",true);
        }
        for(int i = 28; i <= 43; i++ ){
            FileUtils.write(pojoFile,"\tprivate Boolean A" + i + ";\n","UTF-8",true);
        }
        for(int i = 44; i <= 81; i++ ){
            FileUtils.write(pojoFile,"\tprivate Float A" + i + ";\n","UTF-8",true);
        }
        FileUtils.write(pojoFile,"\tprivate Boolean A82;\n","UTF-8",true);

        //构造器
        FileUtils.write(pojoFile, "\tpublic ExtraTenData2DB() {\n", "UTF-8", true);
        //
        for (int i = 14; i<= 27; i++) {
            FileUtils.write(pojoFile, "\t\tthis.A"+ i+" = 0F;\n", "UTF-8", true);
        }
        for (int i = 28; i<= 43; i++) {
            FileUtils.write(pojoFile, "\t\tthis.A"+ i+" = false;\n", "UTF-8", true);
        }
        for (int i = 47; i<= 78; i++) {
            FileUtils.write(pojoFile, "\t\tthis.A"+ i+" = 0F;\n", "UTF-8", true);
        }
        FileUtils.write(pojoFile, "\t\tthis.A81 = 0F;\n", "UTF-8", true);
        FileUtils.write(pojoFile, "\t}\n", "UTF-8", true);
        //结尾
        FileUtils.write(pojoFile,"}\n","UTF-8",true);
    }
}

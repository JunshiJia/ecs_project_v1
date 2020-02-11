package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.util.EcsUtils;
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
        FileUtils.write(pojoFile,"package com.junshijia.ecs.domain;\n\n","UTF-8",true);
        FileUtils.write(pojoFile,"@Entity\n@Table(name=\"allTurbine_data\")\n","UTF-8",true);
        FileUtils.write(pojoFile,"public class UpdateData2DB{\n\n","UTF-8",true);
        //写id
        FileUtils.write(pojoFile,"\t@Id\n" +
                "\t@GenericGenerator(name = \"id\",strategy = \"assigned\")\n" +
                "\t@GeneratedValue(generator = \"id\")\n" +
                "\t@Column(name = \"id\", nullable = false)\n","UTF-8",true);
        //写时间
        FileUtils.write(pojoFile,"\t@Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型\n" +
                "\tprivate Date time;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate int id;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tprivate int wtId;\n","UTF-8",true);
        //写其他属性
        for(String enCoding : this.updateSet){
            if(enCoding.charAt(4)=='C' || enCoding.charAt(4)=='D'){
                FileUtils.write(pojoFile,"\t@Column(name=\""+enCoding+"\")\n","UTF-8",true);
                FileUtils.write(pojoFile,"\tprivate boolean " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
            else if(enCoding.charAt(4)=='H' || enCoding.charAt(4)=='I'){
                FileUtils.write(pojoFile,"\t@Column(name=\""+enCoding+"\")\n","UTF-8",true);
                FileUtils.write(pojoFile,"\tprivate Float " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
        }
        //结尾
        FileUtils.write(pojoFile,"}\n","UTF-8",true);
    }
}

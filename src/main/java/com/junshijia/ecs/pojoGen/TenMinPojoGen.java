package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TenMinPojoGen {
    private Set<String> tenMinSet;
    private Set<String> maxSet;
    private Set<String> meanSet;
    private Set<String> minSet;
    private Set<String> stdDivSet;
    private Set<String> andSet;
    private Set<String> maxNumSet;
    private Set<String> flowSet;

    public TenMinPojoGen() {
        //读取配置获得列表
        ReadCSV read = new ReadCSV();
        this.tenMinSet = read.getTenMinSet();
        this.maxSet = read.getMaxSet();
        this.meanSet = read.getMeanSet();
        this.minSet = read.getMinSet();
        this.stdDivSet = read.getStdDivSet();
        this.andSet = read.getAndSet();
        this.maxNumSet = read.getMaxNumSet();
        this.flowSet = read.getFlowSet();
        this.andSet = read.getAndSet();
        this.maxNumSet = read.getMaxNumSet();
        this.flowSet = read.getFlowSet();
        //写出到文件
        try {
            this.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile() throws IOException {
        //需要写出的文件目录
        File pojoFile = new File("src/main/java/com/junshijia/ecs/domain/TenMinData2DB.java");
        if (pojoFile.exists()) {
            pojoFile.delete();
        }

        //开头
        FileUtils.write(pojoFile, "package com.junshijia.ecs.domain;\r\n\n", "UTF-8", true);
        FileUtils.write(pojoFile,"@Entity\n@Table(name=\"ten_min\")\n","UTF-8",true);
        FileUtils.write(pojoFile, "public class TenMinData2DB{\r\n\n", "UTF-8", true);

        //写id
        FileUtils.write(pojoFile,"\t@Id\n" + "\t@GeneratedValue(strategy = GenerationType.AUTO)\n","UTF-8",true);
        FileUtils.write(pojoFile, "\tprivate int id;\n", "UTF-8", true);
        FileUtils.write(pojoFile, "\tprivate String Wtid;\n", "UTF-8", true);
        FileUtils.write(pojoFile,"\t@Column(columnDefinition =\"double NOT NULL DEFAULT '0'\")\n" +
                "\tprivate Long Time_S;\n","UTF-8",true);
        FileUtils.write(pojoFile,"\t@Column(columnDefinition =\"varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0'\")\n" +
                "\tprivate Date TimeStamp;\n","UTF-8",true);

        //写其他属性
        for (String enCoding : this.tenMinSet) {
            if (this.maxSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_Max`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "Max;\n", "UTF-8", true);
            }
            if (this.meanSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_Mean`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "Mean;\n", "UTF-8", true);
            }
            if (this.minSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_Min`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "Min;\n", "UTF-8", true);
            }
            if (this.stdDivSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_StdDiv`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "StdDiv;\n", "UTF-8", true);
            }
            if (this.andSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_And`\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate boolean " + EcsUtils.deleteChar(enCoding) + "And;\n", "UTF-8", true);
            }
            if (this.maxNumSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_NumberMax`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "MaxNum;\n", "UTF-8", true);
            }
            if (this.flowSet.contains(enCoding)) {
                FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "_Onflow`\", columnDefinition =\"float NOT NULL DEFAULT '0'\")\n", "UTF-8", true);
                FileUtils.write(pojoFile, "\tprivate float " + EcsUtils.deleteChar(enCoding) + "Flow;\n", "UTF-8", true);
            }
        }

        //时间setter
        FileUtils.write(pojoFile,"\tpublic void setTimeStamp(Date TimeStamp) {\n" +
                "\t\tthis.TimeStamp = TimeStamp;\n" +
                "\t\tthis.setTime_S();\n" +
                "\t}\n","UTF-8",true);
        FileUtils.write(pojoFile,"\tpublic void setTime_S() {\n" +
                "\t\tZonedDateTime zdt = LocalDateTime.of(1904, 1, 1, 0, 0, 0).atZone(ZoneId.of(\"UTC\"));\n" +
                "\t\tTime_S = System.currentTimeMillis()/1000 + Math.abs(zdt.toEpochSecond());\n" +
                "\t}\n","UTF-8",true);
        //结尾
        FileUtils.write(pojoFile, "}\n", "UTF-8", true);
    }
}

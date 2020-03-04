package com.junshijia.ecs.pojoGen;

import com.junshijia.ecs.data_transfer.ReadCSV;
import com.junshijia.ecs.util.EcsUtils;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class TenMinPojoGen {
    private Set<String> TenMinSet;
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
        this.TenMinSet = read.getTenMinSet();
        this.maxSet = read.getMaxSet();
        this.meanSet = read.getMeanSet();
        this.minSet = read.getMinSet();
        this.stdDivSet = read.getStdDivSet();
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
        FileUtils.write(pojoFile, "@Entity\n", "UTF-8", true);
        FileUtils.write(pojoFile, "public class TenMinData2DB{\r\n\n", "UTF-8", true);
        //写id
        FileUtils.write(pojoFile,"\t@Id\n" + "\t@GeneratedValue(strategy = GenerationType.AUTO)\n","UTF-8",true);
        FileUtils.write(pojoFile, "\tprivate int id;\n", "UTF-8", true);
        FileUtils.write(pojoFile, "\tprivate int wtId;\n", "UTF-8", true);
        //写其他属性
        for (String enCoding : this.TenMinSet) {
            if (enCoding.charAt(4) == 'C' || enCoding.charAt(4) == 'D') {//忽略布尔量
                //FileUtils.write(pojoFile,"\t@Column(name=\"`"+enCoding+"`\")\n","UTF-8",true);
                //FileUtils.write(pojoFile,"\tprivate boolean " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
            }
            else if (enCoding.charAt(4) == 'H' || enCoding.charAt(4) == 'I') {
                //if (this.meanSet.contains(enCoding) || this.stdDivSet.contains(enCoding)) {
                //    FileUtils.write(pojoFile,"\t@Transient\n","UTF-8",true);
                //    FileUtils.write(pojoFile,"\tprivate List<Float> " + EcsUtils.deleteChar(enCoding) + ";\n","UTF-8",true);
                //}
                if (this.maxSet.contains(enCoding)) {
                    FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "Max`\")\n", "UTF-8", true);
                    FileUtils.write(pojoFile, "\tprivate Float " + EcsUtils.deleteChar(enCoding) + "Max;\n", "UTF-8", true);
                }
                if (this.meanSet.contains(enCoding)) {
                    FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "Mean`\")\n", "UTF-8", true);
                    FileUtils.write(pojoFile, "\tprivate Float " + EcsUtils.deleteChar(enCoding) + "Mean;\n", "UTF-8", true);

                }
                if (this.minSet.contains(enCoding)) {
                    FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "Min`\")\n", "UTF-8", true);
                    FileUtils.write(pojoFile, "\tprivate Float " + EcsUtils.deleteChar(enCoding) + "Min;\n", "UTF-8", true);
                }
                if (this.stdDivSet.contains(enCoding)) {
                    FileUtils.write(pojoFile, "\t@Column(name=\"`" + enCoding + "StdDiv`\")\n", "UTF-8", true);
                    FileUtils.write(pojoFile, "\tprivate Float " + EcsUtils.deleteChar(enCoding) + "StdDiv;\n", "UTF-8", true);
                }
            }

        }
        //构造器
        /*
        FileUtils.write(pojoFile, "\tpublic TenMinData2DB() {\n", "UTF-8", true);
        for (String enCoding : this.TenMinSet) {
            if (enCoding.charAt(4) == 'H' || enCoding.charAt(4) == 'I') {
                if (this.meanSet.contains(enCoding) || this.stdDivSet.contains(enCoding)) {
                    FileUtils.write(pojoFile, "\t\tthis."+EcsUtils.deleteChar(enCoding)+" = new ArrayList<>();\n", "UTF-8", true);
                }
            }
        }
        FileUtils.write(pojoFile, "\t}\n", "UTF-8", true);
        */
        //结尾
        FileUtils.write(pojoFile, "}\n", "UTF-8", true);
    }
}

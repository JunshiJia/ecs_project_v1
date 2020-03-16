package com.junshijia.ecs.create_table;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class BuildSqlString {
    private String version;
    private int turbineNum;
    private List<String> sqlList;
    public BuildSqlString() {
        this.sqlList = new LinkedList<>();
        Properties prop = new Properties();
        try{
            //读取属性文件a.properties
            InputStream in = new BufferedInputStream(new FileInputStream("src/main/resources/version.properties"));
            prop.load(in);     ///加载属性列表
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                if(key.equals("version")){
                    this.version = prop.getProperty(key);
                }else if(key.equals("turbineNumber")){
                    this.turbineNum = Integer.parseInt(prop.getProperty(key));
                }
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<String> getSqlList() {
        return sqlList;
    }

    public String getVersion() {
        return version;
    }

    public void buildStringList(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String time = formatter.format(date);
        //1秒数据
        for(int i = 1; i <= this.turbineNum; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("wt").append(i).append("V").append(version).append("_oneSec_")
                    .append(time);
            String oneSecSql = "CREATE TABLE `" + sb.toString() + "` (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `HMI_Disc[1001]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1002]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1003]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1005]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1006]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1007]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1008]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1010]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1011]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1012]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_Disc[1013]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_IReg[1405]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1406]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1407]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1408]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1422]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1423]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[153]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[155]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1644]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1645]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1646]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1647]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1648]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1649]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1665]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1666]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[237]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[238]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[239]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[240]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[241]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[242]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[243]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[244]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[253]` float DEFAULT NULL,\n" +
                    "  `time` datetime DEFAULT NULL,\n" +
                    "  `wtId` int(11) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
            this.sqlList.add(oneSecSql);
        }
        //any1秒数据
        for(int i = 1; i <= this.turbineNum; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("wt").append(i).append("V").append(version).append("_anyOneSec_")
                    .append(time);
            String anyOneSecSql = "CREATE TABLE `"+sb.toString()+"` (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                    "  `HMI_Disc[1653]` bit(1) DEFAULT NULL,\n" +
                    "  `HMI_IReg[107]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[110]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[121]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1405]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1406]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1407]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1408]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1422]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1423]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[155]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1611]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1612]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1613]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1643]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1644]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1645]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1646]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1667]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1691]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1692]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1693]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[1694]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[203]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[210]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[216]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[223]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[224]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[237]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[238]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[239]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[240]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[241]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[242]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[243]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[244]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[245]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[6]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[7]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[8]` float DEFAULT NULL,\n" +
                    "  `HMI_IReg[9]` float DEFAULT NULL,\n" +
                    "  `time` datetime DEFAULT NULL,\n" +
                    "  `wtId` int(11) NOT NULL,\n" +
                    "  PRIMARY KEY (`id`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
            this.sqlList.add(anyOneSecSql);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("V").append(version).append("_tenMinCal");
        String tenMinSql = "CREATE TABLE `"+sb.toString()+"` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `HMI_Disc[332]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[341]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[341]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_Disc[383]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[409]Flow` float DEFAULT NULL,\n" +
                "  `HMI_Disc[409]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[409]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_Disc[413]Flow` float DEFAULT NULL,\n" +
                "  `HMI_Disc[413]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[413]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_Disc[476]Min` float DEFAULT NULL,\n" +
                "  `HMI_Disc[476]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_Disc[910]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_Disc[910]Max` float DEFAULT NULL,\n" +
                "  `HMI_Disc[910]MaxNum` float DEFAULT NULL,\n" +
                "  `HMI_Disc[910]Mean` float DEFAULT NULL,\n" +
                "  `HMI_Disc[912]MaxNum` float DEFAULT NULL,\n" +
                "  `HMI_IReg[101]Max` float DEFAULT NULL,\n" +
                "  `HMI_IReg[101]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[101]Min` float DEFAULT NULL,\n" +
                "  `HMI_IReg[102]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[103]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[104]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[105]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[106]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[107]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[110]Max` float DEFAULT NULL,\n" +
                "  `HMI_IReg[110]MaxNum` float DEFAULT NULL,\n" +
                "  `HMI_IReg[110]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[110]Min` float DEFAULT NULL,\n" +
                "  `HMI_IReg[110]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_IReg[118]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[121]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[122]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1405]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1406]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1407]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1408]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1418]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1419]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1420]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1422]Max` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1422]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1422]Min` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1422]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1423]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1426]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1508]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1514]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1515]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1516]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1517]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1518]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1519]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[155]Max` float DEFAULT NULL,\n" +
                "  `HMI_IReg[155]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[155]Min` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1611]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1612]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1613]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1637]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1638]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1639]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1640]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1641]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1642]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1643]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1644]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1645]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1646]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1665]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1666]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1677]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1678]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[167]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[167]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1691]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1692]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1693]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[1694]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[199]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[201]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[203]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[206]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[206]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[206]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_IReg[210]Flow` float DEFAULT NULL,\n" +
                "  `HMI_IReg[210]Max` float DEFAULT NULL,\n" +
                "  `HMI_IReg[210]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[210]Min` float DEFAULT NULL,\n" +
                "  `HMI_IReg[210]StdDiv` float DEFAULT NULL,\n" +
                "  `HMI_IReg[214]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[216]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[224]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[237]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[238]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[239]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[240]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[241]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[242]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[243]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[244]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[245]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[248]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[6]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[6]Flow` float DEFAULT NULL,\n" +
                "  `HMI_IReg[6]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[7]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[7]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[8]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[8]Flow` float DEFAULT NULL,\n" +
                "  `HMI_IReg[8]Mean` float DEFAULT NULL,\n" +
                "  `HMI_IReg[9]And` bit(1) DEFAULT NULL,\n" +
                "  `HMI_IReg[9]Mean` float DEFAULT NULL,\n" +
                "  `time` datetime DEFAULT NULL,\n" +
                "  `wtId` int(11) NOT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
        this.sqlList.add(tenMinSql);

        sb = new StringBuilder();
        sb.append("V").append(version).append("_extraTenMinCal");
        String extraTenSql = "CREATE TABLE `"+sb.toString()+"` (\n" +
                "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
                "  `A1` datetime DEFAULT NULL,\n" +
                "  `A10` float DEFAULT NULL,\n" +
                "  `A11` float DEFAULT NULL,\n" +
                "  `A12` float DEFAULT NULL,\n" +
                "  `A13` float DEFAULT NULL,\n" +
                "  `A14` float DEFAULT NULL,\n" +
                "  `A15` float DEFAULT NULL,\n" +
                "  `A16` float DEFAULT NULL,\n" +
                "  `A17` float DEFAULT NULL,\n" +
                "  `A18` float DEFAULT NULL,\n" +
                "  `A19` float DEFAULT NULL,\n" +
                "  `A2` varchar(255) DEFAULT NULL,\n" +
                "  `A20` float DEFAULT NULL,\n" +
                "  `A21` float DEFAULT NULL,\n" +
                "  `A22` float DEFAULT NULL,\n" +
                "  `A23` float DEFAULT NULL,\n" +
                "  `A24` float DEFAULT NULL,\n" +
                "  `A25` float DEFAULT NULL,\n" +
                "  `A26` float DEFAULT NULL,\n" +
                "  `A27` float DEFAULT NULL,\n" +
                "  `A28` bit(1) DEFAULT NULL,\n" +
                "  `A29` bit(1) DEFAULT NULL,\n" +
                "  `A3` float DEFAULT NULL,\n" +
                "  `A30` bit(1) DEFAULT NULL,\n" +
                "  `A31` bit(1) DEFAULT NULL,\n" +
                "  `A32` bit(1) DEFAULT NULL,\n" +
                "  `A33` bit(1) DEFAULT NULL,\n" +
                "  `A34` bit(1) DEFAULT NULL,\n" +
                "  `A35` bit(1) DEFAULT NULL,\n" +
                "  `A36` bit(1) DEFAULT NULL,\n" +
                "  `A37` bit(1) DEFAULT NULL,\n" +
                "  `A38` bit(1) DEFAULT NULL,\n" +
                "  `A39` bit(1) DEFAULT NULL,\n" +
                "  `A4` float DEFAULT NULL,\n" +
                "  `A40` bit(1) DEFAULT NULL,\n" +
                "  `A41` bit(1) DEFAULT NULL,\n" +
                "  `A42` bit(1) DEFAULT NULL,\n" +
                "  `A43` bit(1) DEFAULT NULL,\n" +
                "  `A44` float DEFAULT NULL,\n" +
                "  `A45` float DEFAULT NULL,\n" +
                "  `A46` float DEFAULT NULL,\n" +
                "  `A47` float DEFAULT NULL,\n" +
                "  `A48` float DEFAULT NULL,\n" +
                "  `A49` float DEFAULT NULL,\n" +
                "  `A5` float DEFAULT NULL,\n" +
                "  `A50` float DEFAULT NULL,\n" +
                "  `A51` float DEFAULT NULL,\n" +
                "  `A52` float DEFAULT NULL,\n" +
                "  `A53` float DEFAULT NULL,\n" +
                "  `A54` float DEFAULT NULL,\n" +
                "  `A55` float DEFAULT NULL,\n" +
                "  `A56` float DEFAULT NULL,\n" +
                "  `A57` float DEFAULT NULL,\n" +
                "  `A58` float DEFAULT NULL,\n" +
                "  `A59` float DEFAULT NULL,\n" +
                "  `A6` bit(1) DEFAULT NULL,\n" +
                "  `A60` float DEFAULT NULL,\n" +
                "  `A61` float DEFAULT NULL,\n" +
                "  `A62` float DEFAULT NULL,\n" +
                "  `A63` float DEFAULT NULL,\n" +
                "  `A64` float DEFAULT NULL,\n" +
                "  `A65` float DEFAULT NULL,\n" +
                "  `A66` float DEFAULT NULL,\n" +
                "  `A67` float DEFAULT NULL,\n" +
                "  `A68` float DEFAULT NULL,\n" +
                "  `A69` float DEFAULT NULL,\n" +
                "  `A7` float DEFAULT NULL,\n" +
                "  `A70` float DEFAULT NULL,\n" +
                "  `A71` float DEFAULT NULL,\n" +
                "  `A72` float DEFAULT NULL,\n" +
                "  `A73` float DEFAULT NULL,\n" +
                "  `A74` float DEFAULT NULL,\n" +
                "  `A75` float DEFAULT NULL,\n" +
                "  `A76` float DEFAULT NULL,\n" +
                "  `A77` float DEFAULT NULL,\n" +
                "  `A78` float DEFAULT NULL,\n" +
                "  `A79` float DEFAULT NULL,\n" +
                "  `A8` float DEFAULT NULL,\n" +
                "  `A80` float DEFAULT NULL,\n" +
                "  `A81` float DEFAULT NULL,\n" +
                "  `A82` bit(1) DEFAULT NULL,\n" +
                "  `A9` float DEFAULT NULL,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;";
        this.sqlList.add(extraTenSql);

    }

    @Override
    public String toString() {
        return "BuildSqlString{" +
                "version='" + version + '\'' +
                ", turbineNum=" + turbineNum +
                '}';
    }
}

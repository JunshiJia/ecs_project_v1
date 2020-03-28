package com.junshijia.ecs.create_table;

public class StaticStrings {
    //1s
    public static String oneSecString =
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
            "  `HMI_IReg[1405]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1406]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1407]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1408]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1422]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1423]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[153]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[155]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1572]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1573]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1574]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1575]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1576]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1577]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1672]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1673]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[237]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[238]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[239]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[240]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[241]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[242]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[243]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[244]` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[253]` float NOT NULL DEFAULT '0',\n" +
            "  `Wtid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
            "  `TimeStamp` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',\n" +
            "  `Time_S` double NOT NULL DEFAULT '0'," +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;";
    //any 1s
    public static String anyOneSecString =
            "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `HMI_IReg[107]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[108]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[110]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[121]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1405]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1406]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1407]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1408]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1422]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1423]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[155]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1563]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1564]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1565]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1575]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1576]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1577]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1584]` float DEFAULT NULL,\n" +
            "  `HMI_IReg[1670]` float DEFAULT NULL,\n" +
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
            "  `Wtid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
            "  `TimeStamp` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',\n" +
            "  `Time_S` double NOT NULL DEFAULT '0'," +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;";
    //10min
    public static String tenMinCalString =
            "  `id` int(11) NOT NULL AUTO_INCREMENT,\n" +
            "  `HMI_Disc[332]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[341]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[341]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[383]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[409]_Onflow` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[409]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[409]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[413]_Onflow` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[413]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[413]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[910]_And` bit(1) DEFAULT NULL,\n" +
            "  `HMI_Disc[910]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[910]_NumberMax` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[910]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_Disc[912]_NumberMax` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[101]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[101]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[101]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[102]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[103]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[104]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[105]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[106]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[107]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[108]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[110]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[110]_NumberMax` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[110]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[110]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[110]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[118]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[119]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[121]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[122]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1405]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1406]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1407]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1408]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1418]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1419]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1420]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1422]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1422]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1422]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1422]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1423]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1426]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1508]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1514]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1515]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1516]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1517]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1518]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1519]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[155]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[155]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[155]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1563]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1564]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1565]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1575]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1576]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1577]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1578]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1579]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1580]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1581]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1582]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1583]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1584]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1672]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1673]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[167]_And` bit(1) DEFAULT NULL,\n" +
            "  `HMI_IReg[167]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1683]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1691]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1692]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1693]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[1694]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[199]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[201]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[203]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[206]_And` bit(1) DEFAULT NULL,\n" +
            "  `HMI_IReg[206]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[206]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[210]_Onflow` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[210]_Max` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[210]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[210]_Min` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[210]_StdDiv` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[214]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[216]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[224]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[237]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[238]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[239]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[240]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[241]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[242]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[243]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[244]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `HMI_IReg[245]_Mean` float NOT NULL DEFAULT '0',\n" +
            "  `TimeStamp` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',\n" +
            "  `Time_S` double NOT NULL DEFAULT '0',\n" +
            "  `Wtid` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\n" +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;";
    //extra 10min
    public static String extraTenMinCalString =
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
            "  `A83` bit(1) DEFAULT NULL,\n" +
            "  PRIMARY KEY (`id`)\n" +
            ") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;";
}

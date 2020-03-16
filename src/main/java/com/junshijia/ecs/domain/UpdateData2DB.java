package com.junshijia.ecs.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="allTurbines_data")
public class UpdateData2DB{

	@Id
	@GenericGenerator(name = "id",strategy = "assigned")
	@GeneratedValue(generator = "id")
	@Column(name = "id", nullable = false)
	private int id;
	@Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型
	private Date time;
	private int wtId;
	@Column(name="`HMI_Disc[910]`")
	private boolean HMI_Disc910;
	@Column(name="`HMI_Disc[912]`")
	private boolean HMI_Disc912;
	@Column(name="`HMI_IReg[155]`")
	private Float HMI_IReg155;
	@Column(name="`HMI_IReg[199]`")
	private Float HMI_IReg199;
	@Column(name="`HMI_IReg[101]`")
	private Float HMI_IReg101;
	@Column(name="`HMI_IReg[102]`")
	private Float HMI_IReg102;
	@Column(name="`HMI_IReg[103]`")
	private Float HMI_IReg103;
	@Column(name="`HMI_IReg[104]`")
	private Float HMI_IReg104;
	@Column(name="`HMI_IReg[105]`")
	private Float HMI_IReg105;
	@Column(name="`HMI_IReg[106]`")
	private Float HMI_IReg106;
	@Column(name="`HMI_IReg[107]`")
	private Float HMI_IReg107;
	@Column(name="`HMI_IReg[108]`")
	private Float HMI_IReg108;
	@Column(name="`HMI_IReg[109]`")
	private Float HMI_IReg109;
	@Column(name="`HMI_IReg[110]`")
	private Float HMI_IReg110;
	@Column(name="`HMI_IReg[111]`")
	private Float HMI_IReg111;
	@Column(name="`HMI_Disc[922]`")
	private boolean HMI_Disc922;
	@Column(name="`HMI_Disc[923]`")
	private boolean HMI_Disc923;
	@Column(name="`HMI_IReg[118]`")
	private Float HMI_IReg118;
	@Column(name="`HMI_IReg[119]`")
	private Float HMI_IReg119;
	@Column(name="`HMI_IReg[121]`")
	private Float HMI_IReg121;
	@Column(name="`HMI_IReg[122]`")
	private Float HMI_IReg122;
	@Column(name="`HMI_Disc[1021]`")
	private boolean HMI_Disc1021;
	@Column(name="`HMI_Disc[1022]`")
	private boolean HMI_Disc1022;
	@Column(name="`HMI_IReg[201]`")
	private Float HMI_IReg201;
	@Column(name="`HMI_IReg[210]`")
	private Float HMI_IReg210;
	@Column(name="`HMI_IReg[206]`")
	private Float HMI_IReg206;
	@Column(name="`HMI_IReg[214]`")
	private Float HMI_IReg214;
	@Column(name="`HMI_IReg[216]`")
	private Float HMI_IReg216;
	@Column(name="`HMI_IReg[224]`")
	private Float HMI_IReg224;
	@Column(name="`HMI_IReg[237]`")
	private Float HMI_IReg237;
	@Column(name="`HMI_IReg[238]`")
	private Float HMI_IReg238;
	@Column(name="`HMI_IReg[239]`")
	private Float HMI_IReg239;
	@Column(name="`HMI_IReg[240]`")
	private Float HMI_IReg240;
	@Column(name="`HMI_IReg[241]`")
	private Float HMI_IReg241;
	@Column(name="`HMI_IReg[242]`")
	private Float HMI_IReg242;
	@Column(name="`HMI_IReg[243]`")
	private Float HMI_IReg243;
	@Column(name="`HMI_IReg[244]`")
	private Float HMI_IReg244;
	@Column(name="`HMI_IReg[245]`")
	private Float HMI_IReg245;
	@Column(name="`HMI_IReg[248]`")
	private Float HMI_IReg248;
	@Column(name="`HMI_Disc[1056]`")
	private boolean HMI_Disc1056;
	@Column(name="`HMI_IReg[253]`")
	private Float HMI_IReg253;
	@Column(name="`HMI_IReg[254]`")
	private Float HMI_IReg254;
	@Column(name="`HMI_IReg[261]`")
	private Float HMI_IReg261;
	@Column(name="`HMI_IReg[262]`")
	private Float HMI_IReg262;
	@Column(name="`HMI_Disc[1024]`")
	private boolean HMI_Disc1024;
	@Column(name="`HMI_Disc[1025]`")
	private boolean HMI_Disc1025;
	@Column(name="`HMI_Disc[1028]`")
	private boolean HMI_Disc1028;
	@Column(name="`HMI_Disc[1029]`")
	private boolean HMI_Disc1029;
	@Column(name="`HMI_Disc[1031]`")
	private boolean HMI_Disc1031;
	@Column(name="`HMI_Disc[1036]`")
	private boolean HMI_Disc1036;
	@Column(name="`HMI_IReg[352]`")
	private Float HMI_IReg352;
	@Column(name="`HMI_IReg[1405]`")
	private Float HMI_IReg1405;
	@Column(name="`HMI_IReg[1406]`")
	private Float HMI_IReg1406;
	@Column(name="`HMI_IReg[1407]`")
	private Float HMI_IReg1407;
	@Column(name="`HMI_IReg[1408]`")
	private Float HMI_IReg1408;
	@Column(name="`HMI_IReg[1412]`")
	private Float HMI_IReg1412;
	@Column(name="`HMI_IReg[1413]`")
	private Float HMI_IReg1413;
	@Column(name="`HMI_IReg[1414]`")
	private Float HMI_IReg1414;
	@Column(name="`HMI_IReg[1418]`")
	private Float HMI_IReg1418;
	@Column(name="`HMI_IReg[1419]`")
	private Float HMI_IReg1419;
	@Column(name="`HMI_IReg[1420]`")
	private Float HMI_IReg1420;
	@Column(name="`HMI_IReg[1422]`")
	private Float HMI_IReg1422;
	@Column(name="`HMI_IReg[1423]`")
	private Float HMI_IReg1423;
	@Column(name="`HMI_IReg[1426]`")
	private Float HMI_IReg1426;
	@Column(name="`HMI_IReg[1604]`")
	private Float HMI_IReg1604;
	@Column(name="`HMI_IReg[1605]`")
	private Float HMI_IReg1605;
	@Column(name="`HMI_IReg[1606]`")
	private Float HMI_IReg1606;
	@Column(name="`HMI_IReg[1608]`")
	private Float HMI_IReg1608;
	@Column(name="`HMI_IReg[1609]`")
	private Float HMI_IReg1609;
	@Column(name="`HMI_IReg[1610]`")
	private Float HMI_IReg1610;
	@Column(name="`HMI_IReg[1614]`")
	private Float HMI_IReg1614;
	@Column(name="`HMI_IReg[1615]`")
	private Float HMI_IReg1615;
	@Column(name="`HMI_IReg[1616]`")
	private Float HMI_IReg1616;
	@Column(name="`HMI_IReg[1617]`")
	private Float HMI_IReg1617;
	@Column(name="`HMI_IReg[1618]`")
	private Float HMI_IReg1618;
	@Column(name="`HMI_IReg[1619]`")
	private Float HMI_IReg1619;
	@Column(name="`HMI_IReg[1637]`")
	private Float HMI_IReg1637;
	@Column(name="`HMI_IReg[1638]`")
	private Float HMI_IReg1638;
	@Column(name="`HMI_IReg[1639]`")
	private Float HMI_IReg1639;
	@Column(name="`HMI_IReg[1640]`")
	private Float HMI_IReg1640;
	@Column(name="`HMI_IReg[1641]`")
	private Float HMI_IReg1641;
	@Column(name="`HMI_IReg[1642]`")
	private Float HMI_IReg1642;
	@Column(name="`HMI_IReg[1644]`")
	private Float HMI_IReg1644;
	@Column(name="`HMI_IReg[1645]`")
	private Float HMI_IReg1645;
	@Column(name="`HMI_IReg[1646]`")
	private Float HMI_IReg1646;
	@Column(name="`HMI_Disc[1553]`")
	private boolean HMI_Disc1553;
	@Column(name="`HMI_Disc[1554]`")
	private boolean HMI_Disc1554;
	@Column(name="`HMI_Disc[1555]`")
	private boolean HMI_Disc1555;
	@Column(name="`HMI_Disc[1589]`")
	private boolean HMI_Disc1589;
	@Column(name="`HMI_Disc[1651]`")
	private boolean HMI_Disc1651;
	@Column(name="`HMI_Disc[1652]`")
	private boolean HMI_Disc1652;
	@Column(name="`HMI_Disc[1653]`")
	private boolean HMI_Disc1653;
	@Column(name="`HMI_Disc[1654]`")
	private boolean HMI_Disc1654;
	@Column(name="`HMI_Disc[1655]`")
	private boolean HMI_Disc1655;
	@Column(name="`HMI_Disc[1656]`")
	private boolean HMI_Disc1656;
	@Column(name="`HMI_Disc[1657]`")
	private boolean HMI_Disc1657;
	@Column(name="`HMI_Disc[1658]`")
	private boolean HMI_Disc1658;
	@Column(name="`HMI_Disc[1659]`")
	private boolean HMI_Disc1659;
	@Column(name="`HMI_Disc[1660]`")
	private boolean HMI_Disc1660;
	@Column(name="`HMI_Disc[1661]`")
	private boolean HMI_Disc1661;
	@Column(name="`HMI_Disc[1662]`")
	private boolean HMI_Disc1662;
	@Column(name="`HMI_Disc[1663]`")
	private boolean HMI_Disc1663;
	@Column(name="`HMI_Disc[1664]`")
	private boolean HMI_Disc1664;
	@Column(name="`HMI_Disc[1665]`")
	private boolean HMI_Disc1665;
	@Column(name="`HMI_Disc[1666]`")
	private boolean HMI_Disc1666;
	@Column(name="`HMI_Disc[1667]`")
	private boolean HMI_Disc1667;
	@Column(name="`HMI_Disc[1668]`")
	private boolean HMI_Disc1668;
	@Column(name="`HMI_Disc[1669]`")
	private boolean HMI_Disc1669;
	@Column(name="`HMI_Disc[1670]`")
	private boolean HMI_Disc1670;
	@Column(name="`HMI_Disc[1671]`")
	private boolean HMI_Disc1671;
	@Column(name="`HMI_Disc[1672]`")
	private boolean HMI_Disc1672;
	@Column(name="`HMI_Disc[1673]`")
	private boolean HMI_Disc1673;
	@Column(name="`HMI_Disc[1674]`")
	private boolean HMI_Disc1674;
	@Column(name="`HMI_Disc[1675]`")
	private boolean HMI_Disc1675;
	@Column(name="`HMI_Disc[1676]`")
	private boolean HMI_Disc1676;
	@Column(name="`HMI_Disc[1677]`")
	private boolean HMI_Disc1677;
	@Column(name="`HMI_Disc[1678]`")
	private boolean HMI_Disc1678;
	@Column(name="`HMI_Disc[1679]`")
	private boolean HMI_Disc1679;
	@Column(name="`HMI_Disc[1680]`")
	private boolean HMI_Disc1680;
	@Column(name="`HMI_Disc[1681]`")
	private boolean HMI_Disc1681;
	@Column(name="`HMI_Disc[1682]`")
	private boolean HMI_Disc1682;
	@Column(name="`HMI_Disc[1683]`")
	private boolean HMI_Disc1683;
	@Column(name="`HMI_Disc[1684]`")
	private boolean HMI_Disc1684;
	@Column(name="`HMI_IReg[1651]`")
	private Float HMI_IReg1651;
	@Column(name="`HMI_IReg[1652]`")
	private Float HMI_IReg1652;
	@Column(name="`HMI_IReg[1655]`")
	private Float HMI_IReg1655;
	@Column(name="`HMI_IReg[1656]`")
	private Float HMI_IReg1656;
	@Column(name="`HMI_IReg[1657]`")
	private Float HMI_IReg1657;
	@Column(name="`HMI_IReg[1658]`")
	private Float HMI_IReg1658;
	@Column(name="`HMI_IReg[1665]`")
	private Float HMI_IReg1665;
	@Column(name="`HMI_IReg[1666]`")
	private Float HMI_IReg1666;
	@Column(name="`HMI_IReg[1667]`")
	private Float HMI_IReg1667;
	@Column(name="`HMI_IReg[1677]`")
	private Float HMI_IReg1677;
	@Column(name="`HMI_IReg[1691]`")
	private Float HMI_IReg1691;
	@Column(name="`HMI_IReg[1692]`")
	private Float HMI_IReg1692;
	@Column(name="`HMI_IReg[1693]`")
	private Float HMI_IReg1693;
	@Column(name="`HMI_IReg[1694]`")
	private Float HMI_IReg1694;
	@Column(name="`HMI_IReg[796]`")
	private Float HMI_IReg796;
	@Column(name="`HMI_Disc[1304]`")
	private boolean HMI_Disc1304;
	@Column(name="`HMI_Disc[1305]`")
	private boolean HMI_Disc1305;
	@Column(name="`HMI_IReg[1508]`")
	private Float HMI_IReg1508;
	@Column(name="`HMI_IReg[1514]`")
	private Float HMI_IReg1514;
	@Column(name="`HMI_IReg[1515]`")
	private Float HMI_IReg1515;
	@Column(name="`HMI_IReg[1516]`")
	private Float HMI_IReg1516;
	@Column(name="`HMI_IReg[1517]`")
	private Float HMI_IReg1517;
	@Column(name="`HMI_IReg[1518]`")
	private Float HMI_IReg1518;
	@Column(name="`HMI_IReg[1519]`")
	private Float HMI_IReg1519;
	@Column(name="`HMI_Disc[301]`")
	private boolean HMI_Disc301;
	@Column(name="`HMI_Disc[302]`")
	private boolean HMI_Disc302;
	@Column(name="`HMI_Disc[303]`")
	private boolean HMI_Disc303;
	@Column(name="`HMI_Disc[304]`")
	private boolean HMI_Disc304;
	@Column(name="`HMI_Disc[305]`")
	private boolean HMI_Disc305;
	@Column(name="`HMI_Disc[306]`")
	private boolean HMI_Disc306;
	@Column(name="`HMI_Disc[307]`")
	private boolean HMI_Disc307;
	@Column(name="`HMI_Disc[308]`")
	private boolean HMI_Disc308;
	@Column(name="`HMI_Disc[309]`")
	private boolean HMI_Disc309;
	@Column(name="`HMI_Disc[310]`")
	private boolean HMI_Disc310;
	@Column(name="`HMI_Disc[311]`")
	private boolean HMI_Disc311;
	@Column(name="`HMI_Disc[312]`")
	private boolean HMI_Disc312;
	@Column(name="`HMI_Disc[313]`")
	private boolean HMI_Disc313;
	@Column(name="`HMI_Disc[314]`")
	private boolean HMI_Disc314;
	@Column(name="`HMI_Disc[315]`")
	private boolean HMI_Disc315;
	@Column(name="`HMI_Disc[316]`")
	private boolean HMI_Disc316;
	@Column(name="`HMI_Disc[317]`")
	private boolean HMI_Disc317;
	@Column(name="`HMI_Disc[318]`")
	private boolean HMI_Disc318;
	@Column(name="`HMI_Disc[319]`")
	private boolean HMI_Disc319;
	@Column(name="`HMI_Disc[320]`")
	private boolean HMI_Disc320;
	@Column(name="`HMI_Disc[321]`")
	private boolean HMI_Disc321;
	@Column(name="`HMI_Disc[322]`")
	private boolean HMI_Disc322;
	@Column(name="`HMI_Disc[323]`")
	private boolean HMI_Disc323;
	@Column(name="`HMI_Disc[324]`")
	private boolean HMI_Disc324;
	@Column(name="`HMI_Disc[325]`")
	private boolean HMI_Disc325;
	@Column(name="`HMI_Disc[326]`")
	private boolean HMI_Disc326;
	@Column(name="`HMI_Disc[327]`")
	private boolean HMI_Disc327;
	@Column(name="`HMI_Disc[328]`")
	private boolean HMI_Disc328;
	@Column(name="`HMI_Disc[329]`")
	private boolean HMI_Disc329;
	@Column(name="`HMI_Disc[330]`")
	private boolean HMI_Disc330;
	@Column(name="`HMI_Disc[331]`")
	private boolean HMI_Disc331;
	@Column(name="`HMI_Disc[332]`")
	private boolean HMI_Disc332;
	@Column(name="`HMI_Disc[333]`")
	private boolean HMI_Disc333;
	@Column(name="`HMI_Disc[334]`")
	private boolean HMI_Disc334;
	@Column(name="`HMI_Disc[335]`")
	private boolean HMI_Disc335;
	@Column(name="`HMI_Disc[336]`")
	private boolean HMI_Disc336;
	@Column(name="`HMI_Disc[337]`")
	private boolean HMI_Disc337;
	@Column(name="`HMI_Disc[338]`")
	private boolean HMI_Disc338;
	@Column(name="`HMI_Disc[339]`")
	private boolean HMI_Disc339;
	@Column(name="`HMI_Disc[340]`")
	private boolean HMI_Disc340;
	@Column(name="`HMI_Disc[341]`")
	private boolean HMI_Disc341;
	@Column(name="`HMI_Disc[342]`")
	private boolean HMI_Disc342;
	@Column(name="`HMI_Disc[343]`")
	private boolean HMI_Disc343;
	@Column(name="`HMI_Disc[344]`")
	private boolean HMI_Disc344;
	@Column(name="`HMI_Disc[345]`")
	private boolean HMI_Disc345;
	@Column(name="`HMI_Disc[346]`")
	private boolean HMI_Disc346;
	@Column(name="`HMI_Disc[347]`")
	private boolean HMI_Disc347;
	@Column(name="`HMI_Disc[348]`")
	private boolean HMI_Disc348;
	@Column(name="`HMI_Disc[349]`")
	private boolean HMI_Disc349;
	@Column(name="`HMI_Disc[350]`")
	private boolean HMI_Disc350;
	@Column(name="`HMI_Disc[351]`")
	private boolean HMI_Disc351;
	@Column(name="`HMI_Disc[352]`")
	private boolean HMI_Disc352;
	@Column(name="`HMI_Disc[353]`")
	private boolean HMI_Disc353;
	@Column(name="`HMI_Disc[354]`")
	private boolean HMI_Disc354;
	@Column(name="`HMI_Disc[355]`")
	private boolean HMI_Disc355;
	@Column(name="`HMI_Disc[356]`")
	private boolean HMI_Disc356;
	@Column(name="`HMI_Disc[357]`")
	private boolean HMI_Disc357;
	@Column(name="`HMI_Disc[358]`")
	private boolean HMI_Disc358;
	@Column(name="`HMI_Disc[359]`")
	private boolean HMI_Disc359;
	@Column(name="`HMI_Disc[360]`")
	private boolean HMI_Disc360;
	@Column(name="`HMI_Disc[361]`")
	private boolean HMI_Disc361;
	@Column(name="`HMI_Disc[362]`")
	private boolean HMI_Disc362;
	@Column(name="`HMI_Disc[363]`")
	private boolean HMI_Disc363;
	@Column(name="`HMI_Disc[364]`")
	private boolean HMI_Disc364;
	@Column(name="`HMI_Disc[365]`")
	private boolean HMI_Disc365;
	@Column(name="`HMI_Disc[366]`")
	private boolean HMI_Disc366;
	@Column(name="`HMI_Disc[367]`")
	private boolean HMI_Disc367;
	@Column(name="`HMI_Disc[368]`")
	private boolean HMI_Disc368;
	@Column(name="`HMI_Disc[369]`")
	private boolean HMI_Disc369;
	@Column(name="`HMI_Disc[370]`")
	private boolean HMI_Disc370;
	@Column(name="`HMI_Disc[371]`")
	private boolean HMI_Disc371;
	@Column(name="`HMI_Disc[372]`")
	private boolean HMI_Disc372;
	@Column(name="`HMI_Disc[373]`")
	private boolean HMI_Disc373;
	@Column(name="`HMI_Disc[374]`")
	private boolean HMI_Disc374;
	@Column(name="`HMI_Disc[375]`")
	private boolean HMI_Disc375;
	@Column(name="`HMI_Disc[376]`")
	private boolean HMI_Disc376;
	@Column(name="`HMI_Disc[377]`")
	private boolean HMI_Disc377;
	@Column(name="`HMI_Disc[378]`")
	private boolean HMI_Disc378;
	@Column(name="`HMI_Disc[379]`")
	private boolean HMI_Disc379;
	@Column(name="`HMI_Disc[380]`")
	private boolean HMI_Disc380;
	@Column(name="`HMI_Disc[381]`")
	private boolean HMI_Disc381;
	@Column(name="`HMI_Disc[382]`")
	private boolean HMI_Disc382;
	@Column(name="`HMI_Disc[383]`")
	private boolean HMI_Disc383;
	@Column(name="`HMI_Disc[384]`")
	private boolean HMI_Disc384;
	@Column(name="`HMI_Disc[385]`")
	private boolean HMI_Disc385;
	@Column(name="`HMI_Disc[386]`")
	private boolean HMI_Disc386;
	@Column(name="`HMI_Disc[387]`")
	private boolean HMI_Disc387;
	@Column(name="`HMI_Disc[388]`")
	private boolean HMI_Disc388;
	@Column(name="`HMI_Disc[389]`")
	private boolean HMI_Disc389;
	@Column(name="`HMI_Disc[390]`")
	private boolean HMI_Disc390;
	@Column(name="`HMI_Disc[391]`")
	private boolean HMI_Disc391;
	@Column(name="`HMI_Disc[392]`")
	private boolean HMI_Disc392;
	@Column(name="`HMI_Disc[393]`")
	private boolean HMI_Disc393;
	@Column(name="`HMI_Disc[394]`")
	private boolean HMI_Disc394;
	@Column(name="`HMI_Disc[395]`")
	private boolean HMI_Disc395;
	@Column(name="`HMI_Disc[396]`")
	private boolean HMI_Disc396;
	@Column(name="`HMI_Disc[397]`")
	private boolean HMI_Disc397;
	@Column(name="`HMI_Disc[398]`")
	private boolean HMI_Disc398;
	@Column(name="`HMI_Disc[399]`")
	private boolean HMI_Disc399;
	@Column(name="`HMI_Disc[400]`")
	private boolean HMI_Disc400;
	@Column(name="`HMI_Disc[401]`")
	private boolean HMI_Disc401;
	@Column(name="`HMI_Disc[402]`")
	private boolean HMI_Disc402;
	@Column(name="`HMI_Disc[403]`")
	private boolean HMI_Disc403;
	@Column(name="`HMI_Disc[404]`")
	private boolean HMI_Disc404;
	@Column(name="`HMI_Disc[405]`")
	private boolean HMI_Disc405;
	@Column(name="`HMI_Disc[406]`")
	private boolean HMI_Disc406;
	@Column(name="`HMI_Disc[407]`")
	private boolean HMI_Disc407;
	@Column(name="`HMI_Disc[408]`")
	private boolean HMI_Disc408;
	@Column(name="`HMI_Disc[409]`")
	private boolean HMI_Disc409;
	@Column(name="`HMI_Disc[410]`")
	private boolean HMI_Disc410;
	@Column(name="`HMI_Disc[411]`")
	private boolean HMI_Disc411;
	@Column(name="`HMI_Disc[412]`")
	private boolean HMI_Disc412;
	@Column(name="`HMI_Disc[413]`")
	private boolean HMI_Disc413;
	@Column(name="`HMI_Disc[414]`")
	private boolean HMI_Disc414;
	@Column(name="`HMI_Disc[415]`")
	private boolean HMI_Disc415;
	@Column(name="`HMI_Disc[416]`")
	private boolean HMI_Disc416;
	@Column(name="`HMI_Disc[417]`")
	private boolean HMI_Disc417;
	@Column(name="`HMI_Disc[418]`")
	private boolean HMI_Disc418;
	@Column(name="`HMI_Disc[419]`")
	private boolean HMI_Disc419;
	@Column(name="`HMI_Disc[420]`")
	private boolean HMI_Disc420;
	@Column(name="`HMI_Disc[421]`")
	private boolean HMI_Disc421;
	@Column(name="`HMI_Disc[422]`")
	private boolean HMI_Disc422;
	@Column(name="`HMI_Disc[423]`")
	private boolean HMI_Disc423;
	@Column(name="`HMI_Disc[424]`")
	private boolean HMI_Disc424;
	@Column(name="`HMI_Disc[425]`")
	private boolean HMI_Disc425;
	@Column(name="`HMI_Disc[426]`")
	private boolean HMI_Disc426;
	@Column(name="`HMI_Disc[427]`")
	private boolean HMI_Disc427;
	@Column(name="`HMI_Disc[428]`")
	private boolean HMI_Disc428;
	@Column(name="`HMI_Disc[429]`")
	private boolean HMI_Disc429;
	@Column(name="`HMI_Disc[430]`")
	private boolean HMI_Disc430;
	@Column(name="`HMI_Disc[431]`")
	private boolean HMI_Disc431;
	@Column(name="`HMI_Disc[432]`")
	private boolean HMI_Disc432;
	@Column(name="`HMI_Disc[433]`")
	private boolean HMI_Disc433;
	@Column(name="`HMI_Disc[434]`")
	private boolean HMI_Disc434;
	@Column(name="`HMI_Disc[435]`")
	private boolean HMI_Disc435;
	@Column(name="`HMI_Disc[436]`")
	private boolean HMI_Disc436;
	@Column(name="`HMI_Disc[437]`")
	private boolean HMI_Disc437;
	@Column(name="`HMI_Disc[438]`")
	private boolean HMI_Disc438;
	@Column(name="`HMI_Disc[439]`")
	private boolean HMI_Disc439;
	@Column(name="`HMI_Disc[440]`")
	private boolean HMI_Disc440;
	@Column(name="`HMI_Disc[441]`")
	private boolean HMI_Disc441;
	@Column(name="`HMI_Disc[442]`")
	private boolean HMI_Disc442;
	@Column(name="`HMI_Disc[443]`")
	private boolean HMI_Disc443;
	@Column(name="`HMI_Disc[444]`")
	private boolean HMI_Disc444;
	@Column(name="`HMI_Disc[445]`")
	private boolean HMI_Disc445;
	@Column(name="`HMI_Disc[446]`")
	private boolean HMI_Disc446;
	@Column(name="`HMI_Disc[447]`")
	private boolean HMI_Disc447;
	@Column(name="`HMI_Disc[448]`")
	private boolean HMI_Disc448;
	@Column(name="`HMI_Disc[449]`")
	private boolean HMI_Disc449;
	@Column(name="`HMI_Disc[450]`")
	private boolean HMI_Disc450;
	@Column(name="`HMI_Disc[451]`")
	private boolean HMI_Disc451;
	@Column(name="`HMI_Disc[452]`")
	private boolean HMI_Disc452;
	@Column(name="`HMI_Disc[453]`")
	private boolean HMI_Disc453;
	@Column(name="`HMI_Disc[454]`")
	private boolean HMI_Disc454;
	@Column(name="`HMI_Disc[455]`")
	private boolean HMI_Disc455;
	@Column(name="`HMI_Disc[456]`")
	private boolean HMI_Disc456;
	@Column(name="`HMI_Disc[457]`")
	private boolean HMI_Disc457;
	@Column(name="`HMI_Disc[458]`")
	private boolean HMI_Disc458;
	@Column(name="`HMI_Disc[459]`")
	private boolean HMI_Disc459;
	@Column(name="`HMI_Disc[460]`")
	private boolean HMI_Disc460;
	@Column(name="`HMI_Disc[461]`")
	private boolean HMI_Disc461;
	@Column(name="`HMI_Disc[462]`")
	private boolean HMI_Disc462;
	@Column(name="`HMI_Disc[463]`")
	private boolean HMI_Disc463;
	@Column(name="`HMI_Disc[464]`")
	private boolean HMI_Disc464;
	@Column(name="`HMI_Disc[465]`")
	private boolean HMI_Disc465;
	@Column(name="`HMI_Disc[466]`")
	private boolean HMI_Disc466;
	@Column(name="`HMI_Disc[467]`")
	private boolean HMI_Disc467;
	@Column(name="`HMI_Disc[468]`")
	private boolean HMI_Disc468;
	@Column(name="`HMI_Disc[469]`")
	private boolean HMI_Disc469;
	@Column(name="`HMI_Disc[474]`")
	private boolean HMI_Disc474;
	@Column(name="`HMI_Disc[475]`")
	private boolean HMI_Disc475;
	@Column(name="`HMI_Disc[476]`")
	private boolean HMI_Disc476;
	@Column(name="`HMI_Disc[477]`")
	private boolean HMI_Disc477;
	@Column(name="`HMI_Disc[478]`")
	private boolean HMI_Disc478;
	@Column(name="`HMI_Disc[600]`")
	private boolean HMI_Disc600;
	@Column(name="`HMI_Disc[601]`")
	private boolean HMI_Disc601;
	@Column(name="`HMI_Disc[602]`")
	private boolean HMI_Disc602;
	@Column(name="`HMI_Disc[603]`")
	private boolean HMI_Disc603;
	@Column(name="`HMI_Disc[604]`")
	private boolean HMI_Disc604;
	@Column(name="`HMI_Disc[605]`")
	private boolean HMI_Disc605;
	@Column(name="`HMI_Disc[606]`")
	private boolean HMI_Disc606;
	@Column(name="`HMI_Disc[607]`")
	private boolean HMI_Disc607;
	@Column(name="`HMI_Disc[608]`")
	private boolean HMI_Disc608;
	@Column(name="`HMI_Disc[609]`")
	private boolean HMI_Disc609;
	@Column(name="`HMI_Disc[610]`")
	private boolean HMI_Disc610;
	@Column(name="`HMI_Disc[611]`")
	private boolean HMI_Disc611;
	@Column(name="`HMI_Disc[612]`")
	private boolean HMI_Disc612;
	@Column(name="`HMI_Disc[613]`")
	private boolean HMI_Disc613;
	@Column(name="`HMI_Disc[614]`")
	private boolean HMI_Disc614;
	@Column(name="`HMI_Disc[615]`")
	private boolean HMI_Disc615;
	@Column(name="`HMI_Disc[616]`")
	private boolean HMI_Disc616;
	@Column(name="`HMI_Disc[617]`")
	private boolean HMI_Disc617;
	@Column(name="`HMI_Disc[618]`")
	private boolean HMI_Disc618;
	@Column(name="`HMI_Disc[619]`")
	private boolean HMI_Disc619;
	@Column(name="`HMI_Disc[620]`")
	private boolean HMI_Disc620;
	@Column(name="`HMI_Disc[621]`")
	private boolean HMI_Disc621;
	@Column(name="`HMI_Disc[622]`")
	private boolean HMI_Disc622;
	@Column(name="`HMI_Disc[623]`")
	private boolean HMI_Disc623;
	@Column(name="`HMI_Disc[624]`")
	private boolean HMI_Disc624;
	@Column(name="`HMI_Disc[625]`")
	private boolean HMI_Disc625;
	@Column(name="`HMI_Disc[626]`")
	private boolean HMI_Disc626;
	@Column(name="`HMI_Disc[627]`")
	private boolean HMI_Disc627;
	@Column(name="`HMI_Disc[628]`")
	private boolean HMI_Disc628;
	@Column(name="`HMI_Disc[629]`")
	private boolean HMI_Disc629;
	@Column(name="`HMI_Disc[630]`")
	private boolean HMI_Disc630;
	@Column(name="`HMI_Disc[631]`")
	private boolean HMI_Disc631;
	@Column(name="`HMI_Disc[632]`")
	private boolean HMI_Disc632;
	@Column(name="`HMI_Disc[633]`")
	private boolean HMI_Disc633;
	@Column(name="`HMI_Disc[634]`")
	private boolean HMI_Disc634;
	@Column(name="`HMI_Disc[635]`")
	private boolean HMI_Disc635;
	@Column(name="`HMI_Disc[636]`")
	private boolean HMI_Disc636;
	@Column(name="`HMI_Disc[637]`")
	private boolean HMI_Disc637;
	@Column(name="`HMI_Disc[638]`")
	private boolean HMI_Disc638;
	@Column(name="`HMI_Disc[639]`")
	private boolean HMI_Disc639;
	@Column(name="`HMI_Disc[640]`")
	private boolean HMI_Disc640;
	@Column(name="`HMI_Disc[641]`")
	private boolean HMI_Disc641;
	@Column(name="`HMI_Disc[642]`")
	private boolean HMI_Disc642;
	@Column(name="`HMI_Disc[643]`")
	private boolean HMI_Disc643;
	@Column(name="`HMI_Disc[644]`")
	private boolean HMI_Disc644;
	@Column(name="`HMI_Disc[645]`")
	private boolean HMI_Disc645;
	@Column(name="`HMI_Disc[646]`")
	private boolean HMI_Disc646;
	@Column(name="`HMI_Disc[647]`")
	private boolean HMI_Disc647;
	@Column(name="`HMI_Disc[648]`")
	private boolean HMI_Disc648;
	@Column(name="`HMI_Disc[649]`")
	private boolean HMI_Disc649;
	@Column(name="`HMI_Disc[650]`")
	private boolean HMI_Disc650;
	@Column(name="`HMI_Disc[651]`")
	private boolean HMI_Disc651;
	@Column(name="`HMI_Disc[652]`")
	private boolean HMI_Disc652;
	@Column(name="`HMI_Disc[653]`")
	private boolean HMI_Disc653;
	@Column(name="`HMI_Disc[654]`")
	private boolean HMI_Disc654;
	@Column(name="`HMI_Disc[655]`")
	private boolean HMI_Disc655;
	@Column(name="`HMI_Disc[656]`")
	private boolean HMI_Disc656;
	@Column(name="`HMI_Disc[657]`")
	private boolean HMI_Disc657;
	@Column(name="`HMI_Disc[658]`")
	private boolean HMI_Disc658;
	@Column(name="`HMI_Disc[659]`")
	private boolean HMI_Disc659;
	@Column(name="`HMI_Disc[660]`")
	private boolean HMI_Disc660;
	@Column(name="`HMI_Disc[661]`")
	private boolean HMI_Disc661;
	@Column(name="`HMI_Disc[662]`")
	private boolean HMI_Disc662;
	@Column(name="`HMI_Disc[663]`")
	private boolean HMI_Disc663;
	@Column(name="`HMI_Disc[664]`")
	private boolean HMI_Disc664;
	@Column(name="`HMI_Disc[665]`")
	private boolean HMI_Disc665;
	@Column(name="`HMI_Disc[666]`")
	private boolean HMI_Disc666;
	@Column(name="`HMI_Disc[667]`")
	private boolean HMI_Disc667;
	@Column(name="`HMI_Disc[668]`")
	private boolean HMI_Disc668;
	@Column(name="`HMI_Disc[669]`")
	private boolean HMI_Disc669;
	@Column(name="`HMI_Disc[670]`")
	private boolean HMI_Disc670;
	@Column(name="`HMI_Disc[671]`")
	private boolean HMI_Disc671;
	@Column(name="`HMI_Disc[672]`")
	private boolean HMI_Disc672;
	@Column(name="`HMI_Disc[673]`")
	private boolean HMI_Disc673;
	@Column(name="`HMI_Disc[674]`")
	private boolean HMI_Disc674;
	@Column(name="`HMI_Disc[675]`")
	private boolean HMI_Disc675;
	@Column(name="`HMI_Disc[676]`")
	private boolean HMI_Disc676;
	@Column(name="`HMI_Disc[677]`")
	private boolean HMI_Disc677;
	@Column(name="`HMI_Disc[678]`")
	private boolean HMI_Disc678;
	@Column(name="`HMI_Disc[679]`")
	private boolean HMI_Disc679;
	@Column(name="`HMI_Disc[680]`")
	private boolean HMI_Disc680;
	@Column(name="`HMI_Disc[681]`")
	private boolean HMI_Disc681;
	@Column(name="`HMI_Disc[682]`")
	private boolean HMI_Disc682;
	@Column(name="`HMI_Disc[683]`")
	private boolean HMI_Disc683;
	@Column(name="`HMI_Disc[684]`")
	private boolean HMI_Disc684;
	@Column(name="`HMI_Disc[685]`")
	private boolean HMI_Disc685;
	@Column(name="`HMI_Disc[686]`")
	private boolean HMI_Disc686;
	@Column(name="`HMI_Disc[687]`")
	private boolean HMI_Disc687;
	@Column(name="`HMI_Disc[688]`")
	private boolean HMI_Disc688;
	@Column(name="`HMI_Disc[689]`")
	private boolean HMI_Disc689;
	@Column(name="`HMI_Disc[690]`")
	private boolean HMI_Disc690;
	@Column(name="`HMI_Disc[691]`")
	private boolean HMI_Disc691;
	@Column(name="`HMI_Disc[692]`")
	private boolean HMI_Disc692;
	@Column(name="`HMI_Disc[693]`")
	private boolean HMI_Disc693;
	@Column(name="`HMI_Disc[694]`")
	private boolean HMI_Disc694;
	@Column(name="`HMI_Disc[695]`")
	private boolean HMI_Disc695;
	@Column(name="`HMI_Disc[696]`")
	private boolean HMI_Disc696;
	@Column(name="`HMI_Disc[697]`")
	private boolean HMI_Disc697;
	@Column(name="`HMI_Disc[698]`")
	private boolean HMI_Disc698;
	@Column(name="`HMI_Disc[699]`")
	private boolean HMI_Disc699;
	@Column(name="`HMI_Disc[700]`")
	private boolean HMI_Disc700;
	@Column(name="`HMI_Disc[701]`")
	private boolean HMI_Disc701;
	@Column(name="`HMI_Disc[702]`")
	private boolean HMI_Disc702;
	@Column(name="`HMI_Disc[703]`")
	private boolean HMI_Disc703;
	@Column(name="`HMI_Disc[704]`")
	private boolean HMI_Disc704;
	@Column(name="`HMI_Disc[705]`")
	private boolean HMI_Disc705;
	@Column(name="`HMI_Disc[706]`")
	private boolean HMI_Disc706;
	@Column(name="`HMI_Disc[707]`")
	private boolean HMI_Disc707;
	@Column(name="`HMI_Disc[708]`")
	private boolean HMI_Disc708;
	@Column(name="`HMI_Disc[709]`")
	private boolean HMI_Disc709;
	@Column(name="`HMI_Disc[710]`")
	private boolean HMI_Disc710;
	@Column(name="`HMI_Disc[711]`")
	private boolean HMI_Disc711;
	@Column(name="`HMI_Disc[712]`")
	private boolean HMI_Disc712;
	@Column(name="`HMI_Disc[713]`")
	private boolean HMI_Disc713;
	@Column(name="`HMI_Disc[714]`")
	private boolean HMI_Disc714;
	@Column(name="`HMI_Disc[715]`")
	private boolean HMI_Disc715;
	@Column(name="`HMI_Disc[716]`")
	private boolean HMI_Disc716;
	@Column(name="`HMI_Disc[717]`")
	private boolean HMI_Disc717;
	@Column(name="`HMI_Disc[718]`")
	private boolean HMI_Disc718;
	@Column(name="`HMI_Disc[719]`")
	private boolean HMI_Disc719;
	@Column(name="`HMI_Disc[720]`")
	private boolean HMI_Disc720;
	@Column(name="`HMI_Disc[721]`")
	private boolean HMI_Disc721;
	@Column(name="`HMI_Disc[722]`")
	private boolean HMI_Disc722;
	@Column(name="`HMI_Disc[723]`")
	private boolean HMI_Disc723;
	@Column(name="`HMI_Disc[724]`")
	private boolean HMI_Disc724;
	@Column(name="`HMI_Disc[725]`")
	private boolean HMI_Disc725;
	@Column(name="`HMI_Disc[726]`")
	private boolean HMI_Disc726;
	@Column(name="`HMI_Disc[727]`")
	private boolean HMI_Disc727;
	@Column(name="`HMI_Disc[728]`")
	private boolean HMI_Disc728;
	@Column(name="`HMI_Disc[729]`")
	private boolean HMI_Disc729;
	@Column(name="`HMI_Disc[730]`")
	private boolean HMI_Disc730;
	@Column(name="`HMI_Disc[731]`")
	private boolean HMI_Disc731;
	@Column(name="`HMI_Disc[732]`")
	private boolean HMI_Disc732;
	@Column(name="`HMI_Disc[733]`")
	private boolean HMI_Disc733;
	@Column(name="`HMI_Disc[734]`")
	private boolean HMI_Disc734;
	@Column(name="`HMI_Disc[735]`")
	private boolean HMI_Disc735;
	@Column(name="`HMI_Disc[736]`")
	private boolean HMI_Disc736;
	@Column(name="`HMI_Disc[737]`")
	private boolean HMI_Disc737;
	@Column(name="`HMI_Disc[738]`")
	private boolean HMI_Disc738;
	@Column(name="`HMI_Disc[739]`")
	private boolean HMI_Disc739;
	@Column(name="`HMI_Disc[740]`")
	private boolean HMI_Disc740;
	@Column(name="`HMI_Disc[741]`")
	private boolean HMI_Disc741;
	@Column(name="`HMI_Disc[742]`")
	private boolean HMI_Disc742;
	@Column(name="`HMI_Disc[743]`")
	private boolean HMI_Disc743;
	@Column(name="`HMI_Disc[824]`")
	private boolean HMI_Disc824;
	@Column(name="`HMI_Disc[825]`")
	private boolean HMI_Disc825;
	@Column(name="`HMI_Disc[826]`")
	private boolean HMI_Disc826;
	@Column(name="`HMI_Disc[827]`")
	private boolean HMI_Disc827;
	@Column(name="`HMI_Disc[828]`")
	private boolean HMI_Disc828;
	@Column(name="`HMI_Disc[829]`")
	private boolean HMI_Disc829;
	@Column(name="`HMI_Disc[830]`")
	private boolean HMI_Disc830;
	@Column(name="`HMI_Disc[831]`")
	private boolean HMI_Disc831;
	@Column(name="`HMI_Disc[832]`")
	private boolean HMI_Disc832;
	@Column(name="`HMI_Disc[833]`")
	private boolean HMI_Disc833;
	@Column(name="`HMI_Disc[834]`")
	private boolean HMI_Disc834;
	@Column(name="`HMI_Disc[835]`")
	private boolean HMI_Disc835;
	@Column(name="`HMI_Disc[836]`")
	private boolean HMI_Disc836;
	@Column(name="`HMI_Disc[837]`")
	private boolean HMI_Disc837;
	@Column(name="`HMI_Disc[46]`")
	private boolean HMI_Disc46;
	@Column(name="`HMI_Disc[47]`")
	private boolean HMI_Disc47;
	@Column(name="`HMI_Disc[48]`")
	private boolean HMI_Disc48;
	@Column(name="`HMI_Disc[66]`")
	private boolean HMI_Disc66;
	@Column(name="`HMI_Disc[112]`")
	private boolean HMI_Disc112;
	@Column(name="`HMI_Disc[113]`")
	private boolean HMI_Disc113;
	@Column(name="`HMI_Disc[115]`")
	private boolean HMI_Disc115;

	@Override
	public String toString() {
		return "UpdateData2DB{" +
				"id=" + id +
				", time=" + time +
				", wtId=" + wtId +
				", HMI_Disc910=" + HMI_Disc910 +
				", HMI_Disc912=" + HMI_Disc912 +
				", HMI_IReg155=" + HMI_IReg155 +
				", HMI_IReg199=" + HMI_IReg199 +
				", HMI_IReg101=" + HMI_IReg101 +
				", HMI_IReg102=" + HMI_IReg102 +
				", HMI_IReg103=" + HMI_IReg103 +
				", HMI_IReg104=" + HMI_IReg104 +
				", HMI_IReg105=" + HMI_IReg105 +
				", HMI_IReg106=" + HMI_IReg106 +
				", HMI_IReg107=" + HMI_IReg107 +
				", HMI_IReg108=" + HMI_IReg108 +
				", HMI_IReg109=" + HMI_IReg109 +
				", HMI_IReg110=" + HMI_IReg110 +
				", HMI_IReg111=" + HMI_IReg111 +
				", HMI_Disc922=" + HMI_Disc922 +
				", HMI_Disc923=" + HMI_Disc923 +
				", HMI_IReg118=" + HMI_IReg118 +
				", HMI_IReg119=" + HMI_IReg119 +
				", HMI_IReg121=" + HMI_IReg121 +
				", HMI_IReg122=" + HMI_IReg122 +
				", HMI_Disc1021=" + HMI_Disc1021 +
				", HMI_Disc1022=" + HMI_Disc1022 +
				", HMI_IReg201=" + HMI_IReg201 +
				", HMI_IReg210=" + HMI_IReg210 +
				", HMI_IReg206=" + HMI_IReg206 +
				", HMI_IReg214=" + HMI_IReg214 +
				", HMI_IReg216=" + HMI_IReg216 +
				", HMI_IReg224=" + HMI_IReg224 +
				", HMI_IReg237=" + HMI_IReg237 +
				", HMI_IReg238=" + HMI_IReg238 +
				", HMI_IReg239=" + HMI_IReg239 +
				", HMI_IReg240=" + HMI_IReg240 +
				", HMI_IReg241=" + HMI_IReg241 +
				", HMI_IReg242=" + HMI_IReg242 +
				", HMI_IReg243=" + HMI_IReg243 +
				", HMI_IReg244=" + HMI_IReg244 +
				", HMI_IReg245=" + HMI_IReg245 +
				", HMI_IReg248=" + HMI_IReg248 +
				", HMI_Disc1056=" + HMI_Disc1056 +
				", HMI_IReg253=" + HMI_IReg253 +
				", HMI_IReg254=" + HMI_IReg254 +
				", HMI_IReg261=" + HMI_IReg261 +
				", HMI_IReg262=" + HMI_IReg262 +
				", HMI_Disc1024=" + HMI_Disc1024 +
				", HMI_Disc1025=" + HMI_Disc1025 +
				", HMI_Disc1028=" + HMI_Disc1028 +
				", HMI_Disc1029=" + HMI_Disc1029 +
				", HMI_Disc1031=" + HMI_Disc1031 +
				", HMI_Disc1036=" + HMI_Disc1036 +
				", HMI_IReg352=" + HMI_IReg352 +
				", HMI_IReg1405=" + HMI_IReg1405 +
				", HMI_IReg1406=" + HMI_IReg1406 +
				", HMI_IReg1407=" + HMI_IReg1407 +
				", HMI_IReg1408=" + HMI_IReg1408 +
				", HMI_IReg1412=" + HMI_IReg1412 +
				", HMI_IReg1413=" + HMI_IReg1413 +
				", HMI_IReg1414=" + HMI_IReg1414 +
				", HMI_IReg1418=" + HMI_IReg1418 +
				", HMI_IReg1419=" + HMI_IReg1419 +
				", HMI_IReg1420=" + HMI_IReg1420 +
				", HMI_IReg1422=" + HMI_IReg1422 +
				", HMI_IReg1423=" + HMI_IReg1423 +
				", HMI_IReg1426=" + HMI_IReg1426 +
				", HMI_IReg1604=" + HMI_IReg1604 +
				", HMI_IReg1605=" + HMI_IReg1605 +
				", HMI_IReg1606=" + HMI_IReg1606 +
				", HMI_IReg1608=" + HMI_IReg1608 +
				", HMI_IReg1609=" + HMI_IReg1609 +
				", HMI_IReg1610=" + HMI_IReg1610 +
				", HMI_IReg1614=" + HMI_IReg1614 +
				", HMI_IReg1615=" + HMI_IReg1615 +
				", HMI_IReg1616=" + HMI_IReg1616 +
				", HMI_IReg1617=" + HMI_IReg1617 +
				", HMI_IReg1618=" + HMI_IReg1618 +
				", HMI_IReg1619=" + HMI_IReg1619 +
				", HMI_IReg1637=" + HMI_IReg1637 +
				", HMI_IReg1638=" + HMI_IReg1638 +
				", HMI_IReg1639=" + HMI_IReg1639 +
				", HMI_IReg1640=" + HMI_IReg1640 +
				", HMI_IReg1641=" + HMI_IReg1641 +
				", HMI_IReg1642=" + HMI_IReg1642 +
				", HMI_IReg1644=" + HMI_IReg1644 +
				", HMI_IReg1645=" + HMI_IReg1645 +
				", HMI_IReg1646=" + HMI_IReg1646 +
				", HMI_Disc1553=" + HMI_Disc1553 +
				", HMI_Disc1554=" + HMI_Disc1554 +
				", HMI_Disc1555=" + HMI_Disc1555 +
				", HMI_Disc1589=" + HMI_Disc1589 +
				", HMI_Disc1651=" + HMI_Disc1651 +
				", HMI_Disc1652=" + HMI_Disc1652 +
				", HMI_Disc1653=" + HMI_Disc1653 +
				", HMI_Disc1654=" + HMI_Disc1654 +
				", HMI_Disc1655=" + HMI_Disc1655 +
				", HMI_Disc1656=" + HMI_Disc1656 +
				", HMI_Disc1657=" + HMI_Disc1657 +
				", HMI_Disc1658=" + HMI_Disc1658 +
				", HMI_Disc1659=" + HMI_Disc1659 +
				", HMI_Disc1660=" + HMI_Disc1660 +
				", HMI_Disc1661=" + HMI_Disc1661 +
				", HMI_Disc1662=" + HMI_Disc1662 +
				", HMI_Disc1663=" + HMI_Disc1663 +
				", HMI_Disc1664=" + HMI_Disc1664 +
				", HMI_Disc1665=" + HMI_Disc1665 +
				", HMI_Disc1666=" + HMI_Disc1666 +
				", HMI_Disc1667=" + HMI_Disc1667 +
				", HMI_Disc1668=" + HMI_Disc1668 +
				", HMI_Disc1669=" + HMI_Disc1669 +
				", HMI_Disc1670=" + HMI_Disc1670 +
				", HMI_Disc1671=" + HMI_Disc1671 +
				", HMI_Disc1672=" + HMI_Disc1672 +
				", HMI_Disc1673=" + HMI_Disc1673 +
				", HMI_Disc1674=" + HMI_Disc1674 +
				", HMI_Disc1675=" + HMI_Disc1675 +
				", HMI_Disc1676=" + HMI_Disc1676 +
				", HMI_Disc1677=" + HMI_Disc1677 +
				", HMI_Disc1678=" + HMI_Disc1678 +
				", HMI_Disc1679=" + HMI_Disc1679 +
				", HMI_Disc1680=" + HMI_Disc1680 +
				", HMI_Disc1681=" + HMI_Disc1681 +
				", HMI_Disc1682=" + HMI_Disc1682 +
				", HMI_Disc1683=" + HMI_Disc1683 +
				", HMI_Disc1684=" + HMI_Disc1684 +
				", HMI_IReg1651=" + HMI_IReg1651 +
				", HMI_IReg1652=" + HMI_IReg1652 +
				", HMI_IReg1655=" + HMI_IReg1655 +
				", HMI_IReg1656=" + HMI_IReg1656 +
				", HMI_IReg1657=" + HMI_IReg1657 +
				", HMI_IReg1658=" + HMI_IReg1658 +
				", HMI_IReg1665=" + HMI_IReg1665 +
				", HMI_IReg1666=" + HMI_IReg1666 +
				", HMI_IReg1667=" + HMI_IReg1667 +
				", HMI_IReg1677=" + HMI_IReg1677 +
				", HMI_IReg1691=" + HMI_IReg1691 +
				", HMI_IReg1692=" + HMI_IReg1692 +
				", HMI_IReg1693=" + HMI_IReg1693 +
				", HMI_IReg1694=" + HMI_IReg1694 +
				", HMI_IReg796=" + HMI_IReg796 +
				", HMI_Disc1304=" + HMI_Disc1304 +
				", HMI_Disc1305=" + HMI_Disc1305 +
				", HMI_IReg1508=" + HMI_IReg1508 +
				", HMI_IReg1514=" + HMI_IReg1514 +
				", HMI_IReg1515=" + HMI_IReg1515 +
				", HMI_IReg1516=" + HMI_IReg1516 +
				", HMI_IReg1517=" + HMI_IReg1517 +
				", HMI_IReg1518=" + HMI_IReg1518 +
				", HMI_IReg1519=" + HMI_IReg1519 +
				", HMI_Disc301=" + HMI_Disc301 +
				", HMI_Disc302=" + HMI_Disc302 +
				", HMI_Disc303=" + HMI_Disc303 +
				", HMI_Disc304=" + HMI_Disc304 +
				", HMI_Disc305=" + HMI_Disc305 +
				", HMI_Disc306=" + HMI_Disc306 +
				", HMI_Disc307=" + HMI_Disc307 +
				", HMI_Disc308=" + HMI_Disc308 +
				", HMI_Disc309=" + HMI_Disc309 +
				", HMI_Disc310=" + HMI_Disc310 +
				", HMI_Disc311=" + HMI_Disc311 +
				", HMI_Disc312=" + HMI_Disc312 +
				", HMI_Disc313=" + HMI_Disc313 +
				", HMI_Disc314=" + HMI_Disc314 +
				", HMI_Disc315=" + HMI_Disc315 +
				", HMI_Disc316=" + HMI_Disc316 +
				", HMI_Disc317=" + HMI_Disc317 +
				", HMI_Disc318=" + HMI_Disc318 +
				", HMI_Disc319=" + HMI_Disc319 +
				", HMI_Disc320=" + HMI_Disc320 +
				", HMI_Disc321=" + HMI_Disc321 +
				", HMI_Disc322=" + HMI_Disc322 +
				", HMI_Disc323=" + HMI_Disc323 +
				", HMI_Disc324=" + HMI_Disc324 +
				", HMI_Disc325=" + HMI_Disc325 +
				", HMI_Disc326=" + HMI_Disc326 +
				", HMI_Disc327=" + HMI_Disc327 +
				", HMI_Disc328=" + HMI_Disc328 +
				", HMI_Disc329=" + HMI_Disc329 +
				", HMI_Disc330=" + HMI_Disc330 +
				", HMI_Disc331=" + HMI_Disc331 +
				", HMI_Disc332=" + HMI_Disc332 +
				", HMI_Disc333=" + HMI_Disc333 +
				", HMI_Disc334=" + HMI_Disc334 +
				", HMI_Disc335=" + HMI_Disc335 +
				", HMI_Disc336=" + HMI_Disc336 +
				", HMI_Disc337=" + HMI_Disc337 +
				", HMI_Disc338=" + HMI_Disc338 +
				", HMI_Disc339=" + HMI_Disc339 +
				", HMI_Disc340=" + HMI_Disc340 +
				", HMI_Disc341=" + HMI_Disc341 +
				", HMI_Disc342=" + HMI_Disc342 +
				", HMI_Disc343=" + HMI_Disc343 +
				", HMI_Disc344=" + HMI_Disc344 +
				", HMI_Disc345=" + HMI_Disc345 +
				", HMI_Disc346=" + HMI_Disc346 +
				", HMI_Disc347=" + HMI_Disc347 +
				", HMI_Disc348=" + HMI_Disc348 +
				", HMI_Disc349=" + HMI_Disc349 +
				", HMI_Disc350=" + HMI_Disc350 +
				", HMI_Disc351=" + HMI_Disc351 +
				", HMI_Disc352=" + HMI_Disc352 +
				", HMI_Disc353=" + HMI_Disc353 +
				", HMI_Disc354=" + HMI_Disc354 +
				", HMI_Disc355=" + HMI_Disc355 +
				", HMI_Disc356=" + HMI_Disc356 +
				", HMI_Disc357=" + HMI_Disc357 +
				", HMI_Disc358=" + HMI_Disc358 +
				", HMI_Disc359=" + HMI_Disc359 +
				", HMI_Disc360=" + HMI_Disc360 +
				", HMI_Disc361=" + HMI_Disc361 +
				", HMI_Disc362=" + HMI_Disc362 +
				", HMI_Disc363=" + HMI_Disc363 +
				", HMI_Disc364=" + HMI_Disc364 +
				", HMI_Disc365=" + HMI_Disc365 +
				", HMI_Disc366=" + HMI_Disc366 +
				", HMI_Disc367=" + HMI_Disc367 +
				", HMI_Disc368=" + HMI_Disc368 +
				", HMI_Disc369=" + HMI_Disc369 +
				", HMI_Disc370=" + HMI_Disc370 +
				", HMI_Disc371=" + HMI_Disc371 +
				", HMI_Disc372=" + HMI_Disc372 +
				", HMI_Disc373=" + HMI_Disc373 +
				", HMI_Disc374=" + HMI_Disc374 +
				", HMI_Disc375=" + HMI_Disc375 +
				", HMI_Disc376=" + HMI_Disc376 +
				", HMI_Disc377=" + HMI_Disc377 +
				", HMI_Disc378=" + HMI_Disc378 +
				", HMI_Disc379=" + HMI_Disc379 +
				", HMI_Disc380=" + HMI_Disc380 +
				", HMI_Disc381=" + HMI_Disc381 +
				", HMI_Disc382=" + HMI_Disc382 +
				", HMI_Disc383=" + HMI_Disc383 +
				", HMI_Disc384=" + HMI_Disc384 +
				", HMI_Disc385=" + HMI_Disc385 +
				", HMI_Disc386=" + HMI_Disc386 +
				", HMI_Disc387=" + HMI_Disc387 +
				", HMI_Disc388=" + HMI_Disc388 +
				", HMI_Disc389=" + HMI_Disc389 +
				", HMI_Disc390=" + HMI_Disc390 +
				", HMI_Disc391=" + HMI_Disc391 +
				", HMI_Disc392=" + HMI_Disc392 +
				", HMI_Disc393=" + HMI_Disc393 +
				", HMI_Disc394=" + HMI_Disc394 +
				", HMI_Disc395=" + HMI_Disc395 +
				", HMI_Disc396=" + HMI_Disc396 +
				", HMI_Disc397=" + HMI_Disc397 +
				", HMI_Disc398=" + HMI_Disc398 +
				", HMI_Disc399=" + HMI_Disc399 +
				", HMI_Disc400=" + HMI_Disc400 +
				", HMI_Disc401=" + HMI_Disc401 +
				", HMI_Disc402=" + HMI_Disc402 +
				", HMI_Disc403=" + HMI_Disc403 +
				", HMI_Disc404=" + HMI_Disc404 +
				", HMI_Disc405=" + HMI_Disc405 +
				", HMI_Disc406=" + HMI_Disc406 +
				", HMI_Disc407=" + HMI_Disc407 +
				", HMI_Disc408=" + HMI_Disc408 +
				", HMI_Disc409=" + HMI_Disc409 +
				", HMI_Disc410=" + HMI_Disc410 +
				", HMI_Disc411=" + HMI_Disc411 +
				", HMI_Disc412=" + HMI_Disc412 +
				", HMI_Disc413=" + HMI_Disc413 +
				", HMI_Disc414=" + HMI_Disc414 +
				", HMI_Disc415=" + HMI_Disc415 +
				", HMI_Disc416=" + HMI_Disc416 +
				", HMI_Disc417=" + HMI_Disc417 +
				", HMI_Disc418=" + HMI_Disc418 +
				", HMI_Disc419=" + HMI_Disc419 +
				", HMI_Disc420=" + HMI_Disc420 +
				", HMI_Disc421=" + HMI_Disc421 +
				", HMI_Disc422=" + HMI_Disc422 +
				", HMI_Disc423=" + HMI_Disc423 +
				", HMI_Disc424=" + HMI_Disc424 +
				", HMI_Disc425=" + HMI_Disc425 +
				", HMI_Disc426=" + HMI_Disc426 +
				", HMI_Disc427=" + HMI_Disc427 +
				", HMI_Disc428=" + HMI_Disc428 +
				", HMI_Disc429=" + HMI_Disc429 +
				", HMI_Disc430=" + HMI_Disc430 +
				", HMI_Disc431=" + HMI_Disc431 +
				", HMI_Disc432=" + HMI_Disc432 +
				", HMI_Disc433=" + HMI_Disc433 +
				", HMI_Disc434=" + HMI_Disc434 +
				", HMI_Disc435=" + HMI_Disc435 +
				", HMI_Disc436=" + HMI_Disc436 +
				", HMI_Disc437=" + HMI_Disc437 +
				", HMI_Disc438=" + HMI_Disc438 +
				", HMI_Disc439=" + HMI_Disc439 +
				", HMI_Disc440=" + HMI_Disc440 +
				", HMI_Disc441=" + HMI_Disc441 +
				", HMI_Disc442=" + HMI_Disc442 +
				", HMI_Disc443=" + HMI_Disc443 +
				", HMI_Disc444=" + HMI_Disc444 +
				", HMI_Disc445=" + HMI_Disc445 +
				", HMI_Disc446=" + HMI_Disc446 +
				", HMI_Disc447=" + HMI_Disc447 +
				", HMI_Disc448=" + HMI_Disc448 +
				", HMI_Disc449=" + HMI_Disc449 +
				", HMI_Disc450=" + HMI_Disc450 +
				", HMI_Disc451=" + HMI_Disc451 +
				", HMI_Disc452=" + HMI_Disc452 +
				", HMI_Disc453=" + HMI_Disc453 +
				", HMI_Disc454=" + HMI_Disc454 +
				", HMI_Disc455=" + HMI_Disc455 +
				", HMI_Disc456=" + HMI_Disc456 +
				", HMI_Disc457=" + HMI_Disc457 +
				", HMI_Disc458=" + HMI_Disc458 +
				", HMI_Disc459=" + HMI_Disc459 +
				", HMI_Disc460=" + HMI_Disc460 +
				", HMI_Disc461=" + HMI_Disc461 +
				", HMI_Disc462=" + HMI_Disc462 +
				", HMI_Disc463=" + HMI_Disc463 +
				", HMI_Disc464=" + HMI_Disc464 +
				", HMI_Disc465=" + HMI_Disc465 +
				", HMI_Disc466=" + HMI_Disc466 +
				", HMI_Disc467=" + HMI_Disc467 +
				", HMI_Disc468=" + HMI_Disc468 +
				", HMI_Disc469=" + HMI_Disc469 +
				", HMI_Disc474=" + HMI_Disc474 +
				", HMI_Disc475=" + HMI_Disc475 +
				", HMI_Disc476=" + HMI_Disc476 +
				", HMI_Disc477=" + HMI_Disc477 +
				", HMI_Disc478=" + HMI_Disc478 +
				", HMI_Disc600=" + HMI_Disc600 +
				", HMI_Disc601=" + HMI_Disc601 +
				", HMI_Disc602=" + HMI_Disc602 +
				", HMI_Disc603=" + HMI_Disc603 +
				", HMI_Disc604=" + HMI_Disc604 +
				", HMI_Disc605=" + HMI_Disc605 +
				", HMI_Disc606=" + HMI_Disc606 +
				", HMI_Disc607=" + HMI_Disc607 +
				", HMI_Disc608=" + HMI_Disc608 +
				", HMI_Disc609=" + HMI_Disc609 +
				", HMI_Disc610=" + HMI_Disc610 +
				", HMI_Disc611=" + HMI_Disc611 +
				", HMI_Disc612=" + HMI_Disc612 +
				", HMI_Disc613=" + HMI_Disc613 +
				", HMI_Disc614=" + HMI_Disc614 +
				", HMI_Disc615=" + HMI_Disc615 +
				", HMI_Disc616=" + HMI_Disc616 +
				", HMI_Disc617=" + HMI_Disc617 +
				", HMI_Disc618=" + HMI_Disc618 +
				", HMI_Disc619=" + HMI_Disc619 +
				", HMI_Disc620=" + HMI_Disc620 +
				", HMI_Disc621=" + HMI_Disc621 +
				", HMI_Disc622=" + HMI_Disc622 +
				", HMI_Disc623=" + HMI_Disc623 +
				", HMI_Disc624=" + HMI_Disc624 +
				", HMI_Disc625=" + HMI_Disc625 +
				", HMI_Disc626=" + HMI_Disc626 +
				", HMI_Disc627=" + HMI_Disc627 +
				", HMI_Disc628=" + HMI_Disc628 +
				", HMI_Disc629=" + HMI_Disc629 +
				", HMI_Disc630=" + HMI_Disc630 +
				", HMI_Disc631=" + HMI_Disc631 +
				", HMI_Disc632=" + HMI_Disc632 +
				", HMI_Disc633=" + HMI_Disc633 +
				", HMI_Disc634=" + HMI_Disc634 +
				", HMI_Disc635=" + HMI_Disc635 +
				", HMI_Disc636=" + HMI_Disc636 +
				", HMI_Disc637=" + HMI_Disc637 +
				", HMI_Disc638=" + HMI_Disc638 +
				", HMI_Disc639=" + HMI_Disc639 +
				", HMI_Disc640=" + HMI_Disc640 +
				", HMI_Disc641=" + HMI_Disc641 +
				", HMI_Disc642=" + HMI_Disc642 +
				", HMI_Disc643=" + HMI_Disc643 +
				", HMI_Disc644=" + HMI_Disc644 +
				", HMI_Disc645=" + HMI_Disc645 +
				", HMI_Disc646=" + HMI_Disc646 +
				", HMI_Disc647=" + HMI_Disc647 +
				", HMI_Disc648=" + HMI_Disc648 +
				", HMI_Disc649=" + HMI_Disc649 +
				", HMI_Disc650=" + HMI_Disc650 +
				", HMI_Disc651=" + HMI_Disc651 +
				", HMI_Disc652=" + HMI_Disc652 +
				", HMI_Disc653=" + HMI_Disc653 +
				", HMI_Disc654=" + HMI_Disc654 +
				", HMI_Disc655=" + HMI_Disc655 +
				", HMI_Disc656=" + HMI_Disc656 +
				", HMI_Disc657=" + HMI_Disc657 +
				", HMI_Disc658=" + HMI_Disc658 +
				", HMI_Disc659=" + HMI_Disc659 +
				", HMI_Disc660=" + HMI_Disc660 +
				", HMI_Disc661=" + HMI_Disc661 +
				", HMI_Disc662=" + HMI_Disc662 +
				", HMI_Disc663=" + HMI_Disc663 +
				", HMI_Disc664=" + HMI_Disc664 +
				", HMI_Disc665=" + HMI_Disc665 +
				", HMI_Disc666=" + HMI_Disc666 +
				", HMI_Disc667=" + HMI_Disc667 +
				", HMI_Disc668=" + HMI_Disc668 +
				", HMI_Disc669=" + HMI_Disc669 +
				", HMI_Disc670=" + HMI_Disc670 +
				", HMI_Disc671=" + HMI_Disc671 +
				", HMI_Disc672=" + HMI_Disc672 +
				", HMI_Disc673=" + HMI_Disc673 +
				", HMI_Disc674=" + HMI_Disc674 +
				", HMI_Disc675=" + HMI_Disc675 +
				", HMI_Disc676=" + HMI_Disc676 +
				", HMI_Disc677=" + HMI_Disc677 +
				", HMI_Disc678=" + HMI_Disc678 +
				", HMI_Disc679=" + HMI_Disc679 +
				", HMI_Disc680=" + HMI_Disc680 +
				", HMI_Disc681=" + HMI_Disc681 +
				", HMI_Disc682=" + HMI_Disc682 +
				", HMI_Disc683=" + HMI_Disc683 +
				", HMI_Disc684=" + HMI_Disc684 +
				", HMI_Disc685=" + HMI_Disc685 +
				", HMI_Disc686=" + HMI_Disc686 +
				", HMI_Disc687=" + HMI_Disc687 +
				", HMI_Disc688=" + HMI_Disc688 +
				", HMI_Disc689=" + HMI_Disc689 +
				", HMI_Disc690=" + HMI_Disc690 +
				", HMI_Disc691=" + HMI_Disc691 +
				", HMI_Disc692=" + HMI_Disc692 +
				", HMI_Disc693=" + HMI_Disc693 +
				", HMI_Disc694=" + HMI_Disc694 +
				", HMI_Disc695=" + HMI_Disc695 +
				", HMI_Disc696=" + HMI_Disc696 +
				", HMI_Disc697=" + HMI_Disc697 +
				", HMI_Disc698=" + HMI_Disc698 +
				", HMI_Disc699=" + HMI_Disc699 +
				", HMI_Disc700=" + HMI_Disc700 +
				", HMI_Disc701=" + HMI_Disc701 +
				", HMI_Disc702=" + HMI_Disc702 +
				", HMI_Disc703=" + HMI_Disc703 +
				", HMI_Disc704=" + HMI_Disc704 +
				", HMI_Disc705=" + HMI_Disc705 +
				", HMI_Disc706=" + HMI_Disc706 +
				", HMI_Disc707=" + HMI_Disc707 +
				", HMI_Disc708=" + HMI_Disc708 +
				", HMI_Disc709=" + HMI_Disc709 +
				", HMI_Disc710=" + HMI_Disc710 +
				", HMI_Disc711=" + HMI_Disc711 +
				", HMI_Disc712=" + HMI_Disc712 +
				", HMI_Disc713=" + HMI_Disc713 +
				", HMI_Disc714=" + HMI_Disc714 +
				", HMI_Disc715=" + HMI_Disc715 +
				", HMI_Disc716=" + HMI_Disc716 +
				", HMI_Disc717=" + HMI_Disc717 +
				", HMI_Disc718=" + HMI_Disc718 +
				", HMI_Disc719=" + HMI_Disc719 +
				", HMI_Disc720=" + HMI_Disc720 +
				", HMI_Disc721=" + HMI_Disc721 +
				", HMI_Disc722=" + HMI_Disc722 +
				", HMI_Disc723=" + HMI_Disc723 +
				", HMI_Disc724=" + HMI_Disc724 +
				", HMI_Disc725=" + HMI_Disc725 +
				", HMI_Disc726=" + HMI_Disc726 +
				", HMI_Disc727=" + HMI_Disc727 +
				", HMI_Disc728=" + HMI_Disc728 +
				", HMI_Disc729=" + HMI_Disc729 +
				", HMI_Disc730=" + HMI_Disc730 +
				", HMI_Disc731=" + HMI_Disc731 +
				", HMI_Disc732=" + HMI_Disc732 +
				", HMI_Disc733=" + HMI_Disc733 +
				", HMI_Disc734=" + HMI_Disc734 +
				", HMI_Disc735=" + HMI_Disc735 +
				", HMI_Disc736=" + HMI_Disc736 +
				", HMI_Disc737=" + HMI_Disc737 +
				", HMI_Disc738=" + HMI_Disc738 +
				", HMI_Disc739=" + HMI_Disc739 +
				", HMI_Disc740=" + HMI_Disc740 +
				", HMI_Disc741=" + HMI_Disc741 +
				", HMI_Disc742=" + HMI_Disc742 +
				", HMI_Disc743=" + HMI_Disc743 +
				", HMI_Disc824=" + HMI_Disc824 +
				", HMI_Disc825=" + HMI_Disc825 +
				", HMI_Disc826=" + HMI_Disc826 +
				", HMI_Disc827=" + HMI_Disc827 +
				", HMI_Disc828=" + HMI_Disc828 +
				", HMI_Disc829=" + HMI_Disc829 +
				", HMI_Disc830=" + HMI_Disc830 +
				", HMI_Disc831=" + HMI_Disc831 +
				", HMI_Disc832=" + HMI_Disc832 +
				", HMI_Disc833=" + HMI_Disc833 +
				", HMI_Disc834=" + HMI_Disc834 +
				", HMI_Disc835=" + HMI_Disc835 +
				", HMI_Disc836=" + HMI_Disc836 +
				", HMI_Disc837=" + HMI_Disc837 +
				", HMI_Disc46=" + HMI_Disc46 +
				", HMI_Disc47=" + HMI_Disc47 +
				", HMI_Disc48=" + HMI_Disc48 +
				", HMI_Disc66=" + HMI_Disc66 +
				", HMI_Disc112=" + HMI_Disc112 +
				", HMI_Disc113=" + HMI_Disc113 +
				", HMI_Disc115=" + HMI_Disc115 +
				'}';
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getWtId() {
        return wtId;
    }

    public void setWtId(int wtId) {
        this.wtId = wtId;
    }

    public boolean isHMI_Disc910() {
        return HMI_Disc910;
    }

    public void setHMI_Disc910(boolean HMI_Disc910) {
        this.HMI_Disc910 = HMI_Disc910;
    }

    public boolean isHMI_Disc912() {
        return HMI_Disc912;
    }

    public void setHMI_Disc912(boolean HMI_Disc912) {
        this.HMI_Disc912 = HMI_Disc912;
    }

    public Float getHMI_IReg155() {
        return HMI_IReg155;
    }

    public void setHMI_IReg155(Float HMI_IReg155) {
        this.HMI_IReg155 = HMI_IReg155;
    }

    public Float getHMI_IReg199() {
        return HMI_IReg199;
    }

    public void setHMI_IReg199(Float HMI_IReg199) {
        this.HMI_IReg199 = HMI_IReg199;
    }

    public Float getHMI_IReg101() {
        return HMI_IReg101;
    }

    public void setHMI_IReg101(Float HMI_IReg101) {
        this.HMI_IReg101 = HMI_IReg101;
    }

    public Float getHMI_IReg102() {
        return HMI_IReg102;
    }

    public void setHMI_IReg102(Float HMI_IReg102) {
        this.HMI_IReg102 = HMI_IReg102;
    }

    public Float getHMI_IReg103() {
        return HMI_IReg103;
    }

    public void setHMI_IReg103(Float HMI_IReg103) {
        this.HMI_IReg103 = HMI_IReg103;
    }

    public Float getHMI_IReg104() {
        return HMI_IReg104;
    }

    public void setHMI_IReg104(Float HMI_IReg104) {
        this.HMI_IReg104 = HMI_IReg104;
    }

    public Float getHMI_IReg105() {
        return HMI_IReg105;
    }

    public void setHMI_IReg105(Float HMI_IReg105) {
        this.HMI_IReg105 = HMI_IReg105;
    }

    public Float getHMI_IReg106() {
        return HMI_IReg106;
    }

    public void setHMI_IReg106(Float HMI_IReg106) {
        this.HMI_IReg106 = HMI_IReg106;
    }

    public Float getHMI_IReg107() {
        return HMI_IReg107;
    }

    public void setHMI_IReg107(Float HMI_IReg107) {
        this.HMI_IReg107 = HMI_IReg107;
    }

    public Float getHMI_IReg108() {
        return HMI_IReg108;
    }

    public void setHMI_IReg108(Float HMI_IReg108) {
        this.HMI_IReg108 = HMI_IReg108;
    }

    public Float getHMI_IReg109() {
        return HMI_IReg109;
    }

    public void setHMI_IReg109(Float HMI_IReg109) {
        this.HMI_IReg109 = HMI_IReg109;
    }

    public Float getHMI_IReg110() {
        return HMI_IReg110;
    }

    public void setHMI_IReg110(Float HMI_IReg110) {
        this.HMI_IReg110 = HMI_IReg110;
    }

    public Float getHMI_IReg111() {
        return HMI_IReg111;
    }

    public void setHMI_IReg111(Float HMI_IReg111) {
        this.HMI_IReg111 = HMI_IReg111;
    }

    public boolean isHMI_Disc922() {
        return HMI_Disc922;
    }

    public void setHMI_Disc922(boolean HMI_Disc922) {
        this.HMI_Disc922 = HMI_Disc922;
    }

    public boolean isHMI_Disc923() {
        return HMI_Disc923;
    }

    public void setHMI_Disc923(boolean HMI_Disc923) {
        this.HMI_Disc923 = HMI_Disc923;
    }

    public Float getHMI_IReg118() {
        return HMI_IReg118;
    }

    public void setHMI_IReg118(Float HMI_IReg118) {
        this.HMI_IReg118 = HMI_IReg118;
    }

    public Float getHMI_IReg119() {
        return HMI_IReg119;
    }

    public void setHMI_IReg119(Float HMI_IReg119) {
        this.HMI_IReg119 = HMI_IReg119;
    }

    public Float getHMI_IReg121() {
        return HMI_IReg121;
    }

    public void setHMI_IReg121(Float HMI_IReg121) {
        this.HMI_IReg121 = HMI_IReg121;
    }

    public Float getHMI_IReg122() {
        return HMI_IReg122;
    }

    public void setHMI_IReg122(Float HMI_IReg122) {
        this.HMI_IReg122 = HMI_IReg122;
    }

    public boolean isHMI_Disc1021() {
        return HMI_Disc1021;
    }

    public void setHMI_Disc1021(boolean HMI_Disc1021) {
        this.HMI_Disc1021 = HMI_Disc1021;
    }

    public boolean isHMI_Disc1022() {
        return HMI_Disc1022;
    }

    public void setHMI_Disc1022(boolean HMI_Disc1022) {
        this.HMI_Disc1022 = HMI_Disc1022;
    }

    public Float getHMI_IReg201() {
        return HMI_IReg201;
    }

    public void setHMI_IReg201(Float HMI_IReg201) {
        this.HMI_IReg201 = HMI_IReg201;
    }

    public Float getHMI_IReg210() {
        return HMI_IReg210;
    }

    public void setHMI_IReg210(Float HMI_IReg210) {
        this.HMI_IReg210 = HMI_IReg210;
    }

    public Float getHMI_IReg206() {
        return HMI_IReg206;
    }

    public void setHMI_IReg206(Float HMI_IReg206) {
        this.HMI_IReg206 = HMI_IReg206;
    }

    public Float getHMI_IReg214() {
        return HMI_IReg214;
    }

    public void setHMI_IReg214(Float HMI_IReg214) {
        this.HMI_IReg214 = HMI_IReg214;
    }

    public Float getHMI_IReg216() {
        return HMI_IReg216;
    }

    public void setHMI_IReg216(Float HMI_IReg216) {
        this.HMI_IReg216 = HMI_IReg216;
    }

    public Float getHMI_IReg224() {
        return HMI_IReg224;
    }

    public void setHMI_IReg224(Float HMI_IReg224) {
        this.HMI_IReg224 = HMI_IReg224;
    }

    public Float getHMI_IReg237() {
        return HMI_IReg237;
    }

    public void setHMI_IReg237(Float HMI_IReg237) {
        this.HMI_IReg237 = HMI_IReg237;
    }

    public Float getHMI_IReg238() {
        return HMI_IReg238;
    }

    public void setHMI_IReg238(Float HMI_IReg238) {
        this.HMI_IReg238 = HMI_IReg238;
    }

    public Float getHMI_IReg239() {
        return HMI_IReg239;
    }

    public void setHMI_IReg239(Float HMI_IReg239) {
        this.HMI_IReg239 = HMI_IReg239;
    }

    public Float getHMI_IReg240() {
        return HMI_IReg240;
    }

    public void setHMI_IReg240(Float HMI_IReg240) {
        this.HMI_IReg240 = HMI_IReg240;
    }

    public Float getHMI_IReg241() {
        return HMI_IReg241;
    }

    public void setHMI_IReg241(Float HMI_IReg241) {
        this.HMI_IReg241 = HMI_IReg241;
    }

    public Float getHMI_IReg242() {
        return HMI_IReg242;
    }

    public void setHMI_IReg242(Float HMI_IReg242) {
        this.HMI_IReg242 = HMI_IReg242;
    }

    public Float getHMI_IReg243() {
        return HMI_IReg243;
    }

    public void setHMI_IReg243(Float HMI_IReg243) {
        this.HMI_IReg243 = HMI_IReg243;
    }

    public Float getHMI_IReg244() {
        return HMI_IReg244;
    }

    public void setHMI_IReg244(Float HMI_IReg244) {
        this.HMI_IReg244 = HMI_IReg244;
    }

    public Float getHMI_IReg245() {
        return HMI_IReg245;
    }

    public void setHMI_IReg245(Float HMI_IReg245) {
        this.HMI_IReg245 = HMI_IReg245;
    }

    public Float getHMI_IReg248() {
        return HMI_IReg248;
    }

    public void setHMI_IReg248(Float HMI_IReg248) {
        this.HMI_IReg248 = HMI_IReg248;
    }

    public boolean isHMI_Disc1056() {
        return HMI_Disc1056;
    }

    public void setHMI_Disc1056(boolean HMI_Disc1056) {
        this.HMI_Disc1056 = HMI_Disc1056;
    }

    public Float getHMI_IReg253() {
        return HMI_IReg253;
    }

    public void setHMI_IReg253(Float HMI_IReg253) {
        this.HMI_IReg253 = HMI_IReg253;
    }

    public Float getHMI_IReg254() {
        return HMI_IReg254;
    }

    public void setHMI_IReg254(Float HMI_IReg254) {
        this.HMI_IReg254 = HMI_IReg254;
    }

    public Float getHMI_IReg261() {
        return HMI_IReg261;
    }

    public void setHMI_IReg261(Float HMI_IReg261) {
        this.HMI_IReg261 = HMI_IReg261;
    }

    public Float getHMI_IReg262() {
        return HMI_IReg262;
    }

    public void setHMI_IReg262(Float HMI_IReg262) {
        this.HMI_IReg262 = HMI_IReg262;
    }

    public boolean isHMI_Disc1024() {
        return HMI_Disc1024;
    }

    public void setHMI_Disc1024(boolean HMI_Disc1024) {
        this.HMI_Disc1024 = HMI_Disc1024;
    }

    public boolean isHMI_Disc1025() {
        return HMI_Disc1025;
    }

    public void setHMI_Disc1025(boolean HMI_Disc1025) {
        this.HMI_Disc1025 = HMI_Disc1025;
    }

    public boolean isHMI_Disc1028() {
        return HMI_Disc1028;
    }

    public void setHMI_Disc1028(boolean HMI_Disc1028) {
        this.HMI_Disc1028 = HMI_Disc1028;
    }

    public boolean isHMI_Disc1029() {
        return HMI_Disc1029;
    }

    public void setHMI_Disc1029(boolean HMI_Disc1029) {
        this.HMI_Disc1029 = HMI_Disc1029;
    }

    public boolean isHMI_Disc1031() {
        return HMI_Disc1031;
    }

    public void setHMI_Disc1031(boolean HMI_Disc1031) {
        this.HMI_Disc1031 = HMI_Disc1031;
    }

    public boolean isHMI_Disc1036() {
        return HMI_Disc1036;
    }

    public void setHMI_Disc1036(boolean HMI_Disc1036) {
        this.HMI_Disc1036 = HMI_Disc1036;
    }

    public Float getHMI_IReg352() {
        return HMI_IReg352;
    }

    public void setHMI_IReg352(Float HMI_IReg352) {
        this.HMI_IReg352 = HMI_IReg352;
    }

    public Float getHMI_IReg1405() {
        return HMI_IReg1405;
    }

    public void setHMI_IReg1405(Float HMI_IReg1405) {
        this.HMI_IReg1405 = HMI_IReg1405;
    }

    public Float getHMI_IReg1406() {
        return HMI_IReg1406;
    }

    public void setHMI_IReg1406(Float HMI_IReg1406) {
        this.HMI_IReg1406 = HMI_IReg1406;
    }

    public Float getHMI_IReg1407() {
        return HMI_IReg1407;
    }

    public void setHMI_IReg1407(Float HMI_IReg1407) {
        this.HMI_IReg1407 = HMI_IReg1407;
    }

    public Float getHMI_IReg1408() {
        return HMI_IReg1408;
    }

    public void setHMI_IReg1408(Float HMI_IReg1408) {
        this.HMI_IReg1408 = HMI_IReg1408;
    }

    public Float getHMI_IReg1412() {
        return HMI_IReg1412;
    }

    public void setHMI_IReg1412(Float HMI_IReg1412) {
        this.HMI_IReg1412 = HMI_IReg1412;
    }

    public Float getHMI_IReg1413() {
        return HMI_IReg1413;
    }

    public void setHMI_IReg1413(Float HMI_IReg1413) {
        this.HMI_IReg1413 = HMI_IReg1413;
    }

    public Float getHMI_IReg1414() {
        return HMI_IReg1414;
    }

    public void setHMI_IReg1414(Float HMI_IReg1414) {
        this.HMI_IReg1414 = HMI_IReg1414;
    }

    public Float getHMI_IReg1418() {
        return HMI_IReg1418;
    }

    public void setHMI_IReg1418(Float HMI_IReg1418) {
        this.HMI_IReg1418 = HMI_IReg1418;
    }

    public Float getHMI_IReg1419() {
        return HMI_IReg1419;
    }

    public void setHMI_IReg1419(Float HMI_IReg1419) {
        this.HMI_IReg1419 = HMI_IReg1419;
    }

    public Float getHMI_IReg1420() {
        return HMI_IReg1420;
    }

    public void setHMI_IReg1420(Float HMI_IReg1420) {
        this.HMI_IReg1420 = HMI_IReg1420;
    }

    public Float getHMI_IReg1422() {
        return HMI_IReg1422;
    }

    public void setHMI_IReg1422(Float HMI_IReg1422) {
        this.HMI_IReg1422 = HMI_IReg1422;
    }

    public Float getHMI_IReg1423() {
        return HMI_IReg1423;
    }

    public void setHMI_IReg1423(Float HMI_IReg1423) {
        this.HMI_IReg1423 = HMI_IReg1423;
    }

    public Float getHMI_IReg1426() {
        return HMI_IReg1426;
    }

    public void setHMI_IReg1426(Float HMI_IReg1426) {
        this.HMI_IReg1426 = HMI_IReg1426;
    }

    public Float getHMI_IReg1604() {
        return HMI_IReg1604;
    }

    public void setHMI_IReg1604(Float HMI_IReg1604) {
        this.HMI_IReg1604 = HMI_IReg1604;
    }

    public Float getHMI_IReg1605() {
        return HMI_IReg1605;
    }

    public void setHMI_IReg1605(Float HMI_IReg1605) {
        this.HMI_IReg1605 = HMI_IReg1605;
    }

    public Float getHMI_IReg1606() {
        return HMI_IReg1606;
    }

    public void setHMI_IReg1606(Float HMI_IReg1606) {
        this.HMI_IReg1606 = HMI_IReg1606;
    }

    public Float getHMI_IReg1608() {
        return HMI_IReg1608;
    }

    public void setHMI_IReg1608(Float HMI_IReg1608) {
        this.HMI_IReg1608 = HMI_IReg1608;
    }

    public Float getHMI_IReg1609() {
        return HMI_IReg1609;
    }

    public void setHMI_IReg1609(Float HMI_IReg1609) {
        this.HMI_IReg1609 = HMI_IReg1609;
    }

    public Float getHMI_IReg1610() {
        return HMI_IReg1610;
    }

    public void setHMI_IReg1610(Float HMI_IReg1610) {
        this.HMI_IReg1610 = HMI_IReg1610;
    }

    public Float getHMI_IReg1614() {
        return HMI_IReg1614;
    }

    public void setHMI_IReg1614(Float HMI_IReg1614) {
        this.HMI_IReg1614 = HMI_IReg1614;
    }

    public Float getHMI_IReg1615() {
        return HMI_IReg1615;
    }

    public void setHMI_IReg1615(Float HMI_IReg1615) {
        this.HMI_IReg1615 = HMI_IReg1615;
    }

    public Float getHMI_IReg1616() {
        return HMI_IReg1616;
    }

    public void setHMI_IReg1616(Float HMI_IReg1616) {
        this.HMI_IReg1616 = HMI_IReg1616;
    }

    public Float getHMI_IReg1617() {
        return HMI_IReg1617;
    }

    public void setHMI_IReg1617(Float HMI_IReg1617) {
        this.HMI_IReg1617 = HMI_IReg1617;
    }

    public Float getHMI_IReg1618() {
        return HMI_IReg1618;
    }

    public void setHMI_IReg1618(Float HMI_IReg1618) {
        this.HMI_IReg1618 = HMI_IReg1618;
    }

    public Float getHMI_IReg1619() {
        return HMI_IReg1619;
    }

    public void setHMI_IReg1619(Float HMI_IReg1619) {
        this.HMI_IReg1619 = HMI_IReg1619;
    }

    public Float getHMI_IReg1637() {
        return HMI_IReg1637;
    }

    public void setHMI_IReg1637(Float HMI_IReg1637) {
        this.HMI_IReg1637 = HMI_IReg1637;
    }

    public Float getHMI_IReg1638() {
        return HMI_IReg1638;
    }

    public void setHMI_IReg1638(Float HMI_IReg1638) {
        this.HMI_IReg1638 = HMI_IReg1638;
    }

    public Float getHMI_IReg1639() {
        return HMI_IReg1639;
    }

    public void setHMI_IReg1639(Float HMI_IReg1639) {
        this.HMI_IReg1639 = HMI_IReg1639;
    }

    public Float getHMI_IReg1640() {
        return HMI_IReg1640;
    }

    public void setHMI_IReg1640(Float HMI_IReg1640) {
        this.HMI_IReg1640 = HMI_IReg1640;
    }

    public Float getHMI_IReg1641() {
        return HMI_IReg1641;
    }

    public void setHMI_IReg1641(Float HMI_IReg1641) {
        this.HMI_IReg1641 = HMI_IReg1641;
    }

    public Float getHMI_IReg1642() {
        return HMI_IReg1642;
    }

    public void setHMI_IReg1642(Float HMI_IReg1642) {
        this.HMI_IReg1642 = HMI_IReg1642;
    }

    public Float getHMI_IReg1644() {
        return HMI_IReg1644;
    }

    public void setHMI_IReg1644(Float HMI_IReg1644) {
        this.HMI_IReg1644 = HMI_IReg1644;
    }

    public Float getHMI_IReg1645() {
        return HMI_IReg1645;
    }

    public void setHMI_IReg1645(Float HMI_IReg1645) {
        this.HMI_IReg1645 = HMI_IReg1645;
    }

    public Float getHMI_IReg1646() {
        return HMI_IReg1646;
    }

    public void setHMI_IReg1646(Float HMI_IReg1646) {
        this.HMI_IReg1646 = HMI_IReg1646;
    }

    public boolean isHMI_Disc1553() {
        return HMI_Disc1553;
    }

    public void setHMI_Disc1553(boolean HMI_Disc1553) {
        this.HMI_Disc1553 = HMI_Disc1553;
    }

    public boolean isHMI_Disc1554() {
        return HMI_Disc1554;
    }

    public void setHMI_Disc1554(boolean HMI_Disc1554) {
        this.HMI_Disc1554 = HMI_Disc1554;
    }

    public boolean isHMI_Disc1555() {
        return HMI_Disc1555;
    }

    public void setHMI_Disc1555(boolean HMI_Disc1555) {
        this.HMI_Disc1555 = HMI_Disc1555;
    }

    public boolean isHMI_Disc1589() {
        return HMI_Disc1589;
    }

    public void setHMI_Disc1589(boolean HMI_Disc1589) {
        this.HMI_Disc1589 = HMI_Disc1589;
    }

    public boolean isHMI_Disc1651() {
        return HMI_Disc1651;
    }

    public void setHMI_Disc1651(boolean HMI_Disc1651) {
        this.HMI_Disc1651 = HMI_Disc1651;
    }

    public boolean isHMI_Disc1652() {
        return HMI_Disc1652;
    }

    public void setHMI_Disc1652(boolean HMI_Disc1652) {
        this.HMI_Disc1652 = HMI_Disc1652;
    }

    public boolean isHMI_Disc1653() {
        return HMI_Disc1653;
    }

    public void setHMI_Disc1653(boolean HMI_Disc1653) {
        this.HMI_Disc1653 = HMI_Disc1653;
    }

    public boolean isHMI_Disc1654() {
        return HMI_Disc1654;
    }

    public void setHMI_Disc1654(boolean HMI_Disc1654) {
        this.HMI_Disc1654 = HMI_Disc1654;
    }

    public boolean isHMI_Disc1655() {
        return HMI_Disc1655;
    }

    public void setHMI_Disc1655(boolean HMI_Disc1655) {
        this.HMI_Disc1655 = HMI_Disc1655;
    }

    public boolean isHMI_Disc1656() {
        return HMI_Disc1656;
    }

    public void setHMI_Disc1656(boolean HMI_Disc1656) {
        this.HMI_Disc1656 = HMI_Disc1656;
    }

    public boolean isHMI_Disc1657() {
        return HMI_Disc1657;
    }

    public void setHMI_Disc1657(boolean HMI_Disc1657) {
        this.HMI_Disc1657 = HMI_Disc1657;
    }

    public boolean isHMI_Disc1658() {
        return HMI_Disc1658;
    }

    public void setHMI_Disc1658(boolean HMI_Disc1658) {
        this.HMI_Disc1658 = HMI_Disc1658;
    }

    public boolean isHMI_Disc1659() {
        return HMI_Disc1659;
    }

    public void setHMI_Disc1659(boolean HMI_Disc1659) {
        this.HMI_Disc1659 = HMI_Disc1659;
    }

    public boolean isHMI_Disc1660() {
        return HMI_Disc1660;
    }

    public void setHMI_Disc1660(boolean HMI_Disc1660) {
        this.HMI_Disc1660 = HMI_Disc1660;
    }

    public boolean isHMI_Disc1661() {
        return HMI_Disc1661;
    }

    public void setHMI_Disc1661(boolean HMI_Disc1661) {
        this.HMI_Disc1661 = HMI_Disc1661;
    }

    public boolean isHMI_Disc1662() {
        return HMI_Disc1662;
    }

    public void setHMI_Disc1662(boolean HMI_Disc1662) {
        this.HMI_Disc1662 = HMI_Disc1662;
    }

    public boolean isHMI_Disc1663() {
        return HMI_Disc1663;
    }

    public void setHMI_Disc1663(boolean HMI_Disc1663) {
        this.HMI_Disc1663 = HMI_Disc1663;
    }

    public boolean isHMI_Disc1664() {
        return HMI_Disc1664;
    }

    public void setHMI_Disc1664(boolean HMI_Disc1664) {
        this.HMI_Disc1664 = HMI_Disc1664;
    }

    public boolean isHMI_Disc1665() {
        return HMI_Disc1665;
    }

    public void setHMI_Disc1665(boolean HMI_Disc1665) {
        this.HMI_Disc1665 = HMI_Disc1665;
    }

    public boolean isHMI_Disc1666() {
        return HMI_Disc1666;
    }

    public void setHMI_Disc1666(boolean HMI_Disc1666) {
        this.HMI_Disc1666 = HMI_Disc1666;
    }

    public boolean isHMI_Disc1667() {
        return HMI_Disc1667;
    }

    public void setHMI_Disc1667(boolean HMI_Disc1667) {
        this.HMI_Disc1667 = HMI_Disc1667;
    }

    public boolean isHMI_Disc1668() {
        return HMI_Disc1668;
    }

    public void setHMI_Disc1668(boolean HMI_Disc1668) {
        this.HMI_Disc1668 = HMI_Disc1668;
    }

    public boolean isHMI_Disc1669() {
        return HMI_Disc1669;
    }

    public void setHMI_Disc1669(boolean HMI_Disc1669) {
        this.HMI_Disc1669 = HMI_Disc1669;
    }

    public boolean isHMI_Disc1670() {
        return HMI_Disc1670;
    }

    public void setHMI_Disc1670(boolean HMI_Disc1670) {
        this.HMI_Disc1670 = HMI_Disc1670;
    }

    public boolean isHMI_Disc1671() {
        return HMI_Disc1671;
    }

    public void setHMI_Disc1671(boolean HMI_Disc1671) {
        this.HMI_Disc1671 = HMI_Disc1671;
    }

    public boolean isHMI_Disc1672() {
        return HMI_Disc1672;
    }

    public void setHMI_Disc1672(boolean HMI_Disc1672) {
        this.HMI_Disc1672 = HMI_Disc1672;
    }

    public boolean isHMI_Disc1673() {
        return HMI_Disc1673;
    }

    public void setHMI_Disc1673(boolean HMI_Disc1673) {
        this.HMI_Disc1673 = HMI_Disc1673;
    }

    public boolean isHMI_Disc1674() {
        return HMI_Disc1674;
    }

    public void setHMI_Disc1674(boolean HMI_Disc1674) {
        this.HMI_Disc1674 = HMI_Disc1674;
    }

    public boolean isHMI_Disc1675() {
        return HMI_Disc1675;
    }

    public void setHMI_Disc1675(boolean HMI_Disc1675) {
        this.HMI_Disc1675 = HMI_Disc1675;
    }

    public boolean isHMI_Disc1676() {
        return HMI_Disc1676;
    }

    public void setHMI_Disc1676(boolean HMI_Disc1676) {
        this.HMI_Disc1676 = HMI_Disc1676;
    }

    public boolean isHMI_Disc1677() {
        return HMI_Disc1677;
    }

    public void setHMI_Disc1677(boolean HMI_Disc1677) {
        this.HMI_Disc1677 = HMI_Disc1677;
    }

    public boolean isHMI_Disc1678() {
        return HMI_Disc1678;
    }

    public void setHMI_Disc1678(boolean HMI_Disc1678) {
        this.HMI_Disc1678 = HMI_Disc1678;
    }

    public boolean isHMI_Disc1679() {
        return HMI_Disc1679;
    }

    public void setHMI_Disc1679(boolean HMI_Disc1679) {
        this.HMI_Disc1679 = HMI_Disc1679;
    }

    public boolean isHMI_Disc1680() {
        return HMI_Disc1680;
    }

    public void setHMI_Disc1680(boolean HMI_Disc1680) {
        this.HMI_Disc1680 = HMI_Disc1680;
    }

    public boolean isHMI_Disc1681() {
        return HMI_Disc1681;
    }

    public void setHMI_Disc1681(boolean HMI_Disc1681) {
        this.HMI_Disc1681 = HMI_Disc1681;
    }

    public boolean isHMI_Disc1682() {
        return HMI_Disc1682;
    }

    public void setHMI_Disc1682(boolean HMI_Disc1682) {
        this.HMI_Disc1682 = HMI_Disc1682;
    }

    public boolean isHMI_Disc1683() {
        return HMI_Disc1683;
    }

    public void setHMI_Disc1683(boolean HMI_Disc1683) {
        this.HMI_Disc1683 = HMI_Disc1683;
    }

    public boolean isHMI_Disc1684() {
        return HMI_Disc1684;
    }

    public void setHMI_Disc1684(boolean HMI_Disc1684) {
        this.HMI_Disc1684 = HMI_Disc1684;
    }

    public Float getHMI_IReg1651() {
        return HMI_IReg1651;
    }

    public void setHMI_IReg1651(Float HMI_IReg1651) {
        this.HMI_IReg1651 = HMI_IReg1651;
    }

    public Float getHMI_IReg1652() {
        return HMI_IReg1652;
    }

    public void setHMI_IReg1652(Float HMI_IReg1652) {
        this.HMI_IReg1652 = HMI_IReg1652;
    }

    public Float getHMI_IReg1655() {
        return HMI_IReg1655;
    }

    public void setHMI_IReg1655(Float HMI_IReg1655) {
        this.HMI_IReg1655 = HMI_IReg1655;
    }

    public Float getHMI_IReg1656() {
        return HMI_IReg1656;
    }

    public void setHMI_IReg1656(Float HMI_IReg1656) {
        this.HMI_IReg1656 = HMI_IReg1656;
    }

    public Float getHMI_IReg1657() {
        return HMI_IReg1657;
    }

    public void setHMI_IReg1657(Float HMI_IReg1657) {
        this.HMI_IReg1657 = HMI_IReg1657;
    }

    public Float getHMI_IReg1658() {
        return HMI_IReg1658;
    }

    public void setHMI_IReg1658(Float HMI_IReg1658) {
        this.HMI_IReg1658 = HMI_IReg1658;
    }

    public Float getHMI_IReg1665() {
        return HMI_IReg1665;
    }

    public void setHMI_IReg1665(Float HMI_IReg1665) {
        this.HMI_IReg1665 = HMI_IReg1665;
    }

    public Float getHMI_IReg1666() {
        return HMI_IReg1666;
    }

    public void setHMI_IReg1666(Float HMI_IReg1666) {
        this.HMI_IReg1666 = HMI_IReg1666;
    }

    public Float getHMI_IReg1667() {
        return HMI_IReg1667;
    }

    public void setHMI_IReg1667(Float HMI_IReg1667) {
        this.HMI_IReg1667 = HMI_IReg1667;
    }

    public Float getHMI_IReg1677() {
        return HMI_IReg1677;
    }

    public void setHMI_IReg1677(Float HMI_IReg1677) {
        this.HMI_IReg1677 = HMI_IReg1677;
    }

    public Float getHMI_IReg1691() {
        return HMI_IReg1691;
    }

    public void setHMI_IReg1691(Float HMI_IReg1691) {
        this.HMI_IReg1691 = HMI_IReg1691;
    }

    public Float getHMI_IReg1692() {
        return HMI_IReg1692;
    }

    public void setHMI_IReg1692(Float HMI_IReg1692) {
        this.HMI_IReg1692 = HMI_IReg1692;
    }

    public Float getHMI_IReg1693() {
        return HMI_IReg1693;
    }

    public void setHMI_IReg1693(Float HMI_IReg1693) {
        this.HMI_IReg1693 = HMI_IReg1693;
    }

    public Float getHMI_IReg1694() {
        return HMI_IReg1694;
    }

    public void setHMI_IReg1694(Float HMI_IReg1694) {
        this.HMI_IReg1694 = HMI_IReg1694;
    }

    public Float getHMI_IReg796() {
        return HMI_IReg796;
    }

    public void setHMI_IReg796(Float HMI_IReg796) {
        this.HMI_IReg796 = HMI_IReg796;
    }

    public boolean isHMI_Disc1304() {
        return HMI_Disc1304;
    }

    public void setHMI_Disc1304(boolean HMI_Disc1304) {
        this.HMI_Disc1304 = HMI_Disc1304;
    }

    public boolean isHMI_Disc1305() {
        return HMI_Disc1305;
    }

    public void setHMI_Disc1305(boolean HMI_Disc1305) {
        this.HMI_Disc1305 = HMI_Disc1305;
    }

    public Float getHMI_IReg1508() {
        return HMI_IReg1508;
    }

    public void setHMI_IReg1508(Float HMI_IReg1508) {
        this.HMI_IReg1508 = HMI_IReg1508;
    }

    public Float getHMI_IReg1514() {
        return HMI_IReg1514;
    }

    public void setHMI_IReg1514(Float HMI_IReg1514) {
        this.HMI_IReg1514 = HMI_IReg1514;
    }

    public Float getHMI_IReg1515() {
        return HMI_IReg1515;
    }

    public void setHMI_IReg1515(Float HMI_IReg1515) {
        this.HMI_IReg1515 = HMI_IReg1515;
    }

    public Float getHMI_IReg1516() {
        return HMI_IReg1516;
    }

    public void setHMI_IReg1516(Float HMI_IReg1516) {
        this.HMI_IReg1516 = HMI_IReg1516;
    }

    public Float getHMI_IReg1517() {
        return HMI_IReg1517;
    }

    public void setHMI_IReg1517(Float HMI_IReg1517) {
        this.HMI_IReg1517 = HMI_IReg1517;
    }

    public Float getHMI_IReg1518() {
        return HMI_IReg1518;
    }

    public void setHMI_IReg1518(Float HMI_IReg1518) {
        this.HMI_IReg1518 = HMI_IReg1518;
    }

    public Float getHMI_IReg1519() {
        return HMI_IReg1519;
    }

    public void setHMI_IReg1519(Float HMI_IReg1519) {
        this.HMI_IReg1519 = HMI_IReg1519;
    }

    public boolean isHMI_Disc301() {
        return HMI_Disc301;
    }

    public void setHMI_Disc301(boolean HMI_Disc301) {
        this.HMI_Disc301 = HMI_Disc301;
    }

    public boolean isHMI_Disc302() {
        return HMI_Disc302;
    }

    public void setHMI_Disc302(boolean HMI_Disc302) {
        this.HMI_Disc302 = HMI_Disc302;
    }

    public boolean isHMI_Disc303() {
        return HMI_Disc303;
    }

    public void setHMI_Disc303(boolean HMI_Disc303) {
        this.HMI_Disc303 = HMI_Disc303;
    }

    public boolean isHMI_Disc304() {
        return HMI_Disc304;
    }

    public void setHMI_Disc304(boolean HMI_Disc304) {
        this.HMI_Disc304 = HMI_Disc304;
    }

    public boolean isHMI_Disc305() {
        return HMI_Disc305;
    }

    public void setHMI_Disc305(boolean HMI_Disc305) {
        this.HMI_Disc305 = HMI_Disc305;
    }

    public boolean isHMI_Disc306() {
        return HMI_Disc306;
    }

    public void setHMI_Disc306(boolean HMI_Disc306) {
        this.HMI_Disc306 = HMI_Disc306;
    }

    public boolean isHMI_Disc307() {
        return HMI_Disc307;
    }

    public void setHMI_Disc307(boolean HMI_Disc307) {
        this.HMI_Disc307 = HMI_Disc307;
    }

    public boolean isHMI_Disc308() {
        return HMI_Disc308;
    }

    public void setHMI_Disc308(boolean HMI_Disc308) {
        this.HMI_Disc308 = HMI_Disc308;
    }

    public boolean isHMI_Disc309() {
        return HMI_Disc309;
    }

    public void setHMI_Disc309(boolean HMI_Disc309) {
        this.HMI_Disc309 = HMI_Disc309;
    }

    public boolean isHMI_Disc310() {
        return HMI_Disc310;
    }

    public void setHMI_Disc310(boolean HMI_Disc310) {
        this.HMI_Disc310 = HMI_Disc310;
    }

    public boolean isHMI_Disc311() {
        return HMI_Disc311;
    }

    public void setHMI_Disc311(boolean HMI_Disc311) {
        this.HMI_Disc311 = HMI_Disc311;
    }

    public boolean isHMI_Disc312() {
        return HMI_Disc312;
    }

    public void setHMI_Disc312(boolean HMI_Disc312) {
        this.HMI_Disc312 = HMI_Disc312;
    }

    public boolean isHMI_Disc313() {
        return HMI_Disc313;
    }

    public void setHMI_Disc313(boolean HMI_Disc313) {
        this.HMI_Disc313 = HMI_Disc313;
    }

    public boolean isHMI_Disc314() {
        return HMI_Disc314;
    }

    public void setHMI_Disc314(boolean HMI_Disc314) {
        this.HMI_Disc314 = HMI_Disc314;
    }

    public boolean isHMI_Disc315() {
        return HMI_Disc315;
    }

    public void setHMI_Disc315(boolean HMI_Disc315) {
        this.HMI_Disc315 = HMI_Disc315;
    }

    public boolean isHMI_Disc316() {
        return HMI_Disc316;
    }

    public void setHMI_Disc316(boolean HMI_Disc316) {
        this.HMI_Disc316 = HMI_Disc316;
    }

    public boolean isHMI_Disc317() {
        return HMI_Disc317;
    }

    public void setHMI_Disc317(boolean HMI_Disc317) {
        this.HMI_Disc317 = HMI_Disc317;
    }

    public boolean isHMI_Disc318() {
        return HMI_Disc318;
    }

    public void setHMI_Disc318(boolean HMI_Disc318) {
        this.HMI_Disc318 = HMI_Disc318;
    }

    public boolean isHMI_Disc319() {
        return HMI_Disc319;
    }

    public void setHMI_Disc319(boolean HMI_Disc319) {
        this.HMI_Disc319 = HMI_Disc319;
    }

    public boolean isHMI_Disc320() {
        return HMI_Disc320;
    }

    public void setHMI_Disc320(boolean HMI_Disc320) {
        this.HMI_Disc320 = HMI_Disc320;
    }

    public boolean isHMI_Disc321() {
        return HMI_Disc321;
    }

    public void setHMI_Disc321(boolean HMI_Disc321) {
        this.HMI_Disc321 = HMI_Disc321;
    }

    public boolean isHMI_Disc322() {
        return HMI_Disc322;
    }

    public void setHMI_Disc322(boolean HMI_Disc322) {
        this.HMI_Disc322 = HMI_Disc322;
    }

    public boolean isHMI_Disc323() {
        return HMI_Disc323;
    }

    public void setHMI_Disc323(boolean HMI_Disc323) {
        this.HMI_Disc323 = HMI_Disc323;
    }

    public boolean isHMI_Disc324() {
        return HMI_Disc324;
    }

    public void setHMI_Disc324(boolean HMI_Disc324) {
        this.HMI_Disc324 = HMI_Disc324;
    }

    public boolean isHMI_Disc325() {
        return HMI_Disc325;
    }

    public void setHMI_Disc325(boolean HMI_Disc325) {
        this.HMI_Disc325 = HMI_Disc325;
    }

    public boolean isHMI_Disc326() {
        return HMI_Disc326;
    }

    public void setHMI_Disc326(boolean HMI_Disc326) {
        this.HMI_Disc326 = HMI_Disc326;
    }

    public boolean isHMI_Disc327() {
        return HMI_Disc327;
    }

    public void setHMI_Disc327(boolean HMI_Disc327) {
        this.HMI_Disc327 = HMI_Disc327;
    }

    public boolean isHMI_Disc328() {
        return HMI_Disc328;
    }

    public void setHMI_Disc328(boolean HMI_Disc328) {
        this.HMI_Disc328 = HMI_Disc328;
    }

    public boolean isHMI_Disc329() {
        return HMI_Disc329;
    }

    public void setHMI_Disc329(boolean HMI_Disc329) {
        this.HMI_Disc329 = HMI_Disc329;
    }

    public boolean isHMI_Disc330() {
        return HMI_Disc330;
    }

    public void setHMI_Disc330(boolean HMI_Disc330) {
        this.HMI_Disc330 = HMI_Disc330;
    }

    public boolean isHMI_Disc331() {
        return HMI_Disc331;
    }

    public void setHMI_Disc331(boolean HMI_Disc331) {
        this.HMI_Disc331 = HMI_Disc331;
    }

    public boolean isHMI_Disc332() {
        return HMI_Disc332;
    }

    public void setHMI_Disc332(boolean HMI_Disc332) {
        this.HMI_Disc332 = HMI_Disc332;
    }

    public boolean isHMI_Disc333() {
        return HMI_Disc333;
    }

    public void setHMI_Disc333(boolean HMI_Disc333) {
        this.HMI_Disc333 = HMI_Disc333;
    }

    public boolean isHMI_Disc334() {
        return HMI_Disc334;
    }

    public void setHMI_Disc334(boolean HMI_Disc334) {
        this.HMI_Disc334 = HMI_Disc334;
    }

    public boolean isHMI_Disc335() {
        return HMI_Disc335;
    }

    public void setHMI_Disc335(boolean HMI_Disc335) {
        this.HMI_Disc335 = HMI_Disc335;
    }

    public boolean isHMI_Disc336() {
        return HMI_Disc336;
    }

    public void setHMI_Disc336(boolean HMI_Disc336) {
        this.HMI_Disc336 = HMI_Disc336;
    }

    public boolean isHMI_Disc337() {
        return HMI_Disc337;
    }

    public void setHMI_Disc337(boolean HMI_Disc337) {
        this.HMI_Disc337 = HMI_Disc337;
    }

    public boolean isHMI_Disc338() {
        return HMI_Disc338;
    }

    public void setHMI_Disc338(boolean HMI_Disc338) {
        this.HMI_Disc338 = HMI_Disc338;
    }

    public boolean isHMI_Disc339() {
        return HMI_Disc339;
    }

    public void setHMI_Disc339(boolean HMI_Disc339) {
        this.HMI_Disc339 = HMI_Disc339;
    }

    public boolean isHMI_Disc340() {
        return HMI_Disc340;
    }

    public void setHMI_Disc340(boolean HMI_Disc340) {
        this.HMI_Disc340 = HMI_Disc340;
    }

    public boolean isHMI_Disc341() {
        return HMI_Disc341;
    }

    public void setHMI_Disc341(boolean HMI_Disc341) {
        this.HMI_Disc341 = HMI_Disc341;
    }

    public boolean isHMI_Disc342() {
        return HMI_Disc342;
    }

    public void setHMI_Disc342(boolean HMI_Disc342) {
        this.HMI_Disc342 = HMI_Disc342;
    }

    public boolean isHMI_Disc343() {
        return HMI_Disc343;
    }

    public void setHMI_Disc343(boolean HMI_Disc343) {
        this.HMI_Disc343 = HMI_Disc343;
    }

    public boolean isHMI_Disc344() {
        return HMI_Disc344;
    }

    public void setHMI_Disc344(boolean HMI_Disc344) {
        this.HMI_Disc344 = HMI_Disc344;
    }

    public boolean isHMI_Disc345() {
        return HMI_Disc345;
    }

    public void setHMI_Disc345(boolean HMI_Disc345) {
        this.HMI_Disc345 = HMI_Disc345;
    }

    public boolean isHMI_Disc346() {
        return HMI_Disc346;
    }

    public void setHMI_Disc346(boolean HMI_Disc346) {
        this.HMI_Disc346 = HMI_Disc346;
    }

    public boolean isHMI_Disc347() {
        return HMI_Disc347;
    }

    public void setHMI_Disc347(boolean HMI_Disc347) {
        this.HMI_Disc347 = HMI_Disc347;
    }

    public boolean isHMI_Disc348() {
        return HMI_Disc348;
    }

    public void setHMI_Disc348(boolean HMI_Disc348) {
        this.HMI_Disc348 = HMI_Disc348;
    }

    public boolean isHMI_Disc349() {
        return HMI_Disc349;
    }

    public void setHMI_Disc349(boolean HMI_Disc349) {
        this.HMI_Disc349 = HMI_Disc349;
    }

    public boolean isHMI_Disc350() {
        return HMI_Disc350;
    }

    public void setHMI_Disc350(boolean HMI_Disc350) {
        this.HMI_Disc350 = HMI_Disc350;
    }

    public boolean isHMI_Disc351() {
        return HMI_Disc351;
    }

    public void setHMI_Disc351(boolean HMI_Disc351) {
        this.HMI_Disc351 = HMI_Disc351;
    }

    public boolean isHMI_Disc352() {
        return HMI_Disc352;
    }

    public void setHMI_Disc352(boolean HMI_Disc352) {
        this.HMI_Disc352 = HMI_Disc352;
    }

    public boolean isHMI_Disc353() {
        return HMI_Disc353;
    }

    public void setHMI_Disc353(boolean HMI_Disc353) {
        this.HMI_Disc353 = HMI_Disc353;
    }

    public boolean isHMI_Disc354() {
        return HMI_Disc354;
    }

    public void setHMI_Disc354(boolean HMI_Disc354) {
        this.HMI_Disc354 = HMI_Disc354;
    }

    public boolean isHMI_Disc355() {
        return HMI_Disc355;
    }

    public void setHMI_Disc355(boolean HMI_Disc355) {
        this.HMI_Disc355 = HMI_Disc355;
    }

    public boolean isHMI_Disc356() {
        return HMI_Disc356;
    }

    public void setHMI_Disc356(boolean HMI_Disc356) {
        this.HMI_Disc356 = HMI_Disc356;
    }

    public boolean isHMI_Disc357() {
        return HMI_Disc357;
    }

    public void setHMI_Disc357(boolean HMI_Disc357) {
        this.HMI_Disc357 = HMI_Disc357;
    }

    public boolean isHMI_Disc358() {
        return HMI_Disc358;
    }

    public void setHMI_Disc358(boolean HMI_Disc358) {
        this.HMI_Disc358 = HMI_Disc358;
    }

    public boolean isHMI_Disc359() {
        return HMI_Disc359;
    }

    public void setHMI_Disc359(boolean HMI_Disc359) {
        this.HMI_Disc359 = HMI_Disc359;
    }

    public boolean isHMI_Disc360() {
        return HMI_Disc360;
    }

    public void setHMI_Disc360(boolean HMI_Disc360) {
        this.HMI_Disc360 = HMI_Disc360;
    }

    public boolean isHMI_Disc361() {
        return HMI_Disc361;
    }

    public void setHMI_Disc361(boolean HMI_Disc361) {
        this.HMI_Disc361 = HMI_Disc361;
    }

    public boolean isHMI_Disc362() {
        return HMI_Disc362;
    }

    public void setHMI_Disc362(boolean HMI_Disc362) {
        this.HMI_Disc362 = HMI_Disc362;
    }

    public boolean isHMI_Disc363() {
        return HMI_Disc363;
    }

    public void setHMI_Disc363(boolean HMI_Disc363) {
        this.HMI_Disc363 = HMI_Disc363;
    }

    public boolean isHMI_Disc364() {
        return HMI_Disc364;
    }

    public void setHMI_Disc364(boolean HMI_Disc364) {
        this.HMI_Disc364 = HMI_Disc364;
    }

    public boolean isHMI_Disc365() {
        return HMI_Disc365;
    }

    public void setHMI_Disc365(boolean HMI_Disc365) {
        this.HMI_Disc365 = HMI_Disc365;
    }

    public boolean isHMI_Disc366() {
        return HMI_Disc366;
    }

    public void setHMI_Disc366(boolean HMI_Disc366) {
        this.HMI_Disc366 = HMI_Disc366;
    }

    public boolean isHMI_Disc367() {
        return HMI_Disc367;
    }

    public void setHMI_Disc367(boolean HMI_Disc367) {
        this.HMI_Disc367 = HMI_Disc367;
    }

    public boolean isHMI_Disc368() {
        return HMI_Disc368;
    }

    public void setHMI_Disc368(boolean HMI_Disc368) {
        this.HMI_Disc368 = HMI_Disc368;
    }

    public boolean isHMI_Disc369() {
        return HMI_Disc369;
    }

    public void setHMI_Disc369(boolean HMI_Disc369) {
        this.HMI_Disc369 = HMI_Disc369;
    }

    public boolean isHMI_Disc370() {
        return HMI_Disc370;
    }

    public void setHMI_Disc370(boolean HMI_Disc370) {
        this.HMI_Disc370 = HMI_Disc370;
    }

    public boolean isHMI_Disc371() {
        return HMI_Disc371;
    }

    public void setHMI_Disc371(boolean HMI_Disc371) {
        this.HMI_Disc371 = HMI_Disc371;
    }

    public boolean isHMI_Disc372() {
        return HMI_Disc372;
    }

    public void setHMI_Disc372(boolean HMI_Disc372) {
        this.HMI_Disc372 = HMI_Disc372;
    }

    public boolean isHMI_Disc373() {
        return HMI_Disc373;
    }

    public void setHMI_Disc373(boolean HMI_Disc373) {
        this.HMI_Disc373 = HMI_Disc373;
    }

    public boolean isHMI_Disc374() {
        return HMI_Disc374;
    }

    public void setHMI_Disc374(boolean HMI_Disc374) {
        this.HMI_Disc374 = HMI_Disc374;
    }

    public boolean isHMI_Disc375() {
        return HMI_Disc375;
    }

    public void setHMI_Disc375(boolean HMI_Disc375) {
        this.HMI_Disc375 = HMI_Disc375;
    }

    public boolean isHMI_Disc376() {
        return HMI_Disc376;
    }

    public void setHMI_Disc376(boolean HMI_Disc376) {
        this.HMI_Disc376 = HMI_Disc376;
    }

    public boolean isHMI_Disc377() {
        return HMI_Disc377;
    }

    public void setHMI_Disc377(boolean HMI_Disc377) {
        this.HMI_Disc377 = HMI_Disc377;
    }

    public boolean isHMI_Disc378() {
        return HMI_Disc378;
    }

    public void setHMI_Disc378(boolean HMI_Disc378) {
        this.HMI_Disc378 = HMI_Disc378;
    }

    public boolean isHMI_Disc379() {
        return HMI_Disc379;
    }

    public void setHMI_Disc379(boolean HMI_Disc379) {
        this.HMI_Disc379 = HMI_Disc379;
    }

    public boolean isHMI_Disc380() {
        return HMI_Disc380;
    }

    public void setHMI_Disc380(boolean HMI_Disc380) {
        this.HMI_Disc380 = HMI_Disc380;
    }

    public boolean isHMI_Disc381() {
        return HMI_Disc381;
    }

    public void setHMI_Disc381(boolean HMI_Disc381) {
        this.HMI_Disc381 = HMI_Disc381;
    }

    public boolean isHMI_Disc382() {
        return HMI_Disc382;
    }

    public void setHMI_Disc382(boolean HMI_Disc382) {
        this.HMI_Disc382 = HMI_Disc382;
    }

    public boolean isHMI_Disc383() {
        return HMI_Disc383;
    }

    public void setHMI_Disc383(boolean HMI_Disc383) {
        this.HMI_Disc383 = HMI_Disc383;
    }

    public boolean isHMI_Disc384() {
        return HMI_Disc384;
    }

    public void setHMI_Disc384(boolean HMI_Disc384) {
        this.HMI_Disc384 = HMI_Disc384;
    }

    public boolean isHMI_Disc385() {
        return HMI_Disc385;
    }

    public void setHMI_Disc385(boolean HMI_Disc385) {
        this.HMI_Disc385 = HMI_Disc385;
    }

    public boolean isHMI_Disc386() {
        return HMI_Disc386;
    }

    public void setHMI_Disc386(boolean HMI_Disc386) {
        this.HMI_Disc386 = HMI_Disc386;
    }

    public boolean isHMI_Disc387() {
        return HMI_Disc387;
    }

    public void setHMI_Disc387(boolean HMI_Disc387) {
        this.HMI_Disc387 = HMI_Disc387;
    }

    public boolean isHMI_Disc388() {
        return HMI_Disc388;
    }

    public void setHMI_Disc388(boolean HMI_Disc388) {
        this.HMI_Disc388 = HMI_Disc388;
    }

    public boolean isHMI_Disc389() {
        return HMI_Disc389;
    }

    public void setHMI_Disc389(boolean HMI_Disc389) {
        this.HMI_Disc389 = HMI_Disc389;
    }

    public boolean isHMI_Disc390() {
        return HMI_Disc390;
    }

    public void setHMI_Disc390(boolean HMI_Disc390) {
        this.HMI_Disc390 = HMI_Disc390;
    }

    public boolean isHMI_Disc391() {
        return HMI_Disc391;
    }

    public void setHMI_Disc391(boolean HMI_Disc391) {
        this.HMI_Disc391 = HMI_Disc391;
    }

    public boolean isHMI_Disc392() {
        return HMI_Disc392;
    }

    public void setHMI_Disc392(boolean HMI_Disc392) {
        this.HMI_Disc392 = HMI_Disc392;
    }

    public boolean isHMI_Disc393() {
        return HMI_Disc393;
    }

    public void setHMI_Disc393(boolean HMI_Disc393) {
        this.HMI_Disc393 = HMI_Disc393;
    }

    public boolean isHMI_Disc394() {
        return HMI_Disc394;
    }

    public void setHMI_Disc394(boolean HMI_Disc394) {
        this.HMI_Disc394 = HMI_Disc394;
    }

    public boolean isHMI_Disc395() {
        return HMI_Disc395;
    }

    public void setHMI_Disc395(boolean HMI_Disc395) {
        this.HMI_Disc395 = HMI_Disc395;
    }

    public boolean isHMI_Disc396() {
        return HMI_Disc396;
    }

    public void setHMI_Disc396(boolean HMI_Disc396) {
        this.HMI_Disc396 = HMI_Disc396;
    }

    public boolean isHMI_Disc397() {
        return HMI_Disc397;
    }

    public void setHMI_Disc397(boolean HMI_Disc397) {
        this.HMI_Disc397 = HMI_Disc397;
    }

    public boolean isHMI_Disc398() {
        return HMI_Disc398;
    }

    public void setHMI_Disc398(boolean HMI_Disc398) {
        this.HMI_Disc398 = HMI_Disc398;
    }

    public boolean isHMI_Disc399() {
        return HMI_Disc399;
    }

    public void setHMI_Disc399(boolean HMI_Disc399) {
        this.HMI_Disc399 = HMI_Disc399;
    }

    public boolean isHMI_Disc400() {
        return HMI_Disc400;
    }

    public void setHMI_Disc400(boolean HMI_Disc400) {
        this.HMI_Disc400 = HMI_Disc400;
    }

    public boolean isHMI_Disc401() {
        return HMI_Disc401;
    }

    public void setHMI_Disc401(boolean HMI_Disc401) {
        this.HMI_Disc401 = HMI_Disc401;
    }

    public boolean isHMI_Disc402() {
        return HMI_Disc402;
    }

    public void setHMI_Disc402(boolean HMI_Disc402) {
        this.HMI_Disc402 = HMI_Disc402;
    }

    public boolean isHMI_Disc403() {
        return HMI_Disc403;
    }

    public void setHMI_Disc403(boolean HMI_Disc403) {
        this.HMI_Disc403 = HMI_Disc403;
    }

    public boolean isHMI_Disc404() {
        return HMI_Disc404;
    }

    public void setHMI_Disc404(boolean HMI_Disc404) {
        this.HMI_Disc404 = HMI_Disc404;
    }

    public boolean isHMI_Disc405() {
        return HMI_Disc405;
    }

    public void setHMI_Disc405(boolean HMI_Disc405) {
        this.HMI_Disc405 = HMI_Disc405;
    }

    public boolean isHMI_Disc406() {
        return HMI_Disc406;
    }

    public void setHMI_Disc406(boolean HMI_Disc406) {
        this.HMI_Disc406 = HMI_Disc406;
    }

    public boolean isHMI_Disc407() {
        return HMI_Disc407;
    }

    public void setHMI_Disc407(boolean HMI_Disc407) {
        this.HMI_Disc407 = HMI_Disc407;
    }

    public boolean isHMI_Disc408() {
        return HMI_Disc408;
    }

    public void setHMI_Disc408(boolean HMI_Disc408) {
        this.HMI_Disc408 = HMI_Disc408;
    }

    public boolean isHMI_Disc409() {
        return HMI_Disc409;
    }

    public void setHMI_Disc409(boolean HMI_Disc409) {
        this.HMI_Disc409 = HMI_Disc409;
    }

    public boolean isHMI_Disc410() {
        return HMI_Disc410;
    }

    public void setHMI_Disc410(boolean HMI_Disc410) {
        this.HMI_Disc410 = HMI_Disc410;
    }

    public boolean isHMI_Disc411() {
        return HMI_Disc411;
    }

    public void setHMI_Disc411(boolean HMI_Disc411) {
        this.HMI_Disc411 = HMI_Disc411;
    }

    public boolean isHMI_Disc412() {
        return HMI_Disc412;
    }

    public void setHMI_Disc412(boolean HMI_Disc412) {
        this.HMI_Disc412 = HMI_Disc412;
    }

    public boolean isHMI_Disc413() {
        return HMI_Disc413;
    }

    public void setHMI_Disc413(boolean HMI_Disc413) {
        this.HMI_Disc413 = HMI_Disc413;
    }

    public boolean isHMI_Disc414() {
        return HMI_Disc414;
    }

    public void setHMI_Disc414(boolean HMI_Disc414) {
        this.HMI_Disc414 = HMI_Disc414;
    }

    public boolean isHMI_Disc415() {
        return HMI_Disc415;
    }

    public void setHMI_Disc415(boolean HMI_Disc415) {
        this.HMI_Disc415 = HMI_Disc415;
    }

    public boolean isHMI_Disc416() {
        return HMI_Disc416;
    }

    public void setHMI_Disc416(boolean HMI_Disc416) {
        this.HMI_Disc416 = HMI_Disc416;
    }

    public boolean isHMI_Disc417() {
        return HMI_Disc417;
    }

    public void setHMI_Disc417(boolean HMI_Disc417) {
        this.HMI_Disc417 = HMI_Disc417;
    }

    public boolean isHMI_Disc418() {
        return HMI_Disc418;
    }

    public void setHMI_Disc418(boolean HMI_Disc418) {
        this.HMI_Disc418 = HMI_Disc418;
    }

    public boolean isHMI_Disc419() {
        return HMI_Disc419;
    }

    public void setHMI_Disc419(boolean HMI_Disc419) {
        this.HMI_Disc419 = HMI_Disc419;
    }

    public boolean isHMI_Disc420() {
        return HMI_Disc420;
    }

    public void setHMI_Disc420(boolean HMI_Disc420) {
        this.HMI_Disc420 = HMI_Disc420;
    }

    public boolean isHMI_Disc421() {
        return HMI_Disc421;
    }

    public void setHMI_Disc421(boolean HMI_Disc421) {
        this.HMI_Disc421 = HMI_Disc421;
    }

    public boolean isHMI_Disc422() {
        return HMI_Disc422;
    }

    public void setHMI_Disc422(boolean HMI_Disc422) {
        this.HMI_Disc422 = HMI_Disc422;
    }

    public boolean isHMI_Disc423() {
        return HMI_Disc423;
    }

    public void setHMI_Disc423(boolean HMI_Disc423) {
        this.HMI_Disc423 = HMI_Disc423;
    }

    public boolean isHMI_Disc424() {
        return HMI_Disc424;
    }

    public void setHMI_Disc424(boolean HMI_Disc424) {
        this.HMI_Disc424 = HMI_Disc424;
    }

    public boolean isHMI_Disc425() {
        return HMI_Disc425;
    }

    public void setHMI_Disc425(boolean HMI_Disc425) {
        this.HMI_Disc425 = HMI_Disc425;
    }

    public boolean isHMI_Disc426() {
        return HMI_Disc426;
    }

    public void setHMI_Disc426(boolean HMI_Disc426) {
        this.HMI_Disc426 = HMI_Disc426;
    }

    public boolean isHMI_Disc427() {
        return HMI_Disc427;
    }

    public void setHMI_Disc427(boolean HMI_Disc427) {
        this.HMI_Disc427 = HMI_Disc427;
    }

    public boolean isHMI_Disc428() {
        return HMI_Disc428;
    }

    public void setHMI_Disc428(boolean HMI_Disc428) {
        this.HMI_Disc428 = HMI_Disc428;
    }

    public boolean isHMI_Disc429() {
        return HMI_Disc429;
    }

    public void setHMI_Disc429(boolean HMI_Disc429) {
        this.HMI_Disc429 = HMI_Disc429;
    }

    public boolean isHMI_Disc430() {
        return HMI_Disc430;
    }

    public void setHMI_Disc430(boolean HMI_Disc430) {
        this.HMI_Disc430 = HMI_Disc430;
    }

    public boolean isHMI_Disc431() {
        return HMI_Disc431;
    }

    public void setHMI_Disc431(boolean HMI_Disc431) {
        this.HMI_Disc431 = HMI_Disc431;
    }

    public boolean isHMI_Disc432() {
        return HMI_Disc432;
    }

    public void setHMI_Disc432(boolean HMI_Disc432) {
        this.HMI_Disc432 = HMI_Disc432;
    }

    public boolean isHMI_Disc433() {
        return HMI_Disc433;
    }

    public void setHMI_Disc433(boolean HMI_Disc433) {
        this.HMI_Disc433 = HMI_Disc433;
    }

    public boolean isHMI_Disc434() {
        return HMI_Disc434;
    }

    public void setHMI_Disc434(boolean HMI_Disc434) {
        this.HMI_Disc434 = HMI_Disc434;
    }

    public boolean isHMI_Disc435() {
        return HMI_Disc435;
    }

    public void setHMI_Disc435(boolean HMI_Disc435) {
        this.HMI_Disc435 = HMI_Disc435;
    }

    public boolean isHMI_Disc436() {
        return HMI_Disc436;
    }

    public void setHMI_Disc436(boolean HMI_Disc436) {
        this.HMI_Disc436 = HMI_Disc436;
    }

    public boolean isHMI_Disc437() {
        return HMI_Disc437;
    }

    public void setHMI_Disc437(boolean HMI_Disc437) {
        this.HMI_Disc437 = HMI_Disc437;
    }

    public boolean isHMI_Disc438() {
        return HMI_Disc438;
    }

    public void setHMI_Disc438(boolean HMI_Disc438) {
        this.HMI_Disc438 = HMI_Disc438;
    }

    public boolean isHMI_Disc439() {
        return HMI_Disc439;
    }

    public void setHMI_Disc439(boolean HMI_Disc439) {
        this.HMI_Disc439 = HMI_Disc439;
    }

    public boolean isHMI_Disc440() {
        return HMI_Disc440;
    }

    public void setHMI_Disc440(boolean HMI_Disc440) {
        this.HMI_Disc440 = HMI_Disc440;
    }

    public boolean isHMI_Disc441() {
        return HMI_Disc441;
    }

    public void setHMI_Disc441(boolean HMI_Disc441) {
        this.HMI_Disc441 = HMI_Disc441;
    }

    public boolean isHMI_Disc442() {
        return HMI_Disc442;
    }

    public void setHMI_Disc442(boolean HMI_Disc442) {
        this.HMI_Disc442 = HMI_Disc442;
    }

    public boolean isHMI_Disc443() {
        return HMI_Disc443;
    }

    public void setHMI_Disc443(boolean HMI_Disc443) {
        this.HMI_Disc443 = HMI_Disc443;
    }

    public boolean isHMI_Disc444() {
        return HMI_Disc444;
    }

    public void setHMI_Disc444(boolean HMI_Disc444) {
        this.HMI_Disc444 = HMI_Disc444;
    }

    public boolean isHMI_Disc445() {
        return HMI_Disc445;
    }

    public void setHMI_Disc445(boolean HMI_Disc445) {
        this.HMI_Disc445 = HMI_Disc445;
    }

    public boolean isHMI_Disc446() {
        return HMI_Disc446;
    }

    public void setHMI_Disc446(boolean HMI_Disc446) {
        this.HMI_Disc446 = HMI_Disc446;
    }

    public boolean isHMI_Disc447() {
        return HMI_Disc447;
    }

    public void setHMI_Disc447(boolean HMI_Disc447) {
        this.HMI_Disc447 = HMI_Disc447;
    }

    public boolean isHMI_Disc448() {
        return HMI_Disc448;
    }

    public void setHMI_Disc448(boolean HMI_Disc448) {
        this.HMI_Disc448 = HMI_Disc448;
    }

    public boolean isHMI_Disc449() {
        return HMI_Disc449;
    }

    public void setHMI_Disc449(boolean HMI_Disc449) {
        this.HMI_Disc449 = HMI_Disc449;
    }

    public boolean isHMI_Disc450() {
        return HMI_Disc450;
    }

    public void setHMI_Disc450(boolean HMI_Disc450) {
        this.HMI_Disc450 = HMI_Disc450;
    }

    public boolean isHMI_Disc451() {
        return HMI_Disc451;
    }

    public void setHMI_Disc451(boolean HMI_Disc451) {
        this.HMI_Disc451 = HMI_Disc451;
    }

    public boolean isHMI_Disc452() {
        return HMI_Disc452;
    }

    public void setHMI_Disc452(boolean HMI_Disc452) {
        this.HMI_Disc452 = HMI_Disc452;
    }

    public boolean isHMI_Disc453() {
        return HMI_Disc453;
    }

    public void setHMI_Disc453(boolean HMI_Disc453) {
        this.HMI_Disc453 = HMI_Disc453;
    }

    public boolean isHMI_Disc454() {
        return HMI_Disc454;
    }

    public void setHMI_Disc454(boolean HMI_Disc454) {
        this.HMI_Disc454 = HMI_Disc454;
    }

    public boolean isHMI_Disc455() {
        return HMI_Disc455;
    }

    public void setHMI_Disc455(boolean HMI_Disc455) {
        this.HMI_Disc455 = HMI_Disc455;
    }

    public boolean isHMI_Disc456() {
        return HMI_Disc456;
    }

    public void setHMI_Disc456(boolean HMI_Disc456) {
        this.HMI_Disc456 = HMI_Disc456;
    }

    public boolean isHMI_Disc457() {
        return HMI_Disc457;
    }

    public void setHMI_Disc457(boolean HMI_Disc457) {
        this.HMI_Disc457 = HMI_Disc457;
    }

    public boolean isHMI_Disc458() {
        return HMI_Disc458;
    }

    public void setHMI_Disc458(boolean HMI_Disc458) {
        this.HMI_Disc458 = HMI_Disc458;
    }

    public boolean isHMI_Disc459() {
        return HMI_Disc459;
    }

    public void setHMI_Disc459(boolean HMI_Disc459) {
        this.HMI_Disc459 = HMI_Disc459;
    }

    public boolean isHMI_Disc460() {
        return HMI_Disc460;
    }

    public void setHMI_Disc460(boolean HMI_Disc460) {
        this.HMI_Disc460 = HMI_Disc460;
    }

    public boolean isHMI_Disc461() {
        return HMI_Disc461;
    }

    public void setHMI_Disc461(boolean HMI_Disc461) {
        this.HMI_Disc461 = HMI_Disc461;
    }

    public boolean isHMI_Disc462() {
        return HMI_Disc462;
    }

    public void setHMI_Disc462(boolean HMI_Disc462) {
        this.HMI_Disc462 = HMI_Disc462;
    }

    public boolean isHMI_Disc463() {
        return HMI_Disc463;
    }

    public void setHMI_Disc463(boolean HMI_Disc463) {
        this.HMI_Disc463 = HMI_Disc463;
    }

    public boolean isHMI_Disc464() {
        return HMI_Disc464;
    }

    public void setHMI_Disc464(boolean HMI_Disc464) {
        this.HMI_Disc464 = HMI_Disc464;
    }

    public boolean isHMI_Disc465() {
        return HMI_Disc465;
    }

    public void setHMI_Disc465(boolean HMI_Disc465) {
        this.HMI_Disc465 = HMI_Disc465;
    }

    public boolean isHMI_Disc466() {
        return HMI_Disc466;
    }

    public void setHMI_Disc466(boolean HMI_Disc466) {
        this.HMI_Disc466 = HMI_Disc466;
    }

    public boolean isHMI_Disc467() {
        return HMI_Disc467;
    }

    public void setHMI_Disc467(boolean HMI_Disc467) {
        this.HMI_Disc467 = HMI_Disc467;
    }

    public boolean isHMI_Disc468() {
        return HMI_Disc468;
    }

    public void setHMI_Disc468(boolean HMI_Disc468) {
        this.HMI_Disc468 = HMI_Disc468;
    }

    public boolean isHMI_Disc469() {
        return HMI_Disc469;
    }

    public void setHMI_Disc469(boolean HMI_Disc469) {
        this.HMI_Disc469 = HMI_Disc469;
    }

    public boolean isHMI_Disc474() {
        return HMI_Disc474;
    }

    public void setHMI_Disc474(boolean HMI_Disc474) {
        this.HMI_Disc474 = HMI_Disc474;
    }

    public boolean isHMI_Disc475() {
        return HMI_Disc475;
    }

    public void setHMI_Disc475(boolean HMI_Disc475) {
        this.HMI_Disc475 = HMI_Disc475;
    }

    public boolean isHMI_Disc476() {
        return HMI_Disc476;
    }

    public void setHMI_Disc476(boolean HMI_Disc476) {
        this.HMI_Disc476 = HMI_Disc476;
    }

    public boolean isHMI_Disc477() {
        return HMI_Disc477;
    }

    public void setHMI_Disc477(boolean HMI_Disc477) {
        this.HMI_Disc477 = HMI_Disc477;
    }

    public boolean isHMI_Disc478() {
        return HMI_Disc478;
    }

    public void setHMI_Disc478(boolean HMI_Disc478) {
        this.HMI_Disc478 = HMI_Disc478;
    }

    public boolean isHMI_Disc600() {
        return HMI_Disc600;
    }

    public void setHMI_Disc600(boolean HMI_Disc600) {
        this.HMI_Disc600 = HMI_Disc600;
    }

    public boolean isHMI_Disc601() {
        return HMI_Disc601;
    }

    public void setHMI_Disc601(boolean HMI_Disc601) {
        this.HMI_Disc601 = HMI_Disc601;
    }

    public boolean isHMI_Disc602() {
        return HMI_Disc602;
    }

    public void setHMI_Disc602(boolean HMI_Disc602) {
        this.HMI_Disc602 = HMI_Disc602;
    }

    public boolean isHMI_Disc603() {
        return HMI_Disc603;
    }

    public void setHMI_Disc603(boolean HMI_Disc603) {
        this.HMI_Disc603 = HMI_Disc603;
    }

    public boolean isHMI_Disc604() {
        return HMI_Disc604;
    }

    public void setHMI_Disc604(boolean HMI_Disc604) {
        this.HMI_Disc604 = HMI_Disc604;
    }

    public boolean isHMI_Disc605() {
        return HMI_Disc605;
    }

    public void setHMI_Disc605(boolean HMI_Disc605) {
        this.HMI_Disc605 = HMI_Disc605;
    }

    public boolean isHMI_Disc606() {
        return HMI_Disc606;
    }

    public void setHMI_Disc606(boolean HMI_Disc606) {
        this.HMI_Disc606 = HMI_Disc606;
    }

    public boolean isHMI_Disc607() {
        return HMI_Disc607;
    }

    public void setHMI_Disc607(boolean HMI_Disc607) {
        this.HMI_Disc607 = HMI_Disc607;
    }

    public boolean isHMI_Disc608() {
        return HMI_Disc608;
    }

    public void setHMI_Disc608(boolean HMI_Disc608) {
        this.HMI_Disc608 = HMI_Disc608;
    }

    public boolean isHMI_Disc609() {
        return HMI_Disc609;
    }

    public void setHMI_Disc609(boolean HMI_Disc609) {
        this.HMI_Disc609 = HMI_Disc609;
    }

    public boolean isHMI_Disc610() {
        return HMI_Disc610;
    }

    public void setHMI_Disc610(boolean HMI_Disc610) {
        this.HMI_Disc610 = HMI_Disc610;
    }

    public boolean isHMI_Disc611() {
        return HMI_Disc611;
    }

    public void setHMI_Disc611(boolean HMI_Disc611) {
        this.HMI_Disc611 = HMI_Disc611;
    }

    public boolean isHMI_Disc612() {
        return HMI_Disc612;
    }

    public void setHMI_Disc612(boolean HMI_Disc612) {
        this.HMI_Disc612 = HMI_Disc612;
    }

    public boolean isHMI_Disc613() {
        return HMI_Disc613;
    }

    public void setHMI_Disc613(boolean HMI_Disc613) {
        this.HMI_Disc613 = HMI_Disc613;
    }

    public boolean isHMI_Disc614() {
        return HMI_Disc614;
    }

    public void setHMI_Disc614(boolean HMI_Disc614) {
        this.HMI_Disc614 = HMI_Disc614;
    }

    public boolean isHMI_Disc615() {
        return HMI_Disc615;
    }

    public void setHMI_Disc615(boolean HMI_Disc615) {
        this.HMI_Disc615 = HMI_Disc615;
    }

    public boolean isHMI_Disc616() {
        return HMI_Disc616;
    }

    public void setHMI_Disc616(boolean HMI_Disc616) {
        this.HMI_Disc616 = HMI_Disc616;
    }

    public boolean isHMI_Disc617() {
        return HMI_Disc617;
    }

    public void setHMI_Disc617(boolean HMI_Disc617) {
        this.HMI_Disc617 = HMI_Disc617;
    }

    public boolean isHMI_Disc618() {
        return HMI_Disc618;
    }

    public void setHMI_Disc618(boolean HMI_Disc618) {
        this.HMI_Disc618 = HMI_Disc618;
    }

    public boolean isHMI_Disc619() {
        return HMI_Disc619;
    }

    public void setHMI_Disc619(boolean HMI_Disc619) {
        this.HMI_Disc619 = HMI_Disc619;
    }

    public boolean isHMI_Disc620() {
        return HMI_Disc620;
    }

    public void setHMI_Disc620(boolean HMI_Disc620) {
        this.HMI_Disc620 = HMI_Disc620;
    }

    public boolean isHMI_Disc621() {
        return HMI_Disc621;
    }

    public void setHMI_Disc621(boolean HMI_Disc621) {
        this.HMI_Disc621 = HMI_Disc621;
    }

    public boolean isHMI_Disc622() {
        return HMI_Disc622;
    }

    public void setHMI_Disc622(boolean HMI_Disc622) {
        this.HMI_Disc622 = HMI_Disc622;
    }

    public boolean isHMI_Disc623() {
        return HMI_Disc623;
    }

    public void setHMI_Disc623(boolean HMI_Disc623) {
        this.HMI_Disc623 = HMI_Disc623;
    }

    public boolean isHMI_Disc624() {
        return HMI_Disc624;
    }

    public void setHMI_Disc624(boolean HMI_Disc624) {
        this.HMI_Disc624 = HMI_Disc624;
    }

    public boolean isHMI_Disc625() {
        return HMI_Disc625;
    }

    public void setHMI_Disc625(boolean HMI_Disc625) {
        this.HMI_Disc625 = HMI_Disc625;
    }

    public boolean isHMI_Disc626() {
        return HMI_Disc626;
    }

    public void setHMI_Disc626(boolean HMI_Disc626) {
        this.HMI_Disc626 = HMI_Disc626;
    }

    public boolean isHMI_Disc627() {
        return HMI_Disc627;
    }

    public void setHMI_Disc627(boolean HMI_Disc627) {
        this.HMI_Disc627 = HMI_Disc627;
    }

    public boolean isHMI_Disc628() {
        return HMI_Disc628;
    }

    public void setHMI_Disc628(boolean HMI_Disc628) {
        this.HMI_Disc628 = HMI_Disc628;
    }

    public boolean isHMI_Disc629() {
        return HMI_Disc629;
    }

    public void setHMI_Disc629(boolean HMI_Disc629) {
        this.HMI_Disc629 = HMI_Disc629;
    }

    public boolean isHMI_Disc630() {
        return HMI_Disc630;
    }

    public void setHMI_Disc630(boolean HMI_Disc630) {
        this.HMI_Disc630 = HMI_Disc630;
    }

    public boolean isHMI_Disc631() {
        return HMI_Disc631;
    }

    public void setHMI_Disc631(boolean HMI_Disc631) {
        this.HMI_Disc631 = HMI_Disc631;
    }

    public boolean isHMI_Disc632() {
        return HMI_Disc632;
    }

    public void setHMI_Disc632(boolean HMI_Disc632) {
        this.HMI_Disc632 = HMI_Disc632;
    }

    public boolean isHMI_Disc633() {
        return HMI_Disc633;
    }

    public void setHMI_Disc633(boolean HMI_Disc633) {
        this.HMI_Disc633 = HMI_Disc633;
    }

    public boolean isHMI_Disc634() {
        return HMI_Disc634;
    }

    public void setHMI_Disc634(boolean HMI_Disc634) {
        this.HMI_Disc634 = HMI_Disc634;
    }

    public boolean isHMI_Disc635() {
        return HMI_Disc635;
    }

    public void setHMI_Disc635(boolean HMI_Disc635) {
        this.HMI_Disc635 = HMI_Disc635;
    }

    public boolean isHMI_Disc636() {
        return HMI_Disc636;
    }

    public void setHMI_Disc636(boolean HMI_Disc636) {
        this.HMI_Disc636 = HMI_Disc636;
    }

    public boolean isHMI_Disc637() {
        return HMI_Disc637;
    }

    public void setHMI_Disc637(boolean HMI_Disc637) {
        this.HMI_Disc637 = HMI_Disc637;
    }

    public boolean isHMI_Disc638() {
        return HMI_Disc638;
    }

    public void setHMI_Disc638(boolean HMI_Disc638) {
        this.HMI_Disc638 = HMI_Disc638;
    }

    public boolean isHMI_Disc639() {
        return HMI_Disc639;
    }

    public void setHMI_Disc639(boolean HMI_Disc639) {
        this.HMI_Disc639 = HMI_Disc639;
    }

    public boolean isHMI_Disc640() {
        return HMI_Disc640;
    }

    public void setHMI_Disc640(boolean HMI_Disc640) {
        this.HMI_Disc640 = HMI_Disc640;
    }

    public boolean isHMI_Disc641() {
        return HMI_Disc641;
    }

    public void setHMI_Disc641(boolean HMI_Disc641) {
        this.HMI_Disc641 = HMI_Disc641;
    }

    public boolean isHMI_Disc642() {
        return HMI_Disc642;
    }

    public void setHMI_Disc642(boolean HMI_Disc642) {
        this.HMI_Disc642 = HMI_Disc642;
    }

    public boolean isHMI_Disc643() {
        return HMI_Disc643;
    }

    public void setHMI_Disc643(boolean HMI_Disc643) {
        this.HMI_Disc643 = HMI_Disc643;
    }

    public boolean isHMI_Disc644() {
        return HMI_Disc644;
    }

    public void setHMI_Disc644(boolean HMI_Disc644) {
        this.HMI_Disc644 = HMI_Disc644;
    }

    public boolean isHMI_Disc645() {
        return HMI_Disc645;
    }

    public void setHMI_Disc645(boolean HMI_Disc645) {
        this.HMI_Disc645 = HMI_Disc645;
    }

    public boolean isHMI_Disc646() {
        return HMI_Disc646;
    }

    public void setHMI_Disc646(boolean HMI_Disc646) {
        this.HMI_Disc646 = HMI_Disc646;
    }

    public boolean isHMI_Disc647() {
        return HMI_Disc647;
    }

    public void setHMI_Disc647(boolean HMI_Disc647) {
        this.HMI_Disc647 = HMI_Disc647;
    }

    public boolean isHMI_Disc648() {
        return HMI_Disc648;
    }

    public void setHMI_Disc648(boolean HMI_Disc648) {
        this.HMI_Disc648 = HMI_Disc648;
    }

    public boolean isHMI_Disc649() {
        return HMI_Disc649;
    }

    public void setHMI_Disc649(boolean HMI_Disc649) {
        this.HMI_Disc649 = HMI_Disc649;
    }

    public boolean isHMI_Disc650() {
        return HMI_Disc650;
    }

    public void setHMI_Disc650(boolean HMI_Disc650) {
        this.HMI_Disc650 = HMI_Disc650;
    }

    public boolean isHMI_Disc651() {
        return HMI_Disc651;
    }

    public void setHMI_Disc651(boolean HMI_Disc651) {
        this.HMI_Disc651 = HMI_Disc651;
    }

    public boolean isHMI_Disc652() {
        return HMI_Disc652;
    }

    public void setHMI_Disc652(boolean HMI_Disc652) {
        this.HMI_Disc652 = HMI_Disc652;
    }

    public boolean isHMI_Disc653() {
        return HMI_Disc653;
    }

    public void setHMI_Disc653(boolean HMI_Disc653) {
        this.HMI_Disc653 = HMI_Disc653;
    }

    public boolean isHMI_Disc654() {
        return HMI_Disc654;
    }

    public void setHMI_Disc654(boolean HMI_Disc654) {
        this.HMI_Disc654 = HMI_Disc654;
    }

    public boolean isHMI_Disc655() {
        return HMI_Disc655;
    }

    public void setHMI_Disc655(boolean HMI_Disc655) {
        this.HMI_Disc655 = HMI_Disc655;
    }

    public boolean isHMI_Disc656() {
        return HMI_Disc656;
    }

    public void setHMI_Disc656(boolean HMI_Disc656) {
        this.HMI_Disc656 = HMI_Disc656;
    }

    public boolean isHMI_Disc657() {
        return HMI_Disc657;
    }

    public void setHMI_Disc657(boolean HMI_Disc657) {
        this.HMI_Disc657 = HMI_Disc657;
    }

    public boolean isHMI_Disc658() {
        return HMI_Disc658;
    }

    public void setHMI_Disc658(boolean HMI_Disc658) {
        this.HMI_Disc658 = HMI_Disc658;
    }

    public boolean isHMI_Disc659() {
        return HMI_Disc659;
    }

    public void setHMI_Disc659(boolean HMI_Disc659) {
        this.HMI_Disc659 = HMI_Disc659;
    }

    public boolean isHMI_Disc660() {
        return HMI_Disc660;
    }

    public void setHMI_Disc660(boolean HMI_Disc660) {
        this.HMI_Disc660 = HMI_Disc660;
    }

    public boolean isHMI_Disc661() {
        return HMI_Disc661;
    }

    public void setHMI_Disc661(boolean HMI_Disc661) {
        this.HMI_Disc661 = HMI_Disc661;
    }

    public boolean isHMI_Disc662() {
        return HMI_Disc662;
    }

    public void setHMI_Disc662(boolean HMI_Disc662) {
        this.HMI_Disc662 = HMI_Disc662;
    }

    public boolean isHMI_Disc663() {
        return HMI_Disc663;
    }

    public void setHMI_Disc663(boolean HMI_Disc663) {
        this.HMI_Disc663 = HMI_Disc663;
    }

    public boolean isHMI_Disc664() {
        return HMI_Disc664;
    }

    public void setHMI_Disc664(boolean HMI_Disc664) {
        this.HMI_Disc664 = HMI_Disc664;
    }

    public boolean isHMI_Disc665() {
        return HMI_Disc665;
    }

    public void setHMI_Disc665(boolean HMI_Disc665) {
        this.HMI_Disc665 = HMI_Disc665;
    }

    public boolean isHMI_Disc666() {
        return HMI_Disc666;
    }

    public void setHMI_Disc666(boolean HMI_Disc666) {
        this.HMI_Disc666 = HMI_Disc666;
    }

    public boolean isHMI_Disc667() {
        return HMI_Disc667;
    }

    public void setHMI_Disc667(boolean HMI_Disc667) {
        this.HMI_Disc667 = HMI_Disc667;
    }

    public boolean isHMI_Disc668() {
        return HMI_Disc668;
    }

    public void setHMI_Disc668(boolean HMI_Disc668) {
        this.HMI_Disc668 = HMI_Disc668;
    }

    public boolean isHMI_Disc669() {
        return HMI_Disc669;
    }

    public void setHMI_Disc669(boolean HMI_Disc669) {
        this.HMI_Disc669 = HMI_Disc669;
    }

    public boolean isHMI_Disc670() {
        return HMI_Disc670;
    }

    public void setHMI_Disc670(boolean HMI_Disc670) {
        this.HMI_Disc670 = HMI_Disc670;
    }

    public boolean isHMI_Disc671() {
        return HMI_Disc671;
    }

    public void setHMI_Disc671(boolean HMI_Disc671) {
        this.HMI_Disc671 = HMI_Disc671;
    }

    public boolean isHMI_Disc672() {
        return HMI_Disc672;
    }

    public void setHMI_Disc672(boolean HMI_Disc672) {
        this.HMI_Disc672 = HMI_Disc672;
    }

    public boolean isHMI_Disc673() {
        return HMI_Disc673;
    }

    public void setHMI_Disc673(boolean HMI_Disc673) {
        this.HMI_Disc673 = HMI_Disc673;
    }

    public boolean isHMI_Disc674() {
        return HMI_Disc674;
    }

    public void setHMI_Disc674(boolean HMI_Disc674) {
        this.HMI_Disc674 = HMI_Disc674;
    }

    public boolean isHMI_Disc675() {
        return HMI_Disc675;
    }

    public void setHMI_Disc675(boolean HMI_Disc675) {
        this.HMI_Disc675 = HMI_Disc675;
    }

    public boolean isHMI_Disc676() {
        return HMI_Disc676;
    }

    public void setHMI_Disc676(boolean HMI_Disc676) {
        this.HMI_Disc676 = HMI_Disc676;
    }

    public boolean isHMI_Disc677() {
        return HMI_Disc677;
    }

    public void setHMI_Disc677(boolean HMI_Disc677) {
        this.HMI_Disc677 = HMI_Disc677;
    }

    public boolean isHMI_Disc678() {
        return HMI_Disc678;
    }

    public void setHMI_Disc678(boolean HMI_Disc678) {
        this.HMI_Disc678 = HMI_Disc678;
    }

    public boolean isHMI_Disc679() {
        return HMI_Disc679;
    }

    public void setHMI_Disc679(boolean HMI_Disc679) {
        this.HMI_Disc679 = HMI_Disc679;
    }

    public boolean isHMI_Disc680() {
        return HMI_Disc680;
    }

    public void setHMI_Disc680(boolean HMI_Disc680) {
        this.HMI_Disc680 = HMI_Disc680;
    }

    public boolean isHMI_Disc681() {
        return HMI_Disc681;
    }

    public void setHMI_Disc681(boolean HMI_Disc681) {
        this.HMI_Disc681 = HMI_Disc681;
    }

    public boolean isHMI_Disc682() {
        return HMI_Disc682;
    }

    public void setHMI_Disc682(boolean HMI_Disc682) {
        this.HMI_Disc682 = HMI_Disc682;
    }

    public boolean isHMI_Disc683() {
        return HMI_Disc683;
    }

    public void setHMI_Disc683(boolean HMI_Disc683) {
        this.HMI_Disc683 = HMI_Disc683;
    }

    public boolean isHMI_Disc684() {
        return HMI_Disc684;
    }

    public void setHMI_Disc684(boolean HMI_Disc684) {
        this.HMI_Disc684 = HMI_Disc684;
    }

    public boolean isHMI_Disc685() {
        return HMI_Disc685;
    }

    public void setHMI_Disc685(boolean HMI_Disc685) {
        this.HMI_Disc685 = HMI_Disc685;
    }

    public boolean isHMI_Disc686() {
        return HMI_Disc686;
    }

    public void setHMI_Disc686(boolean HMI_Disc686) {
        this.HMI_Disc686 = HMI_Disc686;
    }

    public boolean isHMI_Disc687() {
        return HMI_Disc687;
    }

    public void setHMI_Disc687(boolean HMI_Disc687) {
        this.HMI_Disc687 = HMI_Disc687;
    }

    public boolean isHMI_Disc688() {
        return HMI_Disc688;
    }

    public void setHMI_Disc688(boolean HMI_Disc688) {
        this.HMI_Disc688 = HMI_Disc688;
    }

    public boolean isHMI_Disc689() {
        return HMI_Disc689;
    }

    public void setHMI_Disc689(boolean HMI_Disc689) {
        this.HMI_Disc689 = HMI_Disc689;
    }

    public boolean isHMI_Disc690() {
        return HMI_Disc690;
    }

    public void setHMI_Disc690(boolean HMI_Disc690) {
        this.HMI_Disc690 = HMI_Disc690;
    }

    public boolean isHMI_Disc691() {
        return HMI_Disc691;
    }

    public void setHMI_Disc691(boolean HMI_Disc691) {
        this.HMI_Disc691 = HMI_Disc691;
    }

    public boolean isHMI_Disc692() {
        return HMI_Disc692;
    }

    public void setHMI_Disc692(boolean HMI_Disc692) {
        this.HMI_Disc692 = HMI_Disc692;
    }

    public boolean isHMI_Disc693() {
        return HMI_Disc693;
    }

    public void setHMI_Disc693(boolean HMI_Disc693) {
        this.HMI_Disc693 = HMI_Disc693;
    }

    public boolean isHMI_Disc694() {
        return HMI_Disc694;
    }

    public void setHMI_Disc694(boolean HMI_Disc694) {
        this.HMI_Disc694 = HMI_Disc694;
    }

    public boolean isHMI_Disc695() {
        return HMI_Disc695;
    }

    public void setHMI_Disc695(boolean HMI_Disc695) {
        this.HMI_Disc695 = HMI_Disc695;
    }

    public boolean isHMI_Disc696() {
        return HMI_Disc696;
    }

    public void setHMI_Disc696(boolean HMI_Disc696) {
        this.HMI_Disc696 = HMI_Disc696;
    }

    public boolean isHMI_Disc697() {
        return HMI_Disc697;
    }

    public void setHMI_Disc697(boolean HMI_Disc697) {
        this.HMI_Disc697 = HMI_Disc697;
    }

    public boolean isHMI_Disc698() {
        return HMI_Disc698;
    }

    public void setHMI_Disc698(boolean HMI_Disc698) {
        this.HMI_Disc698 = HMI_Disc698;
    }

    public boolean isHMI_Disc699() {
        return HMI_Disc699;
    }

    public void setHMI_Disc699(boolean HMI_Disc699) {
        this.HMI_Disc699 = HMI_Disc699;
    }

    public boolean isHMI_Disc700() {
        return HMI_Disc700;
    }

    public void setHMI_Disc700(boolean HMI_Disc700) {
        this.HMI_Disc700 = HMI_Disc700;
    }

    public boolean isHMI_Disc701() {
        return HMI_Disc701;
    }

    public void setHMI_Disc701(boolean HMI_Disc701) {
        this.HMI_Disc701 = HMI_Disc701;
    }

    public boolean isHMI_Disc702() {
        return HMI_Disc702;
    }

    public void setHMI_Disc702(boolean HMI_Disc702) {
        this.HMI_Disc702 = HMI_Disc702;
    }

    public boolean isHMI_Disc703() {
        return HMI_Disc703;
    }

    public void setHMI_Disc703(boolean HMI_Disc703) {
        this.HMI_Disc703 = HMI_Disc703;
    }

    public boolean isHMI_Disc704() {
        return HMI_Disc704;
    }

    public void setHMI_Disc704(boolean HMI_Disc704) {
        this.HMI_Disc704 = HMI_Disc704;
    }

    public boolean isHMI_Disc705() {
        return HMI_Disc705;
    }

    public void setHMI_Disc705(boolean HMI_Disc705) {
        this.HMI_Disc705 = HMI_Disc705;
    }

    public boolean isHMI_Disc706() {
        return HMI_Disc706;
    }

    public void setHMI_Disc706(boolean HMI_Disc706) {
        this.HMI_Disc706 = HMI_Disc706;
    }

    public boolean isHMI_Disc707() {
        return HMI_Disc707;
    }

    public void setHMI_Disc707(boolean HMI_Disc707) {
        this.HMI_Disc707 = HMI_Disc707;
    }

    public boolean isHMI_Disc708() {
        return HMI_Disc708;
    }

    public void setHMI_Disc708(boolean HMI_Disc708) {
        this.HMI_Disc708 = HMI_Disc708;
    }

    public boolean isHMI_Disc709() {
        return HMI_Disc709;
    }

    public void setHMI_Disc709(boolean HMI_Disc709) {
        this.HMI_Disc709 = HMI_Disc709;
    }

    public boolean isHMI_Disc710() {
        return HMI_Disc710;
    }

    public void setHMI_Disc710(boolean HMI_Disc710) {
        this.HMI_Disc710 = HMI_Disc710;
    }

    public boolean isHMI_Disc711() {
        return HMI_Disc711;
    }

    public void setHMI_Disc711(boolean HMI_Disc711) {
        this.HMI_Disc711 = HMI_Disc711;
    }

    public boolean isHMI_Disc712() {
        return HMI_Disc712;
    }

    public void setHMI_Disc712(boolean HMI_Disc712) {
        this.HMI_Disc712 = HMI_Disc712;
    }

    public boolean isHMI_Disc713() {
        return HMI_Disc713;
    }

    public void setHMI_Disc713(boolean HMI_Disc713) {
        this.HMI_Disc713 = HMI_Disc713;
    }

    public boolean isHMI_Disc714() {
        return HMI_Disc714;
    }

    public void setHMI_Disc714(boolean HMI_Disc714) {
        this.HMI_Disc714 = HMI_Disc714;
    }

    public boolean isHMI_Disc715() {
        return HMI_Disc715;
    }

    public void setHMI_Disc715(boolean HMI_Disc715) {
        this.HMI_Disc715 = HMI_Disc715;
    }

    public boolean isHMI_Disc716() {
        return HMI_Disc716;
    }

    public void setHMI_Disc716(boolean HMI_Disc716) {
        this.HMI_Disc716 = HMI_Disc716;
    }

    public boolean isHMI_Disc717() {
        return HMI_Disc717;
    }

    public void setHMI_Disc717(boolean HMI_Disc717) {
        this.HMI_Disc717 = HMI_Disc717;
    }

    public boolean isHMI_Disc718() {
        return HMI_Disc718;
    }

    public void setHMI_Disc718(boolean HMI_Disc718) {
        this.HMI_Disc718 = HMI_Disc718;
    }

    public boolean isHMI_Disc719() {
        return HMI_Disc719;
    }

    public void setHMI_Disc719(boolean HMI_Disc719) {
        this.HMI_Disc719 = HMI_Disc719;
    }

    public boolean isHMI_Disc720() {
        return HMI_Disc720;
    }

    public void setHMI_Disc720(boolean HMI_Disc720) {
        this.HMI_Disc720 = HMI_Disc720;
    }

    public boolean isHMI_Disc721() {
        return HMI_Disc721;
    }

    public void setHMI_Disc721(boolean HMI_Disc721) {
        this.HMI_Disc721 = HMI_Disc721;
    }

    public boolean isHMI_Disc722() {
        return HMI_Disc722;
    }

    public void setHMI_Disc722(boolean HMI_Disc722) {
        this.HMI_Disc722 = HMI_Disc722;
    }

    public boolean isHMI_Disc723() {
        return HMI_Disc723;
    }

    public void setHMI_Disc723(boolean HMI_Disc723) {
        this.HMI_Disc723 = HMI_Disc723;
    }

    public boolean isHMI_Disc724() {
        return HMI_Disc724;
    }

    public void setHMI_Disc724(boolean HMI_Disc724) {
        this.HMI_Disc724 = HMI_Disc724;
    }

    public boolean isHMI_Disc725() {
        return HMI_Disc725;
    }

    public void setHMI_Disc725(boolean HMI_Disc725) {
        this.HMI_Disc725 = HMI_Disc725;
    }

    public boolean isHMI_Disc726() {
        return HMI_Disc726;
    }

    public void setHMI_Disc726(boolean HMI_Disc726) {
        this.HMI_Disc726 = HMI_Disc726;
    }

    public boolean isHMI_Disc727() {
        return HMI_Disc727;
    }

    public void setHMI_Disc727(boolean HMI_Disc727) {
        this.HMI_Disc727 = HMI_Disc727;
    }

    public boolean isHMI_Disc728() {
        return HMI_Disc728;
    }

    public void setHMI_Disc728(boolean HMI_Disc728) {
        this.HMI_Disc728 = HMI_Disc728;
    }

    public boolean isHMI_Disc729() {
        return HMI_Disc729;
    }

    public void setHMI_Disc729(boolean HMI_Disc729) {
        this.HMI_Disc729 = HMI_Disc729;
    }

    public boolean isHMI_Disc730() {
        return HMI_Disc730;
    }

    public void setHMI_Disc730(boolean HMI_Disc730) {
        this.HMI_Disc730 = HMI_Disc730;
    }

    public boolean isHMI_Disc731() {
        return HMI_Disc731;
    }

    public void setHMI_Disc731(boolean HMI_Disc731) {
        this.HMI_Disc731 = HMI_Disc731;
    }

    public boolean isHMI_Disc732() {
        return HMI_Disc732;
    }

    public void setHMI_Disc732(boolean HMI_Disc732) {
        this.HMI_Disc732 = HMI_Disc732;
    }

    public boolean isHMI_Disc733() {
        return HMI_Disc733;
    }

    public void setHMI_Disc733(boolean HMI_Disc733) {
        this.HMI_Disc733 = HMI_Disc733;
    }

    public boolean isHMI_Disc734() {
        return HMI_Disc734;
    }

    public void setHMI_Disc734(boolean HMI_Disc734) {
        this.HMI_Disc734 = HMI_Disc734;
    }

    public boolean isHMI_Disc735() {
        return HMI_Disc735;
    }

    public void setHMI_Disc735(boolean HMI_Disc735) {
        this.HMI_Disc735 = HMI_Disc735;
    }

    public boolean isHMI_Disc736() {
        return HMI_Disc736;
    }

    public void setHMI_Disc736(boolean HMI_Disc736) {
        this.HMI_Disc736 = HMI_Disc736;
    }

    public boolean isHMI_Disc737() {
        return HMI_Disc737;
    }

    public void setHMI_Disc737(boolean HMI_Disc737) {
        this.HMI_Disc737 = HMI_Disc737;
    }

    public boolean isHMI_Disc738() {
        return HMI_Disc738;
    }

    public void setHMI_Disc738(boolean HMI_Disc738) {
        this.HMI_Disc738 = HMI_Disc738;
    }

    public boolean isHMI_Disc739() {
        return HMI_Disc739;
    }

    public void setHMI_Disc739(boolean HMI_Disc739) {
        this.HMI_Disc739 = HMI_Disc739;
    }

    public boolean isHMI_Disc740() {
        return HMI_Disc740;
    }

    public void setHMI_Disc740(boolean HMI_Disc740) {
        this.HMI_Disc740 = HMI_Disc740;
    }

    public boolean isHMI_Disc741() {
        return HMI_Disc741;
    }

    public void setHMI_Disc741(boolean HMI_Disc741) {
        this.HMI_Disc741 = HMI_Disc741;
    }

    public boolean isHMI_Disc742() {
        return HMI_Disc742;
    }

    public void setHMI_Disc742(boolean HMI_Disc742) {
        this.HMI_Disc742 = HMI_Disc742;
    }

    public boolean isHMI_Disc743() {
        return HMI_Disc743;
    }

    public void setHMI_Disc743(boolean HMI_Disc743) {
        this.HMI_Disc743 = HMI_Disc743;
    }

    public boolean isHMI_Disc824() {
        return HMI_Disc824;
    }

    public void setHMI_Disc824(boolean HMI_Disc824) {
        this.HMI_Disc824 = HMI_Disc824;
    }

    public boolean isHMI_Disc825() {
        return HMI_Disc825;
    }

    public void setHMI_Disc825(boolean HMI_Disc825) {
        this.HMI_Disc825 = HMI_Disc825;
    }

    public boolean isHMI_Disc826() {
        return HMI_Disc826;
    }

    public void setHMI_Disc826(boolean HMI_Disc826) {
        this.HMI_Disc826 = HMI_Disc826;
    }

    public boolean isHMI_Disc827() {
        return HMI_Disc827;
    }

    public void setHMI_Disc827(boolean HMI_Disc827) {
        this.HMI_Disc827 = HMI_Disc827;
    }

    public boolean isHMI_Disc828() {
        return HMI_Disc828;
    }

    public void setHMI_Disc828(boolean HMI_Disc828) {
        this.HMI_Disc828 = HMI_Disc828;
    }

    public boolean isHMI_Disc829() {
        return HMI_Disc829;
    }

    public void setHMI_Disc829(boolean HMI_Disc829) {
        this.HMI_Disc829 = HMI_Disc829;
    }

    public boolean isHMI_Disc830() {
        return HMI_Disc830;
    }

    public void setHMI_Disc830(boolean HMI_Disc830) {
        this.HMI_Disc830 = HMI_Disc830;
    }

    public boolean isHMI_Disc831() {
        return HMI_Disc831;
    }

    public void setHMI_Disc831(boolean HMI_Disc831) {
        this.HMI_Disc831 = HMI_Disc831;
    }

    public boolean isHMI_Disc832() {
        return HMI_Disc832;
    }

    public void setHMI_Disc832(boolean HMI_Disc832) {
        this.HMI_Disc832 = HMI_Disc832;
    }

    public boolean isHMI_Disc833() {
        return HMI_Disc833;
    }

    public void setHMI_Disc833(boolean HMI_Disc833) {
        this.HMI_Disc833 = HMI_Disc833;
    }

    public boolean isHMI_Disc834() {
        return HMI_Disc834;
    }

    public void setHMI_Disc834(boolean HMI_Disc834) {
        this.HMI_Disc834 = HMI_Disc834;
    }

    public boolean isHMI_Disc835() {
        return HMI_Disc835;
    }

    public void setHMI_Disc835(boolean HMI_Disc835) {
        this.HMI_Disc835 = HMI_Disc835;
    }

    public boolean isHMI_Disc836() {
        return HMI_Disc836;
    }

    public void setHMI_Disc836(boolean HMI_Disc836) {
        this.HMI_Disc836 = HMI_Disc836;
    }

    public boolean isHMI_Disc837() {
        return HMI_Disc837;
    }

    public void setHMI_Disc837(boolean HMI_Disc837) {
        this.HMI_Disc837 = HMI_Disc837;
    }

    public boolean isHMI_Disc46() {
        return HMI_Disc46;
    }

    public void setHMI_Disc46(boolean HMI_Disc46) {
        this.HMI_Disc46 = HMI_Disc46;
    }

    public boolean isHMI_Disc47() {
        return HMI_Disc47;
    }

    public void setHMI_Disc47(boolean HMI_Disc47) {
        this.HMI_Disc47 = HMI_Disc47;
    }

    public boolean isHMI_Disc48() {
        return HMI_Disc48;
    }

    public void setHMI_Disc48(boolean HMI_Disc48) {
        this.HMI_Disc48 = HMI_Disc48;
    }

    public boolean isHMI_Disc66() {
        return HMI_Disc66;
    }

    public void setHMI_Disc66(boolean HMI_Disc66) {
        this.HMI_Disc66 = HMI_Disc66;
    }

    public boolean isHMI_Disc112() {
        return HMI_Disc112;
    }

    public void setHMI_Disc112(boolean HMI_Disc112) {
        this.HMI_Disc112 = HMI_Disc112;
    }

    public boolean isHMI_Disc113() {
        return HMI_Disc113;
    }

    public void setHMI_Disc113(boolean HMI_Disc113) {
        this.HMI_Disc113 = HMI_Disc113;
    }

    public boolean isHMI_Disc115() {
        return HMI_Disc115;
    }

    public void setHMI_Disc115(boolean HMI_Disc115) {
        this.HMI_Disc115 = HMI_Disc115;
    }
}

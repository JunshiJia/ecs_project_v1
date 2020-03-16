package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ten_min")
public class TenMinData2DB{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int wtId;
	private Date time;
	@Column(name="`HMI_Disc[910]_Max`")
	private Float HMI_Disc910Max;
	@Column(name="`HMI_Disc[910]_Mean`")
	private Float HMI_Disc910Mean;
	@Column(name="`HMI_Disc[910]_And`")
	private Boolean HMI_Disc910And;
	@Column(name="`HMI_Disc[910]_MaxNum`")
	private Float HMI_Disc910MaxNum;
	@Column(name="`HMI_Disc[912]_MaxNum`")
	private Float HMI_Disc912MaxNum;
	@Column(name="`HMI_IReg[155]_Max`")
	private Float HMI_IReg155Max;
	@Column(name="`HMI_IReg[155]_Mean`")
	private Float HMI_IReg155Mean;
	@Column(name="`HMI_IReg[155]_Min`")
	private Float HMI_IReg155Min;
	@Column(name="`HMI_IReg[167]_Mean`")
	private Float HMI_IReg167Mean;
	@Column(name="`HMI_IReg[167]_And`")
	private Boolean HMI_IReg167And;
	@Column(name="`HMI_IReg[199]_Mean`")
	private Float HMI_IReg199Mean;
	@Column(name="`HMI_IReg[101]_Max`")
	private Float HMI_IReg101Max;
	@Column(name="`HMI_IReg[101]_Mean`")
	private Float HMI_IReg101Mean;
	@Column(name="`HMI_IReg[101]_Min`")
	private Float HMI_IReg101Min;
	@Column(name="`HMI_IReg[102]_Mean`")
	private Float HMI_IReg102Mean;
	@Column(name="`HMI_IReg[103]_Mean`")
	private Float HMI_IReg103Mean;
	@Column(name="`HMI_IReg[104]_Mean`")
	private Float HMI_IReg104Mean;
	@Column(name="`HMI_IReg[105]_Mean`")
	private Float HMI_IReg105Mean;
	@Column(name="`HMI_IReg[106]_Mean`")
	private Float HMI_IReg106Mean;
	@Column(name="`HMI_IReg[107]_Mean`")
	private Float HMI_IReg107Mean;
	@Column(name="`HMI_IReg[110]_Max`")
	private Float HMI_IReg110Max;
	@Column(name="`HMI_IReg[110]_Mean`")
	private Float HMI_IReg110Mean;
	@Column(name="`HMI_IReg[110]_Min`")
	private Float HMI_IReg110Min;
	@Column(name="`HMI_IReg[110]_StdDiv`")
	private Float HMI_IReg110StdDiv;
	@Column(name="`HMI_IReg[110]_MaxNum`")
	private Float HMI_IReg110MaxNum;
	@Column(name="`HMI_IReg[118]_Mean`")
	private Float HMI_IReg118Mean;
	@Column(name="`HMI_IReg[121]_Mean`")
	private Float HMI_IReg121Mean;
	@Column(name="`HMI_IReg[122]_Mean`")
	private Float HMI_IReg122Mean;
	@Column(name="`HMI_IReg[201]_Mean`")
	private Float HMI_IReg201Mean;
	@Column(name="`HMI_IReg[203]_Mean`")
	private Float HMI_IReg203Mean;
	@Column(name="`HMI_IReg[210]_Max`")
	private Float HMI_IReg210Max;
	@Column(name="`HMI_IReg[210]_Mean`")
	private Float HMI_IReg210Mean;
	@Column(name="`HMI_IReg[210]_Min`")
	private Float HMI_IReg210Min;
	@Column(name="`HMI_IReg[210]_StdDiv`")
	private Float HMI_IReg210StdDiv;
	@Column(name="`HMI_IReg[210]_Onflow`")
	private Float HMI_IReg210Flow;
	@Column(name="`HMI_IReg[206]_Mean`")
	private Float HMI_IReg206Mean;
	@Column(name="`HMI_IReg[206]_StdDiv`")
	private Float HMI_IReg206StdDiv;
	@Column(name="`HMI_IReg[206]_And`")
	private Boolean HMI_IReg206And;
	@Column(name="`HMI_IReg[214]_Mean`")
	private Float HMI_IReg214Mean;
	@Column(name="`HMI_IReg[216]_Mean`")
	private Float HMI_IReg216Mean;
	@Column(name="`HMI_IReg[224]_Mean`")
	private Float HMI_IReg224Mean;
	@Column(name="`HMI_IReg[237]_Mean`")
	private Float HMI_IReg237Mean;
	@Column(name="`HMI_IReg[238]_Mean`")
	private Float HMI_IReg238Mean;
	@Column(name="`HMI_IReg[239]_Mean`")
	private Float HMI_IReg239Mean;
	@Column(name="`HMI_IReg[240]_Mean`")
	private Float HMI_IReg240Mean;
	@Column(name="`HMI_IReg[241]_Mean`")
	private Float HMI_IReg241Mean;
	@Column(name="`HMI_IReg[242]_Mean`")
	private Float HMI_IReg242Mean;
	@Column(name="`HMI_IReg[243]_Mean`")
	private Float HMI_IReg243Mean;
	@Column(name="`HMI_IReg[244]_Mean`")
	private Float HMI_IReg244Mean;
	@Column(name="`HMI_IReg[245]_Mean`")
	private Float HMI_IReg245Mean;
	@Column(name="`HMI_IReg[248]_Mean`")
	private Float HMI_IReg248Mean;
	@Column(name="`HMI_IReg[1405]_Mean`")
	private Float HMI_IReg1405Mean;
	@Column(name="`HMI_IReg[1406]_Mean`")
	private Float HMI_IReg1406Mean;
	@Column(name="`HMI_IReg[1407]_Mean`")
	private Float HMI_IReg1407Mean;
	@Column(name="`HMI_IReg[1408]_Mean`")
	private Float HMI_IReg1408Mean;
	@Column(name="`HMI_IReg[1418]_Mean`")
	private Float HMI_IReg1418Mean;
	@Column(name="`HMI_IReg[1419]_Mean`")
	private Float HMI_IReg1419Mean;
	@Column(name="`HMI_IReg[1420]_Mean`")
	private Float HMI_IReg1420Mean;
	@Column(name="`HMI_IReg[1422]_Max`")
	private Float HMI_IReg1422Max;
	@Column(name="`HMI_IReg[1422]_Mean`")
	private Float HMI_IReg1422Mean;
	@Column(name="`HMI_IReg[1422]_Min`")
	private Float HMI_IReg1422Min;
	@Column(name="`HMI_IReg[1422]_StdDiv`")
	private Float HMI_IReg1422StdDiv;
	@Column(name="`HMI_IReg[1423]_Mean`")
	private Float HMI_IReg1423Mean;
	@Column(name="`HMI_IReg[1426]_Mean`")
	private Float HMI_IReg1426Mean;
	@Column(name="`HMI_IReg[1611]_Mean`")
	private Float HMI_IReg1611Mean;
	@Column(name="`HMI_IReg[1612]_Mean`")
	private Float HMI_IReg1612Mean;
	@Column(name="`HMI_IReg[1613]_Mean`")
	private Float HMI_IReg1613Mean;
	@Column(name="`HMI_IReg[1637]_Mean`")
	private Float HMI_IReg1637Mean;
	@Column(name="`HMI_IReg[1638]_Mean`")
	private Float HMI_IReg1638Mean;
	@Column(name="`HMI_IReg[1639]_Mean`")
	private Float HMI_IReg1639Mean;
	@Column(name="`HMI_IReg[1640]_Mean`")
	private Float HMI_IReg1640Mean;
	@Column(name="`HMI_IReg[1641]_Mean`")
	private Float HMI_IReg1641Mean;
	@Column(name="`HMI_IReg[1642]_Mean`")
	private Float HMI_IReg1642Mean;
	@Column(name="`HMI_IReg[1643]_Mean`")
	private Float HMI_IReg1643Mean;
	@Column(name="`HMI_IReg[1644]_Mean`")
	private Float HMI_IReg1644Mean;
	@Column(name="`HMI_IReg[1645]_Mean`")
	private Float HMI_IReg1645Mean;
	@Column(name="`HMI_IReg[1646]_Mean`")
	private Float HMI_IReg1646Mean;
	@Column(name="`HMI_IReg[1665]_Mean`")
	private Float HMI_IReg1665Mean;
	@Column(name="`HMI_IReg[1666]_Mean`")
	private Float HMI_IReg1666Mean;
	@Column(name="`HMI_IReg[1677]_Mean`")
	private Float HMI_IReg1677Mean;
	@Column(name="`HMI_IReg[1678]_Mean`")
	private Float HMI_IReg1678Mean;
	@Column(name="`HMI_IReg[1691]_Mean`")
	private Float HMI_IReg1691Mean;
	@Column(name="`HMI_IReg[1692]_Mean`")
	private Float HMI_IReg1692Mean;
	@Column(name="`HMI_IReg[1693]_Mean`")
	private Float HMI_IReg1693Mean;
	@Column(name="`HMI_IReg[1694]_Mean`")
	private Float HMI_IReg1694Mean;
	@Column(name="`HMI_IReg[1508]_Mean`")
	private Float HMI_IReg1508Mean;
	@Column(name="`HMI_IReg[1514]_Mean`")
	private Float HMI_IReg1514Mean;
	@Column(name="`HMI_IReg[1515]_Mean`")
	private Float HMI_IReg1515Mean;
	@Column(name="`HMI_IReg[1516]_Mean`")
	private Float HMI_IReg1516Mean;
	@Column(name="`HMI_IReg[1517]_Mean`")
	private Float HMI_IReg1517Mean;
	@Column(name="`HMI_IReg[1518]_Mean`")
	private Float HMI_IReg1518Mean;
	@Column(name="`HMI_IReg[1519]_Mean`")
	private Float HMI_IReg1519Mean;
	@Column(name="`HMI_Disc[332]_Min`")
	private Float HMI_Disc332Min;
	@Column(name="`HMI_Disc[341]_Min`")
	private Float HMI_Disc341Min;
	@Column(name="`HMI_Disc[341]_StdDiv`")
	private Float HMI_Disc341StdDiv;
	@Column(name="`HMI_Disc[383]_Min`")
	private Float HMI_Disc383Min;
	@Column(name="`HMI_Disc[409]_Min`")
	private Float HMI_Disc409Min;
	@Column(name="`HMI_Disc[409]_StdDiv`")
	private Float HMI_Disc409StdDiv;
	@Column(name="`HMI_Disc[409]_Onflow`")
	private Float HMI_Disc409Flow;
	@Column(name="`HMI_Disc[413]_Min`")
	private Float HMI_Disc413Min;
	@Column(name="`HMI_Disc[413]_StdDiv`")
	private Float HMI_Disc413StdDiv;
	@Column(name="`HMI_Disc[413]_Onflow`")
	private Float HMI_Disc413Flow;
	@Column(name="`HMI_Disc[476]_Min`")
	private Float HMI_Disc476Min;
	@Column(name="`HMI_Disc[476]_StdDiv`")
	private Float HMI_Disc476StdDiv;
	@Column(name="`HMI_IReg[6]_Mean`")
	private Float HMI_IReg6Mean;
	@Column(name="`HMI_IReg[6]_And`")
	private Boolean HMI_IReg6And;
	@Column(name="`HMI_IReg[6]_Onflow`")
	private Float HMI_IReg6Flow;
	@Column(name="`HMI_IReg[7]_Mean`")
	private Float HMI_IReg7Mean;
	@Column(name="`HMI_IReg[7]_And`")
	private Boolean HMI_IReg7And;
	@Column(name="`HMI_IReg[8]_Mean`")
	private Float HMI_IReg8Mean;
	@Column(name="`HMI_IReg[8]_And`")
	private Boolean HMI_IReg8And;
	@Column(name="`HMI_IReg[8]_Onflow`")
	private Float HMI_IReg8Flow;
	@Column(name="`HMI_IReg[9]_Mean`")
	private Float HMI_IReg9Mean;
	@Column(name="`HMI_IReg[9]_And`")
	private Boolean HMI_IReg9And;
}

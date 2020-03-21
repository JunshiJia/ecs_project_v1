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
	@Column(name="`HMI_IReg[108]_Max`")
	private Float HMI_IReg108Max;
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
	@Column(name="`HMI_IReg[119]_Mean`")
	private Float HMI_IReg119Mean;
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
	@Column(name="`HMI_IReg[1563]_Mean`")
	private Float HMI_IReg1563Mean;
	@Column(name="`HMI_IReg[1564]_Mean`")
	private Float HMI_IReg1564Mean;
	@Column(name="`HMI_IReg[1565]_Mean`")
	private Float HMI_IReg1565Mean;
	@Column(name="`HMI_IReg[1575]_Mean`")
	private Float HMI_IReg1575Mean;
	@Column(name="`HMI_IReg[1576]_Mean`")
	private Float HMI_IReg1576Mean;
	@Column(name="`HMI_IReg[1577]_Mean`")
	private Float HMI_IReg1577Mean;
	@Column(name="`HMI_IReg[1578]_Mean`")
	private Float HMI_IReg1578Mean;
	@Column(name="`HMI_IReg[1579]_Mean`")
	private Float HMI_IReg1579Mean;
	@Column(name="`HMI_IReg[1580]_Mean`")
	private Float HMI_IReg1580Mean;
	@Column(name="`HMI_IReg[1581]_Mean`")
	private Float HMI_IReg1581Mean;
	@Column(name="`HMI_IReg[1582]_Mean`")
	private Float HMI_IReg1582Mean;
	@Column(name="`HMI_IReg[1583]_Mean`")
	private Float HMI_IReg1583Mean;
	@Column(name="`HMI_IReg[1584]_Mean`")
	private Float HMI_IReg1584Mean;
	@Column(name="`HMI_IReg[1672]_Mean`")
	private Float HMI_IReg1672Mean;
	@Column(name="`HMI_IReg[1673]_Mean`")
	private Float HMI_IReg1673Mean;
	@Column(name="`HMI_IReg[1683]_Mean`")
	private Float HMI_IReg1683Mean;
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

	@Override
	public String toString() {
		return "TenMinData2DB{" +
				"id=" + id +
				", wtId=" + wtId +
				", time=" + time +
				", HMI_Disc910Max=" + HMI_Disc910Max +
				", HMI_Disc910Mean=" + HMI_Disc910Mean +
				", HMI_Disc910And=" + HMI_Disc910And +
				", HMI_Disc910MaxNum=" + HMI_Disc910MaxNum +
				", HMI_Disc912MaxNum=" + HMI_Disc912MaxNum +
				", HMI_IReg155Max=" + HMI_IReg155Max +
				", HMI_IReg155Mean=" + HMI_IReg155Mean +
				", HMI_IReg155Min=" + HMI_IReg155Min +
				", HMI_IReg167Mean=" + HMI_IReg167Mean +
				", HMI_IReg167And=" + HMI_IReg167And +
				", HMI_IReg199Mean=" + HMI_IReg199Mean +
				", HMI_IReg101Max=" + HMI_IReg101Max +
				", HMI_IReg101Mean=" + HMI_IReg101Mean +
				", HMI_IReg101Min=" + HMI_IReg101Min +
				", HMI_IReg102Mean=" + HMI_IReg102Mean +
				", HMI_IReg103Mean=" + HMI_IReg103Mean +
				", HMI_IReg104Mean=" + HMI_IReg104Mean +
				", HMI_IReg105Mean=" + HMI_IReg105Mean +
				", HMI_IReg106Mean=" + HMI_IReg106Mean +
				", HMI_IReg107Mean=" + HMI_IReg107Mean +
				", HMI_IReg108Max=" + HMI_IReg108Max +
				", HMI_IReg110Max=" + HMI_IReg110Max +
				", HMI_IReg110Mean=" + HMI_IReg110Mean +
				", HMI_IReg110Min=" + HMI_IReg110Min +
				", HMI_IReg110StdDiv=" + HMI_IReg110StdDiv +
				", HMI_IReg110MaxNum=" + HMI_IReg110MaxNum +
				", HMI_IReg118Mean=" + HMI_IReg118Mean +
				", HMI_IReg119Mean=" + HMI_IReg119Mean +
				", HMI_IReg121Mean=" + HMI_IReg121Mean +
				", HMI_IReg122Mean=" + HMI_IReg122Mean +
				", HMI_IReg201Mean=" + HMI_IReg201Mean +
				", HMI_IReg203Mean=" + HMI_IReg203Mean +
				", HMI_IReg210Max=" + HMI_IReg210Max +
				", HMI_IReg210Mean=" + HMI_IReg210Mean +
				", HMI_IReg210Min=" + HMI_IReg210Min +
				", HMI_IReg210StdDiv=" + HMI_IReg210StdDiv +
				", HMI_IReg210Flow=" + HMI_IReg210Flow +
				", HMI_IReg206Mean=" + HMI_IReg206Mean +
				", HMI_IReg206StdDiv=" + HMI_IReg206StdDiv +
				", HMI_IReg206And=" + HMI_IReg206And +
				", HMI_IReg214Mean=" + HMI_IReg214Mean +
				", HMI_IReg216Mean=" + HMI_IReg216Mean +
				", HMI_IReg224Mean=" + HMI_IReg224Mean +
				", HMI_IReg237Mean=" + HMI_IReg237Mean +
				", HMI_IReg238Mean=" + HMI_IReg238Mean +
				", HMI_IReg239Mean=" + HMI_IReg239Mean +
				", HMI_IReg240Mean=" + HMI_IReg240Mean +
				", HMI_IReg241Mean=" + HMI_IReg241Mean +
				", HMI_IReg242Mean=" + HMI_IReg242Mean +
				", HMI_IReg243Mean=" + HMI_IReg243Mean +
				", HMI_IReg244Mean=" + HMI_IReg244Mean +
				", HMI_IReg245Mean=" + HMI_IReg245Mean +
				", HMI_IReg1405Mean=" + HMI_IReg1405Mean +
				", HMI_IReg1406Mean=" + HMI_IReg1406Mean +
				", HMI_IReg1407Mean=" + HMI_IReg1407Mean +
				", HMI_IReg1408Mean=" + HMI_IReg1408Mean +
				", HMI_IReg1418Mean=" + HMI_IReg1418Mean +
				", HMI_IReg1419Mean=" + HMI_IReg1419Mean +
				", HMI_IReg1420Mean=" + HMI_IReg1420Mean +
				", HMI_IReg1422Max=" + HMI_IReg1422Max +
				", HMI_IReg1422Mean=" + HMI_IReg1422Mean +
				", HMI_IReg1422Min=" + HMI_IReg1422Min +
				", HMI_IReg1422StdDiv=" + HMI_IReg1422StdDiv +
				", HMI_IReg1423Mean=" + HMI_IReg1423Mean +
				", HMI_IReg1426Mean=" + HMI_IReg1426Mean +
				", HMI_IReg1563Mean=" + HMI_IReg1563Mean +
				", HMI_IReg1564Mean=" + HMI_IReg1564Mean +
				", HMI_IReg1565Mean=" + HMI_IReg1565Mean +
				", HMI_IReg1575Mean=" + HMI_IReg1575Mean +
				", HMI_IReg1576Mean=" + HMI_IReg1576Mean +
				", HMI_IReg1577Mean=" + HMI_IReg1577Mean +
				", HMI_IReg1578Mean=" + HMI_IReg1578Mean +
				", HMI_IReg1579Mean=" + HMI_IReg1579Mean +
				", HMI_IReg1580Mean=" + HMI_IReg1580Mean +
				", HMI_IReg1581Mean=" + HMI_IReg1581Mean +
				", HMI_IReg1582Mean=" + HMI_IReg1582Mean +
				", HMI_IReg1583Mean=" + HMI_IReg1583Mean +
				", HMI_IReg1584Mean=" + HMI_IReg1584Mean +
				", HMI_IReg1672Mean=" + HMI_IReg1672Mean +
				", HMI_IReg1673Mean=" + HMI_IReg1673Mean +
				", HMI_IReg1683Mean=" + HMI_IReg1683Mean +
				", HMI_IReg1691Mean=" + HMI_IReg1691Mean +
				", HMI_IReg1692Mean=" + HMI_IReg1692Mean +
				", HMI_IReg1693Mean=" + HMI_IReg1693Mean +
				", HMI_IReg1694Mean=" + HMI_IReg1694Mean +
				", HMI_IReg1508Mean=" + HMI_IReg1508Mean +
				", HMI_IReg1514Mean=" + HMI_IReg1514Mean +
				", HMI_IReg1515Mean=" + HMI_IReg1515Mean +
				", HMI_IReg1516Mean=" + HMI_IReg1516Mean +
				", HMI_IReg1517Mean=" + HMI_IReg1517Mean +
				", HMI_IReg1518Mean=" + HMI_IReg1518Mean +
				", HMI_IReg1519Mean=" + HMI_IReg1519Mean +
				", HMI_Disc332Min=" + HMI_Disc332Min +
				", HMI_Disc341Min=" + HMI_Disc341Min +
				", HMI_Disc341StdDiv=" + HMI_Disc341StdDiv +
				", HMI_Disc383Min=" + HMI_Disc383Min +
				", HMI_Disc409Min=" + HMI_Disc409Min +
				", HMI_Disc409StdDiv=" + HMI_Disc409StdDiv +
				", HMI_Disc409Flow=" + HMI_Disc409Flow +
				", HMI_Disc413Min=" + HMI_Disc413Min +
				", HMI_Disc413StdDiv=" + HMI_Disc413StdDiv +
				", HMI_Disc413Flow=" + HMI_Disc413Flow +
				'}';
	}

	public TenMinData2DB() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWtId() {
		return wtId;
	}

	public void setWtId(int wtId) {
		this.wtId = wtId;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Float getHMI_Disc910Max() {
		return HMI_Disc910Max;
	}

	public void setHMI_Disc910Max(Float HMI_Disc910Max) {
		this.HMI_Disc910Max = HMI_Disc910Max;
	}

	public Float getHMI_Disc910Mean() {
		return HMI_Disc910Mean;
	}

	public void setHMI_Disc910Mean(Float HMI_Disc910Mean) {
		this.HMI_Disc910Mean = HMI_Disc910Mean;
	}

	public Boolean getHMI_Disc910And() {
		return HMI_Disc910And;
	}

	public void setHMI_Disc910And(Boolean HMI_Disc910And) {
		this.HMI_Disc910And = HMI_Disc910And;
	}

	public Float getHMI_Disc910MaxNum() {
		return HMI_Disc910MaxNum;
	}

	public void setHMI_Disc910MaxNum(Float HMI_Disc910MaxNum) {
		this.HMI_Disc910MaxNum = HMI_Disc910MaxNum;
	}

	public Float getHMI_Disc912MaxNum() {
		return HMI_Disc912MaxNum;
	}

	public void setHMI_Disc912MaxNum(Float HMI_Disc912MaxNum) {
		this.HMI_Disc912MaxNum = HMI_Disc912MaxNum;
	}

	public Float getHMI_IReg155Max() {
		return HMI_IReg155Max;
	}

	public void setHMI_IReg155Max(Float HMI_IReg155Max) {
		this.HMI_IReg155Max = HMI_IReg155Max;
	}

	public Float getHMI_IReg155Mean() {
		return HMI_IReg155Mean;
	}

	public void setHMI_IReg155Mean(Float HMI_IReg155Mean) {
		this.HMI_IReg155Mean = HMI_IReg155Mean;
	}

	public Float getHMI_IReg155Min() {
		return HMI_IReg155Min;
	}

	public void setHMI_IReg155Min(Float HMI_IReg155Min) {
		this.HMI_IReg155Min = HMI_IReg155Min;
	}

	public Float getHMI_IReg167Mean() {
		return HMI_IReg167Mean;
	}

	public void setHMI_IReg167Mean(Float HMI_IReg167Mean) {
		this.HMI_IReg167Mean = HMI_IReg167Mean;
	}

	public Boolean getHMI_IReg167And() {
		return HMI_IReg167And;
	}

	public void setHMI_IReg167And(Boolean HMI_IReg167And) {
		this.HMI_IReg167And = HMI_IReg167And;
	}

	public Float getHMI_IReg199Mean() {
		return HMI_IReg199Mean;
	}

	public void setHMI_IReg199Mean(Float HMI_IReg199Mean) {
		this.HMI_IReg199Mean = HMI_IReg199Mean;
	}

	public Float getHMI_IReg101Max() {
		return HMI_IReg101Max;
	}

	public void setHMI_IReg101Max(Float HMI_IReg101Max) {
		this.HMI_IReg101Max = HMI_IReg101Max;
	}

	public Float getHMI_IReg101Mean() {
		return HMI_IReg101Mean;
	}

	public void setHMI_IReg101Mean(Float HMI_IReg101Mean) {
		this.HMI_IReg101Mean = HMI_IReg101Mean;
	}

	public Float getHMI_IReg101Min() {
		return HMI_IReg101Min;
	}

	public void setHMI_IReg101Min(Float HMI_IReg101Min) {
		this.HMI_IReg101Min = HMI_IReg101Min;
	}

	public Float getHMI_IReg102Mean() {
		return HMI_IReg102Mean;
	}

	public void setHMI_IReg102Mean(Float HMI_IReg102Mean) {
		this.HMI_IReg102Mean = HMI_IReg102Mean;
	}

	public Float getHMI_IReg103Mean() {
		return HMI_IReg103Mean;
	}

	public void setHMI_IReg103Mean(Float HMI_IReg103Mean) {
		this.HMI_IReg103Mean = HMI_IReg103Mean;
	}

	public Float getHMI_IReg104Mean() {
		return HMI_IReg104Mean;
	}

	public void setHMI_IReg104Mean(Float HMI_IReg104Mean) {
		this.HMI_IReg104Mean = HMI_IReg104Mean;
	}

	public Float getHMI_IReg105Mean() {
		return HMI_IReg105Mean;
	}

	public void setHMI_IReg105Mean(Float HMI_IReg105Mean) {
		this.HMI_IReg105Mean = HMI_IReg105Mean;
	}

	public Float getHMI_IReg106Mean() {
		return HMI_IReg106Mean;
	}

	public void setHMI_IReg106Mean(Float HMI_IReg106Mean) {
		this.HMI_IReg106Mean = HMI_IReg106Mean;
	}

	public Float getHMI_IReg107Mean() {
		return HMI_IReg107Mean;
	}

	public void setHMI_IReg107Mean(Float HMI_IReg107Mean) {
		this.HMI_IReg107Mean = HMI_IReg107Mean;
	}

	public Float getHMI_IReg108Max() {
		return HMI_IReg108Max;
	}

	public void setHMI_IReg108Max(Float HMI_IReg108Max) {
		this.HMI_IReg108Max = HMI_IReg108Max;
	}

	public Float getHMI_IReg110Max() {
		return HMI_IReg110Max;
	}

	public void setHMI_IReg110Max(Float HMI_IReg110Max) {
		this.HMI_IReg110Max = HMI_IReg110Max;
	}

	public Float getHMI_IReg110Mean() {
		return HMI_IReg110Mean;
	}

	public void setHMI_IReg110Mean(Float HMI_IReg110Mean) {
		this.HMI_IReg110Mean = HMI_IReg110Mean;
	}

	public Float getHMI_IReg110Min() {
		return HMI_IReg110Min;
	}

	public void setHMI_IReg110Min(Float HMI_IReg110Min) {
		this.HMI_IReg110Min = HMI_IReg110Min;
	}

	public Float getHMI_IReg110StdDiv() {
		return HMI_IReg110StdDiv;
	}

	public void setHMI_IReg110StdDiv(Float HMI_IReg110StdDiv) {
		this.HMI_IReg110StdDiv = HMI_IReg110StdDiv;
	}

	public Float getHMI_IReg110MaxNum() {
		return HMI_IReg110MaxNum;
	}

	public void setHMI_IReg110MaxNum(Float HMI_IReg110MaxNum) {
		this.HMI_IReg110MaxNum = HMI_IReg110MaxNum;
	}

	public Float getHMI_IReg118Mean() {
		return HMI_IReg118Mean;
	}

	public void setHMI_IReg118Mean(Float HMI_IReg118Mean) {
		this.HMI_IReg118Mean = HMI_IReg118Mean;
	}

	public Float getHMI_IReg119Mean() {
		return HMI_IReg119Mean;
	}

	public void setHMI_IReg119Mean(Float HMI_IReg119Mean) {
		this.HMI_IReg119Mean = HMI_IReg119Mean;
	}

	public Float getHMI_IReg121Mean() {
		return HMI_IReg121Mean;
	}

	public void setHMI_IReg121Mean(Float HMI_IReg121Mean) {
		this.HMI_IReg121Mean = HMI_IReg121Mean;
	}

	public Float getHMI_IReg122Mean() {
		return HMI_IReg122Mean;
	}

	public void setHMI_IReg122Mean(Float HMI_IReg122Mean) {
		this.HMI_IReg122Mean = HMI_IReg122Mean;
	}

	public Float getHMI_IReg201Mean() {
		return HMI_IReg201Mean;
	}

	public void setHMI_IReg201Mean(Float HMI_IReg201Mean) {
		this.HMI_IReg201Mean = HMI_IReg201Mean;
	}

	public Float getHMI_IReg203Mean() {
		return HMI_IReg203Mean;
	}

	public void setHMI_IReg203Mean(Float HMI_IReg203Mean) {
		this.HMI_IReg203Mean = HMI_IReg203Mean;
	}

	public Float getHMI_IReg210Max() {
		return HMI_IReg210Max;
	}

	public void setHMI_IReg210Max(Float HMI_IReg210Max) {
		this.HMI_IReg210Max = HMI_IReg210Max;
	}

	public Float getHMI_IReg210Mean() {
		return HMI_IReg210Mean;
	}

	public void setHMI_IReg210Mean(Float HMI_IReg210Mean) {
		this.HMI_IReg210Mean = HMI_IReg210Mean;
	}

	public Float getHMI_IReg210Min() {
		return HMI_IReg210Min;
	}

	public void setHMI_IReg210Min(Float HMI_IReg210Min) {
		this.HMI_IReg210Min = HMI_IReg210Min;
	}

	public Float getHMI_IReg210StdDiv() {
		return HMI_IReg210StdDiv;
	}

	public void setHMI_IReg210StdDiv(Float HMI_IReg210StdDiv) {
		this.HMI_IReg210StdDiv = HMI_IReg210StdDiv;
	}

	public Float getHMI_IReg210Flow() {
		return HMI_IReg210Flow;
	}

	public void setHMI_IReg210Flow(Float HMI_IReg210Flow) {
		this.HMI_IReg210Flow = HMI_IReg210Flow;
	}

	public Float getHMI_IReg206Mean() {
		return HMI_IReg206Mean;
	}

	public void setHMI_IReg206Mean(Float HMI_IReg206Mean) {
		this.HMI_IReg206Mean = HMI_IReg206Mean;
	}

	public Float getHMI_IReg206StdDiv() {
		return HMI_IReg206StdDiv;
	}

	public void setHMI_IReg206StdDiv(Float HMI_IReg206StdDiv) {
		this.HMI_IReg206StdDiv = HMI_IReg206StdDiv;
	}

	public Boolean getHMI_IReg206And() {
		return HMI_IReg206And;
	}

	public void setHMI_IReg206And(Boolean HMI_IReg206And) {
		this.HMI_IReg206And = HMI_IReg206And;
	}

	public Float getHMI_IReg214Mean() {
		return HMI_IReg214Mean;
	}

	public void setHMI_IReg214Mean(Float HMI_IReg214Mean) {
		this.HMI_IReg214Mean = HMI_IReg214Mean;
	}

	public Float getHMI_IReg216Mean() {
		return HMI_IReg216Mean;
	}

	public void setHMI_IReg216Mean(Float HMI_IReg216Mean) {
		this.HMI_IReg216Mean = HMI_IReg216Mean;
	}

	public Float getHMI_IReg224Mean() {
		return HMI_IReg224Mean;
	}

	public void setHMI_IReg224Mean(Float HMI_IReg224Mean) {
		this.HMI_IReg224Mean = HMI_IReg224Mean;
	}

	public Float getHMI_IReg237Mean() {
		return HMI_IReg237Mean;
	}

	public void setHMI_IReg237Mean(Float HMI_IReg237Mean) {
		this.HMI_IReg237Mean = HMI_IReg237Mean;
	}

	public Float getHMI_IReg238Mean() {
		return HMI_IReg238Mean;
	}

	public void setHMI_IReg238Mean(Float HMI_IReg238Mean) {
		this.HMI_IReg238Mean = HMI_IReg238Mean;
	}

	public Float getHMI_IReg239Mean() {
		return HMI_IReg239Mean;
	}

	public void setHMI_IReg239Mean(Float HMI_IReg239Mean) {
		this.HMI_IReg239Mean = HMI_IReg239Mean;
	}

	public Float getHMI_IReg240Mean() {
		return HMI_IReg240Mean;
	}

	public void setHMI_IReg240Mean(Float HMI_IReg240Mean) {
		this.HMI_IReg240Mean = HMI_IReg240Mean;
	}

	public Float getHMI_IReg241Mean() {
		return HMI_IReg241Mean;
	}

	public void setHMI_IReg241Mean(Float HMI_IReg241Mean) {
		this.HMI_IReg241Mean = HMI_IReg241Mean;
	}

	public Float getHMI_IReg242Mean() {
		return HMI_IReg242Mean;
	}

	public void setHMI_IReg242Mean(Float HMI_IReg242Mean) {
		this.HMI_IReg242Mean = HMI_IReg242Mean;
	}

	public Float getHMI_IReg243Mean() {
		return HMI_IReg243Mean;
	}

	public void setHMI_IReg243Mean(Float HMI_IReg243Mean) {
		this.HMI_IReg243Mean = HMI_IReg243Mean;
	}

	public Float getHMI_IReg244Mean() {
		return HMI_IReg244Mean;
	}

	public void setHMI_IReg244Mean(Float HMI_IReg244Mean) {
		this.HMI_IReg244Mean = HMI_IReg244Mean;
	}

	public Float getHMI_IReg245Mean() {
		return HMI_IReg245Mean;
	}

	public void setHMI_IReg245Mean(Float HMI_IReg245Mean) {
		this.HMI_IReg245Mean = HMI_IReg245Mean;
	}

	public Float getHMI_IReg1405Mean() {
		return HMI_IReg1405Mean;
	}

	public void setHMI_IReg1405Mean(Float HMI_IReg1405Mean) {
		this.HMI_IReg1405Mean = HMI_IReg1405Mean;
	}

	public Float getHMI_IReg1406Mean() {
		return HMI_IReg1406Mean;
	}

	public void setHMI_IReg1406Mean(Float HMI_IReg1406Mean) {
		this.HMI_IReg1406Mean = HMI_IReg1406Mean;
	}

	public Float getHMI_IReg1407Mean() {
		return HMI_IReg1407Mean;
	}

	public void setHMI_IReg1407Mean(Float HMI_IReg1407Mean) {
		this.HMI_IReg1407Mean = HMI_IReg1407Mean;
	}

	public Float getHMI_IReg1408Mean() {
		return HMI_IReg1408Mean;
	}

	public void setHMI_IReg1408Mean(Float HMI_IReg1408Mean) {
		this.HMI_IReg1408Mean = HMI_IReg1408Mean;
	}

	public Float getHMI_IReg1418Mean() {
		return HMI_IReg1418Mean;
	}

	public void setHMI_IReg1418Mean(Float HMI_IReg1418Mean) {
		this.HMI_IReg1418Mean = HMI_IReg1418Mean;
	}

	public Float getHMI_IReg1419Mean() {
		return HMI_IReg1419Mean;
	}

	public void setHMI_IReg1419Mean(Float HMI_IReg1419Mean) {
		this.HMI_IReg1419Mean = HMI_IReg1419Mean;
	}

	public Float getHMI_IReg1420Mean() {
		return HMI_IReg1420Mean;
	}

	public void setHMI_IReg1420Mean(Float HMI_IReg1420Mean) {
		this.HMI_IReg1420Mean = HMI_IReg1420Mean;
	}

	public Float getHMI_IReg1422Max() {
		return HMI_IReg1422Max;
	}

	public void setHMI_IReg1422Max(Float HMI_IReg1422Max) {
		this.HMI_IReg1422Max = HMI_IReg1422Max;
	}

	public Float getHMI_IReg1422Mean() {
		return HMI_IReg1422Mean;
	}

	public void setHMI_IReg1422Mean(Float HMI_IReg1422Mean) {
		this.HMI_IReg1422Mean = HMI_IReg1422Mean;
	}

	public Float getHMI_IReg1422Min() {
		return HMI_IReg1422Min;
	}

	public void setHMI_IReg1422Min(Float HMI_IReg1422Min) {
		this.HMI_IReg1422Min = HMI_IReg1422Min;
	}

	public Float getHMI_IReg1422StdDiv() {
		return HMI_IReg1422StdDiv;
	}

	public void setHMI_IReg1422StdDiv(Float HMI_IReg1422StdDiv) {
		this.HMI_IReg1422StdDiv = HMI_IReg1422StdDiv;
	}

	public Float getHMI_IReg1423Mean() {
		return HMI_IReg1423Mean;
	}

	public void setHMI_IReg1423Mean(Float HMI_IReg1423Mean) {
		this.HMI_IReg1423Mean = HMI_IReg1423Mean;
	}

	public Float getHMI_IReg1426Mean() {
		return HMI_IReg1426Mean;
	}

	public void setHMI_IReg1426Mean(Float HMI_IReg1426Mean) {
		this.HMI_IReg1426Mean = HMI_IReg1426Mean;
	}

	public Float getHMI_IReg1563Mean() {
		return HMI_IReg1563Mean;
	}

	public void setHMI_IReg1563Mean(Float HMI_IReg1563Mean) {
		this.HMI_IReg1563Mean = HMI_IReg1563Mean;
	}

	public Float getHMI_IReg1564Mean() {
		return HMI_IReg1564Mean;
	}

	public void setHMI_IReg1564Mean(Float HMI_IReg1564Mean) {
		this.HMI_IReg1564Mean = HMI_IReg1564Mean;
	}

	public Float getHMI_IReg1565Mean() {
		return HMI_IReg1565Mean;
	}

	public void setHMI_IReg1565Mean(Float HMI_IReg1565Mean) {
		this.HMI_IReg1565Mean = HMI_IReg1565Mean;
	}

	public Float getHMI_IReg1575Mean() {
		return HMI_IReg1575Mean;
	}

	public void setHMI_IReg1575Mean(Float HMI_IReg1575Mean) {
		this.HMI_IReg1575Mean = HMI_IReg1575Mean;
	}

	public Float getHMI_IReg1576Mean() {
		return HMI_IReg1576Mean;
	}

	public void setHMI_IReg1576Mean(Float HMI_IReg1576Mean) {
		this.HMI_IReg1576Mean = HMI_IReg1576Mean;
	}

	public Float getHMI_IReg1577Mean() {
		return HMI_IReg1577Mean;
	}

	public void setHMI_IReg1577Mean(Float HMI_IReg1577Mean) {
		this.HMI_IReg1577Mean = HMI_IReg1577Mean;
	}

	public Float getHMI_IReg1578Mean() {
		return HMI_IReg1578Mean;
	}

	public void setHMI_IReg1578Mean(Float HMI_IReg1578Mean) {
		this.HMI_IReg1578Mean = HMI_IReg1578Mean;
	}

	public Float getHMI_IReg1579Mean() {
		return HMI_IReg1579Mean;
	}

	public void setHMI_IReg1579Mean(Float HMI_IReg1579Mean) {
		this.HMI_IReg1579Mean = HMI_IReg1579Mean;
	}

	public Float getHMI_IReg1580Mean() {
		return HMI_IReg1580Mean;
	}

	public void setHMI_IReg1580Mean(Float HMI_IReg1580Mean) {
		this.HMI_IReg1580Mean = HMI_IReg1580Mean;
	}

	public Float getHMI_IReg1581Mean() {
		return HMI_IReg1581Mean;
	}

	public void setHMI_IReg1581Mean(Float HMI_IReg1581Mean) {
		this.HMI_IReg1581Mean = HMI_IReg1581Mean;
	}

	public Float getHMI_IReg1582Mean() {
		return HMI_IReg1582Mean;
	}

	public void setHMI_IReg1582Mean(Float HMI_IReg1582Mean) {
		this.HMI_IReg1582Mean = HMI_IReg1582Mean;
	}

	public Float getHMI_IReg1583Mean() {
		return HMI_IReg1583Mean;
	}

	public void setHMI_IReg1583Mean(Float HMI_IReg1583Mean) {
		this.HMI_IReg1583Mean = HMI_IReg1583Mean;
	}

	public Float getHMI_IReg1584Mean() {
		return HMI_IReg1584Mean;
	}

	public void setHMI_IReg1584Mean(Float HMI_IReg1584Mean) {
		this.HMI_IReg1584Mean = HMI_IReg1584Mean;
	}

	public Float getHMI_IReg1672Mean() {
		return HMI_IReg1672Mean;
	}

	public void setHMI_IReg1672Mean(Float HMI_IReg1672Mean) {
		this.HMI_IReg1672Mean = HMI_IReg1672Mean;
	}

	public Float getHMI_IReg1673Mean() {
		return HMI_IReg1673Mean;
	}

	public void setHMI_IReg1673Mean(Float HMI_IReg1673Mean) {
		this.HMI_IReg1673Mean = HMI_IReg1673Mean;
	}

	public Float getHMI_IReg1683Mean() {
		return HMI_IReg1683Mean;
	}

	public void setHMI_IReg1683Mean(Float HMI_IReg1683Mean) {
		this.HMI_IReg1683Mean = HMI_IReg1683Mean;
	}

	public Float getHMI_IReg1691Mean() {
		return HMI_IReg1691Mean;
	}

	public void setHMI_IReg1691Mean(Float HMI_IReg1691Mean) {
		this.HMI_IReg1691Mean = HMI_IReg1691Mean;
	}

	public Float getHMI_IReg1692Mean() {
		return HMI_IReg1692Mean;
	}

	public void setHMI_IReg1692Mean(Float HMI_IReg1692Mean) {
		this.HMI_IReg1692Mean = HMI_IReg1692Mean;
	}

	public Float getHMI_IReg1693Mean() {
		return HMI_IReg1693Mean;
	}

	public void setHMI_IReg1693Mean(Float HMI_IReg1693Mean) {
		this.HMI_IReg1693Mean = HMI_IReg1693Mean;
	}

	public Float getHMI_IReg1694Mean() {
		return HMI_IReg1694Mean;
	}

	public void setHMI_IReg1694Mean(Float HMI_IReg1694Mean) {
		this.HMI_IReg1694Mean = HMI_IReg1694Mean;
	}

	public Float getHMI_IReg1508Mean() {
		return HMI_IReg1508Mean;
	}

	public void setHMI_IReg1508Mean(Float HMI_IReg1508Mean) {
		this.HMI_IReg1508Mean = HMI_IReg1508Mean;
	}

	public Float getHMI_IReg1514Mean() {
		return HMI_IReg1514Mean;
	}

	public void setHMI_IReg1514Mean(Float HMI_IReg1514Mean) {
		this.HMI_IReg1514Mean = HMI_IReg1514Mean;
	}

	public Float getHMI_IReg1515Mean() {
		return HMI_IReg1515Mean;
	}

	public void setHMI_IReg1515Mean(Float HMI_IReg1515Mean) {
		this.HMI_IReg1515Mean = HMI_IReg1515Mean;
	}

	public Float getHMI_IReg1516Mean() {
		return HMI_IReg1516Mean;
	}

	public void setHMI_IReg1516Mean(Float HMI_IReg1516Mean) {
		this.HMI_IReg1516Mean = HMI_IReg1516Mean;
	}

	public Float getHMI_IReg1517Mean() {
		return HMI_IReg1517Mean;
	}

	public void setHMI_IReg1517Mean(Float HMI_IReg1517Mean) {
		this.HMI_IReg1517Mean = HMI_IReg1517Mean;
	}

	public Float getHMI_IReg1518Mean() {
		return HMI_IReg1518Mean;
	}

	public void setHMI_IReg1518Mean(Float HMI_IReg1518Mean) {
		this.HMI_IReg1518Mean = HMI_IReg1518Mean;
	}

	public Float getHMI_IReg1519Mean() {
		return HMI_IReg1519Mean;
	}

	public void setHMI_IReg1519Mean(Float HMI_IReg1519Mean) {
		this.HMI_IReg1519Mean = HMI_IReg1519Mean;
	}

	public Float getHMI_Disc332Min() {
		return HMI_Disc332Min;
	}

	public void setHMI_Disc332Min(Float HMI_Disc332Min) {
		this.HMI_Disc332Min = HMI_Disc332Min;
	}

	public Float getHMI_Disc341Min() {
		return HMI_Disc341Min;
	}

	public void setHMI_Disc341Min(Float HMI_Disc341Min) {
		this.HMI_Disc341Min = HMI_Disc341Min;
	}

	public Float getHMI_Disc341StdDiv() {
		return HMI_Disc341StdDiv;
	}

	public void setHMI_Disc341StdDiv(Float HMI_Disc341StdDiv) {
		this.HMI_Disc341StdDiv = HMI_Disc341StdDiv;
	}

	public Float getHMI_Disc383Min() {
		return HMI_Disc383Min;
	}

	public void setHMI_Disc383Min(Float HMI_Disc383Min) {
		this.HMI_Disc383Min = HMI_Disc383Min;
	}

	public Float getHMI_Disc409Min() {
		return HMI_Disc409Min;
	}

	public void setHMI_Disc409Min(Float HMI_Disc409Min) {
		this.HMI_Disc409Min = HMI_Disc409Min;
	}

	public Float getHMI_Disc409StdDiv() {
		return HMI_Disc409StdDiv;
	}

	public void setHMI_Disc409StdDiv(Float HMI_Disc409StdDiv) {
		this.HMI_Disc409StdDiv = HMI_Disc409StdDiv;
	}

	public Float getHMI_Disc409Flow() {
		return HMI_Disc409Flow;
	}

	public void setHMI_Disc409Flow(Float HMI_Disc409Flow) {
		this.HMI_Disc409Flow = HMI_Disc409Flow;
	}

	public Float getHMI_Disc413Min() {
		return HMI_Disc413Min;
	}

	public void setHMI_Disc413Min(Float HMI_Disc413Min) {
		this.HMI_Disc413Min = HMI_Disc413Min;
	}

	public Float getHMI_Disc413StdDiv() {
		return HMI_Disc413StdDiv;
	}

	public void setHMI_Disc413StdDiv(Float HMI_Disc413StdDiv) {
		this.HMI_Disc413StdDiv = HMI_Disc413StdDiv;
	}

	public Float getHMI_Disc413Flow() {
		return HMI_Disc413Flow;
	}

	public void setHMI_Disc413Flow(Float HMI_Disc413Flow) {
		this.HMI_Disc413Flow = HMI_Disc413Flow;
	}
}

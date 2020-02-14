package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OneSecData2DB{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date time;
	@Column(name="`HMI_IReg[153]`")
	private Float HMI_IReg153;
	@Column(name="`HMI_IReg[155]`")
	private Float HMI_IReg155;
	@Column(name="`HMI_Disc[1001]`")
	private boolean HMI_Disc1001;
	@Column(name="`HMI_Disc[1002]`")
	private boolean HMI_Disc1002;
	@Column(name="`HMI_Disc[1003]`")
	private boolean HMI_Disc1003;
	@Column(name="`HMI_Disc[1005]`")
	private boolean HMI_Disc1005;
	@Column(name="`HMI_Disc[1006]`")
	private boolean HMI_Disc1006;
	@Column(name="`HMI_Disc[1007]`")
	private boolean HMI_Disc1007;
	@Column(name="`HMI_Disc[1008]`")
	private boolean HMI_Disc1008;
	@Column(name="`HMI_Disc[1010]`")
	private boolean HMI_Disc1010;
	@Column(name="`HMI_Disc[1011]`")
	private boolean HMI_Disc1011;
	@Column(name="`HMI_Disc[1012]`")
	private boolean HMI_Disc1012;
	@Column(name="`HMI_Disc[1013]`")
	private boolean HMI_Disc1013;
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
	@Column(name="`HMI_IReg[253]`")
	private Float HMI_IReg253;
	@Column(name="`HMI_IReg[1405]`")
	private Float HMI_IReg1405;
	@Column(name="`HMI_IReg[1406]`")
	private Float HMI_IReg1406;
	@Column(name="`HMI_IReg[1407]`")
	private Float HMI_IReg1407;
	@Column(name="`HMI_IReg[1408]`")
	private Float HMI_IReg1408;
	@Column(name="`HMI_IReg[1422]`")
	private Float HMI_IReg1422;
	@Column(name="`HMI_IReg[1423]`")
	private Float HMI_IReg1423;
	@Column(name="`HMI_IReg[1644]`")
	private Float HMI_IReg1644;
	@Column(name="`HMI_IReg[1645]`")
	private Float HMI_IReg1645;
	@Column(name="`HMI_IReg[1646]`")
	private Float HMI_IReg1646;
	@Column(name="`HMI_IReg[1647]`")
	private Float HMI_IReg1647;
	@Column(name="`HMI_IReg[1648]`")
	private Float HMI_IReg1648;
	@Column(name="`HMI_IReg[1649]`")
	private Float HMI_IReg1649;
	@Column(name="`HMI_IReg[1665]`")
	private Float HMI_IReg1665;
	@Column(name="`HMI_IReg[1666]`")
	private Float HMI_IReg1666;

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

	public Float getHMI_IReg153() {
		return HMI_IReg153;
	}

	public void setHMI_IReg153(Float HMI_IReg153) {
		this.HMI_IReg153 = HMI_IReg153;
	}

	public Float getHMI_IReg155() {
		return HMI_IReg155;
	}

	public void setHMI_IReg155(Float HMI_IReg155) {
		this.HMI_IReg155 = HMI_IReg155;
	}

	public boolean isHMI_Disc1001() {
		return HMI_Disc1001;
	}

	public void setHMI_Disc1001(boolean HMI_Disc1001) {
		this.HMI_Disc1001 = HMI_Disc1001;
	}

	public boolean isHMI_Disc1002() {
		return HMI_Disc1002;
	}

	public void setHMI_Disc1002(boolean HMI_Disc1002) {
		this.HMI_Disc1002 = HMI_Disc1002;
	}

	public boolean isHMI_Disc1003() {
		return HMI_Disc1003;
	}

	public void setHMI_Disc1003(boolean HMI_Disc1003) {
		this.HMI_Disc1003 = HMI_Disc1003;
	}

	public boolean isHMI_Disc1005() {
		return HMI_Disc1005;
	}

	public void setHMI_Disc1005(boolean HMI_Disc1005) {
		this.HMI_Disc1005 = HMI_Disc1005;
	}

	public boolean isHMI_Disc1006() {
		return HMI_Disc1006;
	}

	public void setHMI_Disc1006(boolean HMI_Disc1006) {
		this.HMI_Disc1006 = HMI_Disc1006;
	}

	public boolean isHMI_Disc1007() {
		return HMI_Disc1007;
	}

	public void setHMI_Disc1007(boolean HMI_Disc1007) {
		this.HMI_Disc1007 = HMI_Disc1007;
	}

	public boolean isHMI_Disc1008() {
		return HMI_Disc1008;
	}

	public void setHMI_Disc1008(boolean HMI_Disc1008) {
		this.HMI_Disc1008 = HMI_Disc1008;
	}

	public boolean isHMI_Disc1010() {
		return HMI_Disc1010;
	}

	public void setHMI_Disc1010(boolean HMI_Disc1010) {
		this.HMI_Disc1010 = HMI_Disc1010;
	}

	public boolean isHMI_Disc1011() {
		return HMI_Disc1011;
	}

	public void setHMI_Disc1011(boolean HMI_Disc1011) {
		this.HMI_Disc1011 = HMI_Disc1011;
	}

	public boolean isHMI_Disc1012() {
		return HMI_Disc1012;
	}

	public void setHMI_Disc1012(boolean HMI_Disc1012) {
		this.HMI_Disc1012 = HMI_Disc1012;
	}

	public boolean isHMI_Disc1013() {
		return HMI_Disc1013;
	}

	public void setHMI_Disc1013(boolean HMI_Disc1013) {
		this.HMI_Disc1013 = HMI_Disc1013;
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

	public Float getHMI_IReg253() {
		return HMI_IReg253;
	}

	public void setHMI_IReg253(Float HMI_IReg253) {
		this.HMI_IReg253 = HMI_IReg253;
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

	public Float getHMI_IReg1647() {
		return HMI_IReg1647;
	}

	public void setHMI_IReg1647(Float HMI_IReg1647) {
		this.HMI_IReg1647 = HMI_IReg1647;
	}

	public Float getHMI_IReg1648() {
		return HMI_IReg1648;
	}

	public void setHMI_IReg1648(Float HMI_IReg1648) {
		this.HMI_IReg1648 = HMI_IReg1648;
	}

	public Float getHMI_IReg1649() {
		return HMI_IReg1649;
	}

	public void setHMI_IReg1649(Float HMI_IReg1649) {
		this.HMI_IReg1649 = HMI_IReg1649;
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
}

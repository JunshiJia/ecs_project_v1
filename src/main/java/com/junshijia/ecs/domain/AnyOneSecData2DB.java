package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AnyOneSecData2DB{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date time;
	@Column(name="`HMI_IReg[155]`")
	private Float HMI_IReg155;
	@Column(name="`HMI_IReg[107]`")
	private Float HMI_IReg107;
	@Column(name="`HMI_IReg[110]`")
	private Float HMI_IReg110;
	@Column(name="`HMI_IReg[121]`")
	private Float HMI_IReg121;
	@Column(name="`HMI_IReg[203]`")
	private Float HMI_IReg203;
	@Column(name="`HMI_IReg[210]`")
	private Float HMI_IReg210;
	@Column(name="`HMI_IReg[216]`")
	private Float HMI_IReg216;
	@Column(name="`HMI_IReg[223]`")
	private Float HMI_IReg223;
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
	@Column(name="`HMI_IReg[1611]`")
	private Float HMI_IReg1611;
	@Column(name="`HMI_IReg[1612]`")
	private Float HMI_IReg1612;
	@Column(name="`HMI_IReg[1613]`")
	private Float HMI_IReg1613;
	@Column(name="`HMI_IReg[1643]`")
	private Float HMI_IReg1643;
	@Column(name="`HMI_IReg[1644]`")
	private Float HMI_IReg1644;
	@Column(name="`HMI_IReg[1645]`")
	private Float HMI_IReg1645;
	@Column(name="`HMI_IReg[1646]`")
	private Float HMI_IReg1646;
	@Column(name="`HMI_Disc[1653]`")
	private boolean HMI_Disc1653;
	@Column(name="`HMI_IReg[1667]`")
	private Float HMI_IReg1667;
	@Column(name="`HMI_IReg[1691]`")
	private Float HMI_IReg1691;
	@Column(name="`HMI_IReg[1692]`")
	private Float HMI_IReg1692;
	@Column(name="`HMI_IReg[1693]`")
	private Float HMI_IReg1693;
	@Column(name="`HMI_IReg[1694]`")
	private Float HMI_IReg1694;
	@Column(name="`HMI_IReg[6]`")
	private Float HMI_IReg6;
	@Column(name="`HMI_IReg[7]`")
	private Float HMI_IReg7;
	@Column(name="`HMI_IReg[8]`")
	private Float HMI_IReg8;
	@Column(name="`HMI_IReg[9]`")
	private Float HMI_IReg9;

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

	public Float getHMI_IReg155() {
		return HMI_IReg155;
	}

	public void setHMI_IReg155(Float HMI_IReg155) {
		this.HMI_IReg155 = HMI_IReg155;
	}

	public Float getHMI_IReg107() {
		return HMI_IReg107;
	}

	public void setHMI_IReg107(Float HMI_IReg107) {
		this.HMI_IReg107 = HMI_IReg107;
	}

	public Float getHMI_IReg110() {
		return HMI_IReg110;
	}

	public void setHMI_IReg110(Float HMI_IReg110) {
		this.HMI_IReg110 = HMI_IReg110;
	}

	public Float getHMI_IReg121() {
		return HMI_IReg121;
	}

	public void setHMI_IReg121(Float HMI_IReg121) {
		this.HMI_IReg121 = HMI_IReg121;
	}

	public Float getHMI_IReg203() {
		return HMI_IReg203;
	}

	public void setHMI_IReg203(Float HMI_IReg203) {
		this.HMI_IReg203 = HMI_IReg203;
	}

	public Float getHMI_IReg210() {
		return HMI_IReg210;
	}

	public void setHMI_IReg210(Float HMI_IReg210) {
		this.HMI_IReg210 = HMI_IReg210;
	}

	public Float getHMI_IReg216() {
		return HMI_IReg216;
	}

	public void setHMI_IReg216(Float HMI_IReg216) {
		this.HMI_IReg216 = HMI_IReg216;
	}

	public Float getHMI_IReg223() {
		return HMI_IReg223;
	}

	public void setHMI_IReg223(Float HMI_IReg223) {
		this.HMI_IReg223 = HMI_IReg223;
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

	public Float getHMI_IReg1611() {
		return HMI_IReg1611;
	}

	public void setHMI_IReg1611(Float HMI_IReg1611) {
		this.HMI_IReg1611 = HMI_IReg1611;
	}

	public Float getHMI_IReg1612() {
		return HMI_IReg1612;
	}

	public void setHMI_IReg1612(Float HMI_IReg1612) {
		this.HMI_IReg1612 = HMI_IReg1612;
	}

	public Float getHMI_IReg1613() {
		return HMI_IReg1613;
	}

	public void setHMI_IReg1613(Float HMI_IReg1613) {
		this.HMI_IReg1613 = HMI_IReg1613;
	}

	public Float getHMI_IReg1643() {
		return HMI_IReg1643;
	}

	public void setHMI_IReg1643(Float HMI_IReg1643) {
		this.HMI_IReg1643 = HMI_IReg1643;
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

	public boolean isHMI_Disc1653() {
		return HMI_Disc1653;
	}

	public void setHMI_Disc1653(boolean HMI_Disc1653) {
		this.HMI_Disc1653 = HMI_Disc1653;
	}

	public Float getHMI_IReg1667() {
		return HMI_IReg1667;
	}

	public void setHMI_IReg1667(Float HMI_IReg1667) {
		this.HMI_IReg1667 = HMI_IReg1667;
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

	public Float getHMI_IReg6() {
		return HMI_IReg6;
	}

	public void setHMI_IReg6(Float HMI_IReg6) {
		this.HMI_IReg6 = HMI_IReg6;
	}

	public Float getHMI_IReg7() {
		return HMI_IReg7;
	}

	public void setHMI_IReg7(Float HMI_IReg7) {
		this.HMI_IReg7 = HMI_IReg7;
	}

	public Float getHMI_IReg8() {
		return HMI_IReg8;
	}

	public void setHMI_IReg8(Float HMI_IReg8) {
		this.HMI_IReg8 = HMI_IReg8;
	}

	public Float getHMI_IReg9() {
		return HMI_IReg9;
	}

	public void setHMI_IReg9(Float HMI_IReg9) {
		this.HMI_IReg9 = HMI_IReg9;
	}
}

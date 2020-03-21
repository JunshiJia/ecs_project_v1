package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="one_sec_any")
public class AnyOneSecData2DB{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int wtId;
	private Date time;
	@Column(name="`HMI_IReg[155]`")
	private Float HMI_IReg155;
	@Column(name="`HMI_IReg[107]`")
	private Float HMI_IReg107;
	@Column(name="`HMI_IReg[108]`")
	private Float HMI_IReg108;
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
	@Column(name="`HMI_IReg[1563]`")
	private Float HMI_IReg1563;
	@Column(name="`HMI_IReg[1564]`")
	private Float HMI_IReg1564;
	@Column(name="`HMI_IReg[1565]`")
	private Float HMI_IReg1565;
	@Column(name="`HMI_IReg[1575]`")
	private Float HMI_IReg1575;
	@Column(name="`HMI_IReg[1576]`")
	private Float HMI_IReg1576;
	@Column(name="`HMI_IReg[1577]`")
	private Float HMI_IReg1577;
	@Column(name="`HMI_IReg[1584]`")
	private Float HMI_IReg1584;
	@Column(name="`HMI_IReg[1670]`")
	private Float HMI_IReg1670;
	@Column(name="`HMI_IReg[1691]`")
	private Float HMI_IReg1691;
	@Column(name="`HMI_IReg[1692]`")
	private Float HMI_IReg1692;
	@Column(name="`HMI_IReg[1693]`")
	private Float HMI_IReg1693;
	@Column(name="`HMI_IReg[1694]`")
	private Float HMI_IReg1694;

	@Override
	public String toString() {
		return "AnyOneSecData2DB{" +
				"id=" + id +
				", time=" + time +
				", HMI_IReg155=" + HMI_IReg155 +
				", HMI_IReg107=" + HMI_IReg107 +
				", HMI_IReg108=" + HMI_IReg108 +
				", HMI_IReg110=" + HMI_IReg110 +
				", HMI_IReg121=" + HMI_IReg121 +
				", HMI_IReg203=" + HMI_IReg203 +
				", HMI_IReg210=" + HMI_IReg210 +
				", HMI_IReg216=" + HMI_IReg216 +
				", HMI_IReg223=" + HMI_IReg223 +
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
				", HMI_IReg1405=" + HMI_IReg1405 +
				", HMI_IReg1406=" + HMI_IReg1406 +
				", HMI_IReg1407=" + HMI_IReg1407 +
				", HMI_IReg1408=" + HMI_IReg1408 +
				", HMI_IReg1422=" + HMI_IReg1422 +
				", HMI_IReg1423=" + HMI_IReg1423 +
				", HMI_IReg1563=" + HMI_IReg1563 +
				", HMI_IReg1564=" + HMI_IReg1564 +
				", HMI_IReg1565=" + HMI_IReg1565 +
				", HMI_IReg1575=" + HMI_IReg1575 +
				", HMI_IReg1576=" + HMI_IReg1576 +
				", HMI_IReg1577=" + HMI_IReg1577 +
				", HMI_IReg1584=" + HMI_IReg1584 +
				", HMI_IReg1670=" + HMI_IReg1670 +
				", HMI_IReg1691=" + HMI_IReg1691 +
				", HMI_IReg1692=" + HMI_IReg1692 +
				", HMI_IReg1693=" + HMI_IReg1693 +
				", HMI_IReg1694=" + HMI_IReg1694 +
				'}';
	}

	public AnyOneSecData2DB() {
	}

	public int getWtId() {
		return wtId;
	}

	public void setWtId(int wtId) {
		this.wtId = wtId;
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

	public Float getHMI_IReg108() {
		return HMI_IReg108;
	}

	public void setHMI_IReg108(Float HMI_IReg108) {
		this.HMI_IReg108 = HMI_IReg108;
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

	public Float getHMI_IReg1563() {
		return HMI_IReg1563;
	}

	public void setHMI_IReg1563(Float HMI_IReg1563) {
		this.HMI_IReg1563 = HMI_IReg1563;
	}

	public Float getHMI_IReg1564() {
		return HMI_IReg1564;
	}

	public void setHMI_IReg1564(Float HMI_IReg1564) {
		this.HMI_IReg1564 = HMI_IReg1564;
	}

	public Float getHMI_IReg1565() {
		return HMI_IReg1565;
	}

	public void setHMI_IReg1565(Float HMI_IReg1565) {
		this.HMI_IReg1565 = HMI_IReg1565;
	}

	public Float getHMI_IReg1575() {
		return HMI_IReg1575;
	}

	public void setHMI_IReg1575(Float HMI_IReg1575) {
		this.HMI_IReg1575 = HMI_IReg1575;
	}

	public Float getHMI_IReg1576() {
		return HMI_IReg1576;
	}

	public void setHMI_IReg1576(Float HMI_IReg1576) {
		this.HMI_IReg1576 = HMI_IReg1576;
	}

	public Float getHMI_IReg1577() {
		return HMI_IReg1577;
	}

	public void setHMI_IReg1577(Float HMI_IReg1577) {
		this.HMI_IReg1577 = HMI_IReg1577;
	}

	public Float getHMI_IReg1584() {
		return HMI_IReg1584;
	}

	public void setHMI_IReg1584(Float HMI_IReg1584) {
		this.HMI_IReg1584 = HMI_IReg1584;
	}

	public Float getHMI_IReg1670() {
		return HMI_IReg1670;
	}

	public void setHMI_IReg1670(Float HMI_IReg1670) {
		this.HMI_IReg1670 = HMI_IReg1670;
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
}

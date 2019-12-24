package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OneSecData2DB{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型
	private Date time;
	private Float c300305;
	private Float c300309;
	private boolean b101001;
	private boolean b101002;
	private boolean b101003;
	private boolean b101005;
	private boolean b101006;
	private boolean b101007;
	private boolean b101008;
	private boolean b101010;
	private boolean b101011;
	private boolean b101012;
	private boolean b101013;
	private Float c300473;
	private Float c300475;
	private Float c300477;
	private Float c300479;
	private Float c300481;
	private Float c300483;
	private Float c300485;
	private Float c300487;
	private Float c300505;
	private Float c302809;
	private Float c302811;
	private Float c302813;
	private Float c302815;
	private Float c302843;
	private Float c302845;
	private Float c303287;
	private Float c303289;
	private Float c303291;
	private Float c303293;
	private Float c303295;
	private Float c303297;
	private Float c303329;
	private Float c303331;

	@Override
	public String toString() {
		return "OneSecData2DB{" +
				"id=" + id +
				", time=" + time +
				", c300305=" + c300305 +
				", c300309=" + c300309 +
				", b101001=" + b101001 +
				", b101002=" + b101002 +
				", b101003=" + b101003 +
				", b101005=" + b101005 +
				", b101006=" + b101006 +
				", b101007=" + b101007 +
				", b101008=" + b101008 +
				", b101010=" + b101010 +
				", b101011=" + b101011 +
				", b101012=" + b101012 +
				", b101013=" + b101013 +
				", c300473=" + c300473 +
				", c300475=" + c300475 +
				", c300477=" + c300477 +
				", c300479=" + c300479 +
				", c300481=" + c300481 +
				", c300483=" + c300483 +
				", c300485=" + c300485 +
				", c300487=" + c300487 +
				", c300505=" + c300505 +
				", c302809=" + c302809 +
				", c302811=" + c302811 +
				", c302813=" + c302813 +
				", c302815=" + c302815 +
				", c302843=" + c302843 +
				", c302845=" + c302845 +
				", c303287=" + c303287 +
				", c303289=" + c303289 +
				", c303291=" + c303291 +
				", c303293=" + c303293 +
				", c303295=" + c303295 +
				", c303297=" + c303297 +
				", c303329=" + c303329 +
				", c303331=" + c303331 +
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

	public Float getC300305() {
		return c300305;
	}

	public void setC300305(Float c300305) {
		this.c300305 = c300305;
	}

	public Float getC300309() {
		return c300309;
	}

	public void setC300309(Float c300309) {
		this.c300309 = c300309;
	}

	public boolean isB101001() {
		return b101001;
	}

	public void setB101001(boolean b101001) {
		this.b101001 = b101001;
	}

	public boolean isB101002() {
		return b101002;
	}

	public void setB101002(boolean b101002) {
		this.b101002 = b101002;
	}

	public boolean isB101003() {
		return b101003;
	}

	public void setB101003(boolean b101003) {
		this.b101003 = b101003;
	}

	public boolean isB101005() {
		return b101005;
	}

	public void setB101005(boolean b101005) {
		this.b101005 = b101005;
	}

	public boolean isB101006() {
		return b101006;
	}

	public void setB101006(boolean b101006) {
		this.b101006 = b101006;
	}

	public boolean isB101007() {
		return b101007;
	}

	public void setB101007(boolean b101007) {
		this.b101007 = b101007;
	}

	public boolean isB101008() {
		return b101008;
	}

	public void setB101008(boolean b101008) {
		this.b101008 = b101008;
	}

	public boolean isB101010() {
		return b101010;
	}

	public void setB101010(boolean b101010) {
		this.b101010 = b101010;
	}

	public boolean isB101011() {
		return b101011;
	}

	public void setB101011(boolean b101011) {
		this.b101011 = b101011;
	}

	public boolean isB101012() {
		return b101012;
	}

	public void setB101012(boolean b101012) {
		this.b101012 = b101012;
	}

	public boolean isB101013() {
		return b101013;
	}

	public void setB101013(boolean b101013) {
		this.b101013 = b101013;
	}

	public Float getC300473() {
		return c300473;
	}

	public void setC300473(Float c300473) {
		this.c300473 = c300473;
	}

	public Float getC300475() {
		return c300475;
	}

	public void setC300475(Float c300475) {
		this.c300475 = c300475;
	}

	public Float getC300477() {
		return c300477;
	}

	public void setC300477(Float c300477) {
		this.c300477 = c300477;
	}

	public Float getC300479() {
		return c300479;
	}

	public void setC300479(Float c300479) {
		this.c300479 = c300479;
	}

	public Float getC300481() {
		return c300481;
	}

	public void setC300481(Float c300481) {
		this.c300481 = c300481;
	}

	public Float getC300483() {
		return c300483;
	}

	public void setC300483(Float c300483) {
		this.c300483 = c300483;
	}

	public Float getC300485() {
		return c300485;
	}

	public void setC300485(Float c300485) {
		this.c300485 = c300485;
	}

	public Float getC300487() {
		return c300487;
	}

	public void setC300487(Float c300487) {
		this.c300487 = c300487;
	}

	public Float getC300505() {
		return c300505;
	}

	public void setC300505(Float c300505) {
		this.c300505 = c300505;
	}

	public Float getC302809() {
		return c302809;
	}

	public void setC302809(Float c302809) {
		this.c302809 = c302809;
	}

	public Float getC302811() {
		return c302811;
	}

	public void setC302811(Float c302811) {
		this.c302811 = c302811;
	}

	public Float getC302813() {
		return c302813;
	}

	public void setC302813(Float c302813) {
		this.c302813 = c302813;
	}

	public Float getC302815() {
		return c302815;
	}

	public void setC302815(Float c302815) {
		this.c302815 = c302815;
	}

	public Float getC302843() {
		return c302843;
	}

	public void setC302843(Float c302843) {
		this.c302843 = c302843;
	}

	public Float getC302845() {
		return c302845;
	}

	public void setC302845(Float c302845) {
		this.c302845 = c302845;
	}

	public Float getC303287() {
		return c303287;
	}

	public void setC303287(Float c303287) {
		this.c303287 = c303287;
	}

	public Float getC303289() {
		return c303289;
	}

	public void setC303289(Float c303289) {
		this.c303289 = c303289;
	}

	public Float getC303291() {
		return c303291;
	}

	public void setC303291(Float c303291) {
		this.c303291 = c303291;
	}

	public Float getC303293() {
		return c303293;
	}

	public void setC303293(Float c303293) {
		this.c303293 = c303293;
	}

	public Float getC303295() {
		return c303295;
	}

	public void setC303295(Float c303295) {
		this.c303295 = c303295;
	}

	public Float getC303297() {
		return c303297;
	}

	public void setC303297(Float c303297) {
		this.c303297 = c303297;
	}

	public Float getC303329() {
		return c303329;
	}

	public void setC303329(Float c303329) {
		this.c303329 = c303329;
	}

	public Float getC303331() {
		return c303331;
	}

	public void setC303331(Float c303331) {
		this.c303331 = c303331;
	}
}

package com.junshijia.ecs.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AnyOneSecData2DB{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型
	private Date time;
	private Float c300309;
	private Float c300213;
	private Float c300219;
	private Float c300241;
	private Float c300405;
	private Float c300419;
	private Float c300431;
	private Float c300445;
	private Float c300447;
	private Float c300473;
	private Float c300475;
	private Float c300477;
	private Float c300479;
	private Float c300481;
	private Float c300483;
	private Float c300485;
	private Float c300487;
	private Float c300489;
	private Float c302809;
	private Float c302811;
	private Float c302813;
	private Float c302815;
	private Float c302843;
	private Float c302845;
	private Float c303221;
	private Float c303223;
	private Float c303225;
	private Float c303285;
	private Float c303287;
	private Float c303289;
	private Float c303291;
	private boolean b101653;
	private Float c303333;
	private Float c303381;
	private Float c303383;
	private Float c303385;
	private Float c303387;
	private Float c300011;
	private Float c300013;
	private Float c300015;
	private Float c300017;

	@Override
	public String toString() {
		return "AnyOneSecData2DB{" +
				"id=" + id +
				", time=" + time +
				", c300309=" + c300309 +
				", c300213=" + c300213 +
				", c300219=" + c300219 +
				", c300241=" + c300241 +
				", c300405=" + c300405 +
				", c300419=" + c300419 +
				", c300431=" + c300431 +
				", c300445=" + c300445 +
				", c300447=" + c300447 +
				", c300473=" + c300473 +
				", c300475=" + c300475 +
				", c300477=" + c300477 +
				", c300479=" + c300479 +
				", c300481=" + c300481 +
				", c300483=" + c300483 +
				", c300485=" + c300485 +
				", c300487=" + c300487 +
				", c300489=" + c300489 +
				", c302809=" + c302809 +
				", c302811=" + c302811 +
				", c302813=" + c302813 +
				", c302815=" + c302815 +
				", c302843=" + c302843 +
				", c302845=" + c302845 +
				", c303221=" + c303221 +
				", c303223=" + c303223 +
				", c303225=" + c303225 +
				", c303285=" + c303285 +
				", c303287=" + c303287 +
				", c303289=" + c303289 +
				", c303291=" + c303291 +
				", b101653=" + b101653 +
				", c303333=" + c303333 +
				", c303381=" + c303381 +
				", c303383=" + c303383 +
				", c303385=" + c303385 +
				", c303387=" + c303387 +
				", c300011=" + c300011 +
				", c300013=" + c300013 +
				", c300015=" + c300015 +
				", c300017=" + c300017 +
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

	public Float getC300309() {
		return c300309;
	}

	public void setC300309(Float c300309) {
		this.c300309 = c300309;
	}

	public Float getC300213() {
		return c300213;
	}

	public void setC300213(Float c300213) {
		this.c300213 = c300213;
	}

	public Float getC300219() {
		return c300219;
	}

	public void setC300219(Float c300219) {
		this.c300219 = c300219;
	}

	public Float getC300241() {
		return c300241;
	}

	public void setC300241(Float c300241) {
		this.c300241 = c300241;
	}

	public Float getC300405() {
		return c300405;
	}

	public void setC300405(Float c300405) {
		this.c300405 = c300405;
	}

	public Float getC300419() {
		return c300419;
	}

	public void setC300419(Float c300419) {
		this.c300419 = c300419;
	}

	public Float getC300431() {
		return c300431;
	}

	public void setC300431(Float c300431) {
		this.c300431 = c300431;
	}

	public Float getC300445() {
		return c300445;
	}

	public void setC300445(Float c300445) {
		this.c300445 = c300445;
	}

	public Float getC300447() {
		return c300447;
	}

	public void setC300447(Float c300447) {
		this.c300447 = c300447;
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

	public Float getC300489() {
		return c300489;
	}

	public void setC300489(Float c300489) {
		this.c300489 = c300489;
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

	public Float getC303221() {
		return c303221;
	}

	public void setC303221(Float c303221) {
		this.c303221 = c303221;
	}

	public Float getC303223() {
		return c303223;
	}

	public void setC303223(Float c303223) {
		this.c303223 = c303223;
	}

	public Float getC303225() {
		return c303225;
	}

	public void setC303225(Float c303225) {
		this.c303225 = c303225;
	}

	public Float getC303285() {
		return c303285;
	}

	public void setC303285(Float c303285) {
		this.c303285 = c303285;
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

	public boolean isB101653() {
		return b101653;
	}

	public void setB101653(boolean b101653) {
		this.b101653 = b101653;
	}

	public Float getC303333() {
		return c303333;
	}

	public void setC303333(Float c303333) {
		this.c303333 = c303333;
	}

	public Float getC303381() {
		return c303381;
	}

	public void setC303381(Float c303381) {
		this.c303381 = c303381;
	}

	public Float getC303383() {
		return c303383;
	}

	public void setC303383(Float c303383) {
		this.c303383 = c303383;
	}

	public Float getC303385() {
		return c303385;
	}

	public void setC303385(Float c303385) {
		this.c303385 = c303385;
	}

	public Float getC303387() {
		return c303387;
	}

	public void setC303387(Float c303387) {
		this.c303387 = c303387;
	}

	public Float getC300011() {
		return c300011;
	}

	public void setC300011(Float c300011) {
		this.c300011 = c300011;
	}

	public Float getC300013() {
		return c300013;
	}

	public void setC300013(Float c300013) {
		this.c300013 = c300013;
	}

	public Float getC300015() {
		return c300015;
	}

	public void setC300015(Float c300015) {
		this.c300015 = c300015;
	}

	public Float getC300017() {
		return c300017;
	}

	public void setC300017(Float c300017) {
		this.c300017 = c300017;
	}
}

package com.junshijia.ecs.domain;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="allTurbine_data")
public class UpdateData2DB_old {
	@Id
	@GenericGenerator(name = "id",strategy = "assigned")
	@GeneratedValue(generator = "id")
	@Column(name = "id", nullable = false)
	private int id;
	private int wtId;
	@Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型
	private Date time;
	private boolean b100910;
	private boolean b100912;
	private Float c300309;
	private Float c300335;
	private Float c300201;
	private Float c300203;
	private Float c300205;
	private Float c300207;
	private Float c300209;
	private Float c300211;
	private Float c300213;
	private Float c300215;
	private Float c300217;
	private Float c300219;
	private Float c300221;
	private boolean b100922;
	private boolean b100923;
	private Float c300235;
	private Float c300237;
	private Float c300241;
	private Float c300243;
	private boolean b101021;
	private boolean b101022;
	private Float c300401;
	private Float c300419;
	private Float c300411;
	private Float c300427;
	private Float c300431;
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
	private Float c300495;
	private boolean b101056;
	private Float c300505;
	private Float c300507;
	private Float c300521;
	private Float c300523;
	private boolean b101024;
	private boolean b101025;
	private boolean b101028;
	private boolean b101029;
	private boolean b101031;
	private boolean b101036;
	private Float c300703;
	private Float c302809;
	private Float c302811;
	private Float c302813;
	private Float c302815;
	private Float c302823;
	private Float c302825;
	private Float c302827;
	private Float c302835;
	private Float c302837;
	private Float c302839;
	private Float c302843;
	private Float c302845;
	private Float c302851;
	private Float c303207;
	private Float c303209;
	private Float c303211;
	private Float c303215;
	private Float c303217;
	private Float c303219;
	private Float c303227;
	private Float c303229;
	private Float c303231;
	private Float c303233;
	private Float c303235;
	private Float c303237;
	private Float c303273;
	private Float c303275;
	private Float c303277;
	private Float c303279;
	private Float c303281;
	private Float c303283;
	private Float c303287;
	private Float c303289;
	private Float c303291;
	private boolean b101553;
	private boolean b101554;
	private boolean b101555;
	private boolean b101589;
	private boolean b101651;
	private boolean b101652;
	private boolean b101653;
	private boolean b101654;
	private boolean b101655;
	private boolean b101656;
	private boolean b101657;
	private boolean b101658;
	private boolean b101659;
	private boolean b101660;
	private boolean b101661;
	private boolean b101662;
	private boolean b101663;
	private boolean b101664;
	private boolean b101665;
	private boolean b101666;
	private boolean b101667;
	private boolean b101668;
	private boolean b101669;
	private boolean b101670;
	private boolean b101671;
	private boolean b101672;
	private boolean b101673;
	private boolean b101674;
	private boolean b101675;
	private boolean b101676;
	private boolean b101677;
	private boolean b101678;
	private boolean b101679;
	private boolean b101680;
	private boolean b101681;
	private boolean b101682;
	private boolean b101683;
	private boolean b101684;
	private Float c303301;
	private Float c303303;
	private Float c303309;
	private Float c303311;
	private Float c303313;
	private Float c303315;
	private Float c303329;
	private Float c303331;
	private Float c303333;
	private Float c303353;
	private Float c303381;
	private Float c303383;
	private Float c303385;
	private Float c303387;
	private Float c301591;
	private boolean b101304;
	private boolean b101305;
	private Float c303015;
	private Float c303027;
	private Float c303029;
	private Float c303031;
	private Float c303033;
	private Float c303035;
	private Float c303037;
	private boolean b100301;
	private boolean b100302;
	private boolean b100303;
	private boolean b100304;
	private boolean b100305;
	private boolean b100306;
	private boolean b100307;
	private boolean b100308;
	private boolean b100309;
	private boolean b100310;
	private boolean b100311;
	private boolean b100312;
	private boolean b100313;
	private boolean b100314;
	private boolean b100315;
	private boolean b100316;
	private boolean b100317;
	private boolean b100318;
	private boolean b100319;
	private boolean b100320;
	private boolean b100321;
	private boolean b100322;
	private boolean b100323;
	private boolean b100324;
	private boolean b100325;
	private boolean b100326;
	private boolean b100327;
	private boolean b100328;
	private boolean b100329;
	private boolean b100330;
	private boolean b100331;
	private boolean b100332;
	private boolean b100333;
	private boolean b100334;
	private boolean b100335;
	private boolean b100336;
	private boolean b100337;
	private boolean b100338;
	private boolean b100339;
	private boolean b100340;
	private boolean b100341;
	private boolean b100342;
	private boolean b100343;
	private boolean b100344;
	private boolean b100345;
	private boolean b100346;
	private boolean b100347;
	private boolean b100348;
	private boolean b100349;
	private boolean b100350;
	private boolean b100351;
	private boolean b100352;
	private boolean b100353;
	private boolean b100354;
	private boolean b100355;
	private boolean b100356;
	private boolean b100357;
	private boolean b100358;
	private boolean b100359;
	private boolean b100360;
	private boolean b100361;
	private boolean b100362;
	private boolean b100363;
	private boolean b100364;
	private boolean b100365;
	private boolean b100366;
	private boolean b100367;
	private boolean b100368;
	private boolean b100369;
	private boolean b100370;
	private boolean b100371;
	private boolean b100372;
	private boolean b100373;
	private boolean b100374;
	private boolean b100375;
	private boolean b100376;
	private boolean b100377;
	private boolean b100378;
	private boolean b100379;
	private boolean b100380;
	private boolean b100381;
	private boolean b100382;
	private boolean b100383;
	private boolean b100384;
	private boolean b100385;
	private boolean b100386;
	private boolean b100387;
	private boolean b100388;
	private boolean b100389;
	private boolean b100390;
	private boolean b100391;
	private boolean b100392;
	private boolean b100393;
	private boolean b100394;
	private boolean b100395;
	private boolean b100396;
	private boolean b100397;
	private boolean b100398;
	private boolean b100399;
	private boolean b100400;
	private boolean b100401;
	private boolean b100402;
	private boolean b100403;
	private boolean b100404;
	private boolean b100405;
	private boolean b100406;
	private boolean b100407;
	private boolean b100408;
	private boolean b100409;
	private boolean b100410;
	private boolean b100411;
	private boolean b100412;
	private boolean b100413;
	private boolean b100414;
	private boolean b100415;
	private boolean b100416;
	private boolean b100417;
	private boolean b100418;
	private boolean b100419;
	private boolean b100420;
	private boolean b100421;
	private boolean b100422;
	private boolean b100423;
	private boolean b100424;
	private boolean b100425;
	private boolean b100426;
	private boolean b100427;
	private boolean b100428;
	private boolean b100429;
	private boolean b100430;
	private boolean b100431;
	private boolean b100432;
	private boolean b100433;
	private boolean b100434;
	private boolean b100435;
	private boolean b100436;
	private boolean b100437;
	private boolean b100438;
	private boolean b100439;
	private boolean b100440;
	private boolean b100441;
	private boolean b100442;
	private boolean b100443;
	private boolean b100444;
	private boolean b100445;
	private boolean b100446;
	private boolean b100447;
	private boolean b100448;
	private boolean b100449;
	private boolean b100450;
	private boolean b100451;
	private boolean b100452;
	private boolean b100453;
	private boolean b100454;
	private boolean b100455;
	private boolean b100456;
	private boolean b100457;
	private boolean b100458;
	private boolean b100459;
	private boolean b100460;
	private boolean b100461;
	private boolean b100462;
	private boolean b100463;
	private boolean b100464;
	private boolean b100465;
	private boolean b100466;
	private boolean b100467;
	private boolean b100468;
	private boolean b100469;
	private boolean b100474;
	private boolean b100475;
	private boolean b100476;
	private boolean b100477;
	private boolean b100478;
	private boolean b100600;
	private boolean b100601;
	private boolean b100602;
	private boolean b100603;
	private boolean b100604;
	private boolean b100605;
	private boolean b100606;
	private boolean b100607;
	private boolean b100608;
	private boolean b100609;
	private boolean b100610;
	private boolean b100611;
	private boolean b100612;
	private boolean b100613;
	private boolean b100614;
	private boolean b100615;
	private boolean b100616;
	private boolean b100617;
	private boolean b100618;
	private boolean b100619;
	private boolean b100620;
	private boolean b100621;
	private boolean b100622;
	private boolean b100623;
	private boolean b100624;
	private boolean b100625;
	private boolean b100626;
	private boolean b100627;
	private boolean b100628;
	private boolean b100629;
	private boolean b100630;
	private boolean b100631;
	private boolean b100632;
	private boolean b100633;
	private boolean b100634;
	private boolean b100635;
	private boolean b100636;
	private boolean b100637;
	private boolean b100638;
	private boolean b100639;
	private boolean b100640;
	private boolean b100641;
	private boolean b100642;
	private boolean b100643;
	private boolean b100644;
	private boolean b100645;
	private boolean b100646;
	private boolean b100647;
	private boolean b100648;
	private boolean b100649;
	private boolean b100650;
	private boolean b100651;
	private boolean b100652;
	private boolean b100653;
	private boolean b100654;
	private boolean b100655;
	private boolean b100656;
	private boolean b100657;
	private boolean b100658;
	private boolean b100659;
	private boolean b100660;
	private boolean b100661;
	private boolean b100662;
	private boolean b100663;
	private boolean b100664;
	private boolean b100665;
	private boolean b100666;
	private boolean b100667;
	private boolean b100668;
	private boolean b100669;
	private boolean b100670;
	private boolean b100671;
	private boolean b100672;
	private boolean b100673;
	private boolean b100674;
	private boolean b100675;
	private boolean b100676;
	private boolean b100677;
	private boolean b100678;
	private boolean b100679;
	private boolean b100680;
	private boolean b100681;
	private boolean b100682;
	private boolean b100683;
	private boolean b100684;
	private boolean b100685;
	private boolean b100686;
	private boolean b100687;
	private boolean b100688;
	private boolean b100689;
	private boolean b100690;
	private boolean b100691;
	private boolean b100692;
	private boolean b100693;
	private boolean b100694;
	private boolean b100695;
	private boolean b100696;
	private boolean b100697;
	private boolean b100698;
	private boolean b100699;
	private boolean b100700;
	private boolean b100701;
	private boolean b100702;
	private boolean b100703;
	private boolean b100704;
	private boolean b100705;
	private boolean b100706;
	private boolean b100707;
	private boolean b100708;
	private boolean b100709;
	private boolean b100710;
	private boolean b100711;
	private boolean b100712;
	private boolean b100713;
	private boolean b100714;
	private boolean b100715;
	private boolean b100716;
	private boolean b100717;
	private boolean b100718;
	private boolean b100719;
	private boolean b100720;
	private boolean b100721;
	private boolean b100722;
	private boolean b100723;
	private boolean b100724;
	private boolean b100725;
	private boolean b100726;
	private boolean b100727;
	private boolean b100728;
	private boolean b100729;
	private boolean b100730;
	private boolean b100731;
	private boolean b100732;
	private boolean b100733;
	private boolean b100734;
	private boolean b100735;
	private boolean b100736;
	private boolean b100737;
	private boolean b100738;
	private boolean b100739;
	private boolean b100740;
	private boolean b100741;
	private boolean b100742;
	private boolean b100743;
	private boolean b100824;
	private boolean b100825;
	private boolean b100826;
	private boolean b100827;
	private boolean b100828;
	private boolean b100829;
	private boolean b100830;
	private boolean b100831;
	private boolean b100832;
	private boolean b100833;
	private boolean b100834;
	private boolean b100835;
	private boolean b100836;
	private boolean b100837;
	private boolean b100046;
	private boolean b100047;
	private boolean b100048;
	private boolean b100066;
	private boolean b100112;
	private boolean b100113;
	private boolean b100115;

	public UpdateData2DB_old() {
		this.time = new Date();
	}

	@Override
	public String toString() {
		return "UpdateData2DB{" +
				"id=" + id +
				", wtId=" + wtId +
				", b100910=" + b100910 +
				", b100912=" + b100912 +
				", c300309=" + c300309 +
				", c300335=" + c300335 +
				", c300201=" + c300201 +
				", c300203=" + c300203 +
				", c300205=" + c300205 +
				", c300207=" + c300207 +
				", c300209=" + c300209 +
				", c300211=" + c300211 +
				", c300213=" + c300213 +
				", c300215=" + c300215 +
				", c300217=" + c300217 +
				", c300219=" + c300219 +
				", c300221=" + c300221 +
				", b100922=" + b100922 +
				", b100923=" + b100923 +
				", c300235=" + c300235 +
				", c300237=" + c300237 +
				", c300241=" + c300241 +
				", c300243=" + c300243 +
				", b101021=" + b101021 +
				", b101022=" + b101022 +
				", c300401=" + c300401 +
				", c300419=" + c300419 +
				", c300411=" + c300411 +
				", c300427=" + c300427 +
				", c300431=" + c300431 +
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
				", c300495=" + c300495 +
				", b101056=" + b101056 +
				", c300505=" + c300505 +
				", c300507=" + c300507 +
				", c300521=" + c300521 +
				", c300523=" + c300523 +
				", b101024=" + b101024 +
				", b101025=" + b101025 +
				", b101028=" + b101028 +
				", b101029=" + b101029 +
				", b101031=" + b101031 +
				", b101036=" + b101036 +
				", c300703=" + c300703 +
				", c302809=" + c302809 +
				", c302811=" + c302811 +
				", c302813=" + c302813 +
				", c302815=" + c302815 +
				", c302823=" + c302823 +
				", c302825=" + c302825 +
				", c302827=" + c302827 +
				", c302835=" + c302835 +
				", c302837=" + c302837 +
				", c302839=" + c302839 +
				", c302843=" + c302843 +
				", c302845=" + c302845 +
				", c302851=" + c302851 +
				", c303207=" + c303207 +
				", c303209=" + c303209 +
				", c303211=" + c303211 +
				", c303215=" + c303215 +
				", c303217=" + c303217 +
				", c303219=" + c303219 +
				", c303227=" + c303227 +
				", c303229=" + c303229 +
				", c303231=" + c303231 +
				", c303233=" + c303233 +
				", c303235=" + c303235 +
				", c303237=" + c303237 +
				", c303273=" + c303273 +
				", c303275=" + c303275 +
				", c303277=" + c303277 +
				", c303279=" + c303279 +
				", c303281=" + c303281 +
				", c303283=" + c303283 +
				", c303287=" + c303287 +
				", c303289=" + c303289 +
				", c303291=" + c303291 +
				", b101553=" + b101553 +
				", b101554=" + b101554 +
				", b101555=" + b101555 +
				", b101589=" + b101589 +
				", b101651=" + b101651 +
				", b101652=" + b101652 +
				", b101653=" + b101653 +
				", b101654=" + b101654 +
				", b101655=" + b101655 +
				", b101656=" + b101656 +
				", b101657=" + b101657 +
				", b101658=" + b101658 +
				", b101659=" + b101659 +
				", b101660=" + b101660 +
				", b101661=" + b101661 +
				", b101662=" + b101662 +
				", b101663=" + b101663 +
				", b101664=" + b101664 +
				", b101665=" + b101665 +
				", b101666=" + b101666 +
				", b101667=" + b101667 +
				", b101668=" + b101668 +
				", b101669=" + b101669 +
				", b101670=" + b101670 +
				", b101671=" + b101671 +
				", b101672=" + b101672 +
				", b101673=" + b101673 +
				", b101674=" + b101674 +
				", b101675=" + b101675 +
				", b101676=" + b101676 +
				", b101677=" + b101677 +
				", b101678=" + b101678 +
				", b101679=" + b101679 +
				", b101680=" + b101680 +
				", b101681=" + b101681 +
				", b101682=" + b101682 +
				", b101683=" + b101683 +
				", b101684=" + b101684 +
				", c303301=" + c303301 +
				", c303303=" + c303303 +
				", c303309=" + c303309 +
				", c303311=" + c303311 +
				", c303313=" + c303313 +
				", c303315=" + c303315 +
				", c303329=" + c303329 +
				", c303331=" + c303331 +
				", c303333=" + c303333 +
				", c303353=" + c303353 +
				", c303381=" + c303381 +
				", c303383=" + c303383 +
				", c303385=" + c303385 +
				", c303387=" + c303387 +
				", c301591=" + c301591 +
				", b101304=" + b101304 +
				", b101305=" + b101305 +
				", c303015=" + c303015 +
				", c303027=" + c303027 +
				", c303029=" + c303029 +
				", c303031=" + c303031 +
				", c303033=" + c303033 +
				", c303035=" + c303035 +
				", c303037=" + c303037 +
				", b100301=" + b100301 +
				", b100302=" + b100302 +
				", b100303=" + b100303 +
				", b100304=" + b100304 +
				", b100305=" + b100305 +
				", b100306=" + b100306 +
				", b100307=" + b100307 +
				", b100308=" + b100308 +
				", b100309=" + b100309 +
				", b100310=" + b100310 +
				", b100311=" + b100311 +
				", b100312=" + b100312 +
				", b100313=" + b100313 +
				", b100314=" + b100314 +
				", b100315=" + b100315 +
				", b100316=" + b100316 +
				", b100317=" + b100317 +
				", b100318=" + b100318 +
				", b100319=" + b100319 +
				", b100320=" + b100320 +
				", b100321=" + b100321 +
				", b100322=" + b100322 +
				", b100323=" + b100323 +
				", b100324=" + b100324 +
				", b100325=" + b100325 +
				", b100326=" + b100326 +
				", b100327=" + b100327 +
				", b100328=" + b100328 +
				", b100329=" + b100329 +
				", b100330=" + b100330 +
				", b100331=" + b100331 +
				", b100332=" + b100332 +
				", b100333=" + b100333 +
				", b100334=" + b100334 +
				", b100335=" + b100335 +
				", b100336=" + b100336 +
				", b100337=" + b100337 +
				", b100338=" + b100338 +
				", b100339=" + b100339 +
				", b100340=" + b100340 +
				", b100341=" + b100341 +
				", b100342=" + b100342 +
				", b100343=" + b100343 +
				", b100344=" + b100344 +
				", b100345=" + b100345 +
				", b100346=" + b100346 +
				", b100347=" + b100347 +
				", b100348=" + b100348 +
				", b100349=" + b100349 +
				", b100350=" + b100350 +
				", b100351=" + b100351 +
				", b100352=" + b100352 +
				", b100353=" + b100353 +
				", b100354=" + b100354 +
				", b100355=" + b100355 +
				", b100356=" + b100356 +
				", b100357=" + b100357 +
				", b100358=" + b100358 +
				", b100359=" + b100359 +
				", b100360=" + b100360 +
				", b100361=" + b100361 +
				", b100362=" + b100362 +
				", b100363=" + b100363 +
				", b100364=" + b100364 +
				", b100365=" + b100365 +
				", b100366=" + b100366 +
				", b100367=" + b100367 +
				", b100368=" + b100368 +
				", b100369=" + b100369 +
				", b100370=" + b100370 +
				", b100371=" + b100371 +
				", b100372=" + b100372 +
				", b100373=" + b100373 +
				", b100374=" + b100374 +
				", b100375=" + b100375 +
				", b100376=" + b100376 +
				", b100377=" + b100377 +
				", b100378=" + b100378 +
				", b100379=" + b100379 +
				", b100380=" + b100380 +
				", b100381=" + b100381 +
				", b100382=" + b100382 +
				", b100383=" + b100383 +
				", b100384=" + b100384 +
				", b100385=" + b100385 +
				", b100386=" + b100386 +
				", b100387=" + b100387 +
				", b100388=" + b100388 +
				", b100389=" + b100389 +
				", b100390=" + b100390 +
				", b100391=" + b100391 +
				", b100392=" + b100392 +
				", b100393=" + b100393 +
				", b100394=" + b100394 +
				", b100395=" + b100395 +
				", b100396=" + b100396 +
				", b100397=" + b100397 +
				", b100398=" + b100398 +
				", b100399=" + b100399 +
				", b100400=" + b100400 +
				", b100401=" + b100401 +
				", b100402=" + b100402 +
				", b100403=" + b100403 +
				", b100404=" + b100404 +
				", b100405=" + b100405 +
				", b100406=" + b100406 +
				", b100407=" + b100407 +
				", b100408=" + b100408 +
				", b100409=" + b100409 +
				", b100410=" + b100410 +
				", b100411=" + b100411 +
				", b100412=" + b100412 +
				", b100413=" + b100413 +
				", b100414=" + b100414 +
				", b100415=" + b100415 +
				", b100416=" + b100416 +
				", b100417=" + b100417 +
				", b100418=" + b100418 +
				", b100419=" + b100419 +
				", b100420=" + b100420 +
				", b100421=" + b100421 +
				", b100422=" + b100422 +
				", b100423=" + b100423 +
				", b100424=" + b100424 +
				", b100425=" + b100425 +
				", b100426=" + b100426 +
				", b100427=" + b100427 +
				", b100428=" + b100428 +
				", b100429=" + b100429 +
				", b100430=" + b100430 +
				", b100431=" + b100431 +
				", b100432=" + b100432 +
				", b100433=" + b100433 +
				", b100434=" + b100434 +
				", b100435=" + b100435 +
				", b100436=" + b100436 +
				", b100437=" + b100437 +
				", b100438=" + b100438 +
				", b100439=" + b100439 +
				", b100440=" + b100440 +
				", b100441=" + b100441 +
				", b100442=" + b100442 +
				", b100443=" + b100443 +
				", b100444=" + b100444 +
				", b100445=" + b100445 +
				", b100446=" + b100446 +
				", b100447=" + b100447 +
				", b100448=" + b100448 +
				", b100449=" + b100449 +
				", b100450=" + b100450 +
				", b100451=" + b100451 +
				", b100452=" + b100452 +
				", b100453=" + b100453 +
				", b100454=" + b100454 +
				", b100455=" + b100455 +
				", b100456=" + b100456 +
				", b100457=" + b100457 +
				", b100458=" + b100458 +
				", b100459=" + b100459 +
				", b100460=" + b100460 +
				", b100461=" + b100461 +
				", b100462=" + b100462 +
				", b100463=" + b100463 +
				", b100464=" + b100464 +
				", b100465=" + b100465 +
				", b100466=" + b100466 +
				", b100467=" + b100467 +
				", b100468=" + b100468 +
				", b100469=" + b100469 +
				", b100474=" + b100474 +
				", b100475=" + b100475 +
				", b100476=" + b100476 +
				", b100477=" + b100477 +
				", b100478=" + b100478 +
				", b100600=" + b100600 +
				", b100601=" + b100601 +
				", b100602=" + b100602 +
				", b100603=" + b100603 +
				", b100604=" + b100604 +
				", b100605=" + b100605 +
				", b100606=" + b100606 +
				", b100607=" + b100607 +
				", b100608=" + b100608 +
				", b100609=" + b100609 +
				", b100610=" + b100610 +
				", b100611=" + b100611 +
				", b100612=" + b100612 +
				", b100613=" + b100613 +
				", b100614=" + b100614 +
				", b100615=" + b100615 +
				", b100616=" + b100616 +
				", b100617=" + b100617 +
				", b100618=" + b100618 +
				", b100619=" + b100619 +
				", b100620=" + b100620 +
				", b100621=" + b100621 +
				", b100622=" + b100622 +
				", b100623=" + b100623 +
				", b100624=" + b100624 +
				", b100625=" + b100625 +
				", b100626=" + b100626 +
				", b100627=" + b100627 +
				", b100628=" + b100628 +
				", b100629=" + b100629 +
				", b100630=" + b100630 +
				", b100631=" + b100631 +
				", b100632=" + b100632 +
				", b100633=" + b100633 +
				", b100634=" + b100634 +
				", b100635=" + b100635 +
				", b100636=" + b100636 +
				", b100637=" + b100637 +
				", b100638=" + b100638 +
				", b100639=" + b100639 +
				", b100640=" + b100640 +
				", b100641=" + b100641 +
				", b100642=" + b100642 +
				", b100643=" + b100643 +
				", b100644=" + b100644 +
				", b100645=" + b100645 +
				", b100646=" + b100646 +
				", b100647=" + b100647 +
				", b100648=" + b100648 +
				", b100649=" + b100649 +
				", b100650=" + b100650 +
				", b100651=" + b100651 +
				", b100652=" + b100652 +
				", b100653=" + b100653 +
				", b100654=" + b100654 +
				", b100655=" + b100655 +
				", b100656=" + b100656 +
				", b100657=" + b100657 +
				", b100658=" + b100658 +
				", b100659=" + b100659 +
				", b100660=" + b100660 +
				", b100661=" + b100661 +
				", b100662=" + b100662 +
				", b100663=" + b100663 +
				", b100664=" + b100664 +
				", b100665=" + b100665 +
				", b100666=" + b100666 +
				", b100667=" + b100667 +
				", b100668=" + b100668 +
				", b100669=" + b100669 +
				", b100670=" + b100670 +
				", b100671=" + b100671 +
				", b100672=" + b100672 +
				", b100673=" + b100673 +
				", b100674=" + b100674 +
				", b100675=" + b100675 +
				", b100676=" + b100676 +
				", b100677=" + b100677 +
				", b100678=" + b100678 +
				", b100679=" + b100679 +
				", b100680=" + b100680 +
				", b100681=" + b100681 +
				", b100682=" + b100682 +
				", b100683=" + b100683 +
				", b100684=" + b100684 +
				", b100685=" + b100685 +
				", b100686=" + b100686 +
				", b100687=" + b100687 +
				", b100688=" + b100688 +
				", b100689=" + b100689 +
				", b100690=" + b100690 +
				", b100691=" + b100691 +
				", b100692=" + b100692 +
				", b100693=" + b100693 +
				", b100694=" + b100694 +
				", b100695=" + b100695 +
				", b100696=" + b100696 +
				", b100697=" + b100697 +
				", b100698=" + b100698 +
				", b100699=" + b100699 +
				", b100700=" + b100700 +
				", b100701=" + b100701 +
				", b100702=" + b100702 +
				", b100703=" + b100703 +
				", b100704=" + b100704 +
				", b100705=" + b100705 +
				", b100706=" + b100706 +
				", b100707=" + b100707 +
				", b100708=" + b100708 +
				", b100709=" + b100709 +
				", b100710=" + b100710 +
				", b100711=" + b100711 +
				", b100712=" + b100712 +
				", b100713=" + b100713 +
				", b100714=" + b100714 +
				", b100715=" + b100715 +
				", b100716=" + b100716 +
				", b100717=" + b100717 +
				", b100718=" + b100718 +
				", b100719=" + b100719 +
				", b100720=" + b100720 +
				", b100721=" + b100721 +
				", b100722=" + b100722 +
				", b100723=" + b100723 +
				", b100724=" + b100724 +
				", b100725=" + b100725 +
				", b100726=" + b100726 +
				", b100727=" + b100727 +
				", b100728=" + b100728 +
				", b100729=" + b100729 +
				", b100730=" + b100730 +
				", b100731=" + b100731 +
				", b100732=" + b100732 +
				", b100733=" + b100733 +
				", b100734=" + b100734 +
				", b100735=" + b100735 +
				", b100736=" + b100736 +
				", b100737=" + b100737 +
				", b100738=" + b100738 +
				", b100739=" + b100739 +
				", b100740=" + b100740 +
				", b100741=" + b100741 +
				", b100742=" + b100742 +
				", b100743=" + b100743 +
				", b100824=" + b100824 +
				", b100825=" + b100825 +
				", b100826=" + b100826 +
				", b100827=" + b100827 +
				", b100828=" + b100828 +
				", b100829=" + b100829 +
				", b100830=" + b100830 +
				", b100831=" + b100831 +
				", b100832=" + b100832 +
				", b100833=" + b100833 +
				", b100834=" + b100834 +
				", b100835=" + b100835 +
				", b100836=" + b100836 +
				", b100837=" + b100837 +
				", b100046=" + b100046 +
				", b100047=" + b100047 +
				", b100048=" + b100048 +
				", b100066=" + b100066 +
				", b100112=" + b100112 +
				", b100113=" + b100113 +
				", b100115=" + b100115 +
				'}';
	}

	public boolean isB100910() {
		return b100910;
	}

	public void setB100910(boolean b100910) {
		this.b100910 = b100910;
	}

	public boolean isB100912() {
		return b100912;
	}

	public void setB100912(boolean b100912) {
		this.b100912 = b100912;
	}

	public Float getC300309() {
		return c300309;
	}

	public void setC300309(Float c300309) {
		this.c300309 = c300309;
	}

	public Float getC300335() {
		return c300335;
	}

	public void setC300335(Float c300335) {
		this.c300335 = c300335;
	}

	public Float getC300201() {
		return c300201;
	}

	public void setC300201(Float c300201) {
		this.c300201 = c300201;
	}

	public Float getC300203() {
		return c300203;
	}

	public void setC300203(Float c300203) {
		this.c300203 = c300203;
	}

	public Float getC300205() {
		return c300205;
	}

	public void setC300205(Float c300205) {
		this.c300205 = c300205;
	}

	public Float getC300207() {
		return c300207;
	}

	public void setC300207(Float c300207) {
		this.c300207 = c300207;
	}

	public Float getC300209() {
		return c300209;
	}

	public void setC300209(Float c300209) {
		this.c300209 = c300209;
	}

	public Float getC300211() {
		return c300211;
	}

	public void setC300211(Float c300211) {
		this.c300211 = c300211;
	}

	public Float getC300213() {
		return c300213;
	}

	public void setC300213(Float c300213) {
		this.c300213 = c300213;
	}

	public Float getC300215() {
		return c300215;
	}

	public void setC300215(Float c300215) {
		this.c300215 = c300215;
	}

	public Float getC300217() {
		return c300217;
	}

	public void setC300217(Float c300217) {
		this.c300217 = c300217;
	}

	public Float getC300219() {
		return c300219;
	}

	public void setC300219(Float c300219) {
		this.c300219 = c300219;
	}

	public Float getC300221() {
		return c300221;
	}

	public void setC300221(Float c300221) {
		this.c300221 = c300221;
	}

	public boolean isB100922() {
		return b100922;
	}

	public void setB100922(boolean b100922) {
		this.b100922 = b100922;
	}

	public boolean isB100923() {
		return b100923;
	}

	public void setB100923(boolean b100923) {
		this.b100923 = b100923;
	}

	public Float getC300235() {
		return c300235;
	}

	public void setC300235(Float c300235) {
		this.c300235 = c300235;
	}

	public Float getC300237() {
		return c300237;
	}

	public void setC300237(Float c300237) {
		this.c300237 = c300237;
	}

	public Float getC300241() {
		return c300241;
	}

	public void setC300241(Float c300241) {
		this.c300241 = c300241;
	}

	public Float getC300243() {
		return c300243;
	}

	public void setC300243(Float c300243) {
		this.c300243 = c300243;
	}

	public boolean isB101021() {
		return b101021;
	}

	public void setB101021(boolean b101021) {
		this.b101021 = b101021;
	}

	public boolean isB101022() {
		return b101022;
	}

	public void setB101022(boolean b101022) {
		this.b101022 = b101022;
	}

	public Float getC300401() {
		return c300401;
	}

	public void setC300401(Float c300401) {
		this.c300401 = c300401;
	}

	public Float getC300419() {
		return c300419;
	}

	public void setC300419(Float c300419) {
		this.c300419 = c300419;
	}

	public Float getC300411() {
		return c300411;
	}

	public void setC300411(Float c300411) {
		this.c300411 = c300411;
	}

	public Float getC300427() {
		return c300427;
	}

	public void setC300427(Float c300427) {
		this.c300427 = c300427;
	}

	public Float getC300431() {
		return c300431;
	}

	public void setC300431(Float c300431) {
		this.c300431 = c300431;
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

	public Float getC300495() {
		return c300495;
	}

	public void setC300495(Float c300495) {
		this.c300495 = c300495;
	}

	public boolean isB101056() {
		return b101056;
	}

	public void setB101056(boolean b101056) {
		this.b101056 = b101056;
	}

	public Float getC300505() {
		return c300505;
	}

	public void setC300505(Float c300505) {
		this.c300505 = c300505;
	}

	public Float getC300507() {
		return c300507;
	}

	public void setC300507(Float c300507) {
		this.c300507 = c300507;
	}

	public Float getC300521() {
		return c300521;
	}

	public void setC300521(Float c300521) {
		this.c300521 = c300521;
	}

	public Float getC300523() {
		return c300523;
	}

	public void setC300523(Float c300523) {
		this.c300523 = c300523;
	}

	public boolean isB101024() {
		return b101024;
	}

	public void setB101024(boolean b101024) {
		this.b101024 = b101024;
	}

	public boolean isB101025() {
		return b101025;
	}

	public void setB101025(boolean b101025) {
		this.b101025 = b101025;
	}

	public boolean isB101028() {
		return b101028;
	}

	public void setB101028(boolean b101028) {
		this.b101028 = b101028;
	}

	public boolean isB101029() {
		return b101029;
	}

	public void setB101029(boolean b101029) {
		this.b101029 = b101029;
	}

	public boolean isB101031() {
		return b101031;
	}

	public void setB101031(boolean b101031) {
		this.b101031 = b101031;
	}

	public boolean isB101036() {
		return b101036;
	}

	public void setB101036(boolean b101036) {
		this.b101036 = b101036;
	}

	public Float getC300703() {
		return c300703;
	}

	public void setC300703(Float c300703) {
		this.c300703 = c300703;
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

	public Float getC302823() {
		return c302823;
	}

	public void setC302823(Float c302823) {
		this.c302823 = c302823;
	}

	public Float getC302825() {
		return c302825;
	}

	public void setC302825(Float c302825) {
		this.c302825 = c302825;
	}

	public Float getC302827() {
		return c302827;
	}

	public void setC302827(Float c302827) {
		this.c302827 = c302827;
	}

	public Float getC302835() {
		return c302835;
	}

	public void setC302835(Float c302835) {
		this.c302835 = c302835;
	}

	public Float getC302837() {
		return c302837;
	}

	public void setC302837(Float c302837) {
		this.c302837 = c302837;
	}

	public Float getC302839() {
		return c302839;
	}

	public void setC302839(Float c302839) {
		this.c302839 = c302839;
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

	public Float getC302851() {
		return c302851;
	}

	public void setC302851(Float c302851) {
		this.c302851 = c302851;
	}

	public Float getC303207() {
		return c303207;
	}

	public void setC303207(Float c303207) {
		this.c303207 = c303207;
	}

	public Float getC303209() {
		return c303209;
	}

	public void setC303209(Float c303209) {
		this.c303209 = c303209;
	}

	public Float getC303211() {
		return c303211;
	}

	public void setC303211(Float c303211) {
		this.c303211 = c303211;
	}

	public Float getC303215() {
		return c303215;
	}

	public void setC303215(Float c303215) {
		this.c303215 = c303215;
	}

	public Float getC303217() {
		return c303217;
	}

	public void setC303217(Float c303217) {
		this.c303217 = c303217;
	}

	public Float getC303219() {
		return c303219;
	}

	public void setC303219(Float c303219) {
		this.c303219 = c303219;
	}

	public Float getC303227() {
		return c303227;
	}

	public void setC303227(Float c303227) {
		this.c303227 = c303227;
	}

	public Float getC303229() {
		return c303229;
	}

	public void setC303229(Float c303229) {
		this.c303229 = c303229;
	}

	public Float getC303231() {
		return c303231;
	}

	public void setC303231(Float c303231) {
		this.c303231 = c303231;
	}

	public Float getC303233() {
		return c303233;
	}

	public void setC303233(Float c303233) {
		this.c303233 = c303233;
	}

	public Float getC303235() {
		return c303235;
	}

	public void setC303235(Float c303235) {
		this.c303235 = c303235;
	}

	public Float getC303237() {
		return c303237;
	}

	public void setC303237(Float c303237) {
		this.c303237 = c303237;
	}

	public Float getC303273() {
		return c303273;
	}

	public void setC303273(Float c303273) {
		this.c303273 = c303273;
	}

	public Float getC303275() {
		return c303275;
	}

	public void setC303275(Float c303275) {
		this.c303275 = c303275;
	}

	public Float getC303277() {
		return c303277;
	}

	public void setC303277(Float c303277) {
		this.c303277 = c303277;
	}

	public Float getC303279() {
		return c303279;
	}

	public void setC303279(Float c303279) {
		this.c303279 = c303279;
	}

	public Float getC303281() {
		return c303281;
	}

	public void setC303281(Float c303281) {
		this.c303281 = c303281;
	}

	public Float getC303283() {
		return c303283;
	}

	public void setC303283(Float c303283) {
		this.c303283 = c303283;
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

	public boolean isB101553() {
		return b101553;
	}

	public void setB101553(boolean b101553) {
		this.b101553 = b101553;
	}

	public boolean isB101554() {
		return b101554;
	}

	public void setB101554(boolean b101554) {
		this.b101554 = b101554;
	}

	public boolean isB101555() {
		return b101555;
	}

	public void setB101555(boolean b101555) {
		this.b101555 = b101555;
	}

	public boolean isB101589() {
		return b101589;
	}

	public void setB101589(boolean b101589) {
		this.b101589 = b101589;
	}

	public boolean isB101651() {
		return b101651;
	}

	public void setB101651(boolean b101651) {
		this.b101651 = b101651;
	}

	public boolean isB101652() {
		return b101652;
	}

	public void setB101652(boolean b101652) {
		this.b101652 = b101652;
	}

	public boolean isB101653() {
		return b101653;
	}

	public void setB101653(boolean b101653) {
		this.b101653 = b101653;
	}

	public boolean isB101654() {
		return b101654;
	}

	public void setB101654(boolean b101654) {
		this.b101654 = b101654;
	}

	public boolean isB101655() {
		return b101655;
	}

	public void setB101655(boolean b101655) {
		this.b101655 = b101655;
	}

	public boolean isB101656() {
		return b101656;
	}

	public void setB101656(boolean b101656) {
		this.b101656 = b101656;
	}

	public boolean isB101657() {
		return b101657;
	}

	public void setB101657(boolean b101657) {
		this.b101657 = b101657;
	}

	public boolean isB101658() {
		return b101658;
	}

	public void setB101658(boolean b101658) {
		this.b101658 = b101658;
	}

	public boolean isB101659() {
		return b101659;
	}

	public void setB101659(boolean b101659) {
		this.b101659 = b101659;
	}

	public boolean isB101660() {
		return b101660;
	}

	public void setB101660(boolean b101660) {
		this.b101660 = b101660;
	}

	public boolean isB101661() {
		return b101661;
	}

	public void setB101661(boolean b101661) {
		this.b101661 = b101661;
	}

	public boolean isB101662() {
		return b101662;
	}

	public void setB101662(boolean b101662) {
		this.b101662 = b101662;
	}

	public boolean isB101663() {
		return b101663;
	}

	public void setB101663(boolean b101663) {
		this.b101663 = b101663;
	}

	public boolean isB101664() {
		return b101664;
	}

	public void setB101664(boolean b101664) {
		this.b101664 = b101664;
	}

	public boolean isB101665() {
		return b101665;
	}

	public void setB101665(boolean b101665) {
		this.b101665 = b101665;
	}

	public boolean isB101666() {
		return b101666;
	}

	public void setB101666(boolean b101666) {
		this.b101666 = b101666;
	}

	public boolean isB101667() {
		return b101667;
	}

	public void setB101667(boolean b101667) {
		this.b101667 = b101667;
	}

	public boolean isB101668() {
		return b101668;
	}

	public void setB101668(boolean b101668) {
		this.b101668 = b101668;
	}

	public boolean isB101669() {
		return b101669;
	}

	public void setB101669(boolean b101669) {
		this.b101669 = b101669;
	}

	public boolean isB101670() {
		return b101670;
	}

	public void setB101670(boolean b101670) {
		this.b101670 = b101670;
	}

	public boolean isB101671() {
		return b101671;
	}

	public void setB101671(boolean b101671) {
		this.b101671 = b101671;
	}

	public boolean isB101672() {
		return b101672;
	}

	public void setB101672(boolean b101672) {
		this.b101672 = b101672;
	}

	public boolean isB101673() {
		return b101673;
	}

	public void setB101673(boolean b101673) {
		this.b101673 = b101673;
	}

	public boolean isB101674() {
		return b101674;
	}

	public void setB101674(boolean b101674) {
		this.b101674 = b101674;
	}

	public boolean isB101675() {
		return b101675;
	}

	public void setB101675(boolean b101675) {
		this.b101675 = b101675;
	}

	public boolean isB101676() {
		return b101676;
	}

	public void setB101676(boolean b101676) {
		this.b101676 = b101676;
	}

	public boolean isB101677() {
		return b101677;
	}

	public void setB101677(boolean b101677) {
		this.b101677 = b101677;
	}

	public boolean isB101678() {
		return b101678;
	}

	public void setB101678(boolean b101678) {
		this.b101678 = b101678;
	}

	public boolean isB101679() {
		return b101679;
	}

	public void setB101679(boolean b101679) {
		this.b101679 = b101679;
	}

	public boolean isB101680() {
		return b101680;
	}

	public void setB101680(boolean b101680) {
		this.b101680 = b101680;
	}

	public boolean isB101681() {
		return b101681;
	}

	public void setB101681(boolean b101681) {
		this.b101681 = b101681;
	}

	public boolean isB101682() {
		return b101682;
	}

	public void setB101682(boolean b101682) {
		this.b101682 = b101682;
	}

	public boolean isB101683() {
		return b101683;
	}

	public void setB101683(boolean b101683) {
		this.b101683 = b101683;
	}

	public boolean isB101684() {
		return b101684;
	}

	public void setB101684(boolean b101684) {
		this.b101684 = b101684;
	}

	public Float getC303301() {
		return c303301;
	}

	public void setC303301(Float c303301) {
		this.c303301 = c303301;
	}

	public Float getC303303() {
		return c303303;
	}

	public void setC303303(Float c303303) {
		this.c303303 = c303303;
	}

	public Float getC303309() {
		return c303309;
	}

	public void setC303309(Float c303309) {
		this.c303309 = c303309;
	}

	public Float getC303311() {
		return c303311;
	}

	public void setC303311(Float c303311) {
		this.c303311 = c303311;
	}

	public Float getC303313() {
		return c303313;
	}

	public void setC303313(Float c303313) {
		this.c303313 = c303313;
	}

	public Float getC303315() {
		return c303315;
	}

	public void setC303315(Float c303315) {
		this.c303315 = c303315;
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

	public Float getC303333() {
		return c303333;
	}

	public void setC303333(Float c303333) {
		this.c303333 = c303333;
	}

	public Float getC303353() {
		return c303353;
	}

	public void setC303353(Float c303353) {
		this.c303353 = c303353;
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

	public Float getC301591() {
		return c301591;
	}

	public void setC301591(Float c301591) {
		this.c301591 = c301591;
	}

	public boolean isB101304() {
		return b101304;
	}

	public void setB101304(boolean b101304) {
		this.b101304 = b101304;
	}

	public boolean isB101305() {
		return b101305;
	}

	public void setB101305(boolean b101305) {
		this.b101305 = b101305;
	}

	public Float getC303015() {
		return c303015;
	}

	public void setC303015(Float c303015) {
		this.c303015 = c303015;
	}

	public Float getC303027() {
		return c303027;
	}

	public void setC303027(Float c303027) {
		this.c303027 = c303027;
	}

	public Float getC303029() {
		return c303029;
	}

	public void setC303029(Float c303029) {
		this.c303029 = c303029;
	}

	public Float getC303031() {
		return c303031;
	}

	public void setC303031(Float c303031) {
		this.c303031 = c303031;
	}

	public Float getC303033() {
		return c303033;
	}

	public void setC303033(Float c303033) {
		this.c303033 = c303033;
	}

	public Float getC303035() {
		return c303035;
	}

	public void setC303035(Float c303035) {
		this.c303035 = c303035;
	}

	public Float getC303037() {
		return c303037;
	}

	public void setC303037(Float c303037) {
		this.c303037 = c303037;
	}

	public boolean isB100301() {
		return b100301;
	}

	public void setB100301(boolean b100301) {
		this.b100301 = b100301;
	}

	public boolean isB100302() {
		return b100302;
	}

	public void setB100302(boolean b100302) {
		this.b100302 = b100302;
	}

	public boolean isB100303() {
		return b100303;
	}

	public void setB100303(boolean b100303) {
		this.b100303 = b100303;
	}

	public boolean isB100304() {
		return b100304;
	}

	public void setB100304(boolean b100304) {
		this.b100304 = b100304;
	}

	public boolean isB100305() {
		return b100305;
	}

	public void setB100305(boolean b100305) {
		this.b100305 = b100305;
	}

	public boolean isB100306() {
		return b100306;
	}

	public void setB100306(boolean b100306) {
		this.b100306 = b100306;
	}

	public boolean isB100307() {
		return b100307;
	}

	public void setB100307(boolean b100307) {
		this.b100307 = b100307;
	}

	public boolean isB100308() {
		return b100308;
	}

	public void setB100308(boolean b100308) {
		this.b100308 = b100308;
	}

	public boolean isB100309() {
		return b100309;
	}

	public void setB100309(boolean b100309) {
		this.b100309 = b100309;
	}

	public boolean isB100310() {
		return b100310;
	}

	public void setB100310(boolean b100310) {
		this.b100310 = b100310;
	}

	public boolean isB100311() {
		return b100311;
	}

	public void setB100311(boolean b100311) {
		this.b100311 = b100311;
	}

	public boolean isB100312() {
		return b100312;
	}

	public void setB100312(boolean b100312) {
		this.b100312 = b100312;
	}

	public boolean isB100313() {
		return b100313;
	}

	public void setB100313(boolean b100313) {
		this.b100313 = b100313;
	}

	public boolean isB100314() {
		return b100314;
	}

	public void setB100314(boolean b100314) {
		this.b100314 = b100314;
	}

	public boolean isB100315() {
		return b100315;
	}

	public void setB100315(boolean b100315) {
		this.b100315 = b100315;
	}

	public boolean isB100316() {
		return b100316;
	}

	public void setB100316(boolean b100316) {
		this.b100316 = b100316;
	}

	public boolean isB100317() {
		return b100317;
	}

	public void setB100317(boolean b100317) {
		this.b100317 = b100317;
	}

	public boolean isB100318() {
		return b100318;
	}

	public void setB100318(boolean b100318) {
		this.b100318 = b100318;
	}

	public boolean isB100319() {
		return b100319;
	}

	public void setB100319(boolean b100319) {
		this.b100319 = b100319;
	}

	public boolean isB100320() {
		return b100320;
	}

	public void setB100320(boolean b100320) {
		this.b100320 = b100320;
	}

	public boolean isB100321() {
		return b100321;
	}

	public void setB100321(boolean b100321) {
		this.b100321 = b100321;
	}

	public boolean isB100322() {
		return b100322;
	}

	public void setB100322(boolean b100322) {
		this.b100322 = b100322;
	}

	public boolean isB100323() {
		return b100323;
	}

	public void setB100323(boolean b100323) {
		this.b100323 = b100323;
	}

	public boolean isB100324() {
		return b100324;
	}

	public void setB100324(boolean b100324) {
		this.b100324 = b100324;
	}

	public boolean isB100325() {
		return b100325;
	}

	public void setB100325(boolean b100325) {
		this.b100325 = b100325;
	}

	public boolean isB100326() {
		return b100326;
	}

	public void setB100326(boolean b100326) {
		this.b100326 = b100326;
	}

	public boolean isB100327() {
		return b100327;
	}

	public void setB100327(boolean b100327) {
		this.b100327 = b100327;
	}

	public boolean isB100328() {
		return b100328;
	}

	public void setB100328(boolean b100328) {
		this.b100328 = b100328;
	}

	public boolean isB100329() {
		return b100329;
	}

	public void setB100329(boolean b100329) {
		this.b100329 = b100329;
	}

	public boolean isB100330() {
		return b100330;
	}

	public void setB100330(boolean b100330) {
		this.b100330 = b100330;
	}

	public boolean isB100331() {
		return b100331;
	}

	public void setB100331(boolean b100331) {
		this.b100331 = b100331;
	}

	public boolean isB100332() {
		return b100332;
	}

	public void setB100332(boolean b100332) {
		this.b100332 = b100332;
	}

	public boolean isB100333() {
		return b100333;
	}

	public void setB100333(boolean b100333) {
		this.b100333 = b100333;
	}

	public boolean isB100334() {
		return b100334;
	}

	public void setB100334(boolean b100334) {
		this.b100334 = b100334;
	}

	public boolean isB100335() {
		return b100335;
	}

	public void setB100335(boolean b100335) {
		this.b100335 = b100335;
	}

	public boolean isB100336() {
		return b100336;
	}

	public void setB100336(boolean b100336) {
		this.b100336 = b100336;
	}

	public boolean isB100337() {
		return b100337;
	}

	public void setB100337(boolean b100337) {
		this.b100337 = b100337;
	}

	public boolean isB100338() {
		return b100338;
	}

	public void setB100338(boolean b100338) {
		this.b100338 = b100338;
	}

	public boolean isB100339() {
		return b100339;
	}

	public void setB100339(boolean b100339) {
		this.b100339 = b100339;
	}

	public boolean isB100340() {
		return b100340;
	}

	public void setB100340(boolean b100340) {
		this.b100340 = b100340;
	}

	public boolean isB100341() {
		return b100341;
	}

	public void setB100341(boolean b100341) {
		this.b100341 = b100341;
	}

	public boolean isB100342() {
		return b100342;
	}

	public void setB100342(boolean b100342) {
		this.b100342 = b100342;
	}

	public boolean isB100343() {
		return b100343;
	}

	public void setB100343(boolean b100343) {
		this.b100343 = b100343;
	}

	public boolean isB100344() {
		return b100344;
	}

	public void setB100344(boolean b100344) {
		this.b100344 = b100344;
	}

	public boolean isB100345() {
		return b100345;
	}

	public void setB100345(boolean b100345) {
		this.b100345 = b100345;
	}

	public boolean isB100346() {
		return b100346;
	}

	public void setB100346(boolean b100346) {
		this.b100346 = b100346;
	}

	public boolean isB100347() {
		return b100347;
	}

	public void setB100347(boolean b100347) {
		this.b100347 = b100347;
	}

	public boolean isB100348() {
		return b100348;
	}

	public void setB100348(boolean b100348) {
		this.b100348 = b100348;
	}

	public boolean isB100349() {
		return b100349;
	}

	public void setB100349(boolean b100349) {
		this.b100349 = b100349;
	}

	public boolean isB100350() {
		return b100350;
	}

	public void setB100350(boolean b100350) {
		this.b100350 = b100350;
	}

	public boolean isB100351() {
		return b100351;
	}

	public void setB100351(boolean b100351) {
		this.b100351 = b100351;
	}

	public boolean isB100352() {
		return b100352;
	}

	public void setB100352(boolean b100352) {
		this.b100352 = b100352;
	}

	public boolean isB100353() {
		return b100353;
	}

	public void setB100353(boolean b100353) {
		this.b100353 = b100353;
	}

	public boolean isB100354() {
		return b100354;
	}

	public void setB100354(boolean b100354) {
		this.b100354 = b100354;
	}

	public boolean isB100355() {
		return b100355;
	}

	public void setB100355(boolean b100355) {
		this.b100355 = b100355;
	}

	public boolean isB100356() {
		return b100356;
	}

	public void setB100356(boolean b100356) {
		this.b100356 = b100356;
	}

	public boolean isB100357() {
		return b100357;
	}

	public void setB100357(boolean b100357) {
		this.b100357 = b100357;
	}

	public boolean isB100358() {
		return b100358;
	}

	public void setB100358(boolean b100358) {
		this.b100358 = b100358;
	}

	public boolean isB100359() {
		return b100359;
	}

	public void setB100359(boolean b100359) {
		this.b100359 = b100359;
	}

	public boolean isB100360() {
		return b100360;
	}

	public void setB100360(boolean b100360) {
		this.b100360 = b100360;
	}

	public boolean isB100361() {
		return b100361;
	}

	public void setB100361(boolean b100361) {
		this.b100361 = b100361;
	}

	public boolean isB100362() {
		return b100362;
	}

	public void setB100362(boolean b100362) {
		this.b100362 = b100362;
	}

	public boolean isB100363() {
		return b100363;
	}

	public void setB100363(boolean b100363) {
		this.b100363 = b100363;
	}

	public boolean isB100364() {
		return b100364;
	}

	public void setB100364(boolean b100364) {
		this.b100364 = b100364;
	}

	public boolean isB100365() {
		return b100365;
	}

	public void setB100365(boolean b100365) {
		this.b100365 = b100365;
	}

	public boolean isB100366() {
		return b100366;
	}

	public void setB100366(boolean b100366) {
		this.b100366 = b100366;
	}

	public boolean isB100367() {
		return b100367;
	}

	public void setB100367(boolean b100367) {
		this.b100367 = b100367;
	}

	public boolean isB100368() {
		return b100368;
	}

	public void setB100368(boolean b100368) {
		this.b100368 = b100368;
	}

	public boolean isB100369() {
		return b100369;
	}

	public void setB100369(boolean b100369) {
		this.b100369 = b100369;
	}

	public boolean isB100370() {
		return b100370;
	}

	public void setB100370(boolean b100370) {
		this.b100370 = b100370;
	}

	public boolean isB100371() {
		return b100371;
	}

	public void setB100371(boolean b100371) {
		this.b100371 = b100371;
	}

	public boolean isB100372() {
		return b100372;
	}

	public void setB100372(boolean b100372) {
		this.b100372 = b100372;
	}

	public boolean isB100373() {
		return b100373;
	}

	public void setB100373(boolean b100373) {
		this.b100373 = b100373;
	}

	public boolean isB100374() {
		return b100374;
	}

	public void setB100374(boolean b100374) {
		this.b100374 = b100374;
	}

	public boolean isB100375() {
		return b100375;
	}

	public void setB100375(boolean b100375) {
		this.b100375 = b100375;
	}

	public boolean isB100376() {
		return b100376;
	}

	public void setB100376(boolean b100376) {
		this.b100376 = b100376;
	}

	public boolean isB100377() {
		return b100377;
	}

	public void setB100377(boolean b100377) {
		this.b100377 = b100377;
	}

	public boolean isB100378() {
		return b100378;
	}

	public void setB100378(boolean b100378) {
		this.b100378 = b100378;
	}

	public boolean isB100379() {
		return b100379;
	}

	public void setB100379(boolean b100379) {
		this.b100379 = b100379;
	}

	public boolean isB100380() {
		return b100380;
	}

	public void setB100380(boolean b100380) {
		this.b100380 = b100380;
	}

	public boolean isB100381() {
		return b100381;
	}

	public void setB100381(boolean b100381) {
		this.b100381 = b100381;
	}

	public boolean isB100382() {
		return b100382;
	}

	public void setB100382(boolean b100382) {
		this.b100382 = b100382;
	}

	public boolean isB100383() {
		return b100383;
	}

	public void setB100383(boolean b100383) {
		this.b100383 = b100383;
	}

	public boolean isB100384() {
		return b100384;
	}

	public void setB100384(boolean b100384) {
		this.b100384 = b100384;
	}

	public boolean isB100385() {
		return b100385;
	}

	public void setB100385(boolean b100385) {
		this.b100385 = b100385;
	}

	public boolean isB100386() {
		return b100386;
	}

	public void setB100386(boolean b100386) {
		this.b100386 = b100386;
	}

	public boolean isB100387() {
		return b100387;
	}

	public void setB100387(boolean b100387) {
		this.b100387 = b100387;
	}

	public boolean isB100388() {
		return b100388;
	}

	public void setB100388(boolean b100388) {
		this.b100388 = b100388;
	}

	public boolean isB100389() {
		return b100389;
	}

	public void setB100389(boolean b100389) {
		this.b100389 = b100389;
	}

	public boolean isB100390() {
		return b100390;
	}

	public void setB100390(boolean b100390) {
		this.b100390 = b100390;
	}

	public boolean isB100391() {
		return b100391;
	}

	public void setB100391(boolean b100391) {
		this.b100391 = b100391;
	}

	public boolean isB100392() {
		return b100392;
	}

	public void setB100392(boolean b100392) {
		this.b100392 = b100392;
	}

	public boolean isB100393() {
		return b100393;
	}

	public void setB100393(boolean b100393) {
		this.b100393 = b100393;
	}

	public boolean isB100394() {
		return b100394;
	}

	public void setB100394(boolean b100394) {
		this.b100394 = b100394;
	}

	public boolean isB100395() {
		return b100395;
	}

	public void setB100395(boolean b100395) {
		this.b100395 = b100395;
	}

	public boolean isB100396() {
		return b100396;
	}

	public void setB100396(boolean b100396) {
		this.b100396 = b100396;
	}

	public boolean isB100397() {
		return b100397;
	}

	public void setB100397(boolean b100397) {
		this.b100397 = b100397;
	}

	public boolean isB100398() {
		return b100398;
	}

	public void setB100398(boolean b100398) {
		this.b100398 = b100398;
	}

	public boolean isB100399() {
		return b100399;
	}

	public void setB100399(boolean b100399) {
		this.b100399 = b100399;
	}

	public boolean isB100400() {
		return b100400;
	}

	public void setB100400(boolean b100400) {
		this.b100400 = b100400;
	}

	public boolean isB100401() {
		return b100401;
	}

	public void setB100401(boolean b100401) {
		this.b100401 = b100401;
	}

	public boolean isB100402() {
		return b100402;
	}

	public void setB100402(boolean b100402) {
		this.b100402 = b100402;
	}

	public boolean isB100403() {
		return b100403;
	}

	public void setB100403(boolean b100403) {
		this.b100403 = b100403;
	}

	public boolean isB100404() {
		return b100404;
	}

	public void setB100404(boolean b100404) {
		this.b100404 = b100404;
	}

	public boolean isB100405() {
		return b100405;
	}

	public void setB100405(boolean b100405) {
		this.b100405 = b100405;
	}

	public boolean isB100406() {
		return b100406;
	}

	public void setB100406(boolean b100406) {
		this.b100406 = b100406;
	}

	public boolean isB100407() {
		return b100407;
	}

	public void setB100407(boolean b100407) {
		this.b100407 = b100407;
	}

	public boolean isB100408() {
		return b100408;
	}

	public void setB100408(boolean b100408) {
		this.b100408 = b100408;
	}

	public boolean isB100409() {
		return b100409;
	}

	public void setB100409(boolean b100409) {
		this.b100409 = b100409;
	}

	public boolean isB100410() {
		return b100410;
	}

	public void setB100410(boolean b100410) {
		this.b100410 = b100410;
	}

	public boolean isB100411() {
		return b100411;
	}

	public void setB100411(boolean b100411) {
		this.b100411 = b100411;
	}

	public boolean isB100412() {
		return b100412;
	}

	public void setB100412(boolean b100412) {
		this.b100412 = b100412;
	}

	public boolean isB100413() {
		return b100413;
	}

	public void setB100413(boolean b100413) {
		this.b100413 = b100413;
	}

	public boolean isB100414() {
		return b100414;
	}

	public void setB100414(boolean b100414) {
		this.b100414 = b100414;
	}

	public boolean isB100415() {
		return b100415;
	}

	public void setB100415(boolean b100415) {
		this.b100415 = b100415;
	}

	public boolean isB100416() {
		return b100416;
	}

	public void setB100416(boolean b100416) {
		this.b100416 = b100416;
	}

	public boolean isB100417() {
		return b100417;
	}

	public void setB100417(boolean b100417) {
		this.b100417 = b100417;
	}

	public boolean isB100418() {
		return b100418;
	}

	public void setB100418(boolean b100418) {
		this.b100418 = b100418;
	}

	public boolean isB100419() {
		return b100419;
	}

	public void setB100419(boolean b100419) {
		this.b100419 = b100419;
	}

	public boolean isB100420() {
		return b100420;
	}

	public void setB100420(boolean b100420) {
		this.b100420 = b100420;
	}

	public boolean isB100421() {
		return b100421;
	}

	public void setB100421(boolean b100421) {
		this.b100421 = b100421;
	}

	public boolean isB100422() {
		return b100422;
	}

	public void setB100422(boolean b100422) {
		this.b100422 = b100422;
	}

	public boolean isB100423() {
		return b100423;
	}

	public void setB100423(boolean b100423) {
		this.b100423 = b100423;
	}

	public boolean isB100424() {
		return b100424;
	}

	public void setB100424(boolean b100424) {
		this.b100424 = b100424;
	}

	public boolean isB100425() {
		return b100425;
	}

	public void setB100425(boolean b100425) {
		this.b100425 = b100425;
	}

	public boolean isB100426() {
		return b100426;
	}

	public void setB100426(boolean b100426) {
		this.b100426 = b100426;
	}

	public boolean isB100427() {
		return b100427;
	}

	public void setB100427(boolean b100427) {
		this.b100427 = b100427;
	}

	public boolean isB100428() {
		return b100428;
	}

	public void setB100428(boolean b100428) {
		this.b100428 = b100428;
	}

	public boolean isB100429() {
		return b100429;
	}

	public void setB100429(boolean b100429) {
		this.b100429 = b100429;
	}

	public boolean isB100430() {
		return b100430;
	}

	public void setB100430(boolean b100430) {
		this.b100430 = b100430;
	}

	public boolean isB100431() {
		return b100431;
	}

	public void setB100431(boolean b100431) {
		this.b100431 = b100431;
	}

	public boolean isB100432() {
		return b100432;
	}

	public void setB100432(boolean b100432) {
		this.b100432 = b100432;
	}

	public boolean isB100433() {
		return b100433;
	}

	public void setB100433(boolean b100433) {
		this.b100433 = b100433;
	}

	public boolean isB100434() {
		return b100434;
	}

	public void setB100434(boolean b100434) {
		this.b100434 = b100434;
	}

	public boolean isB100435() {
		return b100435;
	}

	public void setB100435(boolean b100435) {
		this.b100435 = b100435;
	}

	public boolean isB100436() {
		return b100436;
	}

	public void setB100436(boolean b100436) {
		this.b100436 = b100436;
	}

	public boolean isB100437() {
		return b100437;
	}

	public void setB100437(boolean b100437) {
		this.b100437 = b100437;
	}

	public boolean isB100438() {
		return b100438;
	}

	public void setB100438(boolean b100438) {
		this.b100438 = b100438;
	}

	public boolean isB100439() {
		return b100439;
	}

	public void setB100439(boolean b100439) {
		this.b100439 = b100439;
	}

	public boolean isB100440() {
		return b100440;
	}

	public void setB100440(boolean b100440) {
		this.b100440 = b100440;
	}

	public boolean isB100441() {
		return b100441;
	}

	public void setB100441(boolean b100441) {
		this.b100441 = b100441;
	}

	public boolean isB100442() {
		return b100442;
	}

	public void setB100442(boolean b100442) {
		this.b100442 = b100442;
	}

	public boolean isB100443() {
		return b100443;
	}

	public void setB100443(boolean b100443) {
		this.b100443 = b100443;
	}

	public boolean isB100444() {
		return b100444;
	}

	public void setB100444(boolean b100444) {
		this.b100444 = b100444;
	}

	public boolean isB100445() {
		return b100445;
	}

	public void setB100445(boolean b100445) {
		this.b100445 = b100445;
	}

	public boolean isB100446() {
		return b100446;
	}

	public void setB100446(boolean b100446) {
		this.b100446 = b100446;
	}

	public boolean isB100447() {
		return b100447;
	}

	public void setB100447(boolean b100447) {
		this.b100447 = b100447;
	}

	public boolean isB100448() {
		return b100448;
	}

	public void setB100448(boolean b100448) {
		this.b100448 = b100448;
	}

	public boolean isB100449() {
		return b100449;
	}

	public void setB100449(boolean b100449) {
		this.b100449 = b100449;
	}

	public boolean isB100450() {
		return b100450;
	}

	public void setB100450(boolean b100450) {
		this.b100450 = b100450;
	}

	public boolean isB100451() {
		return b100451;
	}

	public void setB100451(boolean b100451) {
		this.b100451 = b100451;
	}

	public boolean isB100452() {
		return b100452;
	}

	public void setB100452(boolean b100452) {
		this.b100452 = b100452;
	}

	public boolean isB100453() {
		return b100453;
	}

	public void setB100453(boolean b100453) {
		this.b100453 = b100453;
	}

	public boolean isB100454() {
		return b100454;
	}

	public void setB100454(boolean b100454) {
		this.b100454 = b100454;
	}

	public boolean isB100455() {
		return b100455;
	}

	public void setB100455(boolean b100455) {
		this.b100455 = b100455;
	}

	public boolean isB100456() {
		return b100456;
	}

	public void setB100456(boolean b100456) {
		this.b100456 = b100456;
	}

	public boolean isB100457() {
		return b100457;
	}

	public void setB100457(boolean b100457) {
		this.b100457 = b100457;
	}

	public boolean isB100458() {
		return b100458;
	}

	public void setB100458(boolean b100458) {
		this.b100458 = b100458;
	}

	public boolean isB100459() {
		return b100459;
	}

	public void setB100459(boolean b100459) {
		this.b100459 = b100459;
	}

	public boolean isB100460() {
		return b100460;
	}

	public void setB100460(boolean b100460) {
		this.b100460 = b100460;
	}

	public boolean isB100461() {
		return b100461;
	}

	public void setB100461(boolean b100461) {
		this.b100461 = b100461;
	}

	public boolean isB100462() {
		return b100462;
	}

	public void setB100462(boolean b100462) {
		this.b100462 = b100462;
	}

	public boolean isB100463() {
		return b100463;
	}

	public void setB100463(boolean b100463) {
		this.b100463 = b100463;
	}

	public boolean isB100464() {
		return b100464;
	}

	public void setB100464(boolean b100464) {
		this.b100464 = b100464;
	}

	public boolean isB100465() {
		return b100465;
	}

	public void setB100465(boolean b100465) {
		this.b100465 = b100465;
	}

	public boolean isB100466() {
		return b100466;
	}

	public void setB100466(boolean b100466) {
		this.b100466 = b100466;
	}

	public boolean isB100467() {
		return b100467;
	}

	public void setB100467(boolean b100467) {
		this.b100467 = b100467;
	}

	public boolean isB100468() {
		return b100468;
	}

	public void setB100468(boolean b100468) {
		this.b100468 = b100468;
	}

	public boolean isB100469() {
		return b100469;
	}

	public void setB100469(boolean b100469) {
		this.b100469 = b100469;
	}

	public boolean isB100474() {
		return b100474;
	}

	public void setB100474(boolean b100474) {
		this.b100474 = b100474;
	}

	public boolean isB100475() {
		return b100475;
	}

	public void setB100475(boolean b100475) {
		this.b100475 = b100475;
	}

	public boolean isB100476() {
		return b100476;
	}

	public void setB100476(boolean b100476) {
		this.b100476 = b100476;
	}

	public boolean isB100477() {
		return b100477;
	}

	public void setB100477(boolean b100477) {
		this.b100477 = b100477;
	}

	public boolean isB100478() {
		return b100478;
	}

	public void setB100478(boolean b100478) {
		this.b100478 = b100478;
	}

	public boolean isB100600() {
		return b100600;
	}

	public void setB100600(boolean b100600) {
		this.b100600 = b100600;
	}

	public boolean isB100601() {
		return b100601;
	}

	public void setB100601(boolean b100601) {
		this.b100601 = b100601;
	}

	public boolean isB100602() {
		return b100602;
	}

	public void setB100602(boolean b100602) {
		this.b100602 = b100602;
	}

	public boolean isB100603() {
		return b100603;
	}

	public void setB100603(boolean b100603) {
		this.b100603 = b100603;
	}

	public boolean isB100604() {
		return b100604;
	}

	public void setB100604(boolean b100604) {
		this.b100604 = b100604;
	}

	public boolean isB100605() {
		return b100605;
	}

	public void setB100605(boolean b100605) {
		this.b100605 = b100605;
	}

	public boolean isB100606() {
		return b100606;
	}

	public void setB100606(boolean b100606) {
		this.b100606 = b100606;
	}

	public boolean isB100607() {
		return b100607;
	}

	public void setB100607(boolean b100607) {
		this.b100607 = b100607;
	}

	public boolean isB100608() {
		return b100608;
	}

	public void setB100608(boolean b100608) {
		this.b100608 = b100608;
	}

	public boolean isB100609() {
		return b100609;
	}

	public void setB100609(boolean b100609) {
		this.b100609 = b100609;
	}

	public boolean isB100610() {
		return b100610;
	}

	public void setB100610(boolean b100610) {
		this.b100610 = b100610;
	}

	public boolean isB100611() {
		return b100611;
	}

	public void setB100611(boolean b100611) {
		this.b100611 = b100611;
	}

	public boolean isB100612() {
		return b100612;
	}

	public void setB100612(boolean b100612) {
		this.b100612 = b100612;
	}

	public boolean isB100613() {
		return b100613;
	}

	public void setB100613(boolean b100613) {
		this.b100613 = b100613;
	}

	public boolean isB100614() {
		return b100614;
	}

	public void setB100614(boolean b100614) {
		this.b100614 = b100614;
	}

	public boolean isB100615() {
		return b100615;
	}

	public void setB100615(boolean b100615) {
		this.b100615 = b100615;
	}

	public boolean isB100616() {
		return b100616;
	}

	public void setB100616(boolean b100616) {
		this.b100616 = b100616;
	}

	public boolean isB100617() {
		return b100617;
	}

	public void setB100617(boolean b100617) {
		this.b100617 = b100617;
	}

	public boolean isB100618() {
		return b100618;
	}

	public void setB100618(boolean b100618) {
		this.b100618 = b100618;
	}

	public boolean isB100619() {
		return b100619;
	}

	public void setB100619(boolean b100619) {
		this.b100619 = b100619;
	}

	public boolean isB100620() {
		return b100620;
	}

	public void setB100620(boolean b100620) {
		this.b100620 = b100620;
	}

	public boolean isB100621() {
		return b100621;
	}

	public void setB100621(boolean b100621) {
		this.b100621 = b100621;
	}

	public boolean isB100622() {
		return b100622;
	}

	public void setB100622(boolean b100622) {
		this.b100622 = b100622;
	}

	public boolean isB100623() {
		return b100623;
	}

	public void setB100623(boolean b100623) {
		this.b100623 = b100623;
	}

	public boolean isB100624() {
		return b100624;
	}

	public void setB100624(boolean b100624) {
		this.b100624 = b100624;
	}

	public boolean isB100625() {
		return b100625;
	}

	public void setB100625(boolean b100625) {
		this.b100625 = b100625;
	}

	public boolean isB100626() {
		return b100626;
	}

	public void setB100626(boolean b100626) {
		this.b100626 = b100626;
	}

	public boolean isB100627() {
		return b100627;
	}

	public void setB100627(boolean b100627) {
		this.b100627 = b100627;
	}

	public boolean isB100628() {
		return b100628;
	}

	public void setB100628(boolean b100628) {
		this.b100628 = b100628;
	}

	public boolean isB100629() {
		return b100629;
	}

	public void setB100629(boolean b100629) {
		this.b100629 = b100629;
	}

	public boolean isB100630() {
		return b100630;
	}

	public void setB100630(boolean b100630) {
		this.b100630 = b100630;
	}

	public boolean isB100631() {
		return b100631;
	}

	public void setB100631(boolean b100631) {
		this.b100631 = b100631;
	}

	public boolean isB100632() {
		return b100632;
	}

	public void setB100632(boolean b100632) {
		this.b100632 = b100632;
	}

	public boolean isB100633() {
		return b100633;
	}

	public void setB100633(boolean b100633) {
		this.b100633 = b100633;
	}

	public boolean isB100634() {
		return b100634;
	}

	public void setB100634(boolean b100634) {
		this.b100634 = b100634;
	}

	public boolean isB100635() {
		return b100635;
	}

	public void setB100635(boolean b100635) {
		this.b100635 = b100635;
	}

	public boolean isB100636() {
		return b100636;
	}

	public void setB100636(boolean b100636) {
		this.b100636 = b100636;
	}

	public boolean isB100637() {
		return b100637;
	}

	public void setB100637(boolean b100637) {
		this.b100637 = b100637;
	}

	public boolean isB100638() {
		return b100638;
	}

	public void setB100638(boolean b100638) {
		this.b100638 = b100638;
	}

	public boolean isB100639() {
		return b100639;
	}

	public void setB100639(boolean b100639) {
		this.b100639 = b100639;
	}

	public boolean isB100640() {
		return b100640;
	}

	public void setB100640(boolean b100640) {
		this.b100640 = b100640;
	}

	public boolean isB100641() {
		return b100641;
	}

	public void setB100641(boolean b100641) {
		this.b100641 = b100641;
	}

	public boolean isB100642() {
		return b100642;
	}

	public void setB100642(boolean b100642) {
		this.b100642 = b100642;
	}

	public boolean isB100643() {
		return b100643;
	}

	public void setB100643(boolean b100643) {
		this.b100643 = b100643;
	}

	public boolean isB100644() {
		return b100644;
	}

	public void setB100644(boolean b100644) {
		this.b100644 = b100644;
	}

	public boolean isB100645() {
		return b100645;
	}

	public void setB100645(boolean b100645) {
		this.b100645 = b100645;
	}

	public boolean isB100646() {
		return b100646;
	}

	public void setB100646(boolean b100646) {
		this.b100646 = b100646;
	}

	public boolean isB100647() {
		return b100647;
	}

	public void setB100647(boolean b100647) {
		this.b100647 = b100647;
	}

	public boolean isB100648() {
		return b100648;
	}

	public void setB100648(boolean b100648) {
		this.b100648 = b100648;
	}

	public boolean isB100649() {
		return b100649;
	}

	public void setB100649(boolean b100649) {
		this.b100649 = b100649;
	}

	public boolean isB100650() {
		return b100650;
	}

	public void setB100650(boolean b100650) {
		this.b100650 = b100650;
	}

	public boolean isB100651() {
		return b100651;
	}

	public void setB100651(boolean b100651) {
		this.b100651 = b100651;
	}

	public boolean isB100652() {
		return b100652;
	}

	public void setB100652(boolean b100652) {
		this.b100652 = b100652;
	}

	public boolean isB100653() {
		return b100653;
	}

	public void setB100653(boolean b100653) {
		this.b100653 = b100653;
	}

	public boolean isB100654() {
		return b100654;
	}

	public void setB100654(boolean b100654) {
		this.b100654 = b100654;
	}

	public boolean isB100655() {
		return b100655;
	}

	public void setB100655(boolean b100655) {
		this.b100655 = b100655;
	}

	public boolean isB100656() {
		return b100656;
	}

	public void setB100656(boolean b100656) {
		this.b100656 = b100656;
	}

	public boolean isB100657() {
		return b100657;
	}

	public void setB100657(boolean b100657) {
		this.b100657 = b100657;
	}

	public boolean isB100658() {
		return b100658;
	}

	public void setB100658(boolean b100658) {
		this.b100658 = b100658;
	}

	public boolean isB100659() {
		return b100659;
	}

	public void setB100659(boolean b100659) {
		this.b100659 = b100659;
	}

	public boolean isB100660() {
		return b100660;
	}

	public void setB100660(boolean b100660) {
		this.b100660 = b100660;
	}

	public boolean isB100661() {
		return b100661;
	}

	public void setB100661(boolean b100661) {
		this.b100661 = b100661;
	}

	public boolean isB100662() {
		return b100662;
	}

	public void setB100662(boolean b100662) {
		this.b100662 = b100662;
	}

	public boolean isB100663() {
		return b100663;
	}

	public void setB100663(boolean b100663) {
		this.b100663 = b100663;
	}

	public boolean isB100664() {
		return b100664;
	}

	public void setB100664(boolean b100664) {
		this.b100664 = b100664;
	}

	public boolean isB100665() {
		return b100665;
	}

	public void setB100665(boolean b100665) {
		this.b100665 = b100665;
	}

	public boolean isB100666() {
		return b100666;
	}

	public void setB100666(boolean b100666) {
		this.b100666 = b100666;
	}

	public boolean isB100667() {
		return b100667;
	}

	public void setB100667(boolean b100667) {
		this.b100667 = b100667;
	}

	public boolean isB100668() {
		return b100668;
	}

	public void setB100668(boolean b100668) {
		this.b100668 = b100668;
	}

	public boolean isB100669() {
		return b100669;
	}

	public void setB100669(boolean b100669) {
		this.b100669 = b100669;
	}

	public boolean isB100670() {
		return b100670;
	}

	public void setB100670(boolean b100670) {
		this.b100670 = b100670;
	}

	public boolean isB100671() {
		return b100671;
	}

	public void setB100671(boolean b100671) {
		this.b100671 = b100671;
	}

	public boolean isB100672() {
		return b100672;
	}

	public void setB100672(boolean b100672) {
		this.b100672 = b100672;
	}

	public boolean isB100673() {
		return b100673;
	}

	public void setB100673(boolean b100673) {
		this.b100673 = b100673;
	}

	public boolean isB100674() {
		return b100674;
	}

	public void setB100674(boolean b100674) {
		this.b100674 = b100674;
	}

	public boolean isB100675() {
		return b100675;
	}

	public void setB100675(boolean b100675) {
		this.b100675 = b100675;
	}

	public boolean isB100676() {
		return b100676;
	}

	public void setB100676(boolean b100676) {
		this.b100676 = b100676;
	}

	public boolean isB100677() {
		return b100677;
	}

	public void setB100677(boolean b100677) {
		this.b100677 = b100677;
	}

	public boolean isB100678() {
		return b100678;
	}

	public void setB100678(boolean b100678) {
		this.b100678 = b100678;
	}

	public boolean isB100679() {
		return b100679;
	}

	public void setB100679(boolean b100679) {
		this.b100679 = b100679;
	}

	public boolean isB100680() {
		return b100680;
	}

	public void setB100680(boolean b100680) {
		this.b100680 = b100680;
	}

	public boolean isB100681() {
		return b100681;
	}

	public void setB100681(boolean b100681) {
		this.b100681 = b100681;
	}

	public boolean isB100682() {
		return b100682;
	}

	public void setB100682(boolean b100682) {
		this.b100682 = b100682;
	}

	public boolean isB100683() {
		return b100683;
	}

	public void setB100683(boolean b100683) {
		this.b100683 = b100683;
	}

	public boolean isB100684() {
		return b100684;
	}

	public void setB100684(boolean b100684) {
		this.b100684 = b100684;
	}

	public boolean isB100685() {
		return b100685;
	}

	public void setB100685(boolean b100685) {
		this.b100685 = b100685;
	}

	public boolean isB100686() {
		return b100686;
	}

	public void setB100686(boolean b100686) {
		this.b100686 = b100686;
	}

	public boolean isB100687() {
		return b100687;
	}

	public void setB100687(boolean b100687) {
		this.b100687 = b100687;
	}

	public boolean isB100688() {
		return b100688;
	}

	public void setB100688(boolean b100688) {
		this.b100688 = b100688;
	}

	public boolean isB100689() {
		return b100689;
	}

	public void setB100689(boolean b100689) {
		this.b100689 = b100689;
	}

	public boolean isB100690() {
		return b100690;
	}

	public void setB100690(boolean b100690) {
		this.b100690 = b100690;
	}

	public boolean isB100691() {
		return b100691;
	}

	public void setB100691(boolean b100691) {
		this.b100691 = b100691;
	}

	public boolean isB100692() {
		return b100692;
	}

	public void setB100692(boolean b100692) {
		this.b100692 = b100692;
	}

	public boolean isB100693() {
		return b100693;
	}

	public void setB100693(boolean b100693) {
		this.b100693 = b100693;
	}

	public boolean isB100694() {
		return b100694;
	}

	public void setB100694(boolean b100694) {
		this.b100694 = b100694;
	}

	public boolean isB100695() {
		return b100695;
	}

	public void setB100695(boolean b100695) {
		this.b100695 = b100695;
	}

	public boolean isB100696() {
		return b100696;
	}

	public void setB100696(boolean b100696) {
		this.b100696 = b100696;
	}

	public boolean isB100697() {
		return b100697;
	}

	public void setB100697(boolean b100697) {
		this.b100697 = b100697;
	}

	public boolean isB100698() {
		return b100698;
	}

	public void setB100698(boolean b100698) {
		this.b100698 = b100698;
	}

	public boolean isB100699() {
		return b100699;
	}

	public void setB100699(boolean b100699) {
		this.b100699 = b100699;
	}

	public boolean isB100700() {
		return b100700;
	}

	public void setB100700(boolean b100700) {
		this.b100700 = b100700;
	}

	public boolean isB100701() {
		return b100701;
	}

	public void setB100701(boolean b100701) {
		this.b100701 = b100701;
	}

	public boolean isB100702() {
		return b100702;
	}

	public void setB100702(boolean b100702) {
		this.b100702 = b100702;
	}

	public boolean isB100703() {
		return b100703;
	}

	public void setB100703(boolean b100703) {
		this.b100703 = b100703;
	}

	public boolean isB100704() {
		return b100704;
	}

	public void setB100704(boolean b100704) {
		this.b100704 = b100704;
	}

	public boolean isB100705() {
		return b100705;
	}

	public void setB100705(boolean b100705) {
		this.b100705 = b100705;
	}

	public boolean isB100706() {
		return b100706;
	}

	public void setB100706(boolean b100706) {
		this.b100706 = b100706;
	}

	public boolean isB100707() {
		return b100707;
	}

	public void setB100707(boolean b100707) {
		this.b100707 = b100707;
	}

	public boolean isB100708() {
		return b100708;
	}

	public void setB100708(boolean b100708) {
		this.b100708 = b100708;
	}

	public boolean isB100709() {
		return b100709;
	}

	public void setB100709(boolean b100709) {
		this.b100709 = b100709;
	}

	public boolean isB100710() {
		return b100710;
	}

	public void setB100710(boolean b100710) {
		this.b100710 = b100710;
	}

	public boolean isB100711() {
		return b100711;
	}

	public void setB100711(boolean b100711) {
		this.b100711 = b100711;
	}

	public boolean isB100712() {
		return b100712;
	}

	public void setB100712(boolean b100712) {
		this.b100712 = b100712;
	}

	public boolean isB100713() {
		return b100713;
	}

	public void setB100713(boolean b100713) {
		this.b100713 = b100713;
	}

	public boolean isB100714() {
		return b100714;
	}

	public void setB100714(boolean b100714) {
		this.b100714 = b100714;
	}

	public boolean isB100715() {
		return b100715;
	}

	public void setB100715(boolean b100715) {
		this.b100715 = b100715;
	}

	public boolean isB100716() {
		return b100716;
	}

	public void setB100716(boolean b100716) {
		this.b100716 = b100716;
	}

	public boolean isB100717() {
		return b100717;
	}

	public void setB100717(boolean b100717) {
		this.b100717 = b100717;
	}

	public boolean isB100718() {
		return b100718;
	}

	public void setB100718(boolean b100718) {
		this.b100718 = b100718;
	}

	public boolean isB100719() {
		return b100719;
	}

	public void setB100719(boolean b100719) {
		this.b100719 = b100719;
	}

	public boolean isB100720() {
		return b100720;
	}

	public void setB100720(boolean b100720) {
		this.b100720 = b100720;
	}

	public boolean isB100721() {
		return b100721;
	}

	public void setB100721(boolean b100721) {
		this.b100721 = b100721;
	}

	public boolean isB100722() {
		return b100722;
	}

	public void setB100722(boolean b100722) {
		this.b100722 = b100722;
	}

	public boolean isB100723() {
		return b100723;
	}

	public void setB100723(boolean b100723) {
		this.b100723 = b100723;
	}

	public boolean isB100724() {
		return b100724;
	}

	public void setB100724(boolean b100724) {
		this.b100724 = b100724;
	}

	public boolean isB100725() {
		return b100725;
	}

	public void setB100725(boolean b100725) {
		this.b100725 = b100725;
	}

	public boolean isB100726() {
		return b100726;
	}

	public void setB100726(boolean b100726) {
		this.b100726 = b100726;
	}

	public boolean isB100727() {
		return b100727;
	}

	public void setB100727(boolean b100727) {
		this.b100727 = b100727;
	}

	public boolean isB100728() {
		return b100728;
	}

	public void setB100728(boolean b100728) {
		this.b100728 = b100728;
	}

	public boolean isB100729() {
		return b100729;
	}

	public void setB100729(boolean b100729) {
		this.b100729 = b100729;
	}

	public boolean isB100730() {
		return b100730;
	}

	public void setB100730(boolean b100730) {
		this.b100730 = b100730;
	}

	public boolean isB100731() {
		return b100731;
	}

	public void setB100731(boolean b100731) {
		this.b100731 = b100731;
	}

	public boolean isB100732() {
		return b100732;
	}

	public void setB100732(boolean b100732) {
		this.b100732 = b100732;
	}

	public boolean isB100733() {
		return b100733;
	}

	public void setB100733(boolean b100733) {
		this.b100733 = b100733;
	}

	public boolean isB100734() {
		return b100734;
	}

	public void setB100734(boolean b100734) {
		this.b100734 = b100734;
	}

	public boolean isB100735() {
		return b100735;
	}

	public void setB100735(boolean b100735) {
		this.b100735 = b100735;
	}

	public boolean isB100736() {
		return b100736;
	}

	public void setB100736(boolean b100736) {
		this.b100736 = b100736;
	}

	public boolean isB100737() {
		return b100737;
	}

	public void setB100737(boolean b100737) {
		this.b100737 = b100737;
	}

	public boolean isB100738() {
		return b100738;
	}

	public void setB100738(boolean b100738) {
		this.b100738 = b100738;
	}

	public boolean isB100739() {
		return b100739;
	}

	public void setB100739(boolean b100739) {
		this.b100739 = b100739;
	}

	public boolean isB100740() {
		return b100740;
	}

	public void setB100740(boolean b100740) {
		this.b100740 = b100740;
	}

	public boolean isB100741() {
		return b100741;
	}

	public void setB100741(boolean b100741) {
		this.b100741 = b100741;
	}

	public boolean isB100742() {
		return b100742;
	}

	public void setB100742(boolean b100742) {
		this.b100742 = b100742;
	}

	public boolean isB100743() {
		return b100743;
	}

	public void setB100743(boolean b100743) {
		this.b100743 = b100743;
	}

	public boolean isB100824() {
		return b100824;
	}

	public void setB100824(boolean b100824) {
		this.b100824 = b100824;
	}

	public boolean isB100825() {
		return b100825;
	}

	public void setB100825(boolean b100825) {
		this.b100825 = b100825;
	}

	public boolean isB100826() {
		return b100826;
	}

	public void setB100826(boolean b100826) {
		this.b100826 = b100826;
	}

	public boolean isB100827() {
		return b100827;
	}

	public void setB100827(boolean b100827) {
		this.b100827 = b100827;
	}

	public boolean isB100828() {
		return b100828;
	}

	public void setB100828(boolean b100828) {
		this.b100828 = b100828;
	}

	public boolean isB100829() {
		return b100829;
	}

	public void setB100829(boolean b100829) {
		this.b100829 = b100829;
	}

	public boolean isB100830() {
		return b100830;
	}

	public void setB100830(boolean b100830) {
		this.b100830 = b100830;
	}

	public boolean isB100831() {
		return b100831;
	}

	public void setB100831(boolean b100831) {
		this.b100831 = b100831;
	}

	public boolean isB100832() {
		return b100832;
	}

	public void setB100832(boolean b100832) {
		this.b100832 = b100832;
	}

	public boolean isB100833() {
		return b100833;
	}

	public void setB100833(boolean b100833) {
		this.b100833 = b100833;
	}

	public boolean isB100834() {
		return b100834;
	}

	public void setB100834(boolean b100834) {
		this.b100834 = b100834;
	}

	public boolean isB100835() {
		return b100835;
	}

	public void setB100835(boolean b100835) {
		this.b100835 = b100835;
	}

	public boolean isB100836() {
		return b100836;
	}

	public void setB100836(boolean b100836) {
		this.b100836 = b100836;
	}

	public boolean isB100837() {
		return b100837;
	}

	public void setB100837(boolean b100837) {
		this.b100837 = b100837;
	}

	public boolean isB100046() {
		return b100046;
	}

	public void setB100046(boolean b100046) {
		this.b100046 = b100046;
	}

	public boolean isB100047() {
		return b100047;
	}

	public void setB100047(boolean b100047) {
		this.b100047 = b100047;
	}

	public boolean isB100048() {
		return b100048;
	}

	public void setB100048(boolean b100048) {
		this.b100048 = b100048;
	}

	public boolean isB100066() {
		return b100066;
	}

	public void setB100066(boolean b100066) {
		this.b100066 = b100066;
	}

	public boolean isB100112() {
		return b100112;
	}

	public void setB100112(boolean b100112) {
		this.b100112 = b100112;
	}

	public boolean isB100113() {
		return b100113;
	}

	public void setB100113(boolean b100113) {
		this.b100113 = b100113;
	}

	public boolean isB100115() {
		return b100115;
	}

	public void setB100115(boolean b100115) {
		this.b100115 = b100115;
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
}

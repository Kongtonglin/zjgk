
package com.zjgk.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserResult extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

  
	private User user;
	private Date changeDate;
	private String result01;
	private String result02;
	private String result03;
	private String result04;
	private String result05;
	private String result06;
	private String result07;
	private String result08;
	private String result09;
	private String result10;
	private String result11;
	private String result12;
	private String result13;
	private String result14;
	private String result15;
	private String result16;
	private String result17;
	private String result18;
	private String result19;
	private String result20;
	private String result21;
	private String result22;
	private String result23;
	private String result24;
	private String result25;
	private String result26;
	private String result27;
	private String result28;
	private String result29;
	private String result30;
	private String result31;
	private String result32;
	private String result33;
	private String result34;
	private String result35;
	private String result36;
	private String result37;
	private String result38;
	private String result39;
	private String result40;
	private String result41;
	private String result42;
	private String result43;
	private String result44;
	private String result45;
	private String result46;
	private String result47;
	private String result48;
	private String result49;
	private String result50;
	private String result51;
	private String result52;
	private String result53;
	private String result54;
	private String result55;
	private String result56;
	private String result57;
	private String result58;
	private String result59;
	private String result60;
	private String result61;
	private String result62;
	private String result63;
	private String result64;
	private String result65;
	private String result66;
	private String result67;
	private String result68;
	private String result69;
	private String result70;
	private String result71;
	private String result72;
	private String result73;
	private String result74;
	private String result75;
	private String result76;
	private String result77;
	private String result78;
	private String result79;
	private String result80;

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", insertable = true, updatable = true)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Date getChangeDate() {
		return changeDate;
	}
	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}
	public String getResult01() {
		return result01;
	}
	public void setResult01(String result01) {
		this.result01 = result01;
	}
	public String getResult02() {
		return result02;
	}
	public void setResult02(String result02) {
		this.result02 = result02;
	}
	public String getResult03() {
		return result03;
	}
	public void setResult03(String result03) {
		this.result03 = result03;
	}
	public String getResult04() {
		return result04;
	}
	public void setResult04(String result04) {
		this.result04 = result04;
	}
	public String getResult05() {
		return result05;
	}
	public void setResult05(String result05) {
		this.result05 = result05;
	}
	public String getResult06() {
		return result06;
	}
	public void setResult06(String result06) {
		this.result06 = result06;
	}
	public String getResult07() {
		return result07;
	}
	public void setResult07(String result07) {
		this.result07 = result07;
	}
	public String getResult08() {
		return result08;
	}
	public void setResult08(String result08) {
		this.result08 = result08;
	}
	public String getResult09() {
		return result09;
	}
	public void setResult09(String result09) {
		this.result09 = result09;
	}
	public String getResult10() {
		return result10;
	}
	public void setResult10(String result10) {
		this.result10 = result10;
	}
	public String getResult11() {
		return result11;
	}
	public void setResult11(String result11) {
		this.result11 = result11;
	}
	public String getResult12() {
		return result12;
	}
	public void setResult12(String result12) {
		this.result12 = result12;
	}
	public String getResult13() {
		return result13;
	}
	public void setResult13(String result13) {
		this.result13 = result13;
	}
	public String getResult14() {
		return result14;
	}
	public void setResult14(String result14) {
		this.result14 = result14;
	}
	public String getResult15() {
		return result15;
	}
	public void setResult15(String result15) {
		this.result15 = result15;
	}
	public String getResult16() {
		return result16;
	}
	public void setResult16(String result16) {
		this.result16 = result16;
	}
	public String getResult17() {
		return result17;
	}
	public void setResult17(String result17) {
		this.result17 = result17;
	}
	public String getResult18() {
		return result18;
	}
	public void setResult18(String result18) {
		this.result18 = result18;
	}
	public String getResult19() {
		return result19;
	}
	public void setResult19(String result19) {
		this.result19 = result19;
	}
	public String getResult20() {
		return result20;
	}
	public void setResult20(String result20) {
		this.result20 = result20;
	}
	public String getResult21() {
		return result21;
	}
	public void setResult21(String result21) {
		this.result21 = result21;
	}
	public String getResult22() {
		return result22;
	}
	public void setResult22(String result22) {
		this.result22 = result22;
	}
	public String getResult23() {
		return result23;
	}
	public void setResult23(String result23) {
		this.result23 = result23;
	}
	public String getResult24() {
		return result24;
	}
	public void setResult24(String result24) {
		this.result24 = result24;
	}
	public String getResult25() {
		return result25;
	}
	public void setResult25(String result25) {
		this.result25 = result25;
	}
	public String getResult26() {
		return result26;
	}
	public void setResult26(String result26) {
		this.result26 = result26;
	}
	public String getResult27() {
		return result27;
	}
	public void setResult27(String result27) {
		this.result27 = result27;
	}
	public String getResult28() {
		return result28;
	}
	public void setResult28(String result28) {
		this.result28 = result28;
	}
	public String getResult29() {
		return result29;
	}
	public void setResult29(String result29) {
		this.result29 = result29;
	}
	public String getResult30() {
		return result30;
	}
	public void setResult30(String result30) {
		this.result30 = result30;
	}
	public String getResult31() {
		return result31;
	}
	public void setResult31(String result31) {
		this.result31 = result31;
	}
	public String getResult32() {
		return result32;
	}
	public void setResult32(String result32) {
		this.result32 = result32;
	}
	public String getResult33() {
		return result33;
	}
	public void setResult33(String result33) {
		this.result33 = result33;
	}
	public String getResult34() {
		return result34;
	}
	public void setResult34(String result34) {
		this.result34 = result34;
	}
	public String getResult35() {
		return result35;
	}
	public void setResult35(String result35) {
		this.result35 = result35;
	}
	public String getResult36() {
		return result36;
	}
	public void setResult36(String result36) {
		this.result36 = result36;
	}
	public String getResult37() {
		return result37;
	}
	public void setResult37(String result37) {
		this.result37 = result37;
	}
	public String getResult38() {
		return result38;
	}
	public void setResult38(String result38) {
		this.result38 = result38;
	}
	public String getResult39() {
		return result39;
	}
	public void setResult39(String result39) {
		this.result39 = result39;
	}
	public String getResult40() {
		return result40;
	}
	public void setResult40(String result40) {
		this.result40 = result40;
	}
	public String getResult41() {
		return result41;
	}
	public void setResult41(String result41) {
		this.result41 = result41;
	}
	public String getResult42() {
		return result42;
	}
	public void setResult42(String result42) {
		this.result42 = result42;
	}
	public String getResult43() {
		return result43;
	}
	public void setResult43(String result43) {
		this.result43 = result43;
	}
	public String getResult44() {
		return result44;
	}
	public void setResult44(String result44) {
		this.result44 = result44;
	}
	public String getResult45() {
		return result45;
	}
	public void setResult45(String result45) {
		this.result45 = result45;
	}
	public String getResult46() {
		return result46;
	}
	public void setResult46(String result46) {
		this.result46 = result46;
	}
	public String getResult47() {
		return result47;
	}
	public void setResult47(String result47) {
		this.result47 = result47;
	}
	public String getResult48() {
		return result48;
	}
	public void setResult48(String result48) {
		this.result48 = result48;
	}
	public String getResult49() {
		return result49;
	}
	public void setResult49(String result49) {
		this.result49 = result49;
	}
	public String getResult50() {
		return result50;
	}
	public void setResult50(String result50) {
		this.result50 = result50;
	}
	public String getResult51() {
		return result51;
	}
	public void setResult51(String result51) {
		this.result51 = result51;
	}
	public String getResult52() {
		return result52;
	}
	public void setResult52(String result52) {
		this.result52 = result52;
	}
	public String getResult53() {
		return result53;
	}
	public void setResult53(String result53) {
		this.result53 = result53;
	}
	public String getResult54() {
		return result54;
	}
	public void setResult54(String result54) {
		this.result54 = result54;
	}
	public String getResult55() {
		return result55;
	}
	public void setResult55(String result55) {
		this.result55 = result55;
	}
	public String getResult56() {
		return result56;
	}
	public void setResult56(String result56) {
		this.result56 = result56;
	}
	public String getResult57() {
		return result57;
	}
	public void setResult57(String result57) {
		this.result57 = result57;
	}
	public String getResult58() {
		return result58;
	}
	public void setResult58(String result58) {
		this.result58 = result58;
	}
	public String getResult59() {
		return result59;
	}
	public void setResult59(String result59) {
		this.result59 = result59;
	}
	public String getResult60() {
		return result60;
	}
	public void setResult60(String result60) {
		this.result60 = result60;
	}
	public String getResult61() {
		return result61;
	}
	public void setResult61(String result61) {
		this.result61 = result61;
	}
	public String getResult62() {
		return result62;
	}
	public void setResult62(String result62) {
		this.result62 = result62;
	}
	public String getResult63() {
		return result63;
	}
	public void setResult63(String result63) {
		this.result63 = result63;
	}
	public String getResult64() {
		return result64;
	}
	public void setResult64(String result64) {
		this.result64 = result64;
	}
	public String getResult65() {
		return result65;
	}
	public void setResult65(String result65) {
		this.result65 = result65;
	}
	public String getResult66() {
		return result66;
	}
	public void setResult66(String result66) {
		this.result66 = result66;
	}
	public String getResult67() {
		return result67;
	}
	public void setResult67(String result67) {
		this.result67 = result67;
	}
	public String getResult68() {
		return result68;
	}
	public void setResult68(String result68) {
		this.result68 = result68;
	}
	public String getResult69() {
		return result69;
	}
	public void setResult69(String result69) {
		this.result69 = result69;
	}
	public String getResult70() {
		return result70;
	}
	public void setResult70(String result70) {
		this.result70 = result70;
	}
	public String getResult71() {
		return result71;
	}
	public void setResult71(String result71) {
		this.result71 = result71;
	}
	public String getResult72() {
		return result72;
	}
	public void setResult72(String result72) {
		this.result72 = result72;
	}
	public String getResult73() {
		return result73;
	}
	public void setResult73(String result73) {
		this.result73 = result73;
	}
	public String getResult74() {
		return result74;
	}
	public void setResult74(String result74) {
		this.result74 = result74;
	}
	public String getResult75() {
		return result75;
	}
	public void setResult75(String result75) {
		this.result75 = result75;
	}
	public String getResult76() {
		return result76;
	}
	public void setResult76(String result76) {
		this.result76 = result76;
	}
	public String getResult77() {
		return result77;
	}
	public void setResult77(String result77) {
		this.result77 = result77;
	}
	public String getResult78() {
		return result78;
	}
	public void setResult78(String result78) {
		this.result78 = result78;
	}
	public String getResult79() {
		return result79;
	}
	public void setResult79(String result79) {
		this.result79 = result79;
	}
	public String getResult80() {
		return result80;
	}
	public void setResult80(String result80) {
		this.result80 = result80;
	}


}

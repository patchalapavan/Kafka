package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;


@CsvRecord (separator = "\\|")
public class ApplicationVo {
	
	
	@DataField(pos=1)
	private String APPLICATION_ID;
	@DataField(pos=2)
	private String REFERENCE_ID;
	@DataField(pos=3)
	private String REQUESTED_PRODUCT_TYPE_CODE;
	@DataField(pos=4)
	private String REQUESTED_SUBPRODUCT_TYPE_CODE;
	@DataField(pos=5)
	private String REQUESTED_PROMO_TYPE_CODE;
	@DataField(pos=6)
	private String SOURCE_CHANNEL_TYPE_CODE;
	@DataField(pos=7)
	private String EXTERNAL_TRACKING_CODE;
	@DataField(pos=8)
	private String SOURCE_IP;
	@DataField(pos=9)
	private String ORIGINATION_DTTM;
	@DataField(pos=10)
	private int TERMS_ACCEPTANCE_RESPONSE;
	@DataField(pos=11)
	private String TERMS_ACCEPTANCE_DTTM;
	@DataField(pos=12)
	private String CURRENT_DECISION_ID;
	@DataField(pos=13)
	private String CURRENT_QUEUE_TYPE_CODE;
	@DataField(pos=14)
	private String CURRENT_DECISION_STATUS_TYPE_CODE;
	@DataField(pos=15)
	private String APPLICATION_STATUS_TYPE_CODE;
	@DataField(pos=16)
	private String CHNG_DTTM;
	@DataField(pos=17)
	private String CHECKED_OUT_USER_ID;
	@DataField(pos=18)
	private String INSRT_TS;
	@DataField(pos=19)
	private String CHNG_TS;
	@DataField(pos=20)
	private String INSRT_USR_ID;
	@DataField(pos=21)
	private String CHNG_USR_ID;
	@DataField(pos=22)
	private int ACTIVE_FLAG;
	@DataField(pos=23)
	private int BEST_GUEST_MATCH_FLAG;
	@DataField(pos=24)
	private String TRIPS_090_DAYS;
	@DataField(pos=25)
	private String TRIPS_180_DAYS;
	@DataField(pos=26)
	private String TRIPS_270_DAYS;
	@DataField(pos=27)
	private String TRIPS_360_DAYS;
	@DataField(pos=28)
	private String SOURCE_CODE;
	@DataField(pos=29)
	private String IP_ADDRESS;
	@DataField(pos=30)
	private int FUND_TRANSFER_AUTHORIZE;
	@DataField(pos=31)
	private int ELECTRONIC_CONSENT;
	@DataField(pos=32)
	private int CARD_AGREEMENT;
	@DataField(pos=33)
	private int PRIVACY_POLICY;
	@DataField(pos=34)
	private int MESSAGE_VERSION_NUMBER;
	@DataField(pos=35)
	private String SOLICITATION_STORE_NUMBER;
	@DataField(pos=36)
	private String RINGING_STORE_NUMBER;
	@DataField(pos=37)
	private String SOLICITATION_TEAM_MEMBER;
	@DataField(pos=38)
	private String RINGING_TEAM_MEMBER;
	@DataField(pos=39)
	private int PRIVATE_LABEL_ONLY;
	@DataField(pos=40)
	private int CO_BRAND_ONLY;
	@DataField(pos=41)
	private String TERMS_VERSION;
	@DataField(pos=42)
	private int APR_TYPE;
	@DataField(pos=43)
	private String POS_BASKET_SIZE;
	@DataField(pos=44)
	private String PRE_APPROVED_ID;
	@DataField(pos=45)
	private String PRE_APPROVED_CODE;
	@DataField(pos=46)
	private String SOLICITATION_OFFER;
	@DataField(pos=47)
	private int PIN_SELECTED;
	@DataField(pos=48)
	private String WEB_DATA_1;
	@DataField(pos=49)
	private String WEB_DATA_2;
	@DataField(pos=50)
	private String WEB_DATA_3;
	@DataField(pos=51)
	private String WEB_DATA_4;
	@DataField(pos=52)
	private String WEB_DATA_5;
	
	
	
	public int getAPR_TYPE() {
		return APR_TYPE;
	}
	public void setAPR_TYPE(int aPR_TYPE) {
		APR_TYPE = aPR_TYPE;
	}
	public String getPOS_BASKET_SIZE() {
		return POS_BASKET_SIZE;
	}
	public void setPOS_BASKET_SIZE(String pOS_BASKET_SIZE) {
		POS_BASKET_SIZE = pOS_BASKET_SIZE;
	}
	public String getPRE_APPROVED_ID() {
		return PRE_APPROVED_ID;
	}
	public void setPRE_APPROVED_ID(String pRE_APPROVED_ID) {
		PRE_APPROVED_ID = pRE_APPROVED_ID;
	}
	public String getPRE_APPROVED_CODE() {
		return PRE_APPROVED_CODE;
	}
	public void setPRE_APPROVED_CODE(String pRE_APPROVED_CODE) {
		PRE_APPROVED_CODE = pRE_APPROVED_CODE;
	}
	public String getSOLICITATION_OFFER() {
		return SOLICITATION_OFFER;
	}
	public void setSOLICITATION_OFFER(String sOLICITATION_OFFER) {
		SOLICITATION_OFFER = sOLICITATION_OFFER;
	}
	public int getPIN_SELECTED() {
		return PIN_SELECTED;
	}
	public void setPIN_SELECTED(int pIN_SELECTED) {
		PIN_SELECTED = pIN_SELECTED;
	}
	public String getWEB_DATA_1() {
		return WEB_DATA_1;
	}
	public void setWEB_DATA_1(String wEB_DATA_1) {
		WEB_DATA_1 = wEB_DATA_1;
	}
	public String getWEB_DATA_2() {
		return WEB_DATA_2;
	}
	public void setWEB_DATA_2(String wEB_DATA_2) {
		WEB_DATA_2 = wEB_DATA_2;
	}
	public String getWEB_DATA_3() {
		return WEB_DATA_3;
	}
	public void setWEB_DATA_3(String wEB_DATA_3) {
		WEB_DATA_3 = wEB_DATA_3;
	}
	public String getWEB_DATA_4() {
		return WEB_DATA_4;
	}
	public void setWEB_DATA_4(String wEB_DATA_4) {
		WEB_DATA_4 = wEB_DATA_4;
	}
	public String getWEB_DATA_5() {
		return WEB_DATA_5;
	}
	public void setWEB_DATA_5(String wEB_DATA_5) {
		WEB_DATA_5 = wEB_DATA_5;
	}
	
	public String getTERMS_VERSION() {
		return TERMS_VERSION;
	}
	public void setTERMS_VERSION(String tERMS_VERSION) {
		TERMS_VERSION = tERMS_VERSION;
	}
	

	public String getAPPLICATION_ID() {
		return APPLICATION_ID;
	}
	public void setAPPLICATION_ID(String aPPLICATION_ID) {
		APPLICATION_ID = aPPLICATION_ID;
	}
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}
	public String getREQUESTED_PRODUCT_TYPE_CODE() {
		return REQUESTED_PRODUCT_TYPE_CODE;
	}
	public void setREQUESTED_PRODUCT_TYPE_CODE(String rEQUESTED_PRODUCT_TYPE_CODE) {
		REQUESTED_PRODUCT_TYPE_CODE = rEQUESTED_PRODUCT_TYPE_CODE;
	}
	public String getREQUESTED_SUBPRODUCT_TYPE_CODE() {
		return REQUESTED_SUBPRODUCT_TYPE_CODE;
	}
	public void setREQUESTED_SUBPRODUCT_TYPE_CODE(String rEQUESTED_SUBPRODUCT_TYPE_CODE) {
		REQUESTED_SUBPRODUCT_TYPE_CODE = rEQUESTED_SUBPRODUCT_TYPE_CODE;
	}
	public String getREQUESTED_PROMO_TYPE_CODE() {
		return REQUESTED_PROMO_TYPE_CODE;
	}
	public void setREQUESTED_PROMO_TYPE_CODE(String rEQUESTED_PROMO_TYPE_CODE) {
		REQUESTED_PROMO_TYPE_CODE = rEQUESTED_PROMO_TYPE_CODE;
	}
	public String getSOURCE_CHANNEL_TYPE_CODE() {
		return SOURCE_CHANNEL_TYPE_CODE;
	}
	public void setSOURCE_CHANNEL_TYPE_CODE(String sOURCE_CHANNEL_TYPE_CODE) {
		SOURCE_CHANNEL_TYPE_CODE = sOURCE_CHANNEL_TYPE_CODE;
	}
	public String getEXTERNAL_TRACKING_CODE() {
		return EXTERNAL_TRACKING_CODE;
	}
	public void setEXTERNAL_TRACKING_CODE(String eXTERNAL_TRACKING_CODE) {
		EXTERNAL_TRACKING_CODE = eXTERNAL_TRACKING_CODE;
	}
	public String getSOURCE_IP() {
		return SOURCE_IP;
	}
	public void setSOURCE_IP(String sOURCE_IP) {
		SOURCE_IP = sOURCE_IP;
	}
	
	public int getTERMS_ACCEPTANCE_RESPONSE() {
		return TERMS_ACCEPTANCE_RESPONSE;
	}
	public void setTERMS_ACCEPTANCE_RESPONSE(int tERMS_ACCEPTANCE_RESPONSE) {
		TERMS_ACCEPTANCE_RESPONSE = tERMS_ACCEPTANCE_RESPONSE;
	}
	
	public String getCURRENT_DECISION_ID() {
		return CURRENT_DECISION_ID;
	}
	public void setCURRENT_DECISION_ID(String cURRENT_DECISION_ID) {
		CURRENT_DECISION_ID = cURRENT_DECISION_ID;
	}
	public String getCURRENT_QUEUE_TYPE_CODE() {
		return CURRENT_QUEUE_TYPE_CODE;
	}
	public void setCURRENT_QUEUE_TYPE_CODE(String cURRENT_QUEUE_TYPE_CODE) {
		CURRENT_QUEUE_TYPE_CODE = cURRENT_QUEUE_TYPE_CODE;
	}
	public String getCURRENT_DECISION_STATUS_TYPE_CODE() {
		return CURRENT_DECISION_STATUS_TYPE_CODE;
	}
	public void setCURRENT_DECISION_STATUS_TYPE_CODE(String cURRENT_DECISION_STATUS_TYPE_CODE) {
		CURRENT_DECISION_STATUS_TYPE_CODE = cURRENT_DECISION_STATUS_TYPE_CODE;
	}
	public String getAPPLICATION_STATUS_TYPE_CODE() {
		return APPLICATION_STATUS_TYPE_CODE;
	}
	public void setAPPLICATION_STATUS_TYPE_CODE(String aPPLICATION_STATUS_TYPE_CODE) {
		APPLICATION_STATUS_TYPE_CODE = aPPLICATION_STATUS_TYPE_CODE;
	}
	
	public String getCHECKED_OUT_USER_ID() {
		return CHECKED_OUT_USER_ID;
	}
	public void setCHECKED_OUT_USER_ID(String cHECKED_OUT_USER_ID) {
		CHECKED_OUT_USER_ID = cHECKED_OUT_USER_ID;
	}
	
	public String getINSRT_USR_ID() {
		return INSRT_USR_ID;
	}
	public void setINSRT_USR_ID(String iNSRT_USR_ID) {
		INSRT_USR_ID = iNSRT_USR_ID;
	}
	public String getCHNG_USR_ID() {
		return CHNG_USR_ID;
	}
	public void setCHNG_USR_ID(String cHNG_USR_ID) {
		CHNG_USR_ID = cHNG_USR_ID;
	}
	public int getACTIVE_FLAG() {
		return ACTIVE_FLAG;
	}
	public void setACTIVE_FLAG(int aCTIVE_FLAG) {
		ACTIVE_FLAG = aCTIVE_FLAG;
	}
	public int getBEST_GUEST_MATCH_FLAG() {
		return BEST_GUEST_MATCH_FLAG;
	}
	public void setBEST_GUEST_MATCH_FLAG(int bEST_GUEST_MATCH_FLAG) {
		BEST_GUEST_MATCH_FLAG = bEST_GUEST_MATCH_FLAG;
	}
	public String getTRIPS_090_DAYS() {
		return TRIPS_090_DAYS;
	}
	public void setTRIPS_090_DAYS(String tRIPS_090_DAYS) {
		TRIPS_090_DAYS = tRIPS_090_DAYS;
	}
	public String getTRIPS_180_DAYS() {
		return TRIPS_180_DAYS;
	}
	public void setTRIPS_180_DAYS(String tRIPS_180_DAYS) {
		TRIPS_180_DAYS = tRIPS_180_DAYS;
	}
	public String getTRIPS_270_DAYS() {
		return TRIPS_270_DAYS;
	}
	public void setTRIPS_270_DAYS(String tRIPS_270_DAYS) {
		TRIPS_270_DAYS = tRIPS_270_DAYS;
	}
	public String getTRIPS_360_DAYS() {
		return TRIPS_360_DAYS;
	}
	public void setTRIPS_360_DAYS(String tRIPS_360_DAYS) {
		TRIPS_360_DAYS = tRIPS_360_DAYS;
	}
	public String getSOURCE_CODE() {
		return SOURCE_CODE;
	}
	public void setSOURCE_CODE(String sOURCE_CODE) {
		SOURCE_CODE = sOURCE_CODE;
	}
	public String getIP_ADDRESS() {
		return IP_ADDRESS;
	}
	public void setIP_ADDRESS(String iP_ADDRESS) {
		IP_ADDRESS = iP_ADDRESS;
	}
	public int getFUND_TRANSFER_AUTHORIZE() {
		return FUND_TRANSFER_AUTHORIZE;
	}
	public void setFUND_TRANSFER_AUTHORIZE(int fUND_TRANSFER_AUTHORIZE) {
		FUND_TRANSFER_AUTHORIZE = fUND_TRANSFER_AUTHORIZE;
	}
	public int getELECTRONIC_CONSENT() {
		return ELECTRONIC_CONSENT;
	}
	public void setELECTRONIC_CONSENT(int eLECTRONIC_CONSENT) {
		ELECTRONIC_CONSENT = eLECTRONIC_CONSENT;
	}
	public int getCARD_AGREEMENT() {
		return CARD_AGREEMENT;
	}
	public void setCARD_AGREEMENT(int cARD_AGREEMENT) {
		CARD_AGREEMENT = cARD_AGREEMENT;
	}
	public int getPRIVACY_POLICY() {
		return PRIVACY_POLICY;
	}
	public void setPRIVACY_POLICY(int pRIVACY_POLICY) {
		PRIVACY_POLICY = pRIVACY_POLICY;
	}
	public int getMESSAGE_VERSION_NUMBER() {
		return MESSAGE_VERSION_NUMBER;
	}
	public void setMESSAGE_VERSION_NUMBER(int mESSAGE_VERSION_NUMBER) {
		MESSAGE_VERSION_NUMBER = mESSAGE_VERSION_NUMBER;
	}
	public String getSOLICITATION_STORE_NUMBER() {
		return SOLICITATION_STORE_NUMBER;
	}
	public void setSOLICITATION_STORE_NUMBER(String sOLICITATION_STORE_NUMBER) {
		SOLICITATION_STORE_NUMBER = sOLICITATION_STORE_NUMBER;
	}
	public String getRINGING_STORE_NUMBER() {
		return RINGING_STORE_NUMBER;
	}
	public void setRINGING_STORE_NUMBER(String rINGING_STORE_NUMBER) {
		RINGING_STORE_NUMBER = rINGING_STORE_NUMBER;
	}
	public String getSOLICITATION_TEAM_MEMBER() {
		return SOLICITATION_TEAM_MEMBER;
	}
	public void setSOLICITATION_TEAM_MEMBER(String sOLICITATION_TEAM_MEMBER) {
		SOLICITATION_TEAM_MEMBER = sOLICITATION_TEAM_MEMBER;
	}
	public String getRINGING_TEAM_MEMBER() {
		return RINGING_TEAM_MEMBER;
	}
	public void setRINGING_TEAM_MEMBER(String rINGING_TEAM_MEMBER) {
		RINGING_TEAM_MEMBER = rINGING_TEAM_MEMBER;
	}
	public int getPRIVATE_LABEL_ONLY() {
		return PRIVATE_LABEL_ONLY;
	}
	public void setPRIVATE_LABEL_ONLY(int pRIVATE_LABEL_ONLY) {
		PRIVATE_LABEL_ONLY = pRIVATE_LABEL_ONLY;
	}

	public int getCO_BRAND_ONLY() {
		return CO_BRAND_ONLY;
	}
	public void setCO_BRAND_ONLY(int cO_BRAND_ONLY) {
		CO_BRAND_ONLY = cO_BRAND_ONLY;
	}
	public String getORIGINATION_DTTM() {
		return ORIGINATION_DTTM;
	}
	public void setORIGINATION_DTTM(String oRIGINATION_DTTM) {
		ORIGINATION_DTTM = oRIGINATION_DTTM;
	}
	public String getTERMS_ACCEPTANCE_DTTM() {
		return TERMS_ACCEPTANCE_DTTM;
	}
	public void setTERMS_ACCEPTANCE_DTTM(String tERMS_ACCEPTANCE_DTTM) {
		TERMS_ACCEPTANCE_DTTM = tERMS_ACCEPTANCE_DTTM;
	}
	public String getCHNG_DTTM() {
		return CHNG_DTTM;
	}
	public void setCHNG_DTTM(String cHNG_DTTM) {
		CHNG_DTTM = cHNG_DTTM;
	}
	public String getINSRT_TS() {
		return INSRT_TS;
	}
	public void setINSRT_TS(String iNSRT_TS) {
		INSRT_TS = iNSRT_TS;
	}
	public String getCHNG_TS() {
		return CHNG_TS;
	}
	public void setCHNG_TS(String cHNG_TS) {
		CHNG_TS = cHNG_TS;
	}
	

}

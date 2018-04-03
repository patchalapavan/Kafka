package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord (separator = "\\|")
public class OfferVo {
	
	@DataField(pos=1)
	private String OFFER_ID;
	@DataField(pos=2)
	private String DECISION_ID;
	@DataField(pos=3)
	private String OFFER_TYPE_CODE;
	@DataField(pos=4)
	private String PRODUCT_TYPE_CODE;
	@DataField(pos=5)
	private String SUB_PRODUCT_TYPE_CODE;
	@DataField(pos=6)
	private String PROMO_TYPE_CODE;
	@DataField(pos=7)
	private String OFFER_STATUS_TYPE_CODE;
	@DataField(pos=8)
	private String AMOUNT;
	@DataField(pos=9)
	private String RATE;
	@DataField(pos=10)
	private String ACCOUNT_NBR_ASSIGNED;
	@DataField(pos=11)
	private String ACCOUNT_EXPIRATION_DATE;
	@DataField(pos=12)
	private String ACCOUNT_PIN_NBR_ASSIGNED;
	@DataField(pos=13)
	private int ACCEPTED_OFFER_FLAG;
	@DataField(pos=14)
	private String INSRT_TS;
	@DataField(pos=15)
	private String CHNG_TS;
	@DataField(pos=16)
	private String INSRT_USR_ID;
	@DataField(pos=17)
	private String CHNG_USR_ID;
	@DataField(pos=18)
	private int ACTIVE_FLAG;
	@DataField(pos=19)
	private String TYSYS_ACCOUNT_ID;
	@DataField(pos=20)
	private String BOOKING_DATE_TIME;
	@DataField(pos=21)
	private String TEMPORARY_CREDIT_LIMIT;
	@DataField(pos=22)
	private String TEMPORARY_LIMIT_EXPIRY_DATE;
	@DataField(pos=23)
	private String ONLINE_PROMOTION_CODE;
	@DataField(pos=24)
	private String JOINT_AUTHORIZED_BUYER_FLAG;
	@DataField(pos=25)
	private String AUTO_PAY_ENROLLMENT;
	@DataField(pos=26)
	private String AUTO_PAY_METHOD;
	@DataField(pos=27)
	private String AUTO_PAY_ACCOUNT;
	@DataField(pos=28)
	private String AUTO_PAY_OPTION;
	@DataField(pos=29)
	private String ACE_OPTION_SET;
	@DataField(pos=30)
	private String ASSIGNED_DISCLOSURE_GROUP;
	@DataField(pos=31)
	private String ASSIGNED_PURCHASE_APR;
	@DataField(pos=32)
	private String ASSIGNED_PURCHASE_DIV_PAYOUT_RATIO;
	@DataField(pos=33)
	private String ASSIGNED_PENALTY_APR;
	@DataField(pos=34)
	private String ASSIGNED_PENALTY_DIV_PAYOUT_RATIO;
	@DataField(pos=35)
	private String ASSIGNED_CASH_APR;
	@DataField(pos=36)
	private String ASSIGNED_CASH_DIV_PAYOUT_RATIO;
	@DataField(pos=37)
	private String ASSIGNED_PURCHASE_MARGIN;
	@DataField(pos=38)
	private String ASSIGNED_PENALTY_MARGIN;
	@DataField(pos=39)
	private String ASSIGNED_CASH_MARGIN;
	@DataField(pos=40)
	private String PROMOTIONAL_DISCLOSURE_GROUP;
	@DataField(pos=41)
	private String ACQUISITION_STRATEGY;
	@DataField(pos=42)
	private String MICR_RATING_ASSIGNMENT;
	@DataField(pos=43)
	private String REFERENCE_ID;
	public String getOFFER_ID() {
		return OFFER_ID;
	}
	public void setOFFER_ID(String oFFER_ID) {
		OFFER_ID = oFFER_ID;
	}
	public String getDECISION_ID() {
		return DECISION_ID;
	}
	public void setDECISION_ID(String dECISION_ID) {
		DECISION_ID = dECISION_ID;
	}
	public String getOFFER_TYPE_CODE() {
		return OFFER_TYPE_CODE;
	}
	public void setOFFER_TYPE_CODE(String oFFER_TYPE_CODE) {
		OFFER_TYPE_CODE = oFFER_TYPE_CODE;
	}
	public String getPRODUCT_TYPE_CODE() {
		return PRODUCT_TYPE_CODE;
	}
	public void setPRODUCT_TYPE_CODE(String pRODUCT_TYPE_CODE) {
		PRODUCT_TYPE_CODE = pRODUCT_TYPE_CODE;
	}
	public String getSUB_PRODUCT_TYPE_CODE() {
		return SUB_PRODUCT_TYPE_CODE;
	}
	public void setSUB_PRODUCT_TYPE_CODE(String sUB_PRODUCT_TYPE_CODE) {
		SUB_PRODUCT_TYPE_CODE = sUB_PRODUCT_TYPE_CODE;
	}
	public String getPROMO_TYPE_CODE() {
		return PROMO_TYPE_CODE;
	}
	public void setPROMO_TYPE_CODE(String pROMO_TYPE_CODE) {
		PROMO_TYPE_CODE = pROMO_TYPE_CODE;
	}
	public String getOFFER_STATUS_TYPE_CODE() {
		return OFFER_STATUS_TYPE_CODE;
	}
	public void setOFFER_STATUS_TYPE_CODE(String oFFER_STATUS_TYPE_CODE) {
		OFFER_STATUS_TYPE_CODE = oFFER_STATUS_TYPE_CODE;
	}
	public String getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(String aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public String getRATE() {
		return RATE;
	}
	public void setRATE(String rATE) {
		RATE = rATE;
	}
	public int getACCEPTED_OFFER_FLAG() {
		return ACCEPTED_OFFER_FLAG;
	}
	public void setACCEPTED_OFFER_FLAG(int aCCEPTED_OFFER_FLAG) {
		ACCEPTED_OFFER_FLAG = aCCEPTED_OFFER_FLAG;
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
	public String getTYSYS_ACCOUNT_ID() {
		return TYSYS_ACCOUNT_ID;
	}
	public void setTYSYS_ACCOUNT_ID(String tYSYS_ACCOUNT_ID) {
		TYSYS_ACCOUNT_ID = tYSYS_ACCOUNT_ID;
	}
	public String getBOOKING_DATE_TIME() {
		return BOOKING_DATE_TIME;
	}
	public void setBOOKING_DATE_TIME(String bOOKING_DATE_TIME) {
		BOOKING_DATE_TIME = bOOKING_DATE_TIME;
	}
	public String getTEMPORARY_CREDIT_LIMIT() {
		return TEMPORARY_CREDIT_LIMIT;
	}
	public void setTEMPORARY_CREDIT_LIMIT(String tEMPORARY_CREDIT_LIMIT) {
		TEMPORARY_CREDIT_LIMIT = tEMPORARY_CREDIT_LIMIT;
	}
	public String getTEMPORARY_LIMIT_EXPIRY_DATE() {
		return TEMPORARY_LIMIT_EXPIRY_DATE;
	}
	public void setTEMPORARY_LIMIT_EXPIRY_DATE(String tEMPORARY_LIMIT_EXPIRY_DATE) {
		TEMPORARY_LIMIT_EXPIRY_DATE = tEMPORARY_LIMIT_EXPIRY_DATE;
	}
	public String getONLINE_PROMOTION_CODE() {
		return ONLINE_PROMOTION_CODE;
	}
	public void setONLINE_PROMOTION_CODE(String oNLINE_PROMOTION_CODE) {
		ONLINE_PROMOTION_CODE = oNLINE_PROMOTION_CODE;
	}
	public String getJOINT_AUTHORIZED_BUYER_FLAG() {
		return JOINT_AUTHORIZED_BUYER_FLAG;
	}
	public void setJOINT_AUTHORIZED_BUYER_FLAG(String jOINT_AUTHORIZED_BUYER_FLAG) {
		JOINT_AUTHORIZED_BUYER_FLAG = jOINT_AUTHORIZED_BUYER_FLAG;
	}
	public String getAUTO_PAY_ENROLLMENT() {
		return AUTO_PAY_ENROLLMENT;
	}
	public void setAUTO_PAY_ENROLLMENT(String aUTO_PAY_ENROLLMENT) {
		AUTO_PAY_ENROLLMENT = aUTO_PAY_ENROLLMENT;
	}
	public String getAUTO_PAY_METHOD() {
		return AUTO_PAY_METHOD;
	}
	public void setAUTO_PAY_METHOD(String aUTO_PAY_METHOD) {
		AUTO_PAY_METHOD = aUTO_PAY_METHOD;
	}
	public String getAUTO_PAY_ACCOUNT() {
		return AUTO_PAY_ACCOUNT;
	}
	public void setAUTO_PAY_ACCOUNT(String aUTO_PAY_ACCOUNT) {
		AUTO_PAY_ACCOUNT = aUTO_PAY_ACCOUNT;
	}
	public String getAUTO_PAY_OPTION() {
		return AUTO_PAY_OPTION;
	}
	public void setAUTO_PAY_OPTION(String aUTO_PAY_OPTION) {
		AUTO_PAY_OPTION = aUTO_PAY_OPTION;
	}
	public String getACE_OPTION_SET() {
		return ACE_OPTION_SET;
	}
	public void setACE_OPTION_SET(String aCE_OPTION_SET) {
		ACE_OPTION_SET = aCE_OPTION_SET;
	}
	public String getASSIGNED_DISCLOSURE_GROUP() {
		return ASSIGNED_DISCLOSURE_GROUP;
	}
	public void setASSIGNED_DISCLOSURE_GROUP(String aSSIGNED_DISCLOSURE_GROUP) {
		ASSIGNED_DISCLOSURE_GROUP = aSSIGNED_DISCLOSURE_GROUP;
	}
	public String getASSIGNED_PURCHASE_APR() {
		return ASSIGNED_PURCHASE_APR;
	}
	public void setASSIGNED_PURCHASE_APR(String aSSIGNED_PURCHASE_APR) {
		ASSIGNED_PURCHASE_APR = aSSIGNED_PURCHASE_APR;
	}
	public String getASSIGNED_PURCHASE_DIV_PAYOUT_RATIO() {
		return ASSIGNED_PURCHASE_DIV_PAYOUT_RATIO;
	}
	public void setASSIGNED_PURCHASE_DIV_PAYOUT_RATIO(String aSSIGNED_PURCHASE_DIV_PAYOUT_RATIO) {
		ASSIGNED_PURCHASE_DIV_PAYOUT_RATIO = aSSIGNED_PURCHASE_DIV_PAYOUT_RATIO;
	}
	public String getASSIGNED_PENALTY_APR() {
		return ASSIGNED_PENALTY_APR;
	}
	public void setASSIGNED_PENALTY_APR(String aSSIGNED_PENALTY_APR) {
		ASSIGNED_PENALTY_APR = aSSIGNED_PENALTY_APR;
	}
	public String getASSIGNED_PENALTY_DIV_PAYOUT_RATIO() {
		return ASSIGNED_PENALTY_DIV_PAYOUT_RATIO;
	}
	public void setASSIGNED_PENALTY_DIV_PAYOUT_RATIO(String aSSIGNED_PENALTY_DIV_PAYOUT_RATIO) {
		ASSIGNED_PENALTY_DIV_PAYOUT_RATIO = aSSIGNED_PENALTY_DIV_PAYOUT_RATIO;
	}
	public String getASSIGNED_CASH_APR() {
		return ASSIGNED_CASH_APR;
	}
	public void setASSIGNED_CASH_APR(String aSSIGNED_CASH_APR) {
		ASSIGNED_CASH_APR = aSSIGNED_CASH_APR;
	}
	public String getASSIGNED_CASH_DIV_PAYOUT_RATIO() {
		return ASSIGNED_CASH_DIV_PAYOUT_RATIO;
	}
	public void setASSIGNED_CASH_DIV_PAYOUT_RATIO(String aSSIGNED_CASH_DIV_PAYOUT_RATIO) {
		ASSIGNED_CASH_DIV_PAYOUT_RATIO = aSSIGNED_CASH_DIV_PAYOUT_RATIO;
	}
	public String getASSIGNED_PURCHASE_MARGIN() {
		return ASSIGNED_PURCHASE_MARGIN;
	}
	public void setASSIGNED_PURCHASE_MARGIN(String aSSIGNED_PURCHASE_MARGIN) {
		ASSIGNED_PURCHASE_MARGIN = aSSIGNED_PURCHASE_MARGIN;
	}
	public String getASSIGNED_PENALTY_MARGIN() {
		return ASSIGNED_PENALTY_MARGIN;
	}
	public void setASSIGNED_PENALTY_MARGIN(String aSSIGNED_PENALTY_MARGIN) {
		ASSIGNED_PENALTY_MARGIN = aSSIGNED_PENALTY_MARGIN;
	}
	public String getASSIGNED_CASH_MARGIN() {
		return ASSIGNED_CASH_MARGIN;
	}
	public void setASSIGNED_CASH_MARGIN(String aSSIGNED_CASH_MARGIN) {
		ASSIGNED_CASH_MARGIN = aSSIGNED_CASH_MARGIN;
	}
	public String getPROMOTIONAL_DISCLOSURE_GROUP() {
		return PROMOTIONAL_DISCLOSURE_GROUP;
	}
	public void setPROMOTIONAL_DISCLOSURE_GROUP(String pROMOTIONAL_DISCLOSURE_GROUP) {
		PROMOTIONAL_DISCLOSURE_GROUP = pROMOTIONAL_DISCLOSURE_GROUP;
	}
	public String getACQUISITION_STRATEGY() {
		return ACQUISITION_STRATEGY;
	}
	public void setACQUISITION_STRATEGY(String aCQUISITION_STRATEGY) {
		ACQUISITION_STRATEGY = aCQUISITION_STRATEGY;
	}
	public String getMICR_RATING_ASSIGNMENT() {
		return MICR_RATING_ASSIGNMENT;
	}
	public void setMICR_RATING_ASSIGNMENT(String mICR_RATING_ASSIGNMENT) {
		MICR_RATING_ASSIGNMENT = mICR_RATING_ASSIGNMENT;
	}
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}

	
	
	
	}

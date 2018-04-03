package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class LegalEntityVo {
	
	@DataField(pos=1)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=2)
	private String APPLICATION_ID;
	@DataField(pos=3)
	private String LEGAL_ENTITY_TYPE_CD;
	@DataField(pos=4)
	private String FIRST_NAME;
	@DataField(pos=5)
	private String MIDDLE_NAME;
	@DataField(pos=6)
	private String LAST_NAME;
	@DataField(pos=7)
	private String SUFFIX_TYPE_CODE;
	@DataField(pos=8)
	private String BIRTH_DATE;
	@DataField(pos=9)
	private String TAX_ID;
	@DataField(pos=10)
	private String PRIMARY_EMAIL_ADDRESS;
	@DataField(pos=11)
	private String PRIMARY_PHONE_NUMBER;
	@DataField(pos=12)
	private int ENTITY_ORDER;
	@DataField(pos=13)
	private String EMPLOYMENT_STATUS_TYPE_CODE;
	@DataField(pos=14)
	private String EMPLOYER_NAME;
	@DataField(pos=15)
	private String ANNUAL_INCOME;
	@DataField(pos=16)
	private String HOUSING_STATUS_TYPE_CODE;
	@DataField(pos=17)
	private String MONTHLY_HOUSING_PAYMENT;
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
	private String KYC_VERIFICATION_VENDOR;
	@DataField(pos=24)
	private String KYC_VERIFICATION_STATUS;
	@DataField(pos=25)
	private String KYC_REASON_CODE_1;
	@DataField(pos=26)
	private String KYC_REASON_CODE_2;
	@DataField(pos=27)
	private String KYC_REASON_CODE_3;
	@DataField(pos=28)
	private String KYC_REASON_CODE_4;
	@DataField(pos=29)
	private String PRIMARY_PHONE_NUMBER_2;
	@DataField(pos=30)
	private String ANNUAL_INCOME_AMOUNT;
	@DataField(pos=31)
	private int PRIMARY_APPLICANT_SIGNED;
	@DataField(pos=32)
	private int EMAIL_PREFERENCE_FLAG;
	@DataField(pos=33)
	private String DL_NUMBER;
	@DataField(pos=34)
	private String DL_ISSUANCE_STATE;
	@DataField(pos=35)
	private String DL_FIRST_NAME;
	@DataField(pos=36)
	private String DL_MIDDLE_INITIAL;
	@DataField(pos=37)
	private String DL_LAST_NAME;
	@DataField(pos=38)
	private String DL_NAME_SUFFIX;
	@DataField(pos=39)
	private int DL_NAME_CHANGED;
	@DataField(pos=40)
	private int DL_DATE_OF_BIRTH_CHANGED;
	@DataField(pos=41)
	private String DL_ORIGINAL_ADDRESS_SOURCE;
	@DataField(pos=42)
	private int DL_ADDRESS_CHANGED;
	@DataField(pos=43)
	private String DL_ISSUE_DATE;
	@DataField(pos=44)
	private String DL_EXPIRATION_DATE;
	@DataField(pos=45)
	private String DL_DATE_OF_BIRTH;
	@DataField(pos=46)
	private String DL_ENTRY_FORMAT_FAILED;
	@DataField(pos=47)
	private int DL_SWIPE_RESPONSE_CODE;
	@DataField(pos=48)
	private String DL_SWIPE_METHOD_INDICATOR;
	@DataField(pos=49)
	private String DL_QUALIFYING_CARD_TYPE;
	@DataField(pos=50)
	private String DL_QUALIFYING_CARD_BYPASSED;
	@DataField(pos=51)
	private String REFERENCE_ID;
	
	
	public String getLEGAL_ENTITY_ID() {
		return LEGAL_ENTITY_ID;
	}
	public void setLEGAL_ENTITY_ID(String lEGAL_ENTITY_ID) {
		LEGAL_ENTITY_ID = lEGAL_ENTITY_ID;
	}
	public String getAPPLICATION_ID() {
		return APPLICATION_ID;
	}
	public void setAPPLICATION_ID(String aPPLICATION_ID) {
		APPLICATION_ID = aPPLICATION_ID;
	}
	public String getLEGAL_ENTITY_TYPE_CD() {
		return LEGAL_ENTITY_TYPE_CD;
	}
	public void setLEGAL_ENTITY_TYPE_CD(String lEGAL_ENTITY_TYPE_CD) {
		LEGAL_ENTITY_TYPE_CD = lEGAL_ENTITY_TYPE_CD;
	}
	public String getTAX_ID() {
		return TAX_ID;
	}
	public void setTAX_ID(String tAX_ID) {
		TAX_ID = tAX_ID;
	}
	public String getPRIMARY_EMAIL_ADDRESS() {
		return PRIMARY_EMAIL_ADDRESS;
	}
	public void setPRIMARY_EMAIL_ADDRESS(String pRIMARY_EMAIL_ADDRESS) {
		PRIMARY_EMAIL_ADDRESS = pRIMARY_EMAIL_ADDRESS;
	}
	public String getANNUAL_INCOME() {
		return ANNUAL_INCOME;
	}
	public void setANNUAL_INCOME(String aNNUAL_INCOME) {
		ANNUAL_INCOME = aNNUAL_INCOME;
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
	public String getKYC_VERIFICATION_VENDOR() {
		return KYC_VERIFICATION_VENDOR;
	}
	public void setKYC_VERIFICATION_VENDOR(String kYC_VERIFICATION_VENDOR) {
		KYC_VERIFICATION_VENDOR = kYC_VERIFICATION_VENDOR;
	}
	public String getKYC_VERIFICATION_STATUS() {
		return KYC_VERIFICATION_STATUS;
	}
	public void setKYC_VERIFICATION_STATUS(String kYC_VERIFICATION_STATUS) {
		KYC_VERIFICATION_STATUS = kYC_VERIFICATION_STATUS;
	}
	public String getKYC_REASON_CODE_1() {
		return KYC_REASON_CODE_1;
	}
	public void setKYC_REASON_CODE_1(String kYC_REASON_CODE_1) {
		KYC_REASON_CODE_1 = kYC_REASON_CODE_1;
	}
	public String getKYC_REASON_CODE_2() {
		return KYC_REASON_CODE_2;
	}
	public void setKYC_REASON_CODE_2(String kYC_REASON_CODE_2) {
		KYC_REASON_CODE_2 = kYC_REASON_CODE_2;
	}
	public String getKYC_REASON_CODE_3() {
		return KYC_REASON_CODE_3;
	}
	public void setKYC_REASON_CODE_3(String kYC_REASON_CODE_3) {
		KYC_REASON_CODE_3 = kYC_REASON_CODE_3;
	}
	public String getKYC_REASON_CODE_4() {
		return KYC_REASON_CODE_4;
	}
	public void setKYC_REASON_CODE_4(String kYC_REASON_CODE_4) {
		KYC_REASON_CODE_4 = kYC_REASON_CODE_4;
	}
	public String getANNUAL_INCOME_AMOUNT() {
		return ANNUAL_INCOME_AMOUNT;
	}
	public void setANNUAL_INCOME_AMOUNT(String aNNUAL_INCOME_AMOUNT) {
		ANNUAL_INCOME_AMOUNT = aNNUAL_INCOME_AMOUNT;
	}
	public int getPRIMARY_APPLICANT_SIGNED() {
		return PRIMARY_APPLICANT_SIGNED;
	}
	public void setPRIMARY_APPLICANT_SIGNED(int pRIMARY_APPLICANT_SIGNED) {
		PRIMARY_APPLICANT_SIGNED = pRIMARY_APPLICANT_SIGNED;
	}
	public int getEMAIL_PREFERENCE_FLAG() {
		return EMAIL_PREFERENCE_FLAG;
	}
	public void setEMAIL_PREFERENCE_FLAG(int eMAIL_PREFERENCE_FLAG) {
		EMAIL_PREFERENCE_FLAG = eMAIL_PREFERENCE_FLAG;
	}
	public String getDL_NUMBER() {
		return DL_NUMBER;
	}
	public void setDL_NUMBER(String dL_NUMBER) {
		DL_NUMBER = dL_NUMBER;
	}
	public String getDL_ISSUANCE_STATE() {
		return DL_ISSUANCE_STATE;
	}
	public void setDL_ISSUANCE_STATE(String dL_ISSUANCE_STATE) {
		DL_ISSUANCE_STATE = dL_ISSUANCE_STATE;
	}
	public int getDL_NAME_CHANGED() {
		return DL_NAME_CHANGED;
	}
	public void setDL_NAME_CHANGED(int dL_NAME_CHANGED) {
		DL_NAME_CHANGED = dL_NAME_CHANGED;
	}
	public int getDL_DATE_OF_BIRTH_CHANGED() {
		return DL_DATE_OF_BIRTH_CHANGED;
	}
	public void setDL_DATE_OF_BIRTH_CHANGED(int dL_DATE_OF_BIRTH_CHANGED) {
		DL_DATE_OF_BIRTH_CHANGED = dL_DATE_OF_BIRTH_CHANGED;
	}
	public String getDL_ORIGINAL_ADDRESS_SOURCE() {
		return DL_ORIGINAL_ADDRESS_SOURCE;
	}
	public void setDL_ORIGINAL_ADDRESS_SOURCE(String dL_ORIGINAL_ADDRESS_SOURCE) {
		DL_ORIGINAL_ADDRESS_SOURCE = dL_ORIGINAL_ADDRESS_SOURCE;
	}
	public int getDL_ADDRESS_CHANGED() {
		return DL_ADDRESS_CHANGED;
	}
	public void setDL_ADDRESS_CHANGED(int dL_ADDRESS_CHANGED) {
		DL_ADDRESS_CHANGED = dL_ADDRESS_CHANGED;
	}
	public String getDL_ISSUE_DATE() {
		return DL_ISSUE_DATE;
	}
	public void setDL_ISSUE_DATE(String dL_ISSUE_DATE) {
		DL_ISSUE_DATE = dL_ISSUE_DATE;
	}
	public String getDL_EXPIRATION_DATE() {
		return DL_EXPIRATION_DATE;
	}
	public void setDL_EXPIRATION_DATE(String dL_EXPIRATION_DATE) {
		DL_EXPIRATION_DATE = dL_EXPIRATION_DATE;
	}
	public String getDL_ENTRY_FORMAT_FAILED() {
		return DL_ENTRY_FORMAT_FAILED;
	}
	public void setDL_ENTRY_FORMAT_FAILED(String dL_ENTRY_FORMAT_FAILED) {
		DL_ENTRY_FORMAT_FAILED = dL_ENTRY_FORMAT_FAILED;
	}
	public int getDL_SWIPE_RESPONSE_CODE() {
		return DL_SWIPE_RESPONSE_CODE;
	}
	public void setDL_SWIPE_RESPONSE_CODE(int dL_SWIPE_RESPONSE_CODE) {
		DL_SWIPE_RESPONSE_CODE = dL_SWIPE_RESPONSE_CODE;
	}
	public String getDL_SWIPE_METHOD_INDICATOR() {
		return DL_SWIPE_METHOD_INDICATOR;
	}
	public void setDL_SWIPE_METHOD_INDICATOR(String dL_SWIPE_METHOD_INDICATOR) {
		DL_SWIPE_METHOD_INDICATOR = dL_SWIPE_METHOD_INDICATOR;
	}
	public String getDL_QUALIFYING_CARD_TYPE() {
		return DL_QUALIFYING_CARD_TYPE;
	}
	public void setDL_QUALIFYING_CARD_TYPE(String dL_QUALIFYING_CARD_TYPE) {
		DL_QUALIFYING_CARD_TYPE = dL_QUALIFYING_CARD_TYPE;
	}
	public String getDL_QUALIFYING_CARD_BYPASSED() {
		return DL_QUALIFYING_CARD_BYPASSED;
	}
	public void setDL_QUALIFYING_CARD_BYPASSED(String dL_QUALIFYING_CARD_BYPASSED) {
		DL_QUALIFYING_CARD_BYPASSED = dL_QUALIFYING_CARD_BYPASSED;
	}
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}
	
	
	
	
	
	
	
	
	
	

}

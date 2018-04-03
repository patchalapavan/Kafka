package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord (separator = "\\|")
public class DataProviderReportVo {
	
	@DataField(pos=1)
	private String DATA_PROVIDER_REPORT_ID;
	@DataField(pos=2)
	private String DECISION_ID;
	@DataField(pos=3)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=4)
	private String DATA_PROVIDER_TYPE_CODE;
	@DataField(pos=5)
	private String DATA_PROVIDER_REPORT_TYPE_CODE;
	@DataField(pos=6)
	private String DATA_PROVIDER_STATUS_TYPE_CODE;
	@DataField(pos=7)
	private String DATA_PROIVDER_REPORT_DTTM;
	@DataField(pos=8)
	private String FIRST_NAME;
	@DataField(pos=9)
	private String LAST_NAME;
	@DataField(pos=10)
	private String LEGAL_ENTITY_TYPE_CD;
	@DataField(pos=11)
	private String CREDIT_RPT_RX_KEY;
	@DataField(pos=12)
	private String INSRT_TS;
	@DataField(pos=13)
	private String CHNG_TS;
	@DataField(pos=14)
	private String INSRT_USR_ID;
	@DataField(pos=15)
	private String CHNG_USR_ID;
	@DataField(pos=16)
	private int ACTIVE_FLAG;
	@DataField(pos=17)
	private String REFERENCE_ID;
	
	
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}
	public String getDATA_PROVIDER_REPORT_ID() {
		return DATA_PROVIDER_REPORT_ID;
	}
	public void setDATA_PROVIDER_REPORT_ID(String dATA_PROVIDER_REPORT_ID) {
		DATA_PROVIDER_REPORT_ID = dATA_PROVIDER_REPORT_ID;
	}
	public String getDECISION_ID() {
		return DECISION_ID;
	}
	public void setDECISION_ID(String dECISION_ID) {
		DECISION_ID = dECISION_ID;
	}
	public String getLEGAL_ENTITY_ID() {
		return LEGAL_ENTITY_ID;
	}
	public void setLEGAL_ENTITY_ID(String lEGAL_ENTITY_ID) {
		LEGAL_ENTITY_ID = lEGAL_ENTITY_ID;
	}
	public String getDATA_PROVIDER_TYPE_CODE() {
		return DATA_PROVIDER_TYPE_CODE;
	}
	public void setDATA_PROVIDER_TYPE_CODE(String dATA_PROVIDER_TYPE_CODE) {
		DATA_PROVIDER_TYPE_CODE = dATA_PROVIDER_TYPE_CODE;
	}
	public String getDATA_PROVIDER_REPORT_TYPE_CODE() {
		return DATA_PROVIDER_REPORT_TYPE_CODE;
	}
	public void setDATA_PROVIDER_REPORT_TYPE_CODE(String dATA_PROVIDER_REPORT_TYPE_CODE) {
		DATA_PROVIDER_REPORT_TYPE_CODE = dATA_PROVIDER_REPORT_TYPE_CODE;
	}
	public String getDATA_PROVIDER_STATUS_TYPE_CODE() {
		return DATA_PROVIDER_STATUS_TYPE_CODE;
	}
	public void setDATA_PROVIDER_STATUS_TYPE_CODE(String dATA_PROVIDER_STATUS_TYPE_CODE) {
		DATA_PROVIDER_STATUS_TYPE_CODE = dATA_PROVIDER_STATUS_TYPE_CODE;
	}
	public String getDATA_PROIVDER_REPORT_DTTM() {
		return DATA_PROIVDER_REPORT_DTTM;
	}
	public void setDATA_PROIVDER_REPORT_DTTM(String dATA_PROIVDER_REPORT_DTTM) {
		DATA_PROIVDER_REPORT_DTTM = dATA_PROIVDER_REPORT_DTTM;
	}
	public String getLEGAL_ENTITY_TYPE_CD() {
		return LEGAL_ENTITY_TYPE_CD;
	}
	public void setLEGAL_ENTITY_TYPE_CD(String lEGAL_ENTITY_TYPE_CD) {
		LEGAL_ENTITY_TYPE_CD = lEGAL_ENTITY_TYPE_CD;
	}
	public String getCREDIT_RPT_RX_KEY() {
		return CREDIT_RPT_RX_KEY;
	}
	public void setCREDIT_RPT_RX_KEY(String cREDIT_RPT_RX_KEY) {
		CREDIT_RPT_RX_KEY = cREDIT_RPT_RX_KEY;
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

	
}

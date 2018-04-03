package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class DecisionReasonVo {

	@DataField(pos=1)
	private String DECISION_REASON_ID;
	@DataField(pos=2)
	private String DECISION_ID;
	@DataField(pos=3)
	private String DECISION_REASON_TYPE_CODE;
	@DataField(pos=4)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=5)
	private String LEGAL_ENTITY_TYPE_CD;
	@DataField(pos=6)
	private String FIRST_NAME;
	@DataField(pos=7)
	private String MIDDLE_NAME;
	@DataField(pos=8)
	private String OVERRIDE_TYPE_CODE;
	@DataField(pos=9)
	private String COMMENTS;
	@DataField(pos=10)
	private String INSRT_TS;
	@DataField(pos=11)
	private String CHNG_TS;
	@DataField(pos=12)
	private String INSRT_USR_ID;
	@DataField(pos=13)
	private String CHNG_USR_ID;
	@DataField(pos=14)
	private int ACTIVE_FLAG;
	@DataField(pos=15)
	private String REFERENCE_ID;
	
	public String getDECISION_REASON_ID() {
		return DECISION_REASON_ID;
	}
	public void setDECISION_REASON_ID(String dECISION_REASON_ID) {
		DECISION_REASON_ID = dECISION_REASON_ID;
	}
	public String getDECISION_ID() {
		return DECISION_ID;
	}
	public void setDECISION_ID(String dECISION_ID) {
		DECISION_ID = dECISION_ID;
	}
	public String getDECISION_REASON_TYPE_CODE() {
		return DECISION_REASON_TYPE_CODE;
	}
	public void setDECISION_REASON_TYPE_CODE(String dECISION_REASON_TYPE_CODE) {
		DECISION_REASON_TYPE_CODE = dECISION_REASON_TYPE_CODE;
	}
	public String getLEGAL_ENTITY_ID() {
		return LEGAL_ENTITY_ID;
	}
	public void setLEGAL_ENTITY_ID(String lEGAL_ENTITY_ID) {
		LEGAL_ENTITY_ID = lEGAL_ENTITY_ID;
	}
	public String getLEGAL_ENTITY_TYPE_CD() {
		return LEGAL_ENTITY_TYPE_CD;
	}
	public void setLEGAL_ENTITY_TYPE_CD(String lEGAL_ENTITY_TYPE_CD) {
		LEGAL_ENTITY_TYPE_CD = lEGAL_ENTITY_TYPE_CD;
	}
	public String getOVERRIDE_TYPE_CODE() {
		return OVERRIDE_TYPE_CODE;
	}
	public void setOVERRIDE_TYPE_CODE(String oVERRIDE_TYPE_CODE) {
		OVERRIDE_TYPE_CODE = oVERRIDE_TYPE_CODE;
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
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}
	
	
	
}

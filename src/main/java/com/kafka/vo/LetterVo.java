package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class LetterVo {
	
	@DataField(pos=1)
	private String LETTER_ID;
	@DataField(pos=2)
	private String DECISION_ID;
	@DataField(pos=3)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=4)
	private String LETTER_TYPE_CODE;
	@DataField(pos=5)
	private String STATUS_TYPE_CODE;
	@DataField(pos=6)
	private String SEND_DTTM;
	@DataField(pos=7)
	private String INSRT_TS;
	@DataField(pos=8)
	private String CHNG_TS;
	@DataField(pos=9)
	private String INSRT_USR_ID;
	@DataField(pos=10)
	private String CHNG_USR_ID;
	@DataField(pos=11)
	private int ACTIVE_FLAG;
	@DataField(pos=12)
	private String REFERENCE_ID;
	
	
	public String getLETTER_ID() {
		return LETTER_ID;
	}
	public void setLETTER_ID(String lETTER_ID) {
		LETTER_ID = lETTER_ID;
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
	public String getLETTER_TYPE_CODE() {
		return LETTER_TYPE_CODE;
	}
	public void setLETTER_TYPE_CODE(String lETTER_TYPE_CODE) {
		LETTER_TYPE_CODE = lETTER_TYPE_CODE;
	}
	public String getSTATUS_TYPE_CODE() {
		return STATUS_TYPE_CODE;
	}
	public void setSTATUS_TYPE_CODE(String sTATUS_TYPE_CODE) {
		STATUS_TYPE_CODE = sTATUS_TYPE_CODE;
	}
	public String getSEND_DTTM() {
		return SEND_DTTM;
	}
	public void setSEND_DTTM(String sEND_DTTM) {
		SEND_DTTM = sEND_DTTM;
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
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}
	
	
	

}

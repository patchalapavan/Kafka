package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class AttributeVo {
	
	
	
	@DataField(pos=1)
	private String ATTRIBUTE_ID;
	@DataField(pos=2)
	private String DECISION_ID;
	@DataField(pos=3)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=4)
	private String DATA_PROVIDER_REPORT_ID;
	@DataField(pos=5)
	private String ATTRIBUTE_TYPE_CD;
	@DataField(pos=6)
	private String VALUE;
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
	
	
	public String getATTRIBUTE_ID() {
		return ATTRIBUTE_ID;
	}
	public void setATTRIBUTE_ID(String aTTRIBUTE_ID) {
		ATTRIBUTE_ID = aTTRIBUTE_ID;
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
	public String getDATA_PROVIDER_REPORT_ID() {
		return DATA_PROVIDER_REPORT_ID;
	}
	public void setDATA_PROVIDER_REPORT_ID(String dATA_PROVIDER_REPORT_ID) {
		DATA_PROVIDER_REPORT_ID = dATA_PROVIDER_REPORT_ID;
	}
	public String getATTRIBUTE_TYPE_CD() {
		return ATTRIBUTE_TYPE_CD;
	}
	public void setATTRIBUTE_TYPE_CD(String aTTRIBUTE_TYPE_CD) {
		ATTRIBUTE_TYPE_CD = aTTRIBUTE_TYPE_CD;
	}
	public String getVALUE() {
		return VALUE;
	}
	public void setVALUE(String vALUE) {
		VALUE = vALUE;
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

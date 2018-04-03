package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord (separator ="\\|" )
public class DecisionVo {
	
	@DataField(pos=1)
	private String DECISION_ID;
	@DataField(pos=2)
	private String APPLICATION_ID;
	@DataField(pos=3)
	private String DECISION_STATUS_TYPE_CODE;
	@DataField(pos=4)
	private int CURRENT_PREFERRED_FLAG;
	@DataField(pos=5)
	private String INSRT_TS;
	@DataField(pos=6)
	private String CHNG_TS;
	@DataField(pos=7)
	private String INSRT_USR_ID;
	@DataField(pos=8)
	private String CHNG_USR_ID;
	@DataField(pos=9)
	private int ACTIVE_FLAG;
	@DataField(pos=10)
	private String REFERENCE_ID;
	
	
	public String getDECISION_ID() {
		return DECISION_ID;
	}
	public void setDECISION_ID(String dECISION_ID) {
		DECISION_ID = dECISION_ID;
	}
	public String getAPPLICATION_ID() {
		return APPLICATION_ID;
	}
	public void setAPPLICATION_ID(String aPPLICATION_ID) {
		APPLICATION_ID = aPPLICATION_ID;
	}
	public String getDECISION_STATUS_TYPE_CODE() {
		return DECISION_STATUS_TYPE_CODE;
	}
	public void setDECISION_STATUS_TYPE_CODE(String dECISION_STATUS_TYPE_CODE) {
		DECISION_STATUS_TYPE_CODE = dECISION_STATUS_TYPE_CODE;
	}
	public int getCURRENT_PREFERRED_FLAG() {
		return CURRENT_PREFERRED_FLAG;
	}
	public void setCURRENT_PREFERRED_FLAG(int cURRENT_PREFERRED_FLAG) {
		CURRENT_PREFERRED_FLAG = cURRENT_PREFERRED_FLAG;
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

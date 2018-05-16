package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class ScoreReasonVo {
	
	@DataField(pos=1)
	private String SCORE_REASON_ID;
	@DataField(pos=2)
	private String SCORE_ID;
	@DataField(pos=3)
	private String REASON_TYPE_CODE;
	@DataField(pos=4)
	private int PRIORITY;
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
	
	
	public String getSCORE_REASON_ID() {
		return SCORE_REASON_ID;
	}
	public void setSCORE_REASON_ID(String sCORE_REASON_ID) {
		SCORE_REASON_ID = sCORE_REASON_ID;
	}
	public String getSCORE_ID() {
		return SCORE_ID;
	}
	public void setSCORE_ID(String sCORE_ID) {
		SCORE_ID = sCORE_ID;
	}
	public String getREASON_TYPE_CODE() {
		return REASON_TYPE_CODE;
	}
	public void setREASON_TYPE_CODE(String rEASON_TYPE_CODE) {
		REASON_TYPE_CODE = rEASON_TYPE_CODE;
	}
	public int getPRIORITY() {
		return PRIORITY;
	}
	public void setPRIORITY(int pRIORITY) {
		PRIORITY = pRIORITY;
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

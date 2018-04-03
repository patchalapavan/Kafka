package com.kafka.vo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = "\\|")
public class AddrVo {
	
	@DataField(pos=1)
	private String ADDR_ID;
	@DataField(pos=2)
	private String LEGAL_ENTITY_ID;
	@DataField(pos=3)
	private String ADDRESS_TYPE_CODE;
	@DataField(pos=4)
	private String LINE1;
	@DataField(pos=5)
	private String LINE2;
	@DataField(pos=6)
	private String CITY;
	@DataField(pos=7)
	private String STATE_TYPE_CODE;
	@DataField(pos=8)
	private String POSTAL_CODE;
	@DataField(pos=9)
	private String INSRT_TS;
	@DataField(pos=10)
	private String CHNG_TS;
	@DataField(pos=11)
	private String INSRT_USR_ID;
	@DataField(pos=12)
	private String CHNG_USR_ID;
	@DataField(pos=13)
	private int ACTIVE_FLAG;
	@DataField(pos=14)
	private int ADDRESS_STANDARDIZATION_FAILED_FLAG;
	@DataField(pos=15)
	private String REFERENCE_ID;
	
	
	
	public String getADDRESS_TYPE_CODE() {
		return ADDRESS_TYPE_CODE;
	}
	public void setADDRESS_TYPE_CODE(String aDDRESS_TYPE_CODE) {
		ADDRESS_TYPE_CODE = aDDRESS_TYPE_CODE;
	}
	public String getSTATE_TYPE_CODE() {
		return STATE_TYPE_CODE;
	}
	public void setSTATE_TYPE_CODE(String sTATE_TYPE_CODE) {
		STATE_TYPE_CODE = sTATE_TYPE_CODE;
	}
	public String getPOSTAL_CODE() {
		return POSTAL_CODE;
	}
	public void setPOSTAL_CODE(String pOSTAL_CODE) {
		POSTAL_CODE = pOSTAL_CODE;
	}
	public int getADDRESS_STANDARDIZATION_FAILED_FLAG() {
		return ADDRESS_STANDARDIZATION_FAILED_FLAG;
	}
	public void setADDRESS_STANDARDIZATION_FAILED_FLAG(int aDDRESS_STANDARDIZATION_FAILED_FLAG) {
		ADDRESS_STANDARDIZATION_FAILED_FLAG = aDDRESS_STANDARDIZATION_FAILED_FLAG;
	}
	public String getREFERENCE_ID() {
		return REFERENCE_ID;
	}
	public void setREFERENCE_ID(String rEFERENCE_ID) {
		REFERENCE_ID = rEFERENCE_ID;
	}

	
	
}

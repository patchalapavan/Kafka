package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.legalentity;
import com.kafka.vo.LegalEntityVo;

//@Component
public class LegalEntityProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		LegalEntityVo kafkaVoObj = exchange.getIn().getBody(LegalEntityVo.class);

		legalentity le = new legalentity();

		le.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
		le.setAPPLICATIONID(kafkaVoObj.getAPPLICATION_ID());
		le.setLEGALENTITYTYPECD(kafkaVoObj.getLEGAL_ENTITY_TYPE_CD());
		le.setTAXID(kafkaVoObj.getTAX_ID());
		le.setPRIMARYEMAILADDRESS(kafkaVoObj.getPRIMARY_EMAIL_ADDRESS());
		le.setANNUALINCOME(kafkaVoObj.getANNUAL_INCOME());
		le.setINSRTTS(kafkaVoObj.getINSRT_TS());
		le.setCHNGTS(kafkaVoObj.getCHNG_TS());
		le.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
		le.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		le.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		le.setKYCVERIFICATIONVENDOR(kafkaVoObj.getKYC_VERIFICATION_VENDOR());
		le.setKYCVERIFICATIONSTATUS(kafkaVoObj.getKYC_VERIFICATION_STATUS());
		le.setKYCREASONCODE1(kafkaVoObj.getKYC_REASON_CODE_1());
		le.setKYCREASONCODE2(kafkaVoObj.getKYC_REASON_CODE_2());
		le.setKCYREASONCODE3(kafkaVoObj.getKYC_REASON_CODE_3());
		le.setKYCREASONCODE4(kafkaVoObj.getKYC_REASON_CODE_4());
		le.setANNUALINCOMEAMOUNT(kafkaVoObj.getANNUAL_INCOME_AMOUNT());
		le.setPRIMARYAPPLICANTSIGNED(kafkaVoObj.getPRIMARY_APPLICANT_SIGNED());
		le.setEMAILPREFERENCEFLAG(kafkaVoObj.getEMAIL_PREFERENCE_FLAG());
		le.setDLNUMBER(kafkaVoObj.getDL_NUMBER());
		le.setDLISSUANCESTATE(kafkaVoObj.getDL_ISSUANCE_STATE());
		le.setDLNAMECHANGED(kafkaVoObj.getDL_NAME_CHANGED());
		le.setDLDATEOFBIRTHCHANGED(kafkaVoObj.getDL_DATE_OF_BIRTH_CHANGED());
		le.setDLORIGINALADDRESSSOURCE(kafkaVoObj.getDL_ORIGINAL_ADDRESS_SOURCE());
		le.setDLADDRESSCHANGED(kafkaVoObj.getDL_ADDRESS_CHANGED());
		le.setDLISSUEDATE(kafkaVoObj.getDL_ISSUE_DATE());
		le.setDLEXPIRATIONDATE(kafkaVoObj.getDL_EXPIRATION_DATE());
		le.setDLENTRYFORMATFAILED(kafkaVoObj.getDL_ENTRY_FORMAT_FAILED());
		le.setDLSWIPERESPONSECODE(kafkaVoObj.getDL_SWIPE_RESPONSE_CODE());
		le.setDLSWIPEMETHODINDICATOR(kafkaVoObj.getDL_SWIPE_METHOD_INDICATOR());
		le.setDLQUALIFYINGCARDTYPE(kafkaVoObj.getDL_QUALIFYING_CARD_TYPE());
		le.setDLQUALIFYINGCARDBYPASSED(kafkaVoObj.getDL_QUALIFYING_CARD_BYPASSED());
		le.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());
		exchange.getIn().setBody(le);

	}

}

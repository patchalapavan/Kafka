package com.kafka.processors;

import java.io.ByteArrayOutputStream;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


import com.kafka.avro.offer;
import com.kafka.vo.OfferVo;

@Component
public class OfferProcessors implements Processor {
	private static int count = 0;
	@Override
	public void process(Exchange exchange) throws Exception {

		
		
		
		OfferVo kafkaVOObj = exchange.getIn().getBody(OfferVo.class);
		
		String schemaDescription = offer.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<offer> writer = new GenericDatumWriter<offer>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

		offer off = new offer();
		
		off.setOFFERID(kafkaVOObj.getOFFER_ID());
		off.setDECISIONID(kafkaVOObj.getDECISION_ID());
		off.setOFFERTYPECODE(kafkaVOObj.getOFFER_TYPE_CODE());
		off.setPRODUCTTYPECODE(kafkaVOObj.getPRODUCT_TYPE_CODE());
		off.setSUBPRODUCTTYPECODE(kafkaVOObj.getSUB_PRODUCT_TYPE_CODE());
		off.setPROMOTYPECODE(kafkaVOObj.getPROMO_TYPE_CODE());
		off.setOFFERSTATUSTYPECODE(kafkaVOObj.getOFFER_STATUS_TYPE_CODE());
		off.setAMOUNT(kafkaVOObj.getAMOUNT());
		off.setRATE(kafkaVOObj.getRATE());
		off.setACCEPTEDOFFERFLAG(kafkaVOObj.getACCEPTED_OFFER_FLAG());
		off.setINSRTTS(kafkaVOObj.getINSRT_TS());
		off.setCHNGTS(kafkaVOObj.getCHNG_TS());
		off.setINSRTUSRID(kafkaVOObj.getINSRT_USR_ID());
		off.setCHNGUSRID(kafkaVOObj.getCHNG_USR_ID());
		off.setACTIVEFLAG(kafkaVOObj.getACTIVE_FLAG());
		off.setTYSYSACCOUNTID(kafkaVOObj.getTYSYS_ACCOUNT_ID());
		off.setBOOKINGDATETIME(kafkaVOObj.getBOOKING_DATE_TIME());
		off.setTEMPORARYCREDITLIMIT(kafkaVOObj.getTEMPORARY_CREDIT_LIMIT());
		off.setTEMPORARYLIMITEXPIRYDATE(kafkaVOObj.getTEMPORARY_LIMIT_EXPIRY_DATE());
		off.setONLINEPROMOTIONCODE(kafkaVOObj.getONLINE_PROMOTION_CODE());
		off.setJOINTAUTHORIZEDBUYERFLAG(kafkaVOObj.getJOINT_AUTHORIZED_BUYER_FLAG());
		off.setAUTOPAYENROLLMENT(kafkaVOObj.getAUTO_PAY_ENROLLMENT());
		off.setAUTOPAYMETHOD(kafkaVOObj.getAUTO_PAY_METHOD());
		off.setAUTOPAYACCOUNT(kafkaVOObj.getAUTO_PAY_ACCOUNT());
		off.setAUTOPAYOPTION(kafkaVOObj.getAUTO_PAY_OPTION());
		off.setACEOPTIONSET(kafkaVOObj.getACE_OPTION_SET());
		off.setASSIGNEDDISCLOSUREGROUP(kafkaVOObj.getASSIGNED_DISCLOSURE_GROUP());
		off.setASSIGNEDPURCHASEAPR(kafkaVOObj.getASSIGNED_PURCHASE_APR());
		off.setASSIGNEDPURCHASEDIVPAYOUTRATIO(kafkaVOObj.getASSIGNED_PURCHASE_DIV_PAYOUT_RATIO());
		off.setASSIGNEDPENALTYAPR(kafkaVOObj.getASSIGNED_PENALTY_APR());
		off.setASSIGNEDPENALTYDIVPAYOUTRATIO(kafkaVOObj.getASSIGNED_PENALTY_DIV_PAYOUT_RATIO());
		off.setASSIGNEDCASHAPR(kafkaVOObj.getASSIGNED_CASH_APR());
		off.setASSIGNEDCASHDIVPAYOUTRATIO(kafkaVOObj.getASSIGNED_CASH_DIV_PAYOUT_RATIO());
		off.setASSIGNEDPURCHASEMARGIN(kafkaVOObj.getASSIGNED_PURCHASE_MARGIN());
		off.setASSIGNEDPENALTYMARGIN(kafkaVOObj.getASSIGNED_PENALTY_MARGIN());
		off.setASSIGNEDCASHMARGIN(kafkaVOObj.getASSIGNED_CASH_MARGIN());
		off.setPROMOTIONALDISCLOSUREGROUP(kafkaVOObj.getPROMOTIONAL_DISCLOSURE_GROUP());
		off.setACQUISITIONSTRATEGY(kafkaVOObj.getACQUISITION_STRATEGY());
		off.setMICRRATINGASSIGNMENT(kafkaVOObj.getMICR_RATING_ASSIGNMENT());
		off.setREFERENCEID(kafkaVOObj.getREFERENCE_ID());
		
		
		writer.write(off, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
	}
	
	

}

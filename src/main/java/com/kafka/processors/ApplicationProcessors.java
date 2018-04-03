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

import com.kafka.avro.application;
import com.kafka.vo.ApplicationVo;

@Component
public class ApplicationProcessors implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		

		ApplicationVo kafkaVoObj = exchange.getIn().getBody(ApplicationVo.class);

		String schemaDescription = application.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<application> writer = new GenericDatumWriter<application>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

		application app = new application();


			
				app.setAPPLICATIONID(kafkaVoObj.getAPPLICATION_ID());			
				app.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());
				app.setREQUESTEDPRODUCTTYPECODE(kafkaVoObj.getREQUESTED_PRODUCT_TYPE_CODE());
				app.setREQUESTEDSUBPRODUCTTYPECODE(kafkaVoObj.getREQUESTED_SUBPRODUCT_TYPE_CODE());
				app.setREQUESTEDPROMOTYPECODE(kafkaVoObj.getREQUESTED_PROMO_TYPE_CODE());
				app.setSOURCECHANNELTYPECODE(kafkaVoObj.getSOURCE_CHANNEL_TYPE_CODE());
				app.setEXTERNALTRACKINGCODE(kafkaVoObj.getEXTERNAL_TRACKING_CODE());
				app.setSOURCEIP(kafkaVoObj.getSOURCE_IP());
				app.setORIGINATIONDTTM(kafkaVoObj.getORIGINATION_DTTM());
				app.setTERMSACCEPTANCERESPONSE(kafkaVoObj.getTERMS_ACCEPTANCE_RESPONSE());
				app.setTERMSACCEPTANCEDTTM(kafkaVoObj.getTERMS_ACCEPTANCE_DTTM());
				app.setCURRENTDECISIONID(kafkaVoObj.getCURRENT_DECISION_ID());
				app.setCURRENTQUEUETYPECODE(kafkaVoObj.getCURRENT_QUEUE_TYPE_CODE());
				app.setCURRENTDECISIONSTATUSTYPECODE(kafkaVoObj.getCURRENT_DECISION_STATUS_TYPE_CODE());
				app.setAPPLICATIONSTATUSTYPECODE(kafkaVoObj.getAPPLICATION_STATUS_TYPE_CODE());
				app.setCHNGDTTM(kafkaVoObj.getCHNG_DTTM());
				app.setSOURCECHANNELTYPECODE(kafkaVoObj.getSOURCE_CHANNEL_TYPE_CODE());
				app.setINSRTTS(kafkaVoObj.getINSRT_TS());
				app.setCHNGTS(kafkaVoObj.getCHNG_TS());
				app.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
				app.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
				app.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
				app.setBESTGUESTMATCHFLAG(kafkaVoObj.getBEST_GUEST_MATCH_FLAG());
				app.setTRIPS090DAYS(kafkaVoObj.getTRIPS_090_DAYS());
				app.setTRIPS180DAYS(kafkaVoObj.getTRIPS_180_DAYS());
				app.setTRIPS270DAYS(kafkaVoObj.getTRIPS_270_DAYS());
				app.setTRIPS360DAYS(kafkaVoObj.getTRIPS_360_DAYS());
				app.setSOURCECODE(kafkaVoObj.getSOURCE_CODE());
				app.setIPADDRESS(kafkaVoObj.getIP_ADDRESS());
				app.setFUNDTRANSFERAUTHORIZE(kafkaVoObj.getFUND_TRANSFER_AUTHORIZE());
				app.setELECTRONICCONSENT(kafkaVoObj.getELECTRONIC_CONSENT());
				app.setCARDAGREEMENT(kafkaVoObj.getCARD_AGREEMENT());
				app.setPRIVACYPOLICY(kafkaVoObj.getPRIVACY_POLICY());
				app.setMESSAGEVERSIONNUMBER(kafkaVoObj.getMESSAGE_VERSION_NUMBER());
				app.setSOLICITATIONSTORENUMBER(kafkaVoObj.getSOLICITATION_STORE_NUMBER());
				app.setRINGINGSTORENUMBER(kafkaVoObj.getRINGING_STORE_NUMBER());
				app.setSOLICITATIONTEAMMEMBER(kafkaVoObj.getSOLICITATION_TEAM_MEMBER());
				app.setRINGINGTEAMMEMBER(kafkaVoObj.getRINGING_TEAM_MEMBER());
				app.setPRIVATELABELONLY(kafkaVoObj.getPRIVATE_LABEL_ONLY());
				app.setCOBRANDONLY(kafkaVoObj.getCO_BRAND_ONLY());
				app.setTERMSVERSION(kafkaVoObj.getTERMS_VERSION());
				app.setAPRTYPE(kafkaVoObj.getAPR_TYPE());
				app.setPOSBASKETSIZE(kafkaVoObj.getPOS_BASKET_SIZE());
				app.setPREAPPROVEDID(kafkaVoObj.getPRE_APPROVED_ID());
				app.setPREAPPROVEDCODE(kafkaVoObj.getPRE_APPROVED_CODE());
				app.setSOLICITATIONOFFER(kafkaVoObj.getSOLICITATION_OFFER());
				app.setPINSELECTED(kafkaVoObj.getPIN_SELECTED());
				app.setWEBDATA1(kafkaVoObj.getWEB_DATA_1());
				app.setWEBDATA2(kafkaVoObj.getWEB_DATA_2());
				app.setWEBDATA3(kafkaVoObj.getWEB_DATA_3());
				app.setWEBDATA4(kafkaVoObj.getWEB_DATA_4());
				app.setWEBDATA5(kafkaVoObj.getWEB_DATA_5());
				
				
		writer.write(app, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());

	}

}

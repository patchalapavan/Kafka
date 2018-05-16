package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.decisionreason;
import com.kafka.vo.DecisionReasonVo;

//@Component
public class DecisionReasonProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		DecisionReasonVo kafkaVoObj = exchange.getIn().getBody(DecisionReasonVo.class);

		decisionreason dcr = new decisionreason();

		dcr.setDECISIONREASONID(kafkaVoObj.getDECISION_REASON_ID());
		dcr.setDECISIONID(kafkaVoObj.getDECISION_ID());
		dcr.setDECISIONREASONTYPECODE(kafkaVoObj.getDECISION_REASON_TYPE_CODE());
		dcr.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
		dcr.setLEGALENTITYTYPECD(kafkaVoObj.getLEGAL_ENTITY_TYPE_CD());
		dcr.setOVERRIDETYPECODE(kafkaVoObj.getOVERRIDE_TYPE_CODE());
		dcr.setINSRTTS(kafkaVoObj.getINSRT_TS());
		dcr.setCHNGTS(kafkaVoObj.getCHNG_TS());
		dcr.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		dcr.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());

		exchange.getIn().setBody(dcr);

	}

}

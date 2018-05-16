package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.attribute;
import com.kafka.vo.AttributeVo;

//@Component
public class AttributeProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		AttributeVo kafkaVoObj = exchange.getIn().getBody(AttributeVo.class);

		attribute at = new attribute();

		at.setATTRIBUTEID(kafkaVoObj.getATTRIBUTE_ID());
		at.setDECISIONID(kafkaVoObj.getDECISION_ID());
		at.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
		at.setDATAPROVIDERREPORTID(kafkaVoObj.getDATA_PROVIDER_REPORT_ID());
		at.setATTRIBUTETYPECD(kafkaVoObj.getATTRIBUTE_TYPE_CD());
		at.setVALUE(kafkaVoObj.getVALUE());
		at.setINSRTTS(kafkaVoObj.getINSRT_TS());
		at.setCHNGTS(kafkaVoObj.getCHNG_TS());
		at.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
		at.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		at.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		at.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());

		exchange.getIn().setBody(at);

	}

}

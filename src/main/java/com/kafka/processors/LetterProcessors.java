package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.letter;
import com.kafka.vo.LetterVo;

//@Component
public class LetterProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		LetterVo kafkaVoObj = exchange.getIn().getBody(LetterVo.class);

		letter let = new letter();

		let.setLETTERID(kafkaVoObj.getLETTER_ID());
		let.setDECISIONID(kafkaVoObj.getDECISION_ID());
		let.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
		let.setLETTERTYPECODE(kafkaVoObj.getLETTER_TYPE_CODE());
		let.setSTATUSTYPECODE(kafkaVoObj.getSTATUS_TYPE_CODE());
		let.setSENDDTTM(kafkaVoObj.getSEND_DTTM());
		let.setINSRTTS(kafkaVoObj.getINSRT_TS());
		let.setCHNGTS(kafkaVoObj.getCHNG_TS());
		let.setINSRTUSRID(kafkaVoObj.getCHNG_USR_ID());
		let.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		let.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		let.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());
		exchange.getIn().setBody(let);

	}

}

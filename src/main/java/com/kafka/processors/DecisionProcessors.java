package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.decision;
import com.kafka.vo.DecisionVo;

//@Component
public class DecisionProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println("Checking Kafka Processors");

		DecisionVo kafkaVoObj = exchange.getIn().getBody(DecisionVo.class);

		decision dc = new decision();

		dc.setDECISIONID(kafkaVoObj.getDECISION_ID());
		dc.setAPPLICATIONID(kafkaVoObj.getAPPLICATION_ID());
		dc.setDECISIONSTATUSTYPECODE(kafkaVoObj.getDECISION_STATUS_TYPE_CODE());
		dc.setCURRENTPREFERREDFLAG(kafkaVoObj.getCURRENT_PREFERRED_FLAG());
		dc.setINSRTTS(kafkaVoObj.getINSRT_TS());
		dc.setCHNGTS(kafkaVoObj.getCHNG_TS());
		dc.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
		dc.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		dc.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		dc.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());

		exchange.getIn().setBody(dc);
	}

}

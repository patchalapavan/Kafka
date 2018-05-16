package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.scorereason;
import com.kafka.vo.ScoreReasonVo;

//@Component
public class ScoreReasonProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		ScoreReasonVo kafkaVoObj = exchange.getIn().getBody(ScoreReasonVo.class);

		scorereason scr = new scorereason();

		scr.setSCOREREASONID(kafkaVoObj.getSCORE_REASON_ID());
		scr.setSCOREID(kafkaVoObj.getSCORE_ID());
		scr.setREASONTYPECODE(kafkaVoObj.getREASON_TYPE_CODE());
		scr.setPRIORITY(kafkaVoObj.getPRIORITY());
		scr.setINSRTTS(kafkaVoObj.getINSRT_TS());
		scr.setCHNGTS(kafkaVoObj.getCHNG_TS());
		scr.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
		scr.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		scr.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		scr.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());
		exchange.getIn().setBody(scr);

	}

}

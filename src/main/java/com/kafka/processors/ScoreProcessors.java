package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.score;
import com.kafka.vo.ScoreVo;

//@Component
public class ScoreProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		ScoreVo kafkaVoObj = exchange.getIn().getBody(ScoreVo.class);

		score sc = new score();

		sc.setSCOREID(kafkaVoObj.getSCORE_ID());
		sc.setDECISIONID(kafkaVoObj.getDECISION_ID());
		sc.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
		sc.setDATAPROVIDERREPORTID(kafkaVoObj.getDATA_PROVIDER_REPORT_ID());
		sc.setSCORETYPECODE(kafkaVoObj.getSCORE_TYPE_CODE());
		sc.setVALUE(kafkaVoObj.getVALUE());
		sc.setINSRTTS(kafkaVoObj.getINSRT_TS());
		sc.setCHNGTS(kafkaVoObj.getCHNG_TS());
		sc.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
		sc.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
		sc.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
		sc.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());

		exchange.getIn().setBody(sc);

	}

}

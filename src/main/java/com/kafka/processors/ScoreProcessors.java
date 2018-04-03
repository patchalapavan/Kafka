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

import com.kafka.avro.score;
import com.kafka.vo.ScoreVo;

@Component
public class ScoreProcessors implements Processor {

	private static int count = 0;
	@Override
	public void process(Exchange exchange) throws Exception {
		
		

		ScoreVo kafkaVoObj = exchange.getIn().getBody(ScoreVo.class);

		String schemaDescription = score.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<score> writer = new GenericDatumWriter<score>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

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
		
		writer.write(sc, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
		
		
		
	}

}

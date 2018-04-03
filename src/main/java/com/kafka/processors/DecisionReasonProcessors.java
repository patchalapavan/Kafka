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


import com.kafka.avro.decisionreason;
import com.kafka.vo.DecisionReasonVo;

@Component
public class DecisionReasonProcessors implements  Processor{
	private static int count = 0;

	@Override
	public void process(Exchange exchange) throws Exception {
		
		

		DecisionReasonVo kafkaVoObj = exchange.getIn().getBody(DecisionReasonVo.class);

		String schemaDescription = decisionreason.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<decisionreason> writer = new GenericDatumWriter<decisionreason>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

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
		
		writer.write(dcr, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		System.out.println("out of stream DecisionReason -> "+count++);
		exchange.getIn().setBody(outputStream.toByteArray());
		
		
	}

}

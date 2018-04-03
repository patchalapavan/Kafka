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

import com.kafka.avro.dataProviderReport;
import com.kafka.avro.decision;
import com.kafka.vo.DataProviderReportVo;
import com.kafka.vo.DecisionVo;

@Component
public class DecisionProcessors implements Processor {
	

	@Override
	public void process(Exchange exchange) throws Exception {

		System.out.println("Checking Kafka Processors");
		
DecisionVo kafkaVoObj = exchange.getIn().getBody(DecisionVo.class);
		
		String schemaDescription = decision.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<decision> writer = new GenericDatumWriter<decision>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

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
		
		
		
		writer.write(dc, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
	}

}

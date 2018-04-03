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

import com.kafka.avro.addr;
import com.kafka.avro.attribute;
import com.kafka.vo.AddrVo;
import com.kafka.vo.AttributeVo;

@Component
public class AttributeProcessors implements Processor{
	
	

	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		
		AttributeVo kafkaVoObj = exchange.getIn().getBody(AttributeVo.class);
		
		String schemaDescription = attribute.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<attribute> writer = new GenericDatumWriter<attribute>(s);
		
		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
		
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
		
		
		
		writer.write(at, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
		
		
		
	}

}

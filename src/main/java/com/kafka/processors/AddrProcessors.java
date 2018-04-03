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
import com.kafka.vo.AddrVo;


@Component
public class AddrProcessors implements Processor {

	
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		
		
		AddrVo kafkaVoObj = exchange.getIn().getBody(AddrVo.class);
		
		String schemaDescription = addr.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<addr> writer = new GenericDatumWriter<addr>(s);
		
		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
		
		addr ad = new addr();
		
		ad.setADDRESSTYPECODE(kafkaVoObj.getADDRESS_TYPE_CODE());
		ad.setSTATETYPECODE(kafkaVoObj.getSTATE_TYPE_CODE());
		ad.setPOSTALCODE(kafkaVoObj.getPOSTAL_CODE());
		ad.setADDRESSSTANDARDIZATIONFAILEDFLAG(kafkaVoObj.getADDRESS_STANDARDIZATION_FAILED_FLAG());
		ad.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());	
		
		writer.write(ad, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
		
		
	}

}

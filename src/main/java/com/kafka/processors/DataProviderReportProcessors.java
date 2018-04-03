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

import com.kafka.avro.application;
import com.kafka.avro.dataProviderReport;
import com.kafka.vo.DataProviderReportVo;

@Component
public class DataProviderReportProcessors implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {

		
		
		DataProviderReportVo kafkaVoObj = exchange.getIn().getBody(DataProviderReportVo.class);
		
		String schemaDescription = dataProviderReport.getClassSchema().toString();
		Schema s = Schema.parse(schemaDescription);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		DatumWriter<dataProviderReport> writer = new GenericDatumWriter<dataProviderReport>(s);

		BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);

		dataProviderReport dpr = new dataProviderReport();
		

			
			dpr.setDATAPROVIDERREPORTID(kafkaVoObj.getDATA_PROVIDER_REPORT_ID());
			dpr.setDECISIONID(kafkaVoObj.getDECISION_ID());
			dpr.setLEGALENTITYID(kafkaVoObj.getLEGAL_ENTITY_ID());
			dpr.setDATAPROVIDERTYPECODE(kafkaVoObj.getDATA_PROVIDER_TYPE_CODE());
			dpr.setDATAPROVIDERREPORTTYPECODE(kafkaVoObj.getDATA_PROVIDER_REPORT_TYPE_CODE());
			dpr.setDATAPROVIDERSTATUSTYPECODE(kafkaVoObj.getDATA_PROVIDER_STATUS_TYPE_CODE());
			dpr.setDATAPROIVDERREPORTDTTM(kafkaVoObj.getDATA_PROIVDER_REPORT_DTTM());
			dpr.setLEGALENTITYTYPECD(kafkaVoObj.getLEGAL_ENTITY_TYPE_CD());
			dpr.setCREDITRPTRXKEY(kafkaVoObj.getCREDIT_RPT_RX_KEY());
			dpr.setINSRTTS(kafkaVoObj.getINSRT_TS());
			dpr.setCHNGTS(kafkaVoObj.getCHNG_TS());
			dpr.setINSRTUSRID(kafkaVoObj.getINSRT_USR_ID());
			dpr.setCHNGUSRID(kafkaVoObj.getCHNG_USR_ID());
			dpr.setACTIVEFLAG(kafkaVoObj.getACTIVE_FLAG());
			dpr.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());
			
			
			

		
		writer.write(dpr, binaryEncoder);

		binaryEncoder.flush();
		outputStream.close();

		
		exchange.getIn().setBody(outputStream.toByteArray());
		
		
	}

}

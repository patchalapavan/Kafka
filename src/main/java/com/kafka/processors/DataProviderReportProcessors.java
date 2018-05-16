package com.kafka.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.kafka.avro.dataProviderReport;
import com.kafka.vo.DataProviderReportVo;

//@Component
public class DataProviderReportProcessors implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		DataProviderReportVo kafkaVoObj = exchange.getIn().getBody(DataProviderReportVo.class);

		

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


		exchange.getIn().setBody(dpr);

	}

}

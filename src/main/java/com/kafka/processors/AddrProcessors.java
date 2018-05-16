package com.kafka.processors;

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

		addr add = new addr();

		add.setADDRESSTYPECODE(kafkaVoObj.getADDRESS_TYPE_CODE());
		add.setSTATETYPECODE(kafkaVoObj.getSTATE_TYPE_CODE());
		add.setPOSTALCODE(kafkaVoObj.getPOSTAL_CODE());
		add.setADDRESSSTANDARDIZATIONFAILEDFLAG(kafkaVoObj.getADDRESS_STANDARDIZATION_FAILED_FLAG());
		add.setREFERENCEID(kafkaVoObj.getREFERENCE_ID());

		exchange.getIn().setBody(add);

	}

}

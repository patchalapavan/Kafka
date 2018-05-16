package com.kafka.reader;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.kafka.processors.AddrProcessors;
import com.kafka.util.KafkaUtil;
import com.kafka.vo.AddrVo;

@Component
public class AddrReader extends RouteBuilder {

	@Value("${camel.file.input}")
	private String inputFile;

	@Autowired
	private KafkaUtil util;

	@Override
	public void configure() throws Exception {

		BindyDataFormat bindyDataFormat = util.bindyFormat();
		bindyDataFormat.setClassType(AddrVo.class);

		// Read the file
		from("file://" + inputFile + "?fileName=addr.txt&noop=true").log("reads Addr file").split()
				.tokenize("\n", 1, true).unmarshal(bindyDataFormat).process(new AddrProcessors()).log("toKafkaTopic")
				.to(util.buildKafkaEndpointUri("kafka:redcard-enrollment-archives-addr"));

	}

}

package com.kafka.reader;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.kafka.processors.AttributeProcessors;
import com.kafka.util.KafkaUtil;
import com.kafka.vo.AttributeVo;

//@Component
public class AttributeReader extends RouteBuilder {

	@Value("${camel.file.input}")
	private String inputFile;

	@Autowired
	private KafkaUtil util;

	@Override
	public void configure() throws Exception {

		BindyDataFormat bindyDataFormat = util.bindyFormat();
		bindyDataFormat.setClassType(AttributeVo.class);

		// Read the file
		from("file://" + inputFile + "?fileName=attribute.txt&noop=true").log("reads Attribute file").split()
				.tokenize("\n", 1, true).unmarshal(bindyDataFormat).process(new AttributeProcessors())
				.log("toKafkaTopic").to(util.buildKafkaEndpointUri("kafka:redcard-enrollment-archives-attribute"));
	}

}

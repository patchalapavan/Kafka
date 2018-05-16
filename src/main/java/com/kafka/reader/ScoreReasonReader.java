package com.kafka.reader;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.kafka.processors.ScoreReasonProcessors;
import com.kafka.util.KafkaUtil;
import com.kafka.vo.ScoreReasonVo;

//@Component
public class ScoreReasonReader extends RouteBuilder {

	@Value("${camel.file.input}")
	private String inputFile;
	@Autowired
	private KafkaUtil util;

	@Override
	public void configure() throws Exception {

		BindyDataFormat bindyDataFormat = util.bindyFormat();
		bindyDataFormat.setClassType(ScoreReasonVo.class);

		// Read the file
		from("file://" + inputFile + "?fileName=scorereason.txt&noop=true").log("reads file")

				.split().tokenize("\n", 1, true).unmarshal(bindyDataFormat).process(new ScoreReasonProcessors())
				.log("toKafkaTopic").to(util.buildKafkaEndpointUri("kafka:redcard-enrollment-archives-scorereason"));

	}

}

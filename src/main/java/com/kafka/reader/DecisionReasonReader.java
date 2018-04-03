package com.kafka.reader;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.kafka.processors.DecisionReasonProcessors;
import com.kafka.util.KafkaUtil;
import com.kafka.vo.DecisionReasonVo;

@Component
public class DecisionReasonReader extends RouteBuilder {

	@Value("${camel.file.input}")
    private String inputFile;
    @Value("${camel.file.output}")
    private String outputFile;
    @Value("${kafka.consumer.groupId}")
    private String groupId;
    @Value("${kafka.ssl.keystore.location}")
    private String sslKeystoreLocation;
    @Value("${kafka.ssl.keystore.password}")
    private String sslKeystorePassword;
    @Value("${kafka.ssl.trustore.password}")
    private String sslTruststorePassword;
    @Value("${kafka.ssl.trustore.location}")
    private String sslTruststoreLocation;
	
	
	@Override
	public void configure() throws Exception {
		
		
		
		BindyDataFormat bindyDataFormat = new BindyDataFormat();
	    bindyDataFormat.setType(BindyType.Csv);
	    bindyDataFormat.setLocale("en-us");
	    bindyDataFormat.setClassType(DecisionReasonVo.class);
		
	 // Read the file
	    from("file://"+inputFile+"?fileName=decisionreason.txt&noop=true").log("reads file")
	    			.split().tokenize("\n", 1, true)
	    			.unmarshal(bindyDataFormat)
	    			.process(new DecisionReasonProcessors())
	    			.log("toKafkaTopic")
	    			.to(new KafkaUtil().buildKafkaEndpointUri(
	   		    	"kafka:redcard-enrollment-archives-decisionreason",groupId, sslKeystorePassword, sslKeystoreLocation, sslTruststoreLocation, sslTruststorePassword));
		
	}

}

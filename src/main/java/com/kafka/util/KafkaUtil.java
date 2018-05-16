package com.kafka.util;

import org.apache.camel.model.dataformat.BindyDataFormat;
import org.apache.camel.model.dataformat.BindyType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaUtil {

	@Value("${camel.file.output}")
	private String outputFile;
	@Value("${kafka.consumer.groupId}")
	private String groupId;
	@Value("${kafka.ssl.keystore.location}")
	private String sslKeystoreLocation;
	@Value("${kafka.ssl.keystore.password}")
	private String sslKeystorePassword;
	@Value("${kafka.ssl.trustore.location}")
	private String sslTruststoreLocation;
	@Value("${kafka.ssl.trustore.password}")
	private String sslTruststorePassword;

	public String buildKafkaEndpointUri(String topic) {

		return String.format(
				topic + "?brokers=10.65.133.232:9093,10.65.133.233:9093,10.65.133.234:9093"
						+ "&groupId=%s&autoCommitEnable=true"
						+ "&securityProtocol=SSL&sslKeystorePassword=%s&sslKeystoreLocation=%s"
						+ "&sslTruststoreLocation=%s&sslTruststorePassword=%s"
						+ "&serializerClass==com.kafka.processors.util.AvroSerializer", // "&valueDeserializer=org.apache.kafka.common.serialization.ByteArrayDeserializer",
				groupId, sslKeystorePassword, sslKeystoreLocation, sslTruststoreLocation, sslTruststorePassword);

	}

	public BindyDataFormat bindyFormat() {
		BindyDataFormat bindyDataFormat = new BindyDataFormat();
		bindyDataFormat.setType(BindyType.Csv);
		bindyDataFormat.setLocale("en-us");
		return bindyDataFormat;
	}

}

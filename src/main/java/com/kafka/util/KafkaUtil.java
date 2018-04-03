package com.kafka.util;



import org.springframework.stereotype.Component;



@Component
public class KafkaUtil {
	 
	 
	public String buildKafkaEndpointUri(String topic, String groupId, String sslKeystorePassword, String sslKeystoreLocation, String sslTruststoreLocation, String sslTruststorePassword) {
	    return String.format(topic
	                    + "?brokers=10.65.133.232:9093,10.65.133.233:9093,10.65.133.234:9093"
	                    + "&groupId=%s&autoCommitEnable=true"
	                    + "&securityProtocol=SSL&sslKeystorePassword=%s&sslKeystoreLocation=%s"
	                    + "&sslTruststoreLocation=%s&sslTruststorePassword=%s"
	                    + "&valueDeserializer=org.apache.kafka.common.serialization.ByteArrayDeserializer",
	            groupId, sslKeystorePassword, sslKeystoreLocation, sslTruststoreLocation, sslTruststorePassword);
	}

}

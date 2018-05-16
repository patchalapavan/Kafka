package com.kafka.processors.util;

import java.util.HashMap;
import java.util.Map;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

public class AvroSerializer extends KafkaAvroSerializer {
	
	@Override
    public void configure(Map<String, ?> configs, boolean isKey) {
				
        Map<String,Object> effectiveConfigs = new HashMap<>(configs);
        effectiveConfigs.put("schema.registry.url","http://10.65.166.47:8081");
        super.configure(effectiveConfigs,isKey);
	}
	
}

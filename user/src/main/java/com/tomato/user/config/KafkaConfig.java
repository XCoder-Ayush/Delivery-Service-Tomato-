package com.tomato.user.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    Logger logger=LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = "location-test-topic",groupId = "group-1")
    public void updatedLocation(String location){
        this.logger.info("Location Received {}",location);
    }
}

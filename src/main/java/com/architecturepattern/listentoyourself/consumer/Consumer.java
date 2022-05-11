package com.architecturepattern.listentoyourself.consumer;

import com.architecturepattern.listentoyourself.producer.EventProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @KafkaListener(topics = "listentoyourself", groupId = "listentoyourself-groupid")
    public void consumerGroupListenToYourSelf(EventProducer event) {
        log.info("Event {}", event);
    }

}

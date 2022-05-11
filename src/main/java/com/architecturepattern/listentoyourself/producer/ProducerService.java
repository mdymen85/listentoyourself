package com.architecturepattern.listentoyourself.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProducerService {

    @Value("${topic.name:listentoyourself}")
    private String topic;

    private final KafkaTemplate<String, EventProducer> kafkaTemplate;

    public void send(EventProducer event) {

        kafkaTemplate.send(topic, event);

    }

}

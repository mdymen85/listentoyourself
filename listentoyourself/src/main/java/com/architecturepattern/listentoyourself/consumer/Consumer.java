package com.architecturepattern.listentoyourself.consumer;

import com.architecturepattern.listentoyourself.producer.EventProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

    private final EventRepository eventRepository;

    @KafkaListener(topics = "listentoyourself", groupId = "listentoyourself-groupid")
    public void consumerGroupListenToYourSelf(EventConsumer event) {
        log.info("Reading message {} from topic {}.", event, "listentoyourself");

        this.eventRepository.save(event);

        log.info("Event {} saved on database.", event);

    }

}

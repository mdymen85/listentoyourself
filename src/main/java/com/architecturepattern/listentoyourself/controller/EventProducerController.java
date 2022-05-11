package com.architecturepattern.listentoyourself.controller;

import com.architecturepattern.listentoyourself.producer.EventProducer;
import com.architecturepattern.listentoyourself.producer.ProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
@Slf4j
public class EventProducerController {

    private final ProducerService producerService;

    @RequestMapping(value = "/produce", method = RequestMethod.POST)
    public ResponseEntity<EventProducer> produce(@RequestBody EventProducer eventProducer) {

        this.producerService.send(eventProducer);
        return new ResponseEntity<EventProducer>(eventProducer, HttpStatus.ACCEPTED);

    }

}

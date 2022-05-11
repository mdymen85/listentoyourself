package com.architecturepattern.listentoyourselfconsumer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<EventConsumer, Long> {
}

package com.architecturepattern.listentoyourselfconsumer;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Using @Data for JPA entities is not recommended.
//It can cause severe performance and memory consumption issues.
@Data
@Entity
@Table(name = "ltys_otherconsumer_event")
public class EventConsumer {

    @Id
    private Long id;
    private String name;

}

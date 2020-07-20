package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.tshering.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}

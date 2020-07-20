package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.tshering.eventmanagement.entities.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

}

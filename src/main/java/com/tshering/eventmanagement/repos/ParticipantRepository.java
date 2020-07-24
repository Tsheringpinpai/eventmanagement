package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tshering.eventmanagement.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}

package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tshering.eventmanagement.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}

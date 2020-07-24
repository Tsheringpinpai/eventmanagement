package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tshering.eventmanagement.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}

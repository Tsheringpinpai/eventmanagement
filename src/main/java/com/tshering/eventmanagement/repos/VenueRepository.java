package com.tshering.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.tshering.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}

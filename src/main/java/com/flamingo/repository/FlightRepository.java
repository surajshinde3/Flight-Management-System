package com.flamingo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flamingo.model.Airport;
import com.flamingo.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findAllByDepartureAirportEqualsAndDestinationAirportEqualsAndDepartureDateEquals(Airport depAirport, Airport destAirport, LocalDate depDate);

}

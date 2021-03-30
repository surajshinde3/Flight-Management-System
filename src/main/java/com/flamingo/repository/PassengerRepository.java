package com.flamingo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flamingo.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

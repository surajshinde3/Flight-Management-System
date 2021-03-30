package com.flamingo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flamingo.model.Aircraft;

@Repository
public interface AircraftRepository extends JpaRepository<Aircraft, Long> {
}

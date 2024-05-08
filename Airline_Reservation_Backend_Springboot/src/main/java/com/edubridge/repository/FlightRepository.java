package com.edubridge.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer>{

	
}

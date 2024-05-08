package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.entity.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {
	
	
}

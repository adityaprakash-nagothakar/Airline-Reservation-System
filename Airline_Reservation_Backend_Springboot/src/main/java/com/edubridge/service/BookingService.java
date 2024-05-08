package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.Booking;

public interface BookingService {
    
public Booking create(Booking booking,int flight_id,int userId);
List<Booking> getAllBooking();
public Booking getBookingById(Integer id);
public String deleteBookingById(Integer id);
public String cancelTicket(Integer id);


}

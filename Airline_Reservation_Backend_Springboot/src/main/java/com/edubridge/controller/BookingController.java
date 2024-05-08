package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Booking;
import com.edubridge.service.BookingService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;
    

    @PostMapping("/newbooking/{flight_id}/{userId}")
    public Booking addBooking( @PathVariable int flight_id,@PathVariable int userId, @RequestBody  Booking booking) {
     return bookingService.create( booking, flight_id,userId);
    
    }
    
    @GetMapping("/getallbooking")
    public List<Booking> getallbooking()
    {
    	 return bookingService.getAllBooking();
    }
    
    @GetMapping("/getbookingbyid/{id}")
    public Booking getbookingbyid(@PathVariable Integer id)
    {
    	 return bookingService.getBookingById(id);
    }
    
    @DeleteMapping("/deletebyid/{id}")
    public String deletebyid(@PathVariable Integer id)
    {
    	 return bookingService.deleteBookingById(id);
    }
    
    @PostMapping("/cancelticket/{id}")
    public String cancelticket(@PathVariable Integer id)
    {
    	 return bookingService.cancelTicket(id);
    	
    }
   
  }

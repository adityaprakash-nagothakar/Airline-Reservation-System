package com.edubridge.service.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edubridge.entity.Booking;
import com.edubridge.entity.Flight;
import com.edubridge.entity.User;
import com.edubridge.repository.BookingRepository;
import com.edubridge.service.BookingService;
import com.edubridge.service.FlightService;
import com.edubridge.service.UserService;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private FlightService flightService;
    
    @Autowired
    private UserService userService;

	@Override
	public Booking create(Booking booking,int flight_id,int userId) {
	   Flight flight= flightService.getFlightById(flight_id);
	   User user=userService.getUserById(userId);
	   booking.setAirlineName(flight.getAirlineName());
	   booking.setArrivalAirport(flight.getArrivalAirport());
	   booking.setDepartureAirport(flight.getDepartureAirport());
	   booking.setDepartureDate(flight.getDepartureDate());
	   booking.setArrivalDate(flight.getArrivalDate());
	 
	   booking.setBookingStatus("Booked");
	   booking.setTicketPrice(flight.getTicketPrice());
	   booking.setUsername(user.getUsername());
	   
		return bookingRepository.save(booking);
	
	}
	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(Integer id) {
		// TODO Auto-generated method stub
		return bookingRepository.findById(id).get();
	}

	@Override
	public String deleteBookingById(Integer id) {
		bookingRepository.deleteById(id);
		 return("Deleted Successfully");
	}


	@Override
	public String cancelTicket(Integer id) {
		Optional<Booking> optionalBooking  =bookingRepository.findById(id);
		 
		 if (optionalBooking.isPresent()) {
			 Booking booking = optionalBooking.get();
	            
	            if ("Canceled".equals(booking.getBookingStatus())) {
	                return "Ticket is already canceled.";
	            }

	            booking.setBookingStatus("Canceled");
	            bookingRepository.save(booking);
	            return "Ticket canceled successfully.";
	        } else {
	            return "Ticket not found.";
	        }}

	
}


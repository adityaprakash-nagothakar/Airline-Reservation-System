package com.edubridge.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Flight;
import com.edubridge.repository.FlightRepository;
import com.edubridge.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	
  
    @Autowired
    FlightRepository flightRepository;
    

    @Override
    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
    
    @Override
    public Flight getFlightById(Integer flightId) {
        return flightRepository.findById(flightId).get();
        
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

   
    @Override
	public String deleteFlightById(Integer flightId) {
    	flightRepository.deleteById(flightId);
		 return("Deleted Successfully");
	}



	@Override
	public List<Flight> getFlightsByAirports(String departure_airport,String arrival_airport ) {
		return null;
	}



	@Override
	public List<Flight> getFlightsByName(String name) {
	return null;
	}
	
}
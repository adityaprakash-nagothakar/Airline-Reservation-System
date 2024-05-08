package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.Flight;

public interface FlightService {
	    Flight createFlight(Flight flight);
	    Flight getFlightById(Integer flight_id);
	    List<Flight> getAllFlights();
	    public String deleteFlightById(Integer id);
		List<Flight> getFlightsByAirports(String departure_airport,String arrival_airport );
		List<Flight> getFlightsByName(String name);

}


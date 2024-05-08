package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.edubridge.entity.Flight;
import com.edubridge.service.FlightService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/flight")
public class FlightController {

	    @Autowired
	    private FlightService flightService;


	    @PostMapping("/addflight")
	    public Flight saveUSer(@RequestBody Flight flight)
	    {
	     return flightService.createFlight(flight);
	    }
	    
	    @GetMapping("/getallflights")
	    public List<Flight> getflights()
	    {
	    	 return flightService.getAllFlights();
	    }
	
	    
	    @GetMapping("/getflightbyid/{flight_id}")
	    public Flight getflightbyid(@PathVariable Integer flight_id)
	    {
	    	 return flightService.getFlightById(flight_id);
	    }
	    
	    
	    @DeleteMapping("/deletebyid/{flight_id}")
	    public String deleteUser(@PathVariable Integer flight_id)
	    {
	    	 return flightService.deleteFlightById(flight_id);
	    }
	    
	    @GetMapping("/byName/{airline}")
	    public ResponseEntity<List<Flight>> getFlightsByName(@PathVariable String airline) {
	        List<Flight> flights = flightService.getFlightsByName(airline);
	        return ResponseEntity.ok(flights);
	    }
    }

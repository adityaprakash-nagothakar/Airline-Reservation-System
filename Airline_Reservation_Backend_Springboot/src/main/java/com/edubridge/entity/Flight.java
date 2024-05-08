package com.edubridge.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;


@Entity

@Table(name="flight_details")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  flight_id;
    private String flight_number;
	private String airlineName ;
	private String departureAirport ;
	private String arrivalAirport ;
	
    @Future(message = "Departure Date must be in the future")
	private Date departureDate;

    @Future(message = "Arrival Date must be in the future")
	private Date arrivalDate ;
	private Double ticketPrice;
	private int noOfTickets;
	
	  public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public Flight() {

	    }

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Flight(int flight_id, String flight_number, String airlineName, String departureAirport,
			String arrivalAirport, @Future(message = "Departure Date must be in the future") Date departureDate,
			@Future(message = "Arrival Date must be in the future") Date arrivalDate, Double ticketPrice,
			int noOfTickets) {
		super();
		this.flight_id = flight_id;
		this.flight_number = flight_number;
		this.airlineName = airlineName;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.ticketPrice = ticketPrice;
		this.noOfTickets = noOfTickets;
	}

	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", flight_number=" + flight_number + ", airlineName=" + airlineName
				+ ", departureAirport=" + departureAirport + ", arrivalAirport=" + arrivalAirport + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", ticketPrice=" + ticketPrice + ", noOfTickets="
				+ noOfTickets + "]";
	}


	  
	  }
	

package com.edubridge.entity;



import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;




@Entity
@Table(name="booking_details")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String airlineName;
    private String departureAirport;
    private String arrivalAirport;

    @Future(message = "Departure Date must be in the future")
    private Date departureDate;
    

    @Future(message = "Arrival Date must be in the future")
    private Date arrivalDate;
    private Double ticketPrice;
    private String bookingStatus;
    public Booking() {

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Booking(int id, String username, String airlineName, String departureAirport, String arrivalAirport,
			@Future(message = "Departure Date must be in the future") Date departureDate,
			 @Future(message = "Arrival Date must be in the future") Date arrivalDate,
			Double ticketPrice, String bookingStatus) {
		super();
		this.id = id;
		this.username = username;
		this.airlineName = airlineName;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.ticketPrice = ticketPrice;
		this.bookingStatus = bookingStatus;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", username=" + username + ", airlineName=" + airlineName + ", departureAirport="
				+ departureAirport + ", arrivalAirport=" + arrivalAirport + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", ticketPrice=" + ticketPrice + ", bookingStatus=" + bookingStatus
				+ "]";
	}

    
    }

	
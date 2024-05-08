package com.edubridge.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment_details")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private int bookingId;
	private int userId;
	private String username;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private Double ticketPrice;
	private String nameOnCard;
	private Double cardNumber;
	private String expYear;
	private int cvv;
	private String paymentStatus;
	private Date paymentDate;
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public Double getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Double cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpYear() {
		return expYear;
	}
	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int paymentId, int bookingId, int userId, String username, Double ticketPrice, String nameOnCard,
			Double cardNumber, String expYear, int cvv, String paymentStatus, Date paymentDate) {
		super();
		this.paymentId = paymentId;
		this.bookingId = bookingId;
		this.userId = userId;
		this.username = username;
		this.ticketPrice = ticketPrice;
		this.nameOnCard = nameOnCard;
		this.cardNumber = cardNumber;
		this.expYear = expYear;
		this.cvv = cvv;
		this.paymentStatus = paymentStatus;
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", userId=" + userId + ", username="
				+ username + ", ticketPrice=" + ticketPrice + ", nameOnCard=" + nameOnCard + ", cardNumber="
				+ cardNumber + ", expYear=" + expYear + ", cvv=" + cvv + ", paymentStatus=" + paymentStatus
				+ ", paymentDate=" + paymentDate + "]";
	}

	
	
}
    
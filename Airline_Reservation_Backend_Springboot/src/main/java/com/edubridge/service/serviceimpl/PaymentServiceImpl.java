package com.edubridge.service.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.entity.Booking;
import com.edubridge.entity.Payment;
import com.edubridge.entity.User;
import com.edubridge.repository.PaymentRepository;
import com.edubridge.service.BookingService;
import com.edubridge.service.PaymentService;
import com.edubridge.service.UserService;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    
    @Autowired
    private BookingService bookingService;
    
    @Autowired
    private UserService userService;

	@Override
	public Payment create(Payment payment,int bookingId,int userId) {
	
		 Booking booking=bookingService.getBookingById(bookingId);
		 User user=userService.getUserById(userId);
		 payment.setTicketPrice(booking.getTicketPrice());
		 payment.setBookingId(booking.getId());
		 payment.setUserId(user.getId());
		 payment.setUsername(user.getUsername());
		 payment.setPaymentStatus("paid");
		return paymentRepository.save(payment);
	}

	@Override
	public List<Payment> getallPayment() {
	    return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentById(Integer id) {
		return paymentRepository.findById(id).get();
	}

	@Override
	public String cancelPayment(Integer id) {
		Optional<Payment> optionalPayment  =paymentRepository.findById(id);
		 
		 if (optionalPayment.isPresent()) {
	            Payment payment = optionalPayment.get();
	            
	            if ("Canceled".equals(payment.getPaymentStatus())) {
	                return "Payment is already canceled.";
	            }

	            payment.setPaymentStatus("Canceled");
	            paymentRepository.save(payment);
	            return "Payment canceled successfully.";
	        } else {
	            return "Payment not found.";
	        }
	}


	public String deletePaymentById(Integer id) {
		return "deleted successfully";
	}

	
}


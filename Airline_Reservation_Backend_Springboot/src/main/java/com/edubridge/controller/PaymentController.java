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

import com.edubridge.entity.Payment;
import com.edubridge.service.PaymentService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    

    @PostMapping("/newpayment/{bookingId}/{userId}")
    public Payment newpayment(@PathVariable int bookingId,@PathVariable int userId,@RequestBody Payment payment) {
     return paymentService.create(payment, bookingId,userId); 
    }
    
    @GetMapping("/getallpayment")
    public List<Payment> getallPayment()
    {
    	 return paymentService.getallPayment();
    }   
    
    @GetMapping("/getpaymentbyid/{id}")
    public Payment getpaymentbyid(@PathVariable Integer id)
    {
    	 return paymentService.getPaymentById(id);
    }  
    
    @PostMapping("/cancelpayment/{id}")
    public String cancelpayment(@PathVariable Integer id)
    {
    	 return paymentService.cancelPayment(id);
    	
    }
    
    @DeleteMapping("/deletebyid/{id}")
    public String deletebyid(@PathVariable Integer id)
    {
    	 return paymentService.deletePaymentById(id);
    }
    
 }

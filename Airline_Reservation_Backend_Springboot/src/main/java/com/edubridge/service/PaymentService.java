package com.edubridge.service;

import java.util.List;
import com.edubridge.entity.Payment;

public interface PaymentService {
    
public Payment create(Payment payment,int bookingId,int userId);
List<Payment> getallPayment();
public Payment getPaymentById(Integer id);
public String cancelPayment(Integer id);
public String deletePaymentById(Integer id);


}
 

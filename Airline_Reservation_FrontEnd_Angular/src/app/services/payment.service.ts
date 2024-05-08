import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from '../commonurl';
import { Payment } from '../payment/payment';
@Injectable({
  providedIn: 'root'
})
export class PaymentService {

  constructor(private httpClient: HttpClient) { }

  public newPayment(bookingId:number,payment:Payment,userId:number)
  {
  return this.httpClient.post(`${baseUrl}/payment/newpayment/${bookingId}/${userId}`, payment);
}

 
public getallPayment()
{
  return this.httpClient.get(`${baseUrl}/payment/getallpayment`);
}

}


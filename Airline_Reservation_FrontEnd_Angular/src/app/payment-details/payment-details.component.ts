import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PaymentService } from '../services/payment.service';


@Component({
  selector: 'app-payment-details',
  templateUrl: './payment-details.component.html',
  styleUrls: ['./payment-details.component.css']
})
export class PaymentDetailsComponent implements OnInit
 {
payments:any;
pageNumber:number=1;
pageCount:number=5;
  constructor(private route:Router,private paymentService:PaymentService)
  {

  }
  ngOnInit(): void 
  {
    this.paymentService.getallPayment().subscribe(
     (data:any)=>
     {
      console.log("data retrived succesfully");
      this.payments=data;
     }
    );
    
  }
public back()
{
  this.route.navigate(['/admin-home']);
}

 }
 


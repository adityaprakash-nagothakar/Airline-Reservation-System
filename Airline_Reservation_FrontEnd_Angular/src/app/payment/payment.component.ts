import { Component, OnInit } from '@angular/core';
import { Payment } from './payment';
import { PaymentService } from '../services/payment.service';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../services/booking.service';
import { Booking } from '../booking/booking';


@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit 
{
    userId:number=0;
    bookingId:number=0; 
    payment=new Payment(0,0,0,"",0,"",0,"",new Date());
    booking=new Booking( 0,"","","","",new Date(), new Date(),0,"");
   
    constructor(private paymentService:PaymentService, private router: Router,private activatedRoute:ActivatedRoute,private bookingService:BookingService) { }
    ngOnInit(): void {
      console.log("Inside PaymentCom ngOnInit");
      this.userId=this.activatedRoute.snapshot.params['userId'];
      this.bookingId=this.activatedRoute.snapshot.params['bookingId'];
      this.bookingService.getBookingById(this.bookingId).subscribe(
      (Response:any)=>{
        console.log("booking retrived");
        this.booking=Response;
      
      }

      )
       }
    public paymentMethod(){
      console.log("inside PaymentMethod");
      this.paymentService.newPayment(this.bookingId,this.payment,this.userId).subscribe(
        (data:any)=>{
          this.payment=data;
          console.log("paid Successfully!"+data);
          alert("payment Done succesfully");
          this.router.navigate(['thankyou']);
        }
      )

    }
}
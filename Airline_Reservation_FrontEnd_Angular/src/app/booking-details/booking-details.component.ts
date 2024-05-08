import { Component, OnInit } from '@angular/core';
import { BookingService } from '../services/booking.service';
import { ActivatedRoute, Router } from '@angular/router';
import { PaymentService } from '../services/payment.service';
import { Payment } from '../payment/payment';
@Component({
  selector: 'app-booking-details',
  templateUrl: './booking-details.component.html',
  styleUrls: ['./booking-details.component.css']
})
export class BookingDetailsComponent implements OnInit{
  
   booking: any;
   pageNumber:number=1;
   pageCount:number=5;
   userId:number=0;
   payment=new Payment(0,0,0,"",0,"",0,"",new Date());
   
    constructor(private route:Router,private bookingService:BookingService,private paymentService:PaymentService,private activatedRoute:ActivatedRoute)
    {

    }
    public paymentMethod(bookingId:number){
      console.log("inside paymentMethod",this.userId);
      this.route.navigate(['/paymenturl',bookingId,this.userId]);
    }
    ngOnInit(): void 
    {
      this.userId=this.activatedRoute.snapshot.params['userId'];
      this.bookingService.getallbooking().subscribe(
       (data:any)=>
       {
        console.log("data retrived succesfully");
        this.booking=data;
       }
      );  
    }
}

  
  

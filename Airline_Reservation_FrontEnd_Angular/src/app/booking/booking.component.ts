import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../services/booking.service';
import { Booking } from './booking';
import { FlightService } from '../services/flight.service';
import { flight } from './flight';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  
 flight_id:number
 userId:number=1;
 booking = new Booking( 0,"","","","",new Date(), new Date(),0,"");
 flight = new flight( 0,"","","","",new Date(), new Date(),0,0);
  constructor(public bookingService: BookingService, private router: Router,private activatedRoute:ActivatedRoute,private flightService:FlightService) { }
  ngOnInit(): void {
   this.flight_id=this.activatedRoute.snapshot.params['flight_id'];
  }
  public newBooking(flight_id){
    this.bookingService.newBooking(flight_id,this.userId,this.booking).subscribe(
      (data:any)=>{
        this.booking=data;
        console.log("Booking Successfully!"+data);
        alert("Booked");
      }
    )
  }
}


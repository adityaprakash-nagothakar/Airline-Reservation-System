import { Component, OnInit } from '@angular/core';
import { FlightService } from '../services/flight.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking/booking';
import { BookingService } from '../services/booking.service';

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css']
})
export class FlightDetailsComponent implements OnInit {
  flights:any;
  pageNumber:number=1;
  pageCount:number=5;
  userId:number=0;
  booking=new Booking(0,"","","","",new Date(), new Date(),0,"");
  constructor(private route:Router,private flightService:FlightService,private bookingService:BookingService,private activatedRoute:ActivatedRoute)
  {

  }
  public newBooking(flight_id:number){
   this.bookingService.newBooking(flight_id,this.userId,this.booking).subscribe(
    (booking)=>{
          alert("Booking Done Successfully");
    }
   )
    //this.route.navigate(['/newBooking',flight_id]);
    }
 
    public back()
    {
      this.route.navigate(['/passenger-home',this.userId]);
    }

    public bookingList()
    {
      this.route.navigate(['/bookingList',this.userId])
    }
  ngOnInit(): void 
  {
    this.userId=this.activatedRoute.snapshot.params['userId'];
    this.flightService.getflights().subscribe(
     (data:any)=>
     {
      console.log("data retrived succesfully");
      this.flights=data;
     }
     
    );
    
  }}




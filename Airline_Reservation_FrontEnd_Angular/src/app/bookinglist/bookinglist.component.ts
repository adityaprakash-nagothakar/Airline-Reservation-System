import { Component, OnInit } from '@angular/core';
import { BookingService } from '../services/booking.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookinglist',
  templateUrl: './bookinglist.component.html',
  styleUrls: ['./bookinglist.component.css']
})
export class BookinglistComponent implements OnInit {
 booking: any;
 pageNumber:number=1;
 pageCount:number=5;

  constructor(private route:Router,private bookingService:BookingService)
  {}
  ngOnInit(): void 
  {
    this.bookingService.getallbooking().subscribe(
     (data:any)=>
     {
      console.log("data retrived succesfully");
      this.booking=data;
     }
    );  
  
  }
  public back()
  {
    this.route.navigate(['/admin-home']);
  }
    }

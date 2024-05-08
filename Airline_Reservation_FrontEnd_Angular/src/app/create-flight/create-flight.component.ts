import { Component, OnInit } from '@angular/core';
import { flight } from './flight';
import { FlightService } from '../services/flight.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-flight',
  templateUrl: './create-flight.component.html',
  styleUrls: ['./create-flight.component.css']
})
export class CreateFlightComponent implements OnInit {
  [x: string]: any;
  
 flight = new flight( 0,"","","","",new Date(), new Date(),0,0);
 
   constructor(public flightService: FlightService, private router: Router) { }
   ngOnInit(): void {}
   public addFlight(){
     this.flightService.createFlight(this.flight).subscribe(
       (data:any)=>{
         this.flight=data;
         console.log("flight added Successfully!"+data);
         alert("New Flight Added succesfully");
       }
     )
   }
   public back()
   {
     this.route.navigate(['/admin-home']);
   }
 }
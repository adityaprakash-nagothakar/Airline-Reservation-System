import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { BookingService } from '../services/booking.service';
//import { Booking} from "./booking";
@Component({
  selector: 'app-passenger-home',
  templateUrl: './passenger-home.component.html',
  styleUrls: ['./passenger-home.component.css']
})
export class PassengerHomeComponent implements OnInit
{
userId:number=0;
router: any;constructor(private route:Router,private activatedRoute:ActivatedRoute){

}
ngOnInit(): void {
this.userId=this.activatedRoute.snapshot.params['userId'];
  
}

public newBooking(){
this.route.navigate(['/newBooking']);
}

public getflights(){
 this.route.navigate(['/getflights',this.userId]);
}

public newPayment(){
  this.route.navigate(['/newPayment'])
}
}
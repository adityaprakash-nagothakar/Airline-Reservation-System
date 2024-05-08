import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { Payment } from '../payment/payment';
@Component({
  selector: 'app-home',
  templateUrl: './admin-home.component.html',
  styleUrls: ['./admin-home.component.css']
})
export class AdminHomeComponent implements OnInit{
  [x: string]: any;
  
  ngOnInit(): void {
  }
  logOut()
{
  this.route.navigate(['/welcome'])
}

public listUsers()
{
  this.route.navigate(['/listuser'])
}
public getAllBooking()
{
  this.route.navigate(['/getAllBooking'])
}

public getflights(){
  this.route.navigate(['/getAllFlights'])

}
public addFlight(){
  this.route.navigate(['/addflight'])
}
public getallPayment(){
  this.route.navigate(['/getallPayment'])
}
}

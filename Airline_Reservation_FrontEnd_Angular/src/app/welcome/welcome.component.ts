import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-welcome',   // static linking
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})

export class WelcomeComponent {
message="Welcome To Angular Session!";
constructor(private route:Router){//injcted router here

}
// if user clicked on reg it will come here and this will navigate to router
public register(){
this.route.navigate(['/register']);
}
public Login(){
  this.route.navigate(['/login']);

}
public loginUser(){
  this.route.navigate(['/loginCheck']);
  }  
public listUsers()
{
  this.route.navigate(['/listUser'])
}

public getBooking()
{
  this.route.navigate(['/getallbooking']);
}
}



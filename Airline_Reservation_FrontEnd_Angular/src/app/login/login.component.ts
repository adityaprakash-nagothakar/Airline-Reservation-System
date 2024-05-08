import { Component, OnInit } from "@angular/core";


import { UserService } from "../services/user.service";
import { User } from "./user";
import { Router } from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit { 
userId:number=0;
user=new User(0,"","","","","","",false,""); 
  invalidLogin: boolean;


constructor(public router:Router, private userService:UserService){} 

  ngOnInit(): void {
  
  }
  public back()
  {
    this.router.navigate(['/welcome']);
  }
  public userLogin(){
    console.log("inside user login");
    this.userService.loginUser(this.user).subscribe(

      (data:any)=>{
        this.user=data;
        console.log("Login Successfully!"+this.user);
        console.log("inside user login"+this.user.role)
        alert("Succesfully login");
        if (this.user.role === 'Admin') 
        {
          console.log(this.user.role)
          this.router.navigate(['/admin-home',this.userId]);
        } else if (this.user.role === 'Passenger') {
          console.log("inside passenger"+this.user.role)
          this.userId=this.user.id;
          //localStorage.setItem("userId",this.userId);
          this.router.navigate(['/passenger-home',this.userId]);
        } else {
          console.log("inside else")
        }
      },
      (error) => {
        // Handle login error
        console.error('Login failed:', error);
      }
    );
  }
}
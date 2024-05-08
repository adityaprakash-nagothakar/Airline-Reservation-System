import { Component, OnInit } from "@angular/core";
import { UserService } from "../services/user.service";
import { Router } from "@angular/router";
import { User } from "./user";

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit
 {
users:any;
pageNumber:number=1;
pageCount:number=5;
  constructor(private route:Router,private userService:UserService)
  {

  }
  ngOnInit(): void 
  {
    this.userService.getUsers().subscribe(
     (data:any)=>
     {
      console.log("data retrived succesfully");
      this.users=data;
     }
    );
    
  }
public back()
{
  this.route.navigate(['/admin-home']);
}
public logOut()
{
  this.route.navigate(['/welcome']);
}
public updateUser()
{
  this.route.navigate(['/updateuser']);
}
 public deleteUser(){
  this.userService.loginUser(this.users).subscribe(
    (data:any)=>{
      console.log("deleted Successfully!"+data);
      alert("Succesfully deleted");
    
    }
  )
}
 }
 


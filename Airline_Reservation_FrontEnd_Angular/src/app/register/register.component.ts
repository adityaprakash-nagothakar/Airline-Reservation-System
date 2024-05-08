import { Component,OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { User } from './user';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
user=new User(0,"","","","","","",false,"");
  route: any;
  ngOnInit(): void {
    

  }
  public back()
{
  this.route.navigate(['/welcome']);
}
  constructor(private userService:UserService, private router: Router){} 
  public create(){
    this.userService.create(this.user).subscribe(
      (data:any)=>{
        console.log("Registered Successfully!"+data);
        alert("Registered");
        this.router.navigate(['login']);
      }
    )
  }
}
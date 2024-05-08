
import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../login/user';
@Component({
  selector: 'app-updateuser',
  templateUrl: './updateuser.component.html',
  styleUrls: ['./updateuser.component.css']
})
export class UpdateuserComponent  implements OnInit{
  userid:number=0;
  user=new User(0,"","","","","","",false,""); 
  id: any;
constructor(private userService:UserService,private activatedRoute:ActivatedRoute,private route:Router)
{

} 
  ngOnInit(): void {
    this.id=this.activatedRoute.snapshot.params['id'];
    this.userService.getUserById(this.id).subscribe(
      (data:any)=>
      {
        this.user=data;
      }
    );
  }
  public updateUser()
  {
    this.userService.updateUser(this.user,this.id).subscribe(
      (data:any)=>
      {
        console.log("data updated successfully");
        alert("Updated Successfully");
        this.route.navigate(['listUser']);
      }
    );
  }
}

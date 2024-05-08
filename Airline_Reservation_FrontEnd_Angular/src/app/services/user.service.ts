import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from '../commonurl';
import { User } from '../login/user';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  authenticate(_username: string, _password: string) {
    throw new Error("Method not implemented.");
  }
  updateUserById(_user: User, _id: number) {
    throw new Error('Method not implemented.');
  }

  constructor(private httpClient: HttpClient) { }

  public create(user:User)
  {
  return this.httpClient.post(`${baseUrl}/user/register`, user);
}
public loginUser(user:User)
{
  console.log("user service"+user);
  return this.httpClient.post(`${baseUrl}/user/logincheck`, user);

}
 
public getUsers()
{
  return this.httpClient.get(`${baseUrl}/user/getusers`);
}
 public getUserById(id:number)
 {
return this.httpClient.get(`${baseUrl}/user/byid/${id}`);
 }

public updateUser(user:User,id:number)
{
  return this.httpClient.put(`${baseUrl}/user/update/${id}`, user)
}
public deleteUser(id:number)
{
  return this.httpClient.delete(`${baseUrl}/user/delete/${id}`);
}
public getAllPassengers()
{
return this.httpClient.get(`${baseUrl}/user/get/passenger`);
}


}
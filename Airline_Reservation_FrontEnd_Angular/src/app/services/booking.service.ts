import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from '../commonurl';
import { Booking } from '../booking/booking';

//import { Booking } from '../passenger-home/booking';
@Injectable({
  providedIn: 'root'
})
export class BookingService {
  flight: any;
  newbooking(booking: Booking) {
    throw new Error('Method not implemented.');
  }
  constructor(private httpClient: HttpClient) { }

  public newBooking(flight_id:number,userId:number,booking:Booking)
  {
  return this.httpClient.post(`${baseUrl}/booking/newbooking/${flight_id}/${userId}`, booking);
 }

public getallbooking()
{
  return this.httpClient.get(`${baseUrl}/booking/getallbooking`);
}
public cancelTicket(id:number,booking:Booking)
{
  return this.httpClient.post(`${baseUrl}/booking/cancelTicket/${id}`,booking);
}
 public getBookingById(id:number)
 {
return this.httpClient.get(`${baseUrl}/booking/getbookingbyid/${id}`);
 }
 bookFlight(id: number, numberOfTickets: number): boolean {
  const flight = this.flight.find((f) => f.id === id);

  if (flight && flight.availableSeats >= numberOfTickets) {
    flight.availableSeats -= numberOfTickets;
    return true;
  }

  return false;
}
}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from '../commonurl';
import { flight } from '../flight-details/flight';
@Injectable({
  providedIn: 'root'
})
export class FlightService {

  constructor(private httpClient: HttpClient) { }

  public createFlight(flight:flight)
  {
  return this.httpClient.post(`${baseUrl}/flight/addflight`, flight);
}

 
public getflights()
{
 
  return this.httpClient.get(`${baseUrl}/flight/getallflights`);
}
 public getFlightById(flight_id:number)
 {
return this.httpClient.get(`${baseUrl}/flight/getflightbyid/${ flight_id}`);
 }
}

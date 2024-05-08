export class flight{
flight_id:number;
flight_number:string;
airlineName:string;
departureAirport:string;
arrivalAirport:string;
departureDate:Date;
arrivalDate:Date;
ticketPrice:number;


constructor(
   flight_id:number,
   flight_number:string,
   airlineName:string,
   departureAirport:string,
   arrivalAirport:string,
   departureDate:Date,
   arrivalDate:Date,
   ticketPrice:number,
   
){
 this.flight_id=flight_id;
 this.flight_number=flight_number;
 this.airlineName=airlineName;
 this.departureAirport=departureAirport;
 this.arrivalAirport=arrivalAirport;
 this.departureDate=departureDate;
 this.arrivalDate=arrivalDate;
 this.ticketPrice=ticketPrice;

}}

      export class Booking
{ 
     id:number;
      username:string;
     airlineName:string;
     departureAirport:string;
     arrivalAirport:string;
     departureDate:Date;
     arrivalDate:Date;
     ticketPrice:number;
     bookingStatus:string;

constructor(
        id:number,
        username:string,
        airlineName:string,
        departureAirport:string,
        arrivalAirport:string,
        departureDate:Date,
        arrivalDate:Date,
        ticketPrice:number,
        bookingStatus:string,
    ){
      this.id=id;
      this.username=username;
      this.airlineName=airlineName;
      this.departureAirport=departureAirport;
      this.arrivalAirport=arrivalAirport;
      this.departureDate=departureDate;
      this.arrivalDate=arrivalDate;
      this.ticketPrice=ticketPrice;
      this.bookingStatus=bookingStatus;  
    }}

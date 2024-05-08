
export class Payment{
    paymentId:number;
    bookingId:number;
    ticketPrice:number;
    nameOnCard:string;
    cardNumber:number;
    expYear:string;
    cvv:number;
    paymentStatus:string;
    paymentDate:Date;
 
    constructor(
 
         paymentId:number,
         bookingId:number,
      
         ticketPrice:number,
         nameOnCard:string,
         cardNumber:number,
         expYear:string,
         cvv:number,
         paymentStatus:string,
         paymentDate:Date,
         )
{  
   this.paymentId=paymentId;
 
   this.bookingId=bookingId;
   this.ticketPrice=ticketPrice;
   this.nameOnCard=nameOnCard;
   this.cardNumber=cardNumber;
   this.expYear=expYear;
   this.cvv=cvv;
   this.paymentStatus=paymentStatus;
   this.paymentDate=paymentDate;
 }}

 
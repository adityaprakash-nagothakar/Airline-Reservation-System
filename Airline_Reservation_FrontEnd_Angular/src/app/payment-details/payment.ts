
export class Payment{
    paymentId:number;
    paymentDate:Date;
    bookingId:number;
    ticketPrice:number;
    nameOnCard:string;
    cardNumber:number;
    expYear:string;
    cvv:number;
    paymentStatus:string;
   
 
    constructor(
 
         paymentId:number,
         paymentDate:Date,
         bookingId:number,
         ticketPrice:number,
         nameOnCard:string,
         cardNumber:number,
         expYear:string,
         cvv:number,
         paymentStatus:string,
       
         )
{  
   this.paymentId=paymentId;
   this.paymentDate=paymentDate;
   this.bookingId=bookingId;
   this.ticketPrice=ticketPrice;
   this.nameOnCard=nameOnCard;
   this.cardNumber=cardNumber;
   this.expYear=expYear;
   this.cvv=cvv;
   this.paymentStatus=paymentStatus;
  
 }}

 
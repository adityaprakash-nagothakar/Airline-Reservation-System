import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { RegisterComponent } from './register/register.component';
import { ListuserComponent } from './listuser/listuser.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { PassengerHomeComponent } from './passenger-home/passenger-home.component';
import { BookingComponent } from './booking/booking.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { PaymentComponent } from './payment/payment.component';
import { PaymentDetailsComponent } from './payment-details/payment-details.component';
import { BookinglistComponent } from './bookinglist/bookinglist.component';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { ThankyouComponent } from './thankyou/thankyou.component';

const routes: Routes = [{path:'',component:WelcomeComponent} ,
{path:'welcome',component:WelcomeComponent} ,
{path:'login',component:LoginComponent}, 
{path:'register',component:RegisterComponent },
{path:'admin-home', component: AdminHomeComponent },
{path:'admin-home/:userId',component:AdminHomeComponent},
{path:'listUsers',component:ListuserComponent },
{path:'admin-home/getAllBooking', component: BookinglistComponent }, 
{path:'admin-home/getflights',component:FlightDetailsComponent},
{path:'addFlight',component:CreateFlightComponent},
{path:'admin-home/addflight',component:CreateFlightComponent},
{path:'updateuser',component:UpdateuserComponent},
{path:'newBooking/:flight_id',component:BookingComponent},
{path:'passenger-home/:userId',component:PassengerHomeComponent},
{path:'passenger-home/newBooking',component:BookingComponent},
{path:'getflights/:userId',component:FlightDetailsComponent},

{path:'getflights/newBooking',component:BookingComponent},
{path:'paymenturl/:bookingId/:userId',component:PaymentComponent},
{path:'bookingList/:userId',component:BookingDetailsComponent},
{path:'booking-details/getbooking',component:BookingComponent},
{path:'newPayment',component:PaymentComponent},
{path:'getallPayment',component:PaymentDetailsComponent},
{path:'getAllBooking',component:BookinglistComponent},
{path:'booking',component:BookingComponent},
{path:'thankyou',component:ThankyouComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
export const routingComponents= [
  AdminHomeComponent,
  ]




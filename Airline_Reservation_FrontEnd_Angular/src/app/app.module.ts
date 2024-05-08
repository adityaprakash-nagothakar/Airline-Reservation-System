import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ListuserComponent } from './listuser/listuser.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { AdminHomeComponent}from './admin-home/admin-home.component';
import { PassengerHomeComponent } from './passenger-home/passenger-home.component';
import { FlightDetailsComponent } from './flight-details/flight-details.component';
import { PaymentDetailsComponent } from './payment-details/payment-details.component';
import { BookingComponent } from './booking/booking.component';
import { CreateFlightComponent } from './create-flight/create-flight.component';
import { PaymentComponent } from './payment/payment.component';
import { BookinglistComponent } from './bookinglist/bookinglist.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { BookingDetailsComponent } from './booking-details/booking-details.component';
import { ThankyouComponent } from './thankyou/thankyou.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    WelcomeComponent,
    ListuserComponent,
    UpdateuserComponent,
    AdminHomeComponent,
    PassengerHomeComponent,
    FlightDetailsComponent,
    PaymentDetailsComponent,
    BookingComponent,
    CreateFlightComponent,
    PaymentComponent,
    BookinglistComponent,
    BookingDetailsComponent,
    ThankyouComponent,
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgxPaginationModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

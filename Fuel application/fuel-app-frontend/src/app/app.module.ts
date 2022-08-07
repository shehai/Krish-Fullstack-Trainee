import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { OrderComponent } from './order/order.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CheckOrderStatusComponent } from './check-order-status/check-order-status.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    OrderComponent,
    CheckOrderStatusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'order', component:OrderComponent},
      //{path:'employees/:id', component:EmployeesComponent, canActivate:[CreateEmployeeGuard]},
      {path:'home', component:HomeComponent},
      {path:'', redirectTo:'home', pathMatch:'full'},



    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

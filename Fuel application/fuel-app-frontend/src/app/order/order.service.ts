import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { Order } from './order.model';
@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private orderUrl: string = 'http://localhost:8080/order/'

  constructor(private http: HttpClient) {

      }


      saveOrder(order:Order) : Observable <any>{

        return this.http.post(`${this.orderUrl}`,order);
         //console.log(order);

    }
}

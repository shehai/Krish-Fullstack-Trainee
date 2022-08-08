import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from "rxjs";
import { Order } from '../models/order.model';
@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private orderUrl: string = 'http://localhost:8080/order/'

  constructor(private http: HttpClient) {

      }


      saveOrder(order:Order) : Observable <Order>{

        return this.http.post<Order>(`${this.orderUrl}`,order);
         //console.log(order);

    }

    getOrderById(id:string): Observable<Order>{

      return this.http.get<Order>(`${this.orderUrl}id/${id}`);
    }


}

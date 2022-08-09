import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from '../models/order.model';

@Injectable({
  providedIn: 'root'
})
export class DispatchService {

  private dispatchUrl: string = 'http://localhost:9002/dispatch/'

  constructor(private http :HttpClient) { }



  dispatchOrders(id:string):Observable<Order>{

    return this.http.get<Order>(`${this.dispatchUrl}id/${id}`);

  }
}




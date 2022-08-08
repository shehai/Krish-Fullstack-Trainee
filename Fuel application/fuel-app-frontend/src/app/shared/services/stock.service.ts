import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Stock } from '../models/stock.model';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  private stockUrl: string = 'http://localhost:9000/stock/'

  constructor(private http: HttpClient) { }


  getAllStock() : Observable <Stock[]>{

    return this.http.get<Stock[]>(`${this.stockUrl}`);
     //console.log(order);

}
}

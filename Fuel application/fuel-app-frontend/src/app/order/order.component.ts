import { Component, OnInit } from '@angular/core';
import { Order } from '../shared/models/order.model';
import { OrderService } from '../shared/services/order.service';
import {NgForm} from '@angular/forms';
import { Stock } from '../shared/models/stock.model';
import { StockService } from '../shared/services/stock.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  order ={} as Order ;
  newOrder={} as Order;
  OrderId : String;
  stock!:Stock[];
  filteredStock!:Stock[];

  //order:Order={orderId:""}
  //order:Object ={};
  constructor(private orderService:OrderService, private stockService:StockService) { }

  ngOnInit(): void {

     this.stockService.getAllStock().subscribe(
       data => {
        this.filteredStock = data;
        this.stock = this.filteredStock
        console.log(this.filteredStock);
      }
    )
  }

  submitOrder(){

    this.orderService.saveOrder(this.order).subscribe(data => {

      this.newOrder = data
      this.OrderId= this.newOrder.orderId;
      alert('Your Order ID is: '+ this.OrderId);
      console.log(this.OrderId);
      //this.refreshPeople();
    })
    console.log(this.order);


  }



}

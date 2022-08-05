import { Component, OnInit } from '@angular/core';
import { Order } from './order.model';
import { OrderService } from './order.service';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  order ={} as Order ;
  //order:Order={orderId:""}
  //order:Object ={};
  constructor(private orderService:OrderService) { }

  ngOnInit(): void {
  }

  submitOrder(){

    this.orderService.saveOrder(this.order).subscribe(data => {
      console.log(data)
      //this.refreshPeople();
    })
    console.log(this.order);


  }


}

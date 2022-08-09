import { Component, OnInit } from '@angular/core';
import { Order } from '../shared/models/order.model';
import { OrderService } from '../shared/services/order.service';

@Component({
  selector: 'app-check-order-status',
  templateUrl: './check-order-status.component.html',
  styleUrls: ['./check-order-status.component.css']
})
export class CheckOrderStatusComponent implements OnInit {

  order ={} as Order ;
  orders={} as Order;
  id:string;
  showTable:boolean=false;
  alert:boolean=false;
  constructor(private orderService:OrderService) { }

  ngOnInit(): void {
  }


  searchOrder(){

    this.orderService.getOrderById(this.order.orderId).subscribe(data => {

      this.orders = data

      this.showTable=true;

      console.log(this.orders);

    },
    error=>alert('Inavile Order Id')
    );
    console.log(this.orders);

  }


  confirmOrder(id:string){

    //this.id =id;

    this.orderService.orderConfirm(id).subscribe(data => {

      this.order = data

      this.Success();

      //console.log(this.order);

    },

    error=>alert('Order is cannot dispatch')
    );
   // console.log(id);

  }

  Success(){
    this.alert=true;

  }

  closeAlert(){

    this.alert=false
    window.location.reload();
  }

}

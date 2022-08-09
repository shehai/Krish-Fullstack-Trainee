import { Component, OnInit } from '@angular/core';
import { Order } from '../shared/models/order.model';
import { OrderService } from '../shared/services/order.service';
 import { DispatchService } from '../shared/services/dispatch.service';

@Component({
  selector: 'app-dispatch',
  templateUrl: './dispatch.component.html',
  styleUrls: ['./dispatch.component.css']
})
export class DispatchComponent implements OnInit {

  dispatched= new Array();
  orders: Order[]=[];
  order={} as Order;
  filteredOrders:Order[]=[];
  private _fuelStationNameFilter:string ='';
  id:string;
  alert:boolean=false;
  orderId:string;

  set fuelStationNameFilter(value:string){
    console.log('setter fired' +value);
    this._fuelStationNameFilter=value;
    this.filterByFuelStationName();
  }

  get fuelStationNameFilter(){
    return this._fuelStationNameFilter;
  }
  constructor(private orderService: OrderService, private dispatchService: DispatchService) { }

  ngOnInit(): void {



    this.orderService.getScheduledOrders().subscribe({

      next: data => {
        this.filteredOrders = data;
        this.orders = this.filteredOrders
      }

    })
  }

  filterByFuelStationName(){

    return this.filteredOrders = this.orders.filter(orders=>orders.fuelStationName.includes(this.fuelStationNameFilter))
  }

  dispatchOrder(id:string){

    //this.id =id;

    this.dispatchService.dispatchOrders(id).subscribe(data => {

      this.order = data
      this.orderId=this.order.orderId;
      this.Success();



      //console.log(this.order);

    },
    error=>alert('Order is cannot dispatch')
    );
    //console.log(this.orders);

  }

  Success(){
    this.alert=true;

  }

  closeAlert(){

    this.alert=false
    window.location.reload();
  }




}

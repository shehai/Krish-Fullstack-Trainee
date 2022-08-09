import { Component, OnInit } from '@angular/core';
import { Order } from '../shared/models/order.model';
import {OrderService} from '../shared/services/order.service'

@Component({
  selector: 'app-view-all-order',
  templateUrl: './view-all-order.component.html',
  styleUrls: ['./view-all-order.component.css']
})
export class ViewAllOrderComponent implements OnInit {

  orders: Order[]=[];
  filteredOrders:Order[]=[];
  private _fuelStationNameFilter:string ='';

  set fuelStationNameFilter(value:string){
    console.log('setter fired' +value);
    this._fuelStationNameFilter=value;
    this.filterByFuelStationName();
  }

  get fuelStationNameFilter(){
    return this._fuelStationNameFilter;
  }
  constructor(private orderService: OrderService) { }

  ngOnInit(): void {

    this.orderService.getAllOrders().subscribe({

      next: data => {
        this.filteredOrders = data;
        this.orders = this.filteredOrders
      }

    })
  }

  filterByFuelStationName(){

    return this.filteredOrders = this.orders.filter(orders=>orders.fuelStationName.includes(this.fuelStationNameFilter))
  }



}

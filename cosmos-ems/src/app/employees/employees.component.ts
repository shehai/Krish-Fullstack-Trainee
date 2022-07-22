import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { EmployeeService } from './employee.service';

import { Employee } from './Employees.model';

@Component({
  selector: 'em-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.scss']
})
export class EmployeesComponent implements OnInit, OnDestroy  {


  title:string ="Employee Management Solution"
  employees!:Employee[];
  filteredEmployees!:Employee[];
  showIcon:boolean=false;
  message:string='';
  private _designationFilter:string ='';
  substriber!: Subscription;

  set designationFilter(value:string){
    console.log('setter fired' +value);
    this._designationFilter=value;
    this.filterByDesignation();
  }

  get designationFilter(){
    return this._designationFilter;
  }
  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {

    this.substriber = this.employeeService.getEmployees().subscribe({
      next: data => {
        this.filteredEmployees = data;
        this.employees = this.filteredEmployees
      }
    })
  }

  ngOnDestroy() {
    this.substriber.unsubscribe();
  }

toggleIcon(){

  this.showIcon=!this.showIcon


}

filterByDesignation(){

  return this.filteredEmployees = this.employees.filter(employee=>employee.designation.includes(this.designationFilter))
}

onMessageRecieved(value:string){

  this.message=value;
}


}

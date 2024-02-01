// Imports
import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { Employee } from '../core/interfaces/employee';
import { EmpLoginService } from '../core/services/emp-login.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent implements OnInit {

    // Calling for both the interfaces and service files
    // Allows for functions to use employees and index
    employee: Employee[];
    index: number;


  constructor(
    public empService: EmpLoginService
  ) { }

  ngOnInit(): void {
    // We do not want all of the employee accounts to be displayed, but rather only the account of the user. 
      this.empService.getEmployee().subscribe((emp: Employee[]) => {
            this.employee = emp;
      })
  }

  deleteBtn(index) {
    // Deletes employee account by using the account from the list
      // pulls information out by indexing the array of employees
    this.empService.deleteEmployee(this.employee[index].Id).subscribe(() => {
        //splicing to remove
        // this.employee.splice(index, 1);
        this.employee.splice(index, 1);
    })
  }

  addEmployee (emp: Employee) {
    this.employee.push(emp);
  }
}

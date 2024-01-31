// Imports
import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../../core/interfaces/employee';
import { EmployeeComponent } from '../employee.component';

@Component({
  selector: 'app-emp-acc',
  templateUrl: './emp-acc.component.html',
  styleUrls: ['./emp-acc.component.scss']
})
export class EmpAccComponent implements OnInit {

    // Inputs
    @Input() employee: Employee = null;
    @Input() index: number = -1;

  constructor(
    private home: EmployeeComponent,
    private router: Router
  ) { }

  ngOnInit(): void {

  }
    
  deleteBtn() {
    this.home.deleteBtn(this.index);
  }

  updateBtn(Id: number) {
    this.router.navigate(['emp/', Id]);
  }

}

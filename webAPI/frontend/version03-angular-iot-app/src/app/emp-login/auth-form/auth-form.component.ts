// imports
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from  '@angular/router';
import { Employee } from '../../core/interfaces/employee';
import { EmpLoginService } from '../../core/services/emp-login.service';

@Component({
  selector: 'app-auth-form',
  templateUrl: './auth-form.component.html',
  styleUrls: ['./auth-form.component.scss']
})
export class AuthFormComponent implements OnInit {

    // Data Types
    emp: Employee = {
        Id: null,
        Name: null,
        Address: '',
        City: '',
        State: '',
        Zip: '',
        CreatedDate: '',
    };

    employee: Employee[]

    // Defining form as "formGroup" and giving it a type and validator 
    formGroup = new FormGroup({
           name: new FormControl('', Validators.required),
           id: new FormControl(-1, Validators.required),
    });
    
  constructor(
    private empService: EmpLoginService,
    private router: Router
  ) { }
  

  // Pulls in data from the node server to populate accounts
  ngOnInit(): void {
      this.empService.getEmployee().subscribe((employee: Employee[]) => {
        this.employee = employee;
      })
  }

  submitBtn() {
    this.employee.forEach((employee: Employee) => {
        if(employee.Id === Number(this.emp.Id) && employee.Name === this.emp.Name) {
            this.router.navigate(['home']); // change this route later when there is an employee interface that only shows their account, not the others.
        }
    })
  }
}

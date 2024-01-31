// Import
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Employee } from '../../core/interfaces/employee';
import { EmpLoginService } from '../../core/services/emp-login.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-emp-form',
  templateUrl: './emp-form.component.html',
  styleUrls: ['./emp-form.component.scss']
})
export class EmpFormComponent implements OnInit {

    // Variables
    title: string;
    updateInfo: boolean = false;

    newEmployee: Employee = {
        Id: -1,
        Name: '',
        Address: '',
        City: '',
        State: '',
        Zip: '',
        CreatedDate: '',
    };

    // Declaring a new form
    formGroup = new FormGroup({
        name: new FormControl('', Validators.required),
        address: new FormControl('', Validators.required),
        city: new FormControl('', Validators.required),
        state: new FormControl('', Validators.required),
        zip: new FormControl('', Validators.required),
    });

  constructor(
    private empService: EmpLoginService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
      this.newEmployee.Id = Number(this.activatedRoute.snapshot.paramMap.get('id'));
      if(this.newEmployee.Id > -1) {
        this.title = "UPDATE INFO";
        this.updateInfo = true;
        this.empService.getEmployeeById(this.newEmployee.Id).subscribe((employee: Employee) => {
            this.newEmployee = employee;
        })
      } else {
        this.title = "CREATE ACCOUNT";
        this.updateInfo = false;
      }
  }
    
  submitBtn() {
    if(this.updateInfo) {
        this.empService.updateEmployee(this.newEmployee).subscribe(() => {
            this.router.navigate(['home']);
        })
    } else { 
        delete this.newEmployee.Id;
        this.empService.addEmployee(this.newEmployee).subscribe(() => {
            this.router.navigate(['login']);
        })
    }
  }
}

// imports
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AuthEmpFormComponent } from './auth-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [AuthEmpFormComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule
  ],
  exports: [
    AuthEmpFormComponent,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class AuthEmpFormModule { }

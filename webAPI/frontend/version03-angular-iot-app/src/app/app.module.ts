// imports
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AuthFormModule } from './login/auth-form/auth-form.module';
import { AuthEmpFormModule } from './emp-login/auth-form/auth-form.module';
// import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AccountsComponent } from './accounts/accounts.component';
import { AccFormComponent } from './accounts/acc-form/acc-form.component';
import { AccountModule } from './accounts/account/account.module';
import { EmpLoginComponent } from './emp-login/emp-login.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmpFormComponent } from './employee/emp-form/emp-form.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ThemeToggleComponent } from './theme-toggle/theme-toggle.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AccountsComponent,
    AccFormComponent,
    EmpLoginComponent,
    EmployeeComponent,
    EmpFormComponent,
    ThemeToggleComponent,
   // AuthFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AuthFormModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AccountModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

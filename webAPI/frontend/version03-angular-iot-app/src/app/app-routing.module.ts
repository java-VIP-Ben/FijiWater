//imports
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AccountsComponent } from './accounts/accounts.component';
import { AccFormComponent } from './accounts/acc-form/acc-form.component';
import { EmpLoginComponent } from './emp-login/emp-login.component';

const routes: Routes = [
    { path: '', redirectTo: 'login', pathMatch: 'full' },
    { path: 'home', component: AccountsComponent },
    { path: 'login', component: LoginComponent },
    { path: 'acc/:id', component: AccFormComponent },
    { path: 'employee', component: EmpLoginComponent },
    // Add an EmpFormComponent that allows for a different employee home page
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

// imports
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AuthFormModule } from './login/auth-form/auth-form.module';
// import { LoginComponent } from './login/login.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AccountsComponent } from './accounts/accounts.component';
import { AccFormComponent } from './accounts/acc-form/acc-form.component';
import { AccountModule } from './accounts/account/account.module';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AccountsComponent,
    AccFormComponent,
   // AuthFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AuthFormModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AccountModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

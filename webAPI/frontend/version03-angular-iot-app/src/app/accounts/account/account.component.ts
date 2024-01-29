// Imports
// Requires "Input" because the user is putting in information through the interface files
import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Account } from '../../core/interfaces/accounts';
import { AccountsComponent } from '../accounts.component';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit {

    // Inputs
    @Input() account: Account = null;
    @Input() index: number = -1;

  constructor(
    private home: AccountsComponent,
    private router: Router
  ) { }

  ngOnInit(): void {
  }
  
  deleteBtn() {
    this.home.deleteBtn(this.index);
  }

  updateBtn(Id: number) {
    this.router.navigate(['acc/', Id]);
  }
}

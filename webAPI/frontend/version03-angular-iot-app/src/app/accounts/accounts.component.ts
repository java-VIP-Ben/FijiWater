// Imports
import { Component, OnInit } from '@angular/core';
import { NgForm, FormGroup, FormControl, Validators } from '@angular/forms';
import { Account } from '../core/interfaces/accounts';
import { AccountsService } from '../core/services/accounts.service';


@Component({
  selector: 'app-accounts',
  templateUrl: './accounts.component.html',
  styleUrls: ['./accounts.component.scss']
})
export class AccountsComponent implements OnInit {

    // calling for both the interfaces and service files
    // Allows for functions to use accounts and index
    accounts: Account[];
    index: number;


  constructor(
    public accService: AccountsService
  ) { }

  ngOnInit(): void {
      // Pull and define all accounts in a list to be displayed to the current user
      this.accService.getAccounts().subscribe((accs: Account[]) => {
        this.accounts = accs;
      })
  }

  deleteBtn(index) {
    // Deletes account by using the account from the list
      // we pull this by indexing our array of accounts
    this.accService.deleteAccount(this.accounts[index].Id).subscribe(() => {
        // Splicing the object, which removes the deleted object from the list
            // Does so without repulling the data from the database. 
        this.accounts.splice(index, 1);
    })
  }

  addAcc(acc: Account) {
    this.accounts.push(acc);
  }
}

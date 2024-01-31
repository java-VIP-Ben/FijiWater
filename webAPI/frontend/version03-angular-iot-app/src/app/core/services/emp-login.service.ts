// Imports
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../interfaces/employee'; // Will error, needs employee routes fixed

@Injectable({
  providedIn: 'root'
})
export class EmpLoginService {

  uri = 'http://localhost:3000';

  constructor(
    private http: HttpClient
  ) { }

  getEmployeeById(id: number) {
    return this.http.get<Employee[]>(`${this.uri}/employee/${id}`);
  }
}

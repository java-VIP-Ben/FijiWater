// Imports
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Employee } from '../interfaces/employee'; // Will error, needs employee routes fixed

@Injectable({
  providedIn: 'root'
})
export class EmpLoginService {

  uri = 'http://localhost:3000';

  //incorporating trackBy in case there are errors in the imports
  trackByIndex(index: number): number {
    return index;
  }

  constructor(
    private http: HttpClient
  ) { }
    
  getEmployee() {
    return this.http.get<Employee[]>(`${this.uri}/employee`);
  }

  getEmployeeById(id: number) {
    return this.http.get<Employee>(`${this.uri}/employee/${id}`);
  }

  addEmployee(data: Employee) {
    return this.http.post<Employee>(`${this.uri}/employee/add`, data);
  }

  updateEmployee(data: Employee) {
    return this.http.post<Employee>(`${this.uri}/employee/update`, data);
  }

  deleteEmployee(id: number) {
    return this.http.delete<Employee>(`${this.uri}/employee/delete/${id}`);
  }
}

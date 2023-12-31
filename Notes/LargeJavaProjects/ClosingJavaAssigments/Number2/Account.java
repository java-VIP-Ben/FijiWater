//testing blackbox code
import Checking;

public class Account {  
	protected int id;  
	protected double balance;  
	protected static double annualInterestRate;  
	protected java.util.Date dateCreated;  
	public Account() {    
		dateCreated = new java.util.Date();  
	}  
	public Account(int newId, double newBalance) {    
		id = newId;    
		balance = newBalance;    
		dateCreated = new java.util.Date();  
	}  
	public int getId() {    
		return this.id;  
	}  
	public double getBalance() {    
		return balance;  
	}  
	public static double getAnnualInterestRate() {    
		return annualInterestRate;  
	}  
	public void setId(int newId) {    
		id = newId;  
	}  
	public void setBalance(double newBalance) {    
		balance = newBalance;  
	}  
	public static void setAnnualInterestRate(double newAnnualInterestRate) {    
		annualInterestRate = newAnnualInterestRate;  
	}  
	public double getMonthlyInterest() {    
		return balance * (annualInterestRate / 1200);
	}  
	public java.util.Date getDateCreated() {    
		return dateCreated;  
	}  
	public void withdraw(double amount) {    
		balance -= amount;  
	}  
	public void deposit(double amount) {    
		balance += amount;  
	}
	public Checking getChecking() {
		getChecking().setBalance(100.00);
		return new Checking();
	}
}
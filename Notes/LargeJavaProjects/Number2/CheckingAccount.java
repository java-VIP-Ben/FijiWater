public class CheckingAccount extends Account {
    private double overdraftLimit;

    // Constructer for the CheckingAccount with overdraft limit
    public CheckingAccount(int newId, double newBalance, double overdraftLimit) {
        super(newId, newBalance);
        this.overdraftLimit = overdraftLimit;
    }

    //getters and setters
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Overrides the  withdraw method to check for a overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal exceeds overdraft limit. Transaction cancelled.");
        } else {
            balance -= amount;
        }
    }
}
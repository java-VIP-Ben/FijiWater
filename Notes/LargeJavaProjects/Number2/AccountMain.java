import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

            // Create a custom account
            System.out.print("Enter account ID: ");
            int accountId = ui.nextInt();
            System.out.print("Enter initial balance: ");
            double initialBalance = ui.nextDouble();
            //System.out.println("What is your annual interest rate?");
            //double annualInterestRate = ui.nextDouble();
            System.out.println("Please set an overdraft limit:");
            Double overdraftLimit = ui.nextDouble();
            
            Account Account = new Account(accountId, initialBalance);
            operateAccount(Account);
            ui.close();
    }

    private static void operateAccount(Account account) {
        Scanner ui = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nAccount Information:");
            System.out.println("Account ID: " + account.getId());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Annual Interest Rate: " + Account.getAnnualInterestRate());

            //print statement
            System.out.print("\n\nEnter your choice: \n1.)Deposit\n2.)Withdrawal\n3.)Check Interest\n4.)Exit\n");

            int operation = ui.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = ui.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = ui.nextDouble();
                    account.withdraw(withdrawalAmount);
                    System.out.println("Withdrawal successful.");
                    break;
                case 3:
                    System.out.println("Monthly Interest: " + account.getMonthlyInterest());
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter an acceptable choice.");
            }
        }
        //closing the UI HOW IS THIS SO HARD FOR PEOPLE 
        ui.close();
    }
}

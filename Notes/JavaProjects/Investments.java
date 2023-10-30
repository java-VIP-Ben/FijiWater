//imports
import java.util.Scanner;
public class Investments {
    public static void main(String[] args) {
        //ive never used doubles before, so I wanted to see what they do
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your initial investment?");
        double investment = ui.nextDouble();
        System.out.println("What is the monthly interest rate? (%)");
        double interest = ui.nextDouble();
        System.out.println("How many years do you want to calculate for?");
        double years = ui.nextDouble();

        //determining the future value of the account
        System.out.println("Future Value: $" + (Math.round(investment*Math.pow((1 + (interest/1200)), (years*12)))));

        //remembering to close the UI
        ui.close();

    }
}

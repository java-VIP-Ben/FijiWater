import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your hourly rate?"); //based on the idea that you work 2000 hours a year
        double hourly = ui.nextDouble();
        System.out.printf("Your yearly salary would be $" + "%2.2%n", hourly*2000);
        ui.close();

        
    }
}
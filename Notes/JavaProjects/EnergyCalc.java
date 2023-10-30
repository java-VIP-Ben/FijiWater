//imports
import java.util.Scanner;

public class EnergyCalc {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Input the amount of water in kilograms:");
        double water = ui.nextDouble();
        System.out.println("What is the starting temperature in celsius?");
        double temps = ui.nextDouble();
        System.out.println("Enter the final temperature in celsius:");
        double ftemps = ui.nextDouble();

        //calculations
        double energy = (water * (ftemps - temps)) * 4184;        
        System.out.printf("The amount of energy needed is " + energy + " joules.");
    }
}

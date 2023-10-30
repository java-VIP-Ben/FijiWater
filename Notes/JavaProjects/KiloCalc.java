//imports
import java.util.Scanner;

public class KiloCalc {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter the amount of miles:");
        double miles = ui.nextDouble();

        System.out.println(miles + " miles is equivalent to " + (miles*1.6) + " kilometers.");
        ui.close();
    }
}

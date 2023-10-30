//imports
import java.text.DecimalFormat;
import java.util.Scanner;


public class CostOfDriving {
    public static void main(String[] args) {
        
        //starting the project
        Scanner ui = new Scanner(System.in);

        System.out.println("How far are you driving?");
        Double distance = ui.nextDouble();
        System.out.println("How many miles per gallon does your vehicle get?");
        Double gallons = ui.nextDouble();
        System.out.println("How much does a gallon of gas cost you?");
        Double price = ui.nextDouble();

        //calculating the price of driving
        Double mpg = (distance / gallons);
        Double total = (mpg * price);
        DecimalFormat f = new DecimalFormat("###.##");
        System.out.println("The cost of driving is: $" + f.format(total));

        ui.close();
        

    }
}

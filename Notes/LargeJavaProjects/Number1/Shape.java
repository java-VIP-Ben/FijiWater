//import 
import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        //goofball variables
        Double side1 = 1.0;
        Double side2 = 1.0;
        Double side3 = 1.0;


        System.out.println("Enter the length of side 1: ");
        side1 = ui.nextDouble();
        System.out.println("Enter the length of side 2: ");
        side2 = ui.nextDouble();
        System.out.println("Enter the length of side 3: ");
        side3 = ui.nextDouble();

        ui.close();
    }
}

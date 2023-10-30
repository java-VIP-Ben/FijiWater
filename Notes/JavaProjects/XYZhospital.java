//imports
import java.util.Scanner;

public class XYZhospital {
    public static void main(String[] args) {

        // getting user input
       Scanner ui = new Scanner(System.in);
       System.out.println("Please print your first name: ");
       String fname = ui.nextLine();
       System.out.println("Please print your last name: ");
       String lname = ui.nextLine();
       System.out.println("Please enter your street address: ");
       String address = ui.nextLine();
       System.out.println("Please enter your city: ");
       String city = ui.nextLine();
       System.out.println("Please enter your state: ");
       String state = ui.nextLine();
       System.out.println("Please enter your zip: ");
       Integer zip = ui.nextInt();
       System.out.println("Please enter your amount owed: ");
       Double owed = ui.nextDouble();
       System.out.println("Please enter your amount already paid: ");
       Double paid = ui.nextDouble();
       System.out.println("Please enter your payment date: ");
       String paymentdate = ui.nextLine();

        //formatting
        System.out.println(" \n \n \n ");
        System.out.println(" \t \t \t XYZ Community Hospital");
        System.out.println("====================================================================================================");
        System.out.println("  Name: \t \t Address: \t \t Payment Information: \t");
        System.out.println("Last  First    Address Line       City, State   Zip    Amount Owed   Payment Amount  Payment Date");
        System.out.println("====================================================================================================");
        System.out.println(lname + ", " + fname + " " + address + " " + city + ", " + state + "  " + zip + " $" + owed + " $" + paid + " " + paymentdate);

        //closing the ui
        ui.close();

       
    }
}

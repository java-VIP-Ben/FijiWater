//imports
import java.util.Scanner;
 
public class Calculator {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);

        System.out.println("Input your first number:");
        double fnum = ui.nextDouble();
        System.out.println("Input a math operator:");
        String opp = ui.next();
        System.out.println("Input your second number:");
        double snum = ui.nextDouble();
        double total;

        if(opp.equals("+")) {
            total = fnum + snum;
            System.out.println(total);
        } else if(opp.equals("-")) {
            total = fnum - snum;
            System.out.println(total);
        } else if(opp.equals("*")) {
            total = fnum * snum;
            System.out.println(total);
        } else if(opp.equals("/")) {
            total = fnum / snum; 
            System.out.println(total); 
        } else {
            System.out.println("Please input a correct math operator");
        }
     
        ui.close();
    }
}

//imports
import java.util.Scanner;

public class AdditionProgram {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        double total = 0;
        String userInput = "";
        String output = "";
        
        while(true) {
            System.out.println("Enter a number, or type 'quit' to stop adding");
            userInput = ui.nextLine();
            if(userInput.equals("quit")) {
                break;
            } else {
                total += (Double.parseDouble(userInput));
                output += (userInput + ",");
            }
        }

        System.out.println(total);
        System.out.println(output.substring(0,output.length()-1));
        ui.close();
    }
}

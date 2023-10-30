//imports
import java.util.Scanner;

public class KeepingTrack {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        String ints = " ";
        String input = "";

        System.out.println("Please enter a number, or type quit to close the program: ");
        while(!input.equals("quit")) {  
            input = ui.nextLine();
            if(!input.equals("quit")) {
                ints += input + "\n";
            } 
        }
        System.out.println(String.format(ints));
        
        //closing the UI like a gigachad
        ui.close();
    }
}
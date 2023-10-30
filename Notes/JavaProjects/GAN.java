//imports
import java.util.Scanner;


public class GAN {
    public static void main(String[] args) {
        /* 
        * Ask the user for a number between 1-10
        * If the value is higher than 7, say so
        * If the value is lower than 7, say so
        * If the value is equal to 7, say HOORAY you got it!
        * once you complete this version - generate a random number instead of 7
        */ 

        Scanner ui = new Scanner(System.in);
        System.out.println("Guess a number between 0-10");
        Integer input = ui.nextInt();

        //running the program thing
        if(input == 7) {
            System.out.println("Hooray! You got it!");
        } else if (input > 7) {
            System.out.println("Your guess was too high");
        } else if (input < 7) {
            System.out.println("Your guess was too low!");
        }

        ui.close();
    }
}

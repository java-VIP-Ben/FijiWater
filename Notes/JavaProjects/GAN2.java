//imports
import java.util.Scanner;


public class GAN2 {
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
        int input = ui.nextInt();
        int secret = 7;
        System.out.println(CheckAns(input, secret)); //2 different variables signifying the same thing: passing variables into another functon
        ui.close();
        
    }

    public static boolean CheckAns(int ui, int answer) {
        //running the program thing
        if(ui < answer) {
            System.out.println("Your guess was too low!");
        } else if (ui > answer) {
            System.out.println("Your guess was too high");
        } else if (ui == answer) {
            System.out.println("Hooray! You got it!");
            return true;
        }
        return false;


    }

}

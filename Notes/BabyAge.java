import java.util.Scanner;


public class BabyAge {
    public static void main(String[] args) {
        /*
         * take in user input and find out how many months old they are 
         * out: how many years old you are
         * in: 10
         * out: 120 months old
         */

        Scanner ui = new Scanner(System.in);
        System.out.println("How many months old are you?");
        int months = ui.nextInt();

        System.out.println("You are " + months + " months old or " + months/12 + " years old.");
        ui.close(); //good practice to close ui when you are done with input
        //good to do when using multiple functions that use a ui as object, it can break
        // starts the convo on global/local variables
    }

}
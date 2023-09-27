//imports
import java.util.Scanner;


public class Conditional {
    public static void main(String[] args) {
        /*
         * if stand up, then clap
         * if you hear yourName, then do something
         * if this then this
         * if this else if this else if this else
         */

        int x = 5;
        if(x==4) {
            System.out.println(true);
        } else if(x==8) {
            System.out.println("It equeals 8");
        } else {
            System.out.println(x);
        }

        //true and false are spelled in the lowercase, cuz java is SO much better than python. Trust.
        if(4==4.0) {
            System.out.println(true);
        }

        //imagine a world where:
        if("parker"=="Taylor"){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //using user input
        Scanner ui = new Scanner(System.in);
        String input = ui.nextLine();
        if(input.equals("4")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        ui.close();

        /*
         * == works with literals like 4==4 or "parker"=="parker"
         * == does not work with object compared to object
         * .equals is for all objects to compare to other objects
         */

        Integer y = 2;
        int z = 2;
        
        //this will work, but its bad practice
        if(y == z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        /*
         * < less than
         * >= greater than or equal to
         * != not equals
         * ! not
         * %= mod operators
         */

        //not equals with objects
        if(!input.equals("12")) {
            System.out.println("not equals");
        }
    }
}

//imports
import java.text.DecimalFormat;
import java.text.Format;


public class FunFunctions {
    //in python, you create functions up here
    //in java, create functions at the bottom
    //java intializes its global variables up here
    public static void main(String[] args) {

        /*
         * Static functions
         * a f(x) that does not change
         * a f(x) that does not need an object to run
         * print() int() input() ClassName.method() function() <- from python
         * 
         */

        //addTwoNumbers(2,2); //calling the function within the program, not the file.
        //FunFunctions.addTwoNumbers(2,2); //this is how you would call it in another file.

        int s = addTwoNumbers(2,2);
        System.out.println(s);
        addThreeNumbers(2, 2, 2);
        DecimalFormat df = new DecimalFormat("0.00"); //<- this doesnt work btw
        System.out.println(Format.df(addTwoNumbers(s))); //<- this doesnt work btw
    }

    //in java, create functions at the bottom
    public static void addTwoNumbers(int a, int b, int c) {
        /*
         * Synchronus:
         * -> runs from the top down: tasks happen in order 
         * -- python
         * -- scripting
         * Asynchronus: 
         * -> not running from the top down: tasks happen simultaneously, diregarding order. 
         * -- java
         * -- c#
         * -- c
         */
        

        /*
         * public -> anything can access it / open to the public
         * private -> only items on this file or objects can acces it
         * static -> is no object required
         * void -> empty/nothing/empty return, doesnt return
         * 
         * variables a and b are local variables so they differentiate from other functions
         * 
         */



    }

    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void addThreeNumbers(int a, int b, int c) {
        /*
         * a, b, and c are local, so they can be reused in addTwoNumbers
         */
    }

    public static void addTwoNumbers(double a, double b) {
        System.out.println(a+b);
    }
}

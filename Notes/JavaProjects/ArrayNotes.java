//imports 
import java.util.Scanner;

public class ArrayNotes {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        /*
         * Primitive -ints, doubles, floats, chars, boolean
         * Non-Primitive - Strings, Lists, Arrays, ArrayLists, Objects, Maps, Json
         */

        //Array in java
        int[] intNumbers = {0,1,2,3,4,5,6,7,8,9}; //cannot have another array that has 10 items that is called listy. Cannot add or delete items from the list
        double[] decimalNumbers = {0.0, 1,2.5,3.14,4.56};

        //double cannot go into int[], but ints can go into double[]

        String[] words = {"Hello" ," ", "World"};
        System.out.println(intNumbers); //Shows the Array's memory location. Rather than printing out the actual numbers. 

        //printing out the actual numbers
        for(int i = 0; i<intNumbers.length; i++) {
            System.out.println(intNumbers[i]);
        }
        for(int i = 0; i<words.length; i++) {
            System.out.print(words[i]); //using println will make each word or spaced character into a new line
        }

        System.out.println("\n \n \n");

//#############################################################################################################################################################
//############################################ I GOT LOST HERE, THE STUFF AFTER DOES NOT REALLY WORK ##########################################################
//#############################################################################################################################################################


        //printHorizontalArray(intNumbers); //I did this, but with CSV in one line, its not that hard to re-figure out
        //printVerticalArray(intNumbers);
        //ask the user for 10 numbers, then add the number to an array
        int[] userNumbers = new int[10]; //Created 10 0's in an int array
        String[] a = new String[10]; //Created 10 null values in an array
        printHorizontalArray(intNumbers, ","); // This used to work decently, now it pyramids horizontally each line, I bet the print statement is in the wrong spot. 

        System.out.println(minIntArray(userNumbers));
        System.out.println(maxIntArray(userNumbers));
        System.out.println(sumIntArray(userNumbers));
        System.out.println(aveIntArray(userNumbers));
    
    }

    //horizontal array practice. Which is now commented out. IDK WHAT IM DOING
    //Correction, the stuff below should be working, but I dont really understand why. 
    public static void printHorizontalArray(int[] intNumbers, String d) {
        String out = "";
        for(int i = 0; i<intNumbers.length; i++) {
            if(i!=intNumbers.length - 1) {
                out += intNumbers[i];
                out += d;
            } else {
                out += intNumbers[i];
            }
        System.out.print(out);
        }
    }

    public static int minIntArray(int[] userNumbers) {
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < userNumbers.length; i++) {
            if(userNumbers[i]<min) {
                min = userNumbers[i];
            }
        }return min;
    }

    public static int maxIntArray(int[] userNumbers) {
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < userNumbers.length; i++) {
            if(userNumbers[i]>max) {
                max = userNumbers[i];
            }
        }return max;
    }

    public static int sumIntArray(int[] userNumbers) {
        int total = 0;
        for(int i = 0; i < userNumbers.length; i++) {
            total += userNumbers[i];
        } return total;
    } 

    public static double aveIntArray(int[] userNumbers){
        double ave = sumIntArray(userNumbers)/userNumbers.length;
        return ave;
   }
}


//imports
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
     Scanner ui = new Scanner(System.in);
     //ask the user for an item in the array a
     //catch any 
    while(true){
        int a[] = new int[2];
        try{
            System.out.println("Which Item?");
            int item = ui.nextInt();
            System.out.println(a[item]);

            //same exception for array lists... 
            //index out of bounds exception is for all sequences
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Only choose an item from the array");
        } finally { //runs code in all circumstances
            System.out.println("Finally block executed");
            for(int item: a ) {
                System.out.println(item);
            }
        }
        System.out.println("The rest of the code");  
    }  
}
     
        //old code that we worked on earlier
    /*
      * while(true) {
            //try to do something
        try {
            System.out.println("Enter the first number:");
            int fnum = ui.nextInt();
            System.out.println("Enter the second number:");
            int snum = ui.nextInt();
            System.out.println(fnum/snum); //taking the first number and dividing it by the second number using scanner
        } catch(ArithmeticException e) {  //exception in case of something going wrong
            System.out.println(e);
        } catch(InputMismatchException e) {
            System.out.println(e);
            ui.nextLine(); //reset the input() from looping
        }
        catch (Exception e) {
            System.out.println(e);
        }
    
        //exception in case something goes wrong
        //especially useful in file reading
        //finally whatever we do, do this
        System.out.println("This is the rest of the code");
        }   
        //ui.close();
      */
}

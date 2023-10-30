//imports
import java.util.Scanner;


public class MadLib {
    public static void main(String[] args) {
        
        //starting a cool groovy project
        Scanner ui = new Scanner(System.in);

        System.out.println("Please Choose a noun: ");
        String noun1 = ui.nextLine();

        System.out.println("Please Choose a verb: ");
        String verb1 = ui.nextLine();

        System.out.println("Please Choose a noun: ");
        String noun2 = ui.nextLine();

        System.out.println("Please Choose a adjective: ");
        String adj1 = ui.nextLine();

        System.out.println("Please Choose a noun: ");
        String noun3 = ui.nextLine();

        System.out.println("Please Choose a adverb: ");
        String adverb1 = ui.nextLine();

        System.out.println("Please Choose a verb: ");
        String verb2 = ui.nextLine();

        System.out.println("Please Choose a number: ");
        String num1 = ui.nextLine();

        System.out.println("Please Choose a noun: ");
        String noun4 = ui.nextLine();

        System.out.println("Please Choose a verb: ");
        String verb3 = ui.nextLine();

        //putting it all together
        System.out.printf("\n \n \t Adlib \n Quick! A Criminal is " + verb1 + " from the " + noun1 + ". Were going to need the " + noun2 + " to stop that Criminal! \n \tLater: \n Wow! Thanks to you and your " + adj1 + " expertise in " + noun3 + ", we were able to stop and identify the criminal. \n He was " + adverb1 + " " + verb2 + " from the police and didn't see the " + num1 + " "  + noun4 + " in front of him. \n We will " + verb3 + " for your bravery and courage today stopping a dangerous criminal.");

        //closing the UI 
        ui.close();


    }
}

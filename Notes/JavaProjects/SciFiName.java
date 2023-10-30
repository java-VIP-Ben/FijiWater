//imports 
import java.util.Random;
import java.util.Scanner;


public class SciFiName {
    public static void main(String[] args) {
        //take in user input for the following information
        //first name, last name, city, school, pets name, Sibling name

        Scanner ui = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = ui.nextLine();
        System.out.println("What is your last name?");
        String lastName = ui.nextLine();
        System.out.println("What city do you live in?");
        String city = ui.nextLine();
        System.out.println("What school do you go to?");
        String school = ui.nextLine();
        System.out.println("What is your pets name?");
        String petsName = ui.nextLine();
        System.out.println("What is your siblings name?");
        String siblingName = ui.nextLine();

        System.out.println("Your name is " + firstName + " " + lastName + " and you live in " + city + " and go to " + school + ". Your pet's name is " + petsName + ". You also have a sibling named: " + siblingName + ".");

        //the sci fi first name is a portion of the first and last names
        // the sci fi last name is a portion of the city and the school
        //the sci fi origin is portion of the petname and the sibling name

        //prints out >> SciFi Firstname SciFi LastName from the planet SciFiOrigin
        Random rnd = new Random();
        int fPortion = rnd.nextInt(firstName.length());
        int lPortion = rnd.nextInt(lastName.length());
        String SFFN = firstName.substring(0,fPortion) + lastName.substring(0, lPortion);        
        int clnPortion = rnd.nextInt(city.length());
        int slnPortion = rnd.nextInt(school.length());
        String SFLN = city.substring(0,clnPortion) + school.substring(0, slnPortion);
        int pnPortion = rnd.nextInt(petsName.length());
        int snPortion = rnd.nextInt(siblingName.length());
        String Planet = petsName.substring(0,pnPortion) + siblingName.substring(0, snPortion);
        System.out.println("Welcome to Earth: " + SFFN + " " + SFLN + " from planet: " + Planet + "!");


        //closing the scanner
        ui.close();

    }
    
}

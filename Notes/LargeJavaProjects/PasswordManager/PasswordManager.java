//Imports Dump (Imports are always used globally, and should be stored here)
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PasswordManager {


    //Global Variable Dump (Any variables that need to be passed between subclasses will be stored here)
    
    String accName;
    String category;
    static String uLog, pLog, YN, rName, uName, pWord, sInfo, userInput, userChoice;

    


    public static void main(String[] args) {
        //starting the program at the main menu
        Menu();
    }

    public static void Login() {
        Scanner loginScanner = new Scanner(System.in);
        System.out.print("\nPlease enter your username: \n");
        uLog = loginScanner.nextLine();
        System.out.print("\nPlease enter your password: \n");
        pLog = loginScanner.nextLine();
        System.out.print("\nWould you like to continue? (Y/N) \n");
        YN = loginScanner.nextLine();

        //closing the scanner, because EVERYONE eles forgets that --- Ben
        loginScanner.close();


        //testing if the usernames and passwords can get you to a seperate menu
        //if the password is wrong, then it will send you back to the login page --- Ben
        if(YN.equals("Y") || YN.equals("y") || YN.equals("Yes") || YN.equals("yes")){
            if(uLog.equals(uName) && pLog.equals(pWord)){

            } else {
                System.out.println("Incorrect Username or Password.");
                System.out.println("\n\n");
                loginScanner = new Scanner(System.in);
                System.out.print("\nPlease enter your username: \n");
                uLog = loginScanner.nextLine();
                System.out.print("\nPlease enter your password: \n");
                pLog = loginScanner.nextLine();
                System.out.print("\nWould you like to continue? (Y/N) \n");
                YN = loginScanner.nextLine();

        //closing the scanner, because EVERYONE eles forgets that --- Ben
        loginScanner.close();
            }
        } else {
            
        }
    }
    //signing up the user (creating the users account that saves) -- Ben
    public static void Register() {

        //taking all of the users inputs to create an account
        Scanner signUpScanner = new Scanner(System.in);
        System.out.print("\nEnter your name: \n");
        rName = signUpScanner.nextLine();
        System.out.println("Usernames should only contain letters. No numbers or other symbols.");
        System.out.print("\nPlease enter your username: \n");
        uName = signUpScanner.nextLine();
        System.out.println("Passwords should only contain letters. No numbers or other symbols.");
        System.out.print("\nPlease enter your password: \n");
        pWord = signUpScanner.nextLine();
        System.out.print("\nWould you like to save your information? (Y/N) \n");
        sInfo = signUpScanner.nextLine();
        

        // W I P W I P W I P W I P W I P W I P W I P W I P (This is placeholder code until I can save files in a proper fashion)
        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Account Created . . . \nReturning to main menu");
        Menu();
        signUpScanner.close();

        //saving information into  a file (WIP) --- Ben
        //if(sInfo.equals("y") || sInfo.equals("Y") || sInfo.equals("yes")){
            //PrintWriter out = new PrintWriter(rName +".txt");
            //out.printf("\nName: " + rName + "\nUsername: " + uName + "\nPasssword: " + pWord);
            //out.close();
        //} else {
            //System.out.println("You have chosen not to save your information, goodbye!");
        //}
    }

    public static void Menu() {
        //starting a scanner 
        Scanner ui = new Scanner(System.in);
        //front end and navigation      --- Ben
        System.out.println("Would you like to use Password Manager? (Y/N)");
        userInput = ui.nextLine();
        while(userInput.equals("y") || userInput.equals("Y") || userInput.equals("yes")) {
            while(!userInput.equals("exit")) {
                System.out.print("\t|~~~Password Manager~~~| \t \t \n ---------------Login or Signup--------------- \n 1.) Login \n 2.) Sign up \n 3.) Exit \n --------------------------------------------- \n");
                System.out.println("What would you like to do?");
                userInput = ui.nextLine();
                if (userInput.equals("1")) {
                   Login();
                }
                if (userInput.equals("2")) {
                    System.out.print("This worked");
                   Register();
                } else {
                    System.out.println("This did not work");
                    break;
                }
            }
        }
        //closing the UI (jonah keeps messing this up lmao)
        ui.close();
    }
}


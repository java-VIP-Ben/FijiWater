//Imports Dump (Imports are always used globally, and should be stored here)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PasswordManager {


    //Global Variable Dump (Any variables that need to be passed between subclasses will be stored here)
    
    String accName;
    String category;
    static String uLog, pLog, YN, rName, uName, pWord, sInfo, userInput, userChoice, aName, logChoice;

    


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

        //testing if the usernames and passwords can get you to a seperate menu
        //if the password is wrong, then it will send you back to the login page --- Ben
    
            checkLogin();
            while(!userInput.equals("3")){
                System.out.printf("What would you like to do? : \n1.) Create a New Password \n 2.) View Passwords \n 3.) Exit\n");
                userInput = loginScanner.nextLine();
            if (userInput.equals("1")) {
                    System.out.println("Enter the name of the application:");
                aName = loginScanner.nextLine();
                System.out.println("Enter the username for your application:");
                uName = loginScanner.nextLine();
                System.out.println("Enter the password for your application:");
                pWord = loginScanner.nextLine();
                //creating accounts for the user
                try {
                    FileWriter myObj = new FileWriter(aName + ".csv", true);
                    myObj.write(aName+", " + uName + ", " + pWord + "\n");
                    myObj.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                        
                }
            }
            else if(userInput.equals("2")) {
                System.out.println("Hitting 2");
                try {
                    File myObj = new File(aName + ".csv");
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()) {
                      String data = myReader.nextLine();
                      System.out.println(data);
                    }
                    myReader.close();
                  } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
            }
            else if(userInput.equals("3")) {
                System.out.println("Have fun!");
            } else {
                System.out.println("Please enter a valid choice");
            }
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
        
        try {
            //writing to a file
            FileWriter fw = new FileWriter("login.csv", true);
            fw.append(rName+", " + uName + ", " + pWord + "\n");
            File myObj = new File(rName + ".csv");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

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
        userInput="";
        //starting a scanner 
        Scanner ui = new Scanner(System.in);
        //front end and navigation      --- Ben
            while(!userInput.equals("exit")) {
                System.out.print("\t|~~~Password Manager~~~| \t \t \n ---------------Login or Signup--------------- \n 1.) Login \n 2.) Sign up \n 3.) Exit \n --------------------------------------------- \n");
                System.out.println("What would you like to do?");
                userInput = ui.nextLine();
                if (userInput.equals("1")) {
                   Login();
                }
                else if (userInput.equals("2")) {
                    System.out.print("This worked");
                   Register();
                } else {
                    System.out.println("Cya!");
                    break;
                }
            }
            ui.close();
        }
    public static String checkLogin() {
        //work in progress memory login --- Jonah's base code 
        // https://www.w3schools.com/java/java_files_read.asp <- source for majority of file writing code
        try {
            File loginInfo = new File("login.csv");
            try (Scanner myReader = new Scanner(loginInfo)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String userName = data.substring(1, data.indexOf(","));
                    //System.out.println(data);
                    if(userName == uLog) {
                        String passWord = data.substring(data.indexOf(",") + 1, data.indexOf(","));
                        if(passWord == pWord) {
                            return "true";
                        }
                    }
                }
                    myReader.close();
            }
        return "false";
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return "There was an error";
        }
    }


}


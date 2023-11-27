//Imports Dump (Imports are always used globally, and should be stored here)
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class PasswordManager {


    //Global Variable Dump (Any variables that need to be passed between subclasses will be stored here)
    
    String accName;
    String category;

    


    public static void main(String[] args) {

        //Main variables 
        String userInput;
        String userChoice;

        //starting a scanner 
        Scanner ui = new Scanner(System.in);
        
        System.out.println("Would you like to use Password Manager? (Y/N)");
        userInput = ui.nextLine();
        if(userInput.equals("y") || userInput.equals("Y") || userInput.equals("yes")) {
            while(!userInput.equals("3")) {
                System.out.print("\t|~~~Password Manager~~~| \t \t \n ---------------Login or Signup--------------- \n 1.) Login \n 2.) Sign up \n 3.) Exit \n --------------------------------------------- \n");
                System.out.println("What would you like to do?");
                userInput = ui.nextLine();
                if (ui.equals("1")) {
                   
                }
                if (ui.equals("2")) {
                   Register();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Goodbye!");
        }
        

        //closing the UI (jonah keeps messing this up lmao)
        ui.close();
    }

    //signing up the user (creating the users account that saves) <- done by ben
    public static void Register() {

        //taking all of the users inputs to create an account
        Scanner signUpScanner = new Scanner(System.in);
        System.out.print("\nEnter your name: \n");
        String rName = signUpScanner.nextLine();
        System.out.print("\nPlease enter your username: \n");
        String uName = signUpScanner.nextLine();
        System.out.print("\nPlease enter your password: \n");
        String pWord = signUpScanner.nextLine();
        System.out.print("\nWould you like to save your information?\n");
        String sInfo = signUpScanner.nextLine();
        
        //seeing if your information needs to be saved
        if(sInfo.equals("Yes")||sInfo.equals("yes")|| sInfo.equals("Y")|| sInfo.equals("y")) {
            WriteString(s);
        } else {
            
        }

        
    } 

    public class BufferTester {
        public static void main(String[] args) {
            BufferWriter.writeString("hello World");
            BufferWriter.saveAndClose();
    
            //Read in the file 
            System.out.println(BufferWriter.readString());
    
            
        }
    }

    public class BufferWriter {

        private static Scanner in; //Scanner obj is for this file only. 
        private static BufferedWriter out; //of this java class only
        private static final String DATA_FILE = "PasswordManagement.txt";
    
        //run the code by saying BufferWriter.writeString("Print that thing out");
        public static void writeString(String s) {
            //if buffered writer objet is alread created,
            //    you are accessing multiple files named the same thing
    
            if(out == null) {
                //since we are going outside of the file
                try {
                    out = new BufferedWriter(new FileWriter(DATA_FILE));
                } catch(Exception e) {  //Exception class is used for general error reporting. 
                    System.err.println("Cannot open file for output!");
                    e.printStackTrace();
                }
            }
    
            //if you have an out object, we can now try to write the file.
            try {
                out.write(s);
                out.newLine(); //adds a new line to the text file. 
            } catch(Exception e) {
                System.err.println("Cannot write to the file!");
                e.printStackTrace();
            }
    
        }
    
    
        public static void saveAndClose() {
            //closes after the scanner is done reading the file 
            //saving the file
            if(in != null) {
                try {
                    in.close();
                    in=null; //resets the object to be used again later
                } catch(Exception e) {
                    System.err.println("Cannot close the input file!");
                    e.printStackTrace();
                }
            }
            
            //closing the file
            if(out != null) {
                try {
                    out.close();
                    out = null; //resets the object to be used again later
                } catch(Exception e) {
                    System.err.println("Cannot close the output file!");
                    e.printStackTrace();
                }
            }
        }
    
        public static String readString() {
            //check to see if the file is already there, if not, create it
            //open the file(s)
            if(in == null) {
                try {
                    in = new Scanner(new File(DATA_FILE));
                } catch(Exception e) {
                    System.err.println("Cannot open input file!");
                    e.printStackTrace(); // prints out the error report
                }
            }
    
            //read in the values from the text file 
            try {
                //if there is a new line, read it in 
                if(in.hasNext()) {  //goes up to the /n <- grabbing everything in the line. 
                    String s = in.nextLine(); //grabs EVERYTHING all in one line 
                    return s;
                } else {
                    return null; //opened an empty file
                }
            } catch(Exception e) {
                System.err.println("Error reading the input file!");
                e.printStackTrace(); //still printing out the error reports 
            }
            return null;
        }
    }
}


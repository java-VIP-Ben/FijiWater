//imports
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferWriter {

    private static Scanner in; //Scanner obj is for this file only. 
    private static BufferedWriter out; //of this java class only
    private static final String DATA_FILE = "mymedia.txt";

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

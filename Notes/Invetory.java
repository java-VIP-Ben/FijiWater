//imports
import java.util.Scanner;
import java.util.ArrayList;

public class Invetory {
    public static void main(String[] args) {
        //Progrma that keeps track of the animals at the Vet
        //add, insert, remove, replace, clear the db
        //if the user types in quit -> the program ends

        Scanner ui = new Scanner(System.in);
        ArrayList<Strings> petList = new ArrayList<String>();
        String userInput = "";
        String ans = "";

        while(!userInput.equals("q")) {
            System.out.println("What would you like to do? a.)add \n i.)insert \n r.)remove \n p.)replace \n c.)clear \n v.)view \n q.)quit");
            userInput = ui.nextLine();
            if(userInput.equals("a")) {
                System.out.println("Add");
            } else if (userInput.equals("i")) {
                System.out.println("insert");
            } else if (userInput.equals("r")) {
                System.out.println("remove");
            } else if (userInput.equals("p")) {
                System.out.println("replace");
            } else if (userInput.equals("c")) {
                System.out.println("clear");
            } else if (userInput.equals("v")) {
                System.out.println("view");
            } else {
                System.out.println("Please choose a correct answer, please. My family needs me and the future of my career relies on you making a correct answer. \n Please submit another answer, please. I really need this paycheck man.");
            }
            userInput = ui.nextLine();
        }
        System.out.println("*Roblox Wave* Byeeee");
    }
}

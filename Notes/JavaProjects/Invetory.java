//imports
import java.util.ArrayList;
import java.util.Scanner;

public class Invetory {
    public static void main(String[] args) {
        //Progrma that keeps track of the animals at the Vet
        //add, insert, remove, replace, clear the db
        //if the user types in quit -> the program ends

        Scanner ui = new Scanner(System.in);
        ArrayList<String> petList = new ArrayList<String>();
        String userInput = "";
        int ID = 0;

        petList.add("Dog");
        petList.add("Cat");
        petList.add("Parakeet");

        while(!userInput.equals("q")) {
            System.out.println("What would you like to do? \n a.)add \n i.)insert \n r.)remove \n p.)replace \n c.)clear \n v.)view \n q.)quit");
            userInput = ui.nextLine();
            if(userInput.equals("a")) {
                System.out.println("What animal would you like to add?");
                userInput = ui.nextLine();
                petList.add(userInput);
            } else if (userInput.equals("i")) {
                System.out.println(petList);
                System.out.println("Please type where you would like to insert an animal, corresponding with the number of the animal before.");
                ID = ui.nextInt() - 1;
                System.out.println("Please enter the animal being inserted.");
                userInput = ui.nextLine();
                userInput = ui.nextLine();
                petList.add(ID, userInput);
            } else if (userInput.equals("r")) {
                System.out.println(petList);
                System.out.println("What animal would you like to remove?");
                userInput = ui.nextLine();
                petList.remove(userInput);
                System.out.println(petList);
            } else if (userInput.equals("p")) {
                System.out.println(petList);
                System.out.println("Please type where you would like to replace an animal, corresponding with the number of the animal before.");
                ID = ui.nextInt() - 1;
                System.out.println("Please enter the animal being inserted.");
                userInput = ui.nextLine();
                userInput = ui.nextLine();
                petList.set(ID, userInput);
                System.out.println(petList);
            } else if (userInput.equals("c")) {
                System.out.println(petList);
                petList.clear();
                System.out.println(petList);
                System.out.println("Cleared");
            } else if (userInput.equals("v")) {
                System.out.println(petList);
            } else {
                System.out.println("Please choose a correct answer, please. My family needs me and the future of my career relies on you making a correct answer. \n Please submit another answer, please. I really need this paycheck man.");
            }
            
        }
        System.out.println(petList);
        System.out.println("*Roblox Wave* Byeeee");

        ui.close();
    }
}

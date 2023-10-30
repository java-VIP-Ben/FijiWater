//imports 
import java.util.Scanner;

public class Invetory2 {
    public static void main(String[] args) {
        //In case this program is run for grading
        System.out.print(" \n \nThis is the second version of Invetory.java, which uses Arrays, not Array Lists. \n \n");

        Scanner ui = new Scanner(System.in);
        String [] petList = new String[10]; //Setting the petList = new String[10] allowed us to get values that were not just one big string, whereas {""} built out the entire array as one big list.
        String userInput = "";

        while (!userInput.equals("q")) {
            System.out.println("What would you like to do? \n(a)dd \n(i)nsert \n(r)emove \nre(p)lace \n(c)lear \n(v)iew \n(q)uit");
            userInput = ui.nextLine();
            if (userInput.equals("a")) {
                System.out.println("Enter an item to add:");
                String newItem = ui.nextLine();
                for (int i = 0; i < petList.length; i++) {
                    if (petList[i] == null) {
                        petList[i] = newItem;
                        break;
                    }
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } else if (userInput.equals("i")) { // insert an item at a specific index in the array
                System.out.println("Enter an item to insert:");
                String newItem = ui.nextLine();
                System.out.println("Enter the index to insert at:");
                int index = ui.nextInt();
                //ui.nextLine(); // consume the newline character
                if (index >= 0 && index < petList.length) {
                    for (int i = petList.length - 1; i > index; i--) {
                        petList[i] = petList[i - 1];
                    }
                    petList[index] = newItem;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                } else {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Please choose a correct answer, please. My family needs me and the future of my career relies on you making a correct answer. \n Please submit another answer, please. I really need this paycheck man.");
                }
                
            } else if (userInput.equals("r")) { // remove an item from the array
                System.out.println("Enter the index of the item to remove:");
                int index = ui.nextInt();
                //ui.nextLine(); // consume the newline character
                if (index >= 0 && index < petList.length && petList[index] != null) {
                    for (int i = index; i < petList.length - 1; i++) {
                        petList[i] = petList[i + 1];
                    }
                    petList[petList.length - 1] = null;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                } else {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                }
            } else if (userInput.equals("p")) { // replace an item in the array
                System.out.println("Enter the index of the item to replace:");
                int index = ui.nextInt();
                ui.nextLine();
                if (index >= 0 && index < petList.length && petList[index] != null) {
                    System.out.println("Enter the new item:");
                    String newItem = ui.nextLine();
                    petList[index] = newItem;
                } else {
                    System.out.println("Please choose a correct answer, please. My family needs me and the future of my career relies on you making a correct answer. \n Please submit another answer, please. I really need this paycheck man.");
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            } else if (userInput.equals("c")) {
                for (int i = 0; i < petList.length; i++) {
                    petList[i] = null; //previously, I used petList[i] = ""; to clear the array, but then the entire array was one string. 
                }
            } else if (userInput.equals("v")) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("petList:");
                for (int i = 0; i < petList.length; i++) {
                    if (petList[i] != null) {
                        System.out.println(i + ".) " + petList[i]);
                    }
                }
                
            }   
        }
        
        System.out.println("*Roblox Wave* Byeeee");
            ui.close();
    }
}

//import 
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {
        /*
         * Non Primitive Data Type 
         * (the first letter A in Array List will be capitalized.)
         * (Array Lists need to be imported.)
         */


        //If i needed an integer array
        //int[] numbers = new int[10];
        //int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        //inequality brackets are a new thing. hooray.
        //Integer in the array list must be capital. The integers here are a class, they are not primitive.
        
        ArrayList<String> names = new ArrayList<String>();
        //Class<DataType> objName = new Constructor<DataType>();

        names.add("Jonah");
        names.add("Zander");
        names.add("Ben");
        names.add("Parker");
        names.add("Ty");
        names.add(2,"Blake");

        System.out.println(names);
        System.out.println(names.get(4));

        //setting a new name in place of another.
        names.set(1,"Owen");
        System.out.println(names);

        //removing a name from an Array List
        names.remove("Owen");
        names.remove("Blake");
        System.out.println(names);
        names.clear(); //erases all data from the list

        //length of my array list
        System.out.println(names.size());


        ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
        /*
         * 7 8 9 
         * 4 6 5
         * 1 2 3
         */

        ArrayList<String> row3 = new ArrayList<>(Arrays.asList("1","2","3"));
        ArrayList<String> row2 = new ArrayList<>(Arrays.asList("4","5","6"));
        ArrayList<String> row1 = new ArrayList<>(Arrays.asList("7","8","9"));
        board.add(row1);
        board.add(row2);
        board.add(row3);
        for(int i = 0; i < 3; i++) {
           for(int j = 0; j < 3; j++) {
                System.out.print(board.get(i).get(j) + "\s");
           }
           System.out.println();
        }
    }
}

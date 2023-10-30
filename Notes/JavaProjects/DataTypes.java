//imports 
import java.util.Random;


public class DataTypes {
    public static void main(String[] args) {
        /*
         * EVERYTHING USES AN OBJECT. 
         * Primitive Data Types: 
         * Boolean <- true false statements
         * Character (char) <- a single symbol signified by ''
         * Integer (int) <- Integers are cumbersome, use int to store numerical information
         * ^^ ints are used to store postive and negative whole numbers. 
         * Float <- similar to an integer, but allows for decimals and fractions
         * Double <- stores precise floats or numbers up to 15 digits. 
         * 
         * Non-primitive Data Types:
         * Array <-
         * Class <-
         * Interfaces <-
         * String <- A series of chars
         * Enum <- 
         * 
         * Objects.
         * Strings are now objects (still variables, but hey)
         */
        char letter = 'I';
        String name = "Jim"; //<- capitalization

        //official way of creating a string
        String firstName = new String();
        firstName = "jimmy";

        //actual way 
        String lastName = "bob";
        String middleName = "GERALD";

        /*
         * common java commands
         * \n creates a new line 
         * \t creates a new tab
         * \s creates a new space
         * \r creates a new row
         */

        System.out.printf("%s,%s\n", firstName, lastName);
        // %s is the string placeholder

        //js `` is used to be placeholders like {} in python or %n like java

        double age = 17;
        // double age = 17; if var is already defined, cant redefine words

        double years = 17.33; //This is the data type
        Double year = 17.33; //This is the class object

        //math tricks
        age ++; //adding one
        age --; //subtracting one
        age += 5;
        age /= 5; // dividing by 5
        age *=5; // multiplying by 5
        //age ^= 5; // raising age to the 5th power 
        age = age*age;
        age = Math.pow(age, 2);

        System.out.println(age);

        //Random .... theres no such thing .. ??
        //option 1 -> Java built in version

        double randomness = Math.random(); //grabs a value between (0-0.999999)
        System.out.println(randomness);
        //for a number between 0 and 10 
        int answer = (int)(randomness*10); //(int)# casts it to an int
        System.out.println(answer);


        //option 2 -> random Class
        //needs to import random module
        Random random = new Random();

        int randomInt = random.nextInt(10);
        System.out.println(randomInt);
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        //new scenario

        String password = "Th3Cr33d!";
        //System.out.println(password.length());
        System.out.printf("The password length is %s", password.length());
        //System.out.println("the password length is " + password.length()); <- this also works, but not as well sometimes

        System.out.println(" ");

        //new scenario
        String email = firstName + "," + lastName + "@stu.evsck12.com";
        System.out.printf("Your email is: " + email);

        System.out.println(" ");

        //in python, true had a capital T because if it was lowercase, it would have been a variable.
        //in every other language, true has a lowercase T

        //What if I needed the User's info from their email. 
        String email2 = "chad.bob@stu.evsck12.com";
        //you could find the index of the character
        int atSymbol = email2.indexOf("@");
        String userName2 = email2.substring(0, atSymbol);
        String firstName2 = userName2.substring(0, userName2.indexOf("."));
        String lastName2 = userName2.substring(userName2.indexOf("."));
        System.out.println(userName2);
        System.out.printf(firstName2);
        System.out.printf(" " + lastName2);

        //replacing certain characters 
        //can remove/replace by using spaces instead of certain series' of chars
        String word = "poop";
        String firstPart = word.substring(0, word.indexOf("oo"));
        firstPart += "o";
        firstPart += word.substring(word.indexOf("oo"));
        System.out.println("\n" + firstPart);

        
    }
}
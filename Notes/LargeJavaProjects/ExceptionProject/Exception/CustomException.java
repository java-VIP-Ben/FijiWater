//silly imports
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        //ask the user for their age 
        //   custom exception -> if the age is below 18, trigger an exception

        Scanner ui = new Scanner(System.in);
        int age = ui.nextInt();
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
        
    }

    //inner class is utilized when a when code is needed to extend a super class
    //custom exception block utilizes Exception class
    class InvalidAgeException extends Exception {
        public InvalidAgeException(String s) {
            super(s);
        }
    }

    public class TestCustomException {
        public static void validateAge(int age) throws InvalidAgeException {
            if (age < 65) {
                throw new InvalidAgeException("You are not old enough");
            } else {
                System.out.println("Welcome!");
            }
        } 
    }
}

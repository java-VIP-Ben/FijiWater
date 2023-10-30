import java.util.Scanner;
//import java.* imports everything, which can be BAD

public class HelloScanner {
    public static void main(String[] args) {
        //python -> :) input("the message or question") -> much easier
        //Classname objectName = new ClassName(args);
        Scanner ui = new Scanner(System.in);
        System.out.println("What is your favorite year of soy sauce!");
        String name = ui.nextLine();

        System.out.println("Hello " + name);
        ui.close();
    } 
}
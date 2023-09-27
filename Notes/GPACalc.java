import java.util.Scanner;

public class GPACalc {
    public static void main(String[] args) {
        //asking for grades and taking user input
        Scanner ui = new Scanner(System.in);
        System.out.println("What grade did you get in your first class? Answer 4 for A, 3 for B, 2 for C, and 1 for D.");
        double grade1 = ui.nextDouble();
        System.out.println("What grade did you get in your second class?");
        double grade2 = ui.nextDouble();
        System.out.println("What grade did you get in your third class?");
        double grade3 = ui.nextDouble();   
        System.out.println("What grade did you get in your fourth class?");
        double grade4 = ui.nextDouble();     

        //calculating and showing the user their GPA
        double GPA = (grade1 + grade2 + grade3 + grade4)/4;
        System.out.println("Your GPA is " + (GPA));
        ui.close();

    }
}
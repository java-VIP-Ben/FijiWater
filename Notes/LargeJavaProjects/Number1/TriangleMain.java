//imports 

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter side1: ");
        double side1 = ui.nextDouble();
        System.out.println("Enter side2: ");
        double side2 = ui.nextDouble();
        System.out.println("Enter side3: ");
        double side3 = ui.nextDouble();
        System.out.println("What color is your triangle?");
        String color = ui.nextLine();
        System.out.println("Is the triangle filled in? (Y/N)");
        String filled = ui.nextLine();

        Triangle MT = new Triangle(side1, side2, side3, color, filled);
        displayTriangleInfo(MT);


        ui.close();
    }

    private static void displayTriangleInfo(Triangle triangle) {

        //2 line code for print statments (this is better)
        System.out.println("Triangulating (lol) the details back to you:");
        System.out.printf("\n\nArea: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter() + "\nColor Choice: " + triangle.getColor() + "\nFilled in? " + triangle.isFilled());

    }
}
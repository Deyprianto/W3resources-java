
import java.util.Scanner;


/*
 * 11. Circle: Area and Perimeter

Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
 */
public class CircleAreaPerimeter {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter radius of the circle : ");
    double  r = input.nextDouble();

    double radius = (double)(3.1416*r*r);
    double perimeter = (2*3.1416*r);

    System.out.println("Area = "+radius+"\nPerimeter = "+perimeter);
}

}

import java.util.Scanner;

/*
 * 13. Rectangle: Area and Perimeter

Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = input.nextDouble();
        double hight = input.nextDouble();

        System.out.println("Area = "+(width*hight));
        System.out.println("Perimeter = "+(2*(width+hight)));
    }
}

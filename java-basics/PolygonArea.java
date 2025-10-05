import static java.lang.Math.pow;
import static java.lang.Math.tan;
import java.util.Scanner;
/*
35. Polygon Area

Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
 */

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int length = input.nextInt();

        double polygon = (double)((number * pow(length,2)/(4*tan(3.1416/number))));

        System.out.printf("The area is : %.4f",polygon);
    }
}

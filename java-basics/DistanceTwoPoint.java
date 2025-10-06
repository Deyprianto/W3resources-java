import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

import java.util.Scanner;
/*
36. Distance Between Two Points

Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output
The distance between those points is: 1480.0848451069087 km 
 */
public class DistanceTwoPoint {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    x1 = toRadians(x1);
    y1 = toRadians(y1);
    x2 = toRadians(x2);
    y2 = toRadians(y2);

    double d = 6371.01 * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));

    System.out.print(d);
   } 
}


import static java.lang.Math.pow;
import static java.lang.Math.tan;
import java.util.Scanner;

/*
34. Hexagon Area

Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
 */

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the side : ");
        int s = input.nextInt();
        double hexagon = (double) ((6 * pow(s, 2)) / (4 * tan(3.1416/6) ));

        System.out.print(hexagon);

        
    }
    
}

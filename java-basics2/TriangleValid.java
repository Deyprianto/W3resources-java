
import java.util.Scanner;


/*
195. Check Triangle Validity

Write a Java program to check if three given side lengths (integers) can make a triangle or not. Java programming courses

Expected Output:

Input side1:  5
Input side2:  6
Input side3:  8
Is the said sides form a triangle: true 
Click me to see the solution
 */
public class TriangleValid {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            int z = input.nextInt();
            if((x+y>z)&&(y+z>x)&&(x+z>y)) {
                System.out.print("True");
            } else {
                System.out.print("false");
            }
        }
}

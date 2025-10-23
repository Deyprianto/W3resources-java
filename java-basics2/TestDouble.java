import java.util.*;
/*
 * 153. Test Doubles Between 0 and 1

Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false
 */
public class TestDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        if(n1 > 0 && n1 <1 && n2 >0 && n2 <1) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }

    }
}

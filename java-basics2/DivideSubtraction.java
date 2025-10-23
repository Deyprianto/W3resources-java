import java.util.*;
/*
 * 164. Divide Using Subtraction

Write a Java program to divide the two given integers using the subtraction operator.

Expected Output:
Input the dividend: 625
Input the divider: 25
Result: 25.0
 */
public class DivideSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        String s = input.next();
        int n2 = input.nextInt();
        if(s.equals("/")) {
            double result = (double)n1/n2;
            System.out.println(result);
        }
        input.close();
    }
}

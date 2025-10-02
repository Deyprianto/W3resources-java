
import java.util.Scanner;

/*
6. Basic Arithmetic Operations

Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

public class BasicArithmaticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 +" + "+num2 +" = "+(num1+num2));
        System.out.println(num1 +" - "+num2 +" = "+(num1-num2));
        System.out.println(num1 +" * "+num2 +" = "+(num1*num2));
        System.out.println(num1 +" / "+num2 +" = "+(num1/num2));
        System.out.println(num1 +" mod "+num2 +" = "+(num1%num2));



        }    
}

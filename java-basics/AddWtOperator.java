
/*
111. Add Without Operators

Write a Java program to add two numbers without arithmetic operators.
Given x = 10 and y = 12; result = 22
 */

import java.util.Scanner;

public class AddWtOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("result is : "+(x+y));
    }
}

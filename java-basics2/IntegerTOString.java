
/*
 * 166. Integer to String Format

Write a Java program to transform a given integer into String format.

Expected Output:
Input an integer: 35
String format of the said integer: 35
 */

import java.util.Scanner;

public class IntegerTOString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String st = Integer.toString(n);
        System.out.println(n);
    }
}

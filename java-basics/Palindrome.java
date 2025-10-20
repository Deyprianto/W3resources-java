/*
115. Check Palindrome Number
Write a Java program to check if a positive number is a palindrome or not.
Input a positive integer: 151
Is 151 is a palindrome number?
true
 */

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String r = new StringBuilder(n).reverse().toString();
        if(n.equals(r)) {
            System.out.println("Palindrome");
        } else {
            System.out.print("Not palindrome");
        }
    } 
}

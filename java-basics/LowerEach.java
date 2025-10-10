
/*
 * 59. Convert to Lowercase

Write a Java program to convert a string into lowercase.
Sample Output:

Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.           
the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class LowerEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a String : ");
        String st = input.nextLine();
        System.out.println(st.toLowerCase());


    }
}

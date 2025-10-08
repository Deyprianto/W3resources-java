
import java.util.Scanner;


/*
 51. String to Integer Conversion

Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25                                             
The integer value is: 25
 */
public class StringToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int n = Integer.parseInt(num);
        System.out.println("Integerform of num is : "+n);
    }
}

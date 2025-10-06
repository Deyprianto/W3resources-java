
import java.util.Scanner;


/*
 41. ASCII Value Finder

Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90
 */
public class ASCIIFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        System.out.println("ASCII value of "+ch+" is "+(int)ch);
    }
    
}

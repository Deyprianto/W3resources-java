
import java.util.Scanner;


/*
 58. Capitalize Each Word

Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output: Back-end development tools

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog.
 */
public class CapitalizeEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input line :");
        String st = input.nextLine();
        System.out.println(st.toUpperCase());
    }
}

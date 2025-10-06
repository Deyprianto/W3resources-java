
import java.util.Scanner;


/*
37. Reverse a String

Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();


        for(int i = st.length()-1;i>=0;i--) {
            System.out.print(st.charAt(i));
        }
    }
    
}

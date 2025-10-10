import java.util.Scanner;
/*
61. Reverse Word

Write a Java program to reverse a word.
Sample Output: Back-end development tools

Input a word: dsaf
Reverse word: fasd
 */

public class ReverseWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a word :");
        String st = input.nextLine();
        System.out.print("Reverse word :");
        for(int i=st.length()-1;i>=0;i--) {
            System.out.print(st.charAt(i));
        }

    }
    

   
}

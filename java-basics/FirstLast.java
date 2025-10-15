/*
73. First and Last Char Combo

Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.
Test Data: str1 = "Python"
str2 = " "
Sample Output:

P#
 */
import java.util.*;

public class FirstLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.length() > 1 && s2.length() > 1) {
            System.out.print(s1.charAt(0)+""+s2.charAt(s2.length()-1));
        } else if(s1.length()==0 && s2.length() > 1) {
            System.out.print("#"+s2.charAt(s2.length()-1));
        } else {
            System.out.print(s1.charAt(0)+"#");
        }

    }
    
}

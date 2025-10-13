
import java.util.Scanner;


/*
71. Remove First Char and Concatenate

Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

ythonutorial
 */
public class RemoveConcate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        s1 = s1.substring(1);
        s2 = s2.substring(1);
        System.out.println(s1+s2);
    }
}

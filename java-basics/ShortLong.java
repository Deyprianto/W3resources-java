
import java.util.Scanner;


/*
70. Short + Long + Short String

Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython
 */
public class ShortLong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.length() < s2.length()) {
            String s3 = s1+s2+s1;
            System.out.println(s3);
        } else {
            String s3 = s2+s1+s2;
            System.out.println(s3);
        }
    }
}

/*
 * 171. Test Substring in String
 
 Write a Java program to accept two strings and test if the second string contains the first one.
 
 Input first string: Once in a blue moon
 Input second string: See eye to eye
 If the second string contains the first one? false
 */
import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        boolean flag = false ;
        if(s2.contains(s1)) {
            flag = true;
        }
        if(flag) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }

    }
}



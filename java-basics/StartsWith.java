import java.util.*;
/*
85. String Starts with Word
 
 Write a Java program to check if a string starts with a specified word.
 Sample Data: string1 = "Hello how are you?"
 Sample Output:
 */
public class StartsWith {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        boolean x = s2.startsWith(s1);

        System.out.print(x);


    }
}

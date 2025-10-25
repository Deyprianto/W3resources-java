import java.util.*;
public class StringSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n1 = input.next();
        String n2 = input.next();
        int x = Integer.parseInt(n1);
        int y = Integer.parseInt(n2);
        System.out.println(x+y);

    }
}
/*
 * 189. Sum Two Numbers as Strings

Write a Java program to two non-negative integers num1 and num2 represented as strings, return the sum of num1 and num2. Java programming courses

Expected Output:

'123' + '456' = 579
 */
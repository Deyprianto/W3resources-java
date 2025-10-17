import java.util.*;
/*
 * 87. Digit Sum in Words

Write a Java program that then reads an integer and calculates the sum of
 its digits and writes the number of each digit of the sum in English.
 */
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n = n/10;
            
        }
        System.out.println(sum);
    }
}

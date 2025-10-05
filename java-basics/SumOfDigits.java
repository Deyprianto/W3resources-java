
import java.util.Scanner;


/*
33. Sum of Digits

Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
public class SumOfDigits {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    int ans = 0;
    
   while(num != 0) {
    ans += num % 10;
    num /= 10;
   }
   System.out.println(ans);
   } 
}

import java.util.Scanner;
/*
 * 49. Check Even or Odd

Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
Sample Output:

Input a number: 20                                                     
1
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n % 2 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
    
}

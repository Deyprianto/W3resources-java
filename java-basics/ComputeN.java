import java.util.*;
/*
44. Compute n+nn+nnn

Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output: Java programming courses

Input number: 5                                                        
5 + 55  + 555
 */
public class ComputeN {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Input Number : ");
       int n = input.nextInt();

       System.out.printf("%d + %d%d + %d%d%d",n,n,n,n,n,n);

    }
    
}

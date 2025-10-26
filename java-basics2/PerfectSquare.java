import java.util.*;
/*
197. Check Perfect Square
Write a Java program to test if a given number (positive integer) is a perfect square or not.
Expected Output:
Input a positive integer:  6
Is the said number perfect square? 
 */
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double x = Math.sqrt(n);
        boolean perfect = (x == Math.floor(x));
        System.out.print(perfect);

        
    }
}


/*
63. Largest or Smallest Value

Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
Sample Output: Back-end development tools

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13
 */

import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        chk(x,y);
    }
     public static void chk(int x,int y) {
        if(x==y) {
            System.out.println(0);
        }
        else if(x%6 == y%6) {
            System.out.println(min(x,y));
        }
        else {
            System.out.println(max(x,y));
        }
      }

}

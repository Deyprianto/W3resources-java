
/*
 * 110. Check Power of 4

Write a Java program to check whether the given integer is a power of 4 or not.
Given num = 64, return true. Given num = 6, return false.
 */

import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean result =  isPowerOfFour(n);
        System.out.println(result);
    }

    static  boolean isPowerOfFour(int n) {
        if(n <= 0) {
            return false;
        } 

        else {
            while(n%4==0) {
                n /= 4;
            }
            return n==1;
        }
    }
}

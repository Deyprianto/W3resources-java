
/*
  74. 10 as First or Last in Array

Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10

true
 */

import java.util.Scanner;

public class FirstOrlast10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        if(size < 2 ) {
            System.out.println("false");
        }
        else {
            int[] arr = new int[size];
            for (int i=0;i<size;i++) {
                arr[i] = input.nextInt();
                
            }
            if(arr[0]==10 || arr[size-1]==10) {
                System.out.print("true");
            } else {
                System.out.print("false");
            }
        }
    }
}


/*
75. First and Last Element Same

Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false
 */

import java.util.Scanner;

public class FirstLastSame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = input.nextInt();
        }

        if(arr[0] == arr[size-1]) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    
    }
}

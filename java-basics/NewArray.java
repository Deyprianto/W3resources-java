
/*
 77. New Array with Ends of Two Arrays

Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10]
 */

import java.util.Arrays;
import java.util.Scanner;

public class NewArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] arr1 = new int[3];
      int[] arr2 = new int[3];
      for(int i=0;i<3;i++) {
        arr1[i] = sc.nextInt();
      }
      for(int i=0;i<3;i++) {
        arr2[i] = sc.nextInt();
      }
      int[] arr3=new int[2];
      arr3[0] = arr1[0];
      arr3[1] = arr2[2];

      System.out.println("new array : "+Arrays.toString(arr3));
      System.out.println(arr3);
    }
    
    
    
}

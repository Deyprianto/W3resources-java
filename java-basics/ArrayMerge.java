
import java.util.Arrays;
/*
 * 113. Merge Two Sorted Arrays

Write a Java program to merge two given sorted arrays of integers and create another sorted array.
array1 = [1,2,3,4]
array2 = [2,5,7, 8]
result = [1,2,2,3,4,5,7,8]
 */


public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,6,7,8};
        int x = arr1.length+arr2.length;
        int[] arr3 = new int[x];
        for(int i=0;i<arr1.length;i++) {
            arr3[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[arr1.length+i] = arr2[i];
        }
        Arrays.sort(arr3);

        for(int i=0;i<arr3.length;i++) {
            System.out.print(arr3[i]+" ");
        }
       // System.out.println(" "+Arrays.toString(arr3));
    }
}

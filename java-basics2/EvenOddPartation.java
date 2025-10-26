
import java.util.Arrays;


/*
176. Partition Even and Odd

Write a Java program that partitions an array of integers into even and odd numbers.

Expected Output

Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
Click me to see the solution
 */
public class EvenOddPartation {
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int index =0;
        int[] newarr = new int[arr.length];

        for(int i=0;i<arr.length;i++) { 
            if(arr[i]%2==0) {
                newarr[index++]=arr[i];
            }
        }
         for(int i=0;i<arr.length;i++) { 
            if(arr[i]%2!=0) {
                newarr[index++]=arr[i];
            } 
        }
       
        System.out.println(Arrays.toString(newarr));
    }
}

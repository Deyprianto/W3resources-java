
import java.util.Arrays;
import java.util.Collections;


/*
 * 221. Sort Six Numbers in Descending Order
Write a Java program that accepts six numbers as input and sorts them in descending order.
Input:
Input consists of six numbers n1, n2, n3, n4, n5, n6 (-100000 ≤ n1, n2, n3, n4, n5, n6 ≤ 100000). The six numbers are separated by a space.
Expected Output:
  Input six integers:
 4 6 8 2 7 9
After sorting the said integers:
9 8 7 6 4 2                   
Click me to see the s
 */
public class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = { 4 ,6 ,8, 2, 7, 9};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.print(Arrays.toString(arr));
    }
}


import java.util.*;
/*
82. Largest of First, Last, Middle

Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 
 */
public class La {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        int x = Math.max(Math.max(arr[0], arr[size/2]),arr[size-1]);

        System.out.print("Largest element between first, last, and middle values: "+x);
        
    }
}

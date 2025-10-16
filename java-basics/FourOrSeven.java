
import java.util.Scanner;


/*
 78. Contains 4 or 7

Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]                                                 
true
 */
public class FourOrSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        boolean flag = false;

        for(int i=0;i<size;i++) {
            arr[i] = input.nextInt();
            if(arr[i] == 5 || arr[i] == 7) {
                flag = true;
            }
         }
         if(flag) {
            System.out.println("true");
         } else {
            System.out.println("false");
         }
    }
    
}

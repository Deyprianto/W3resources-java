import java.util.*;
/*
 * 92. Count Even and Odd in Array

Write a Java program to count the number of even and odd elements in a given array of integers.
 */
public class ArrrayEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++) {
            if(arr[i]%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Even :"+even+"   odd : "+odd);
    }
}

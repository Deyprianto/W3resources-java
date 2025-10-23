import java.util.*;
/*
 * 131. Remove Duplicates in Sorted Array

Write a Java program to find the updated length of a sorted array where each element appears only once (remove duplicates).
Original array: [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7] The length of the original array is:
 11 After removing duplicates, the new length of the array is: 7
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<n;i++) { 
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++) {
            boolean flag = false;
            for(int j=0;j<n;j++) {
                if(i!=j && arr[i]==arr[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                l.add(arr[i]);
            }
        }
        System.out.print(l);
    }
}

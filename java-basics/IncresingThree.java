
import java.util.Scanner;


/*
 107. Three Increasing Adjacent Numbers

Write a Java program to check if an array of integers contains three increasing adjacent numbers.
 */
public class IncresingThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = input.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<n-2;i++) {
            if(arr[i]+1 == arr[i+1] && arr[i+1]+1==arr[i+2]) {
                flag = true;
                break;
            }
        }
        if(flag) {
            System.out.print("true");
        } else {
            System.out.println("false");
        }
    }
    
}

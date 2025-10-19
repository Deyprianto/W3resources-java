
import java.util.Scanner;


/*
 * 95. Create String Array 0 to N-1

Write a Java program to create an array (length # 0) 
of string values. The elements will contain "0", "1", "2" … through ... n-1.
 */
public class ZeroTONminusOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size  = input.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<size;i++) {
            arr[i] = String.valueOf(i); 
        }

          for(int i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

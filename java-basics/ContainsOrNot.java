
/*
 102. Contains 10 or 30

Write a Java program to check if a specified array of integers contains 10 or 30.
Click me to see the solution
 */

import java.util.Scanner;

public class ContainsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean x = false;

        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++) {
            if(arr[i] == 10 || arr[i]==30) {
                x = true;
                break;
            }
        }
        if (x) {
           System.out.println("contains"); 
        } else {
            System.out.println("not contains");
        }
    }
}

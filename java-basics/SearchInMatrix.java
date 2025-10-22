
/*
 * 120. Search Value in Matrix

Write a Java program that searches for a value in an m x n matrix.
Click me to see the solution
 */

import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix size(square matrix) :");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) { 
            for(int j=0;j<n;j++) {
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter searching item :");
        int x = input.nextInt();

        boolean khujtesi  = false;
         for(int i=0;i<n;i++) { 
            for(int j=0;j<n;j++) {
                if(arr[i][j]==x) {
                    khujtesi = true;
                    break;
                }
            }
        } 
        if(khujtesi) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
    
}

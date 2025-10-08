
/*
53. Number Comparison Logic
Write a Java program that accepts three integers from the user. It returns true if the second number is higher than the first number and the third number is larger than the second number. If "abc" is true, the second number does not need to be larger than the first number.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
      boolean result =   chk(n1,n2,n3);
      System.out.print(result);
        
       
    }
   
    static boolean  chk(int n1,int n2,int n3) {
        if(n1 < n2 && n2 < n3) {
            return true;
        } else {
            return false;
        }
        }
    }
 

import java.util.Scanner;
/*
 52. Sum Equals Third Integer

Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */
public class ThirdInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        chk(n1,n2,n3);
        
       
    }
   
    static void chk(int n1,int n2,int n3) {
        if((n1+n2) == n3) {
            System.out.println("True"); }
        else {
            System.out.println("False");

        }
        }
    }


import java.util.Scanner;
/*
 * 54. Same Rightmost Digit Check

Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
Sample Output:
Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true
 */
public class SameRightMost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        n1 = n1%10;
        n2 = n2%10;
        n3 = n3%10;
        if(n1==n2 || n2==n3 || n1==n3) {
            System.out.print("The result is : True");
        } else {
            System.out.print("The result is : False");
        }
        
    }
}

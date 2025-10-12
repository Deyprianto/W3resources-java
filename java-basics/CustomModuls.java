import java.util.Scanner;
/*
 65. Custom Modulus

Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5 
 */
public class CustomModuls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number");
        int x = input.nextInt();
        System.out.print("Enter 2nd number");
        int y = input.nextInt();
        System.out.print(x%y);
    }
}
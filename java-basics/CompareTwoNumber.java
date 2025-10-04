
/*
 * 32. Compare Two Numbers

Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
 */
import java.util.Scanner;

public class CompareTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 == num2) 
            System.out.printf("%d == %d\n",num1,num2);
        if(num1 != num2 )
           System.out.printf("%d != %d\n",num1,num2);
        if(num1 > num2)
          System.out.printf("%d > %d\n",num1,num2);  
        if(num1 < num2)
          System.out.printf("%d < %d\n ",num1,num2);   
        if(num1 <= num2)
          System.out.printf("%d <= %d\n",num1,num2); 
        if(num1 >= num2 )
          System.out.printf("%d >= %d",num1,num2); 
    }
}

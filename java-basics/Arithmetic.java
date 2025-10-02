/*
4. Arithmetic Operations

Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13

 */

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("result of :  -5 + 8 * 6 = "+(-5+8*6));
        System.out.println("result of :  (55+9) % 9 = "+((55+9) % 9));
        System.out.println("result of :  20 + -3*5 / 8 = "+(20 + -3*5 / 8));
        System.out.println("result of :  5 + 15 / 3 * 2 - 8 % 3 = "+(5 + 15 / 3 * 2 - 8 % 3));
        
    }
    
}

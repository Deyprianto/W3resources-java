import java.util.Scanner;

/*
110. Check Power of 4

Write a Java program to check whether the given integer is a power of 4 or not.
Given num = 64, return true. Given num = 6, return false.
*/
public class PowerFest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPowerOfFour = true;

        
            while (n > 1) {
                if (n % 4 != 0) {
                    isPowerOfFour = false;
                    break;
                }
                n = n / 4;
            }
        

        if (isPowerOfFour) {
            System.out.println("power of 4");
        } else {
            System.out.println("not");
        }
    }
}

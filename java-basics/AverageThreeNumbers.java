
import java.util.Scanner;

/*
 * 12. Average of Three Numbers

Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

public class AverageThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        double average = (double) ((x+y+z)/3);
        System.out.println("Average : "+average);
    }
    
}

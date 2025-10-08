import java.util.*;
/*
 57. Count Factors of Integer
 
 Write a Java program to accept an integer and count the factors of the number.
 Sample Output:
 
 Input an integer: 25                                                   
 3
 */
public class TotalFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int total = 0;

        for(int i=1;i<=num;i++) {
            if(num%i==0) {
                total++;
            }
        }
        System.out.print("Total facor :"+total);

    }    
}




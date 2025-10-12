
/*
66. Sum of 100 Primes

Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output: Java programming courses

Sum of the first 100 prime numbers: 24133
 */
public class SumOfPrime {
    public static void main(String[] args) {
       int count = 0;
       int x = 0;
       int num = 2;

     while(x < 100) {
        boolean isPrime = true;
        for(int i=2;i<=num;i++) {
            for(int j=i;j<=i;j++) {
                if(num%j==0) {
                    isPrime  = false;
                    break;
                }
            }
                if(isPrime) {
                    count += i;
                }
            }
        }
               System.out.println(count);

       }
      
    }

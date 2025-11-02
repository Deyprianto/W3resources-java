import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPrime = false;

        int primeCount = 0;

        if(n==2) {
            System.out.println(1);
        } else if(n > 2) {
            primeCount += 1;
        }

        for(int i=3 ;i<=n;i++) {
        for(int j=2;j<i;j++) {
            if(i%j==0) {
               isPrime = true;
               break;
            } 
        }
        if(!isPrime) {
            primeCount++;
        }
        isPrime = false;
        }
        
        System.out.println("Total prime count : "+primeCount);
    }
}

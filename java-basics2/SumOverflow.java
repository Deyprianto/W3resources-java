
import java.math.BigInteger;
import java.util.Scanner;

public class SumOverflow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n1 = input.nextLine();
        String n2 = input.nextLine();

        BigInteger b1 = new BigInteger(n1);
        BigInteger b2 = new BigInteger(n2);

        BigInteger result = new BigInteger("0");

        result = result.add(b1);
        result = result.add(b2);

        String final_result = ""+result;

        if(n1.length() > 80 || n2.length() > 80 || final_result.length() > 80 ) {
            System.out.println("overflow");
        } else {
            System.out.println(final_result);
        }

        
    }
}
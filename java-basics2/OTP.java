
import java.util.Random;
/*
 * 4 digit otp generator
 */

public class OTP {
    public static void main(String[] args) {
        Random random = new Random();
        String otp = "";
        for(int i=1;i<=4;i++) {
            int n = random.nextInt(3);
             otp += n;
        }
        System.out.print(otp);

    }
}

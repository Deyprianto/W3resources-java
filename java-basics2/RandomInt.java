
import java.util.Random;
/*
 * random number generator
 */
public class RandomInt {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(3)+1;
        System.out.println(n);
    }
}

import java.util.Scanner;

/*
 * Swap two numbers
 */
public class SwapTwoVariable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = x;
        x = y;
        y = z;
        System.out.println("X  = "+x+"\nY = "+y);

    }

   
}

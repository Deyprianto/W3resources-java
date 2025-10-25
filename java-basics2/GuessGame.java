import java.util.*;
//a rando number gussing game 
public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many times you want to play : ");
        int n = input.nextInt();
        int count = 0;
        Random random = new Random();
        System.out.print("Enter range :");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Enter values :");
        for(int i=0;i<n;i++) { 
            int x = random.nextInt(b)+a;
            int y = input.nextInt();
            if(x==y) {
                System.out.println("correct guess ");
                count++;
            } else {
                System.out.println("Wrong guess :");
            }
        }
        System.out.println("You guess "+count+" times correct of total "+n+" times");

    }
}

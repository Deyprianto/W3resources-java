import java.util.Scanner;

/*
 * 94. Rearrange Odd and Even Numbers
 * Write a Java program to rearrange all the elements of a given array of integers
 * so that all the odd numbers come before all the even numbers.
 */
public class Arrange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        int[] arrx = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); 
        }

        int oddIdx = 0;
        int evenIdx = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                arrx[oddIdx++] = arr[i];
            }
        }
        evenIdx = oddIdx;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arrx[evenIdx++] = arr[i];
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arrx[i] + " ");
        }
    }
}
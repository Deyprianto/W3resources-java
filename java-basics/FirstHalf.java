
import java.util.Queue;
import java.util.Scanner;
/*
 * 69. Extract First Half

Write a Java program to extract the first half of a even string.
Test Data: Python
Sample Output:

Pyt
 */
public class FirstHalf {
    public static void main(String[] args) {
        Queue sb ;
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        int midPoint = st.length()/2;
        for(int i=0;i<midPoint;i++) {
            System.out.print(st.charAt(i));
        }
    }
}

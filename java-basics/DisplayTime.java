
/*
 * 46. Display System Time

Write a Java program to display system time.
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017 
 */
public class DisplayTime {
    public static void main(String[] args) {
        System.out.format("Current time : %tc%n",System.currentTimeMillis());
    }
}

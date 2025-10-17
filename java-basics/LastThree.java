
import java.util.Scanner;


/*
84. Add Last 3 Chars to Both Ends

Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
Test data: "Python" will be "honPythonhon"
Sample Output:

honPythonhon
 */
public class LastThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.next();
        String x = st.substring(st.length()-3,st.length());
        System.out.println(x+""+st+""+x);
    }
    
}

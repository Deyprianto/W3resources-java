
import java.util.Scanner;


/*
72. First 3 Chars or #

Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:

###
 */
public class FirstThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();
        
        if(st.length() > 3) {
          for(int i=0;i<3;i++) {
            System.out.print(st.charAt(i));
          }
          
          }
         else if (st.length()==0) {
            System.out.print("###");
         } else if(st.length() ==1) {
            System.out.print(st.charAt(0)+"##");
         }else {
            System.out.print(st.charAt(0)+""+st.charAt(1)+"#");
         }

        }
    }


import java.util.Scanner;
/*
 * 38. Count Characters in String
 
 Write a Java program to count letters, spaces, numbers and other characters in an input string.
 Expected Output
 
 The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
 letter: 23                                               
 space: 9                                                 
 number: 10                                               
 other: 6
 */
public class CountCharacterString {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String st = input.nextLine();
    int letter = 0;
    int space = 0;
    int number = 0;
    int other = 0;

    for(int i=0 ;i <st.length() ;i++) {
        if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')
        {
            letter++;
        }
        else if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z'){
            letter++;
        }
       else if(st.charAt(i) == ' ') {
            space++;
        }
       else if(st.charAt(i) >= '0' && st.charAt(i) <= '9') {
            number ++;
        }
        else {
            other++;
        }

    }
    System.out.println("letter : "+letter);
    System.out.println("space : "+space);
    System.out.println("number : "+number);
    System.out.print("other : "+other);

    }
    

}





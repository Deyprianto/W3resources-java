import java.util.Scanner;

/*
67. Insert Word in Middle

Write a Java program to insert a word in the middle of another string.
Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python Tutorial 3.0.
Sample Output:

Python Tutorial 3.0
 */

public class InsertMiddle {
 
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String st = input.nextLine();
    String add = input.nextLine();
    int midIndex = st.indexOf(" ");

    if(midIndex != -1) {
      StringBuilder sb = new StringBuilder(st);
      sb.insert(midIndex+1, " "+add+" ");
      System.out.println(sb.toString());
    }

  }  
}

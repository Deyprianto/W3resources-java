
/*
 * 48. Print Odd Numbers (1-99)

Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
Sample Output:

1                                                                      
3                                                                      
5                                                                      
7                                                                      
9                                                                      
11                                                                     
....                                                                                                                                       
91                                                                     
93                                                                     
95                                                                     
97                                                                     
99 
 */
public class PrintOdd {
    public static void main(String[] args) {
        for(int i=1;i<100;i+=2) {
            System.out.println(i);
        }
    }
    
}


/*
50. Divisible by 3, 5, Both

Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
Sample Output:

Divided by 3:                                                          
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
                                                                       
Divided by 5:                                                          
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
95,                                                                    
                                                                       
Divided by 3 & 5:                                                      
15, 30, 45, 60, 75, 90,
 */
public class DivisibleThreeFive {
    public static void main(String[] args) {
        divisible(3);
        divisible(5);
        divisible(3,5);//method overloading use korlam

    }
    static void divisible(int n) {
        System.out.println("Divisible by "+n);
        for(int i=1;i<=100;i++) {
            if(i%n==0) {
                System.out.print(i+",");
            }
        }
        System.out.println("");
    }

       static void divisible(int n,int x) {
        System.out.println("Divisible by "+n+" and "+x+" :");
        for(int i=1;i<=100;i++) {
            if(i%n==0 && i%x==0) {
                System.out.print(i+",");
            }
        }
    }
    
}

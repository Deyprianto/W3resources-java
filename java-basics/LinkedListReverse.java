
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size :");
        int n = input.nextInt();
        LinkedList <Integer> l = new LinkedList<Integer>();
        LinkedList <Integer> reverse = new LinkedList<Integer>();
        for(int i=0;i<n;i++) {
            l.add(input.nextInt());
        }
        for(int i=n-1;i >= 0;i--) {
            reverse.add(l.get(i));
        }
        System.out.print("reversed liniked list is :"+reverse);
    }
}

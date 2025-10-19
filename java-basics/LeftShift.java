
/*
106. Left Shift Array
Write a Java program to create an array left shifted from a given array of integers.
 */
public class LeftShift {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int temp = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

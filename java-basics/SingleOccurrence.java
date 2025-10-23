


/*
129. Single Occurrence Number

Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
 */
public class SingleOccurrence {
    public static void main(String[] args) {
        
        int[] arr = {1,1,70,2,3,4,2,3,4};
        
        int x = 0;
        
        for(int i=0;i<arr.length;i++) {
            boolean flag = false;
            for(int j=0;j<arr.length;j++) {
                if(i != j && arr[i]==arr[j]) {
                    flag = true;
                    break; 
                }
            }
            if(!flag) {
                System.out.println(arr[i]);
        }
        }
        
    }
}

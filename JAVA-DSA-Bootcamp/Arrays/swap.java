package Arrays;

import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] ar = new int[4];
     for(int i=0;i<4;i++){
         ar[i]=sc.nextInt();
     }
     swap(ar,2,3);
     System.out.println( Arrays.toString(ar));
}
      static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
      }
}

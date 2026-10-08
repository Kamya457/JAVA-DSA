package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[4];
        for(int i=0;i<4;i++){
            ar[i]=sc.nextInt();
        }
        reverse(ar);
        System.out.println( Arrays.toString(ar));
    }
    static void reverse(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

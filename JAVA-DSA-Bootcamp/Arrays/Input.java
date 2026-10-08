package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int arr[]=new int[5];//declaration of an array
        //1st-directly input the array elements
        arr[0]=23;
        arr[1]=3;
        arr[2]=90;
        arr[3]=101;
        arr[4]=54;
        //2nd-by using for loop
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array-");
        int n=sc.nextInt();
        int ar1[]=new int[n];
        for(int i=0;i<ar1.length;i++){
            ar1[i]=sc.nextInt();
        }
        //for printing the array elements
       //ehanced for loop
        for (int j : ar1) {
            System.out.print(j + " ");
        }
        //normal for loop
        for(int i=0;i<ar1.length;i++){
            System.out.println(ar1[i]);
        }
        //3rd method

        System.out.println(Arrays.toString(ar1));
    }
}

package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TWOInOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        //First Method,enahanced for loop
        for (int[] ints : arr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
        //Second Method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}

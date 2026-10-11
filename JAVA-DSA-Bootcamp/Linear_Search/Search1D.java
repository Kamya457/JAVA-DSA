package Linear_Search;

import java.util.Scanner;

public class Search1D {
    public static void main(String[] args) {
        int[] ar = {34, 54, 12, 35, 67, 90, 100};
        int target = 67;
        int index = search(ar, target);
        System.out.println(index);
    }
    static int search(int[] ar, int target) {
        if (ar.length == 0) {
            return -1;
        } else {
            int start = 0;
            int end = ar.length - 1;
            for (int i = start; i <= end; i++) {
                if (ar[i] == target) {
                    return i;
                }
            }

        }
        return -1;//if no element is found then this will print
    }
}

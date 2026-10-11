package Linear_Search;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int ans=min(ar);
        System.out.println(ans);
    }
    //return the minimum value in the array
    static int min(int[] ar){
        int min = ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }

}

package Linear_Search;

import java.util.Arrays;

public class Searchin2D{
    public static void main(String[] args) {
        int[][] ar={
        {23, 45, 16},
        {12, 60, 91, 77},
        {22,34},
        };
        int target=1;
        int[] ans=search(ar ,target);//store the loc. of the element in row,column
        System.out.println( Arrays.toString(ans));
    }
    static int[] search(int[][] ar,int target){
        for(int i=0;i<ar.length;i++){
            for(int j = 0; j< ar[i].length; j++){
                if(ar[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

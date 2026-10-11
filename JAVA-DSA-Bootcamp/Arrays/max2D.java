package Arrays;

public class max2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }
}

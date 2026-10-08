package Arrays;

public class max {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}

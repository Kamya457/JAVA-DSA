package Linear_Search;

public class SearchRange {
    public static void main(String[] args) {
        int[] ar = {34, 54, 12, 35, 67, 90, 100};
        int target = 34;
        int index = search(ar, target,1,4);
        System.out.println(index);
    }
    static int search(int[] ar, int target,int start,int end) {
        if (ar.length == 0) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (ar[i] == target) {
                    return i;
                }
            }

        }
        return -1;//if no element is found then this will print
    }
}

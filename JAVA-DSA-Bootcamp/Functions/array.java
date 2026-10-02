package Functions;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int arr[]={23,45,63,12};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=81;//if we make a change to thr object via this reference variable
        //,sameobect would be changed
    }
}

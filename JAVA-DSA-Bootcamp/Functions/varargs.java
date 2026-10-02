package Functions;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(34,2,43,13,11,24);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }

}

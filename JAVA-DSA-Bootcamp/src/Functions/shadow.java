package Functions;

public class shadow {
    static int x=90;//ye variable out of the block use hua h,so ye pure program me use ho skta h
    //this is shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);
        int x=43;//ye declare hua h in the block so isko bahar use nhi kr skte
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);//ye value x ki vo value hogi jo sabke liye common h
    }
}

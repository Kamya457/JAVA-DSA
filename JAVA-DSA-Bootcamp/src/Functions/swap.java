package Functions;

public class swap {
    public static void main(String[] args) {
        int a=1,b=2;
        swap(a,b);
        System.out.println(a);
        System.out.println(b);

    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        //here the values are not swapped as we are not changing but
        //we are creating a new object,they are pointing towards the copy of the same variable
    }

}

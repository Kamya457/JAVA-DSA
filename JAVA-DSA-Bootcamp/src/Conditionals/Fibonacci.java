package Conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms-");
        int n=sc.nextInt();
        int a=0,b=1,sum=0;
       System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n;i++){
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }


    }
}

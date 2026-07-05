package Conditionals;

import java.util.Scanner;

public class FiboTerm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,sum=0,i=1;
        while(i!=n){
            sum=a+b;
            a=b;
            b=sum;
            i++;
        }
        System.out.println(sum);
    }
}

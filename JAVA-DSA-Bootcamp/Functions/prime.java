package Functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter number-");
         int n=sc.nextInt();
         isPrime(n);
    }
    static void isPrime(int n){
        int s=0;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                s++;
            }
        }
        if(s==1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}

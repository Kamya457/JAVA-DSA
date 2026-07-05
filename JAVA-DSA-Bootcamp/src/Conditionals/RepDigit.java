package Conditionals;

import java.util.Scanner;

public class RepDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number-");
        int n=sc.nextInt();
        System.out.println("Enter the digit which you want to count-");
        int d=sc.nextInt();
        int count=0;
        while(n>0) {
            int rem = n % 10;
            if (rem == d) {
                count++;
            }
            n = n / 10;
        }
            System.out.println("The number "+d+" is "+count);

    }
}

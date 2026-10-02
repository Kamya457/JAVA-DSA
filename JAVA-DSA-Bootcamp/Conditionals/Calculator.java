package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a operator");
        char ch=sc.next().charAt(0);
        System.out.println("enter a number 1");
        int n1 = sc.nextInt();
        System.out.println("enter a number 2");
        int n2 = sc.nextInt();
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%') {
            if(ch=='+') {
                System.out.println(n1+n2);
            }
            else if(ch=='-') {
                System.out.println(n1-n2);
            }
            else if(ch=='*') {
                System.out.println(n1*n2);
            }
            else if(ch=='/') {
                System.out.println(n1/n2);
            }
            else if(ch=='%') {
                System.out.println(n1%n2);
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

package Conditionals;
import  java.util.Scanner;

public class palin {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Eneter a number");
            int n=sc.nextInt();
            int a= n;
            int rev= 0;
            while(n>0)
            {
                int rem=n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            if(rev==a){
                System.out.println("Number is palindrome");
            }
        }

    }



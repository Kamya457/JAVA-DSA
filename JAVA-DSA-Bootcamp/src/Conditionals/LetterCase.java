package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LetterCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch=input.nextLine().charAt(0);
        int n=(int)ch;
        if(n>=65 && n<=90){
            System.out.println("The letter "+ch+" is a uppercase letter");
        }
        else if(n>=97 && n<=122){
            System.out.println("The letter "+ch+" is a lowercase letter");
        }
        else{
            System.out.println("The letter "+ch+" is not a letter");
        }
    }
}

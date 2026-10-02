package Functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
      int ans=sum();
      System.out.println(ans);
    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1-");
        int n1 = input.nextInt();
        System.out.println("Enter number 2-");
        int n2 = input.nextInt();
        int sum = n1+n2;
        return sum;
    }

}

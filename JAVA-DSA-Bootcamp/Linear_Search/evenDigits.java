package Linear_Search;
//leetcode.com/problems/find-numbers-with-even-number-of-digits
public class evenDigits {


    public static void main(String[] args) {
        int[] nums={34,67,90345,123,1};

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        if(num<0)
            num=-num;
        return (int)(Math.log10(num)+1);
    }

}

package Linear_Search;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="Kamya";
        char target='y';
        System.out.println(searchInStrings(str,target));
        System.out.println(searchInStrings(Arrays.toString(str.toCharArray()),target));
    }
    static int searchInStrings(String str,char target){
        if(str.length()==0){
            return -1;
        }
        else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==target){
                    return i;
                }
            }
        }
        return -1;
    }
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray())
        {
            if(ch==target)
                return true;
        }
        return false;
    }
}

package Linear_Search;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,4,5},{5,6}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
    //when you start another row take the sum of the previous
        int max=0;
        for(int i=0; i<accounts.length; i++)
        {
            int rowsum=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                rowsum+=accounts[i][j];
            }
            if(rowsum>max)
                max=rowsum;
        }
        return max;
    }
}

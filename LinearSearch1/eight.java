package LinearSearch1;


//1672. Richest Customer Wealth
public class eight {
    public static void main(String[] args) {
        int[][] money = {
            {1,2,3},
            {3,2,1}
        };
        int ans = maxWealth(money);
        System.out.println(ans);
    }
    static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
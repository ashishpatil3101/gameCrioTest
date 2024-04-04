import java.util.Arrays;

public class coinsQuesFour {
    static  int count(int coins[], int N, int sum) {
        int dp[] = new int[sum + 1];
        for (int i = 0; i < sum + 1; i++) 
            dp[i] = 0;
    
        dp[0] = 1;
        
        for (int i = 0; i < N; i++)
            for (int j = coins[i]; j <= sum; j++) 
                dp[j] += dp[j - coins[i]];
        
        return dp[sum];
    }

   public static void main(String[] args) {
        int[] coins = {2, 5, 3, 6};
        int sum =10;
        int ans = count(coins, coins.length, sum);
        System.out.println(ans < 0 || ans >= (int)1e9 ? -1 : ans);
   }
}

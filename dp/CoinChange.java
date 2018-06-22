package dp;

import org.junit.Test;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int c : coins) { // 硬币可以使用多次
                if (c <= i) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);//dp[i-c]+1这个1代表加上1次面值为c的coin
                }
            }
            System.out.print("i=" + i+"  ");
            for (int d : dp) {
                System.out.print(d+"  ");
            }
            System.out.println();
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    @Test
    public void test() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}

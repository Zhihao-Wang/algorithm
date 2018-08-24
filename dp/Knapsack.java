package dp;

import org.junit.Test;

public class Knapsack {
    //    public int knapsack(int W, int N, int[] weights, int[] values) {
//        int[][] dp = new int[N + 1][W + 1];
//        for (int i = 1; i <= N; i++) {
//            int w = weights[i - 1], v = values[i - 1];
//            for (int j = 1; j <= W; j++) {
//                if (j >= w) {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w] + v);
//                } else {
//                    dp[i][j] = dp[i - 1][j];
//                }
//            }
//        }
//        return dp[N][W];
//    }


    public int knapsack(int Capacity, int N, int[] weights, int[] values) {
        int[] dp = new int[Capacity + 1];
        //01背包
//        for (int i = 1; i <= N; i++) {
//            int w = weights[i - 1], v = values[i - 1];
//            for (int j = Capacity; j >= 1; j--) {
//                if (j >= w) {
//                    dp[j] = Math.max(dp[j], dp[j - w] + v);
//                }
//            }
//        }
//        完全背包
        for(int i=0;i<N;i++){
            int w = weights[i], v = values[i];
            for(int j=w;j<=Capacity;j++){
                dp[j]=Math.max(dp[j],dp[j-w]+v);
            }
        }
        return dp[Capacity];
    }
    @Test
    public void test() {
        int Capacity = 10;
        int n = 5;
        int[] weights = {2, 1, 3, 3, 4};
        int[] values = {4, 2, 6, 7, 6};
        System.out.println(knapsack(Capacity, n, weights, values));
    }
}

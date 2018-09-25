import org.junit.Test;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum < S || (sum + S) % 2 == 1) return 0;
        int W = (sum + S) / 2;
        int[] dp = new int[W + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = W; i >= 0; i--) {
                if (num <= i) {
                    dp[i] = dp[i] + dp[i - num];
                    //PatitionEqual字串的升级版，方法一样
                }
            }
        }
        return dp[W];
    }

    @Test
    public void test(){
        int[] nums = {1,1,1,1,1};
        int s = 3;
        System.out.println(findTargetSumWays(nums,s));
    }
}

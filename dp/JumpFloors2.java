package dp;

import org.junit.Test;

import java.util.Arrays;

public class JumpFloors2 {
    public int JumpFloorII(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, 1);
        for (int i = 1; i < target; i++)
            for (int j = 0; j < i; j++)
                dp[i] += dp[j];
        return dp[target - 1];
    }

    @Test
    public void test(){
        System.out.println(JumpFloorII(4));
    }
}

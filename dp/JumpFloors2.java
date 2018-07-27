package dp;

import org.junit.Test;

public class JumpFloors2 {
//    public int JumpFloorII(int target) {
//        int[] dp = new int[target];
//        Arrays.fill(dp, 1);
//        for (int i = 1; i < target; i++)
//            for (int j = 0; j < i; j++)
//                dp[i] += dp[j];
//        return dp[target - 1];
//    }

    public int JumpFloorII(int target) {
        int ans = (int) Math.pow(2,target-1);
        return ans;
    }


    @Test
    public void test(){
        System.out.println(JumpFloorII(4));
    }
}

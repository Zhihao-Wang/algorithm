package dp;

import org.junit.Test;
//删除两个字符串的字符使它们相等
//思路：两字符串总长-2倍最长公共字串LCS  即为删除的最小步数
public class DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) continue;
                dp[i][j] = word1.charAt(i - 1) == word2.charAt(j - 1) ?
                        dp[i - 1][j - 1] + 1 : Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }
        return m + n - 2 * dp[m][n];
    }

    @Test
    public void test(){
        String w1="eat";
        String w2="sea";
        System.out.println(minDistance(w1,w2));
    }
}

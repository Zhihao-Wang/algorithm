package dp;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s="ac";
        System.out.println(new Solution().longestPalindrome(s));
    }
}

class Solution {
    private static int low;
    private static int maxLen;
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len<2){
            return s;
        }
        for(int i=0;i<len;i++){
            extend(s,i,i);
            extend(s,i,i+1);
        }
        return s.substring(low, low+maxLen);
    }
    private static void extend(String s, int j, int k) {
        while(j>=0&&k<s.length()&&s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxLen<k-j-1){
            low=j+1;
            maxLen=k-j-1;
        }

    }
}
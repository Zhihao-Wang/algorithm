package leetcode;

public class TwoSumSorted167 {
    public int[] twoSumSorted(int[] nums,int target){
        int i=0,j=nums.length;
        while(i<j) {
            int sum = nums[i] + nums[j];
            if (target == sum)
                return new int[]{i+1, j+1};
            else if (target > sum)
                i++;
            else
                j--;
        }
        return null;
    }
}

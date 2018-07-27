package leetcode;

import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> index=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(index.containsKey(target-nums[i]))
                return new int[]{index.get(target-nums[i]),i};
            else
                index.put(nums[i],i);
        }
        return null;
    }
}

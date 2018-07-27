package doublepointer;

import org.junit.Test;

public class TrappingRainWater {
        public int trap(int[] height) {
            int res = 0, l = 0, r = height.length - 1;
            while (l < r) {
                int mn = Math.min(height[l], height[r]);
                if (height[l] == mn) {
                    ++l;
                    while (l < r && height[l] < mn) {
                        res += mn - height[l++];
                    }
                } else {
                    --r;
                    while (l < r && height[r] < mn) {
                        res += mn - height[r--];
                    }
                }
            }
            return res;
        }

        @Test
        public void test(){
            int[] height={0,1,0,2,1,0,3};
            System.out.println(trap(height));
        }

}

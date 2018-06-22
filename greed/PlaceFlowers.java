package greed;

import org.junit.Test;

public class PlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1) continue;
            int pre = i == 0 ? 0 : flowerbed[i - 1];
            int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
            if(pre == 0 && next == 0) {
                cnt++;
                flowerbed[i] = 1;
            }

        }
        return cnt >= n;
    }
    @Test
    public void test(){
        int[] flowerbed={0,0,0,1,0,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed,2));
    }
}

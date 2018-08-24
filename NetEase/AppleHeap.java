package NetEase;

import java.util.*;
public class AppleHeap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++)
            arr[i] = in.nextInt();
        int m = in.nextInt();
        int[] q = new int[m];
        for (int i = 0; i < m; i++)
            q[i] = in.nextInt();

        int[] res = new int[count];
        res[0] = arr[0];
        // 累加
        for (int i = 1;i < count;i++)
            res[i] = arr[i] + res[i - 1];
        // 二分查找
        for (int i = 0; i < m; i++) {
            int j = 0, k = count - 1;
            while (j < k){
                int mid = (j + k) /2;
                if (q[i] > res[mid])
                    j = mid + 1;
                else if (q[i] <= res[mid])
                    k = mid;

            }
            System.out.println(k + 1);
        }
    }
}
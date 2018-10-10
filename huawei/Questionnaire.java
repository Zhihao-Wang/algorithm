package huawei;

import java.util.*;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/10
 */
public class Questionnaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {

            int[] nums = new int[1000];

            int row = sc.nextInt();
            for (int i = 0; i < row; i++) {
                int next = sc.nextInt();
                nums[next] = next;
            }

            for (int i = 0; i < 1000; i++) {
                if (nums[i] == 0) continue;
                else {
                    System.out.println(nums[i]);
                }
            }
        }

    }
}

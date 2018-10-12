package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/12
 */
public class SodaBottle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while(sc.hasNext()) {
            int n = sc.nextInt();
            if(n!=0) {
                int ans = 0;
                while (n >= 3) {
                    ans += n / 3;
                    n = n % 3 + n / 3;
                }
                if (n == 2)
                    ans += 1;
                System.out.println(ans);
            }
        }
    }
}

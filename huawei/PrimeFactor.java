package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/10
 */
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long num = sc.nextInt();
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    num = num / i;
                    System.out.print(i + " ");
                    i--;
                }

            }

        }
    }
}







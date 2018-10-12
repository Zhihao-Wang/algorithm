package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/12
 */
public class NumberOf1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count =0;
        while (num != 0) {
            count++;
            num=num&(num-1);
        }
        System.out.println(count);
    }
}

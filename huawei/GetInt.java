package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/10
 */
public class GetInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextFloat()) {
            float f = sc.nextFloat();
            int ret = Math.round(f);
            System.out.println(ret);
        }
    }
}

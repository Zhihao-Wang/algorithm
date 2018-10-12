package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/11
 */
public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}

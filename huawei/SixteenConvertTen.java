package huawei;

import java.util.*;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/9
 */
public class SixteenConvertTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(sc.hasNextLine()){
           String s=sc.nextLine();
           int i=Integer.parseInt(s.substring(2),16);
           System.out.println(i);
       }
    }
}

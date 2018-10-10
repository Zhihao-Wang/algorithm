package huawei;

import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/10
 */
public class String8add0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            
            String s = sc.nextLine();
            if (s.length() % 8 != 0) {
                s = s + "00000000";
            }
            while (s.length() >= 8) {
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }
        }

    }


}

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/10
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Twentysix {
    //全局变量进位
    private static int jinWei = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(hexPlus26(sc.next(), sc.next()));
        }
    }

    private static String hexPlus26(String str1, String str2) {

        ArrayList<StringBuffer> arr;

        StringBuffer sbResult = new StringBuffer();

        //将两个字符串用'a'从最高位补全，并为可能出现最长字符串最高位进一的情况，在最高位补一个a
        if (str1.length() >= str2.length()) {
            arr = completeStr(str1, str2);
        } else {
            arr = completeStr(str2, str1);
        }
        StringBuffer sb1 = arr.get(0);
        StringBuffer sb2 = arr.get(1);

        for (int i = sb1.length() - 1; i >= 0; i--) {
            int plusResult = (int) sb1.charAt(i) - 97 + (int) sb2.charAt(i) - 97 + jinWei;
            //如果发生进位，将全局变量jinWei改成1，并在下一次循环中加上，否则为0
            if (plusResult > 25) {
                sbResult.append(Character.toString((char) (plusResult - 26 + 97)));
                jinWei = 1;
            } else {
                sbResult.append((char) (plusResult + 97));
                jinWei = 0;
            }
        }
        //如果最后没发生进位，去掉之前加的a
        if (sbResult.charAt(sbResult.length() - 1) == 'a') {
            sbResult.deleteCharAt(sbResult.length() - 1);
        }
        return sbResult.reverse().toString();
    }

    private static ArrayList<StringBuffer> completeStr(String str1, String str2) {

        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        ArrayList<StringBuffer> arr = new ArrayList<StringBuffer>();

        int lengthDiff = str1.length() - str2.length();

        //为可能出现最长字符串最高位进一的情况，在最高位先补一个a（代表0）
        sb1.append("a");
        sb2.append("a");

        //将两个字符串长度用a补齐
        for (int i = 0; i < lengthDiff; i++) {
            sb2.append("a");
        }

        //将原字符串加到最后边
        sb1.append(str1);
        sb2.append(str2);

        arr.add(sb1);
        arr.add(sb2);
        return arr;
    }
}
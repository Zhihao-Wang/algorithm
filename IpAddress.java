import java.util.ArrayList;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/11
 */
public class IpAddress {

    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));

    }

    public static ArrayList<String> restoreIpAddresses(String s) {

            ArrayList<String> res = new ArrayList<String>();
            if (s.length() < 4) return res;
            for (int i = 1; i < 4 && i < s.length() - 2; i++) {
                for (int j = i + 1; j < i + 4 && j < s.length() - 1; j++) {
                    for (int k = j + 1; k < j + 4 && k < s.length(); k++) {
                        String s1 = s.substring(0, i);
                        String s2 = s.substring(i, j);
                        String s3 = s.substring(j, k);
                        String s4 = s.substring(k, s.length());
                        if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                            res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                        }
                    }
                }
            }
            return res;
        }

    private static boolean isValid(String s) {
        if (s.length() == 0 || s.length() > 3 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255)
            return false;
        return true;

    }
}


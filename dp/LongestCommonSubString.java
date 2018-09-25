package dp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LongestCommonSubString {
//    public static int lcs(String str1,String str2){
//        int len1 = str1.length();
//        int len2 = str2.length();
//        int c[][] = new int[len1+1][len2+1];
//        int res=0;
//        for (int i = 0; i <= len1; i++) {
//            for( int j = 0; j <= len2; j++) {
//                if(i == 0 || j == 0) {
//                    c[i][j] = 0;
//                } else if (str1.charAt(i-1) == str2.charAt(j-1)) {
//                    c[i][j] = c[i-1][j-1] + 1;
//                    res=max(res,c[i][j]);
//                } else {
//                    c[i][j] = 0;
//                }
//            }
//        }
//        return res;
//
//    }

    public static String getPreMonthLastDay(String sdate) throws Exception {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
        SimpleDateFormat sfs = new SimpleDateFormat("yy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date date=sf.parse(sdate);
        calendar.setTime(date);
        int month = calendar.get(Calendar.MONTH);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH,
                calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        String lastdayoflastmonth=sfs.format(calendar.getTime());
        String s=lastdayoflastmonth.replaceAll("-","");
        String s1="ehrbk.t_employee_base_info_"+s;
        return s1;
    }

    public static void main(String[] args) throws Exception {
        String date="2018-08";
        System.out.println(getPreMonthLastDay(date));
    }
}

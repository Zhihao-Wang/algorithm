package meetingRoomReserve;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

public class MeetingSql {

    public static void main(String[] args) {

        Properties properties = new Properties();
        // 使用InPutStream流读取properties文件
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("E:/project/algorithm/meetingRoomReserve/meetingRoomReserve.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            properties.load(bufferedReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 获取key对应的value值
        int year = Integer.parseInt(properties.getProperty("year")); //定义一个字段，接收输入的年份
        int startMonth= Integer.parseInt(properties.getProperty("startMonth"));//开始的月份
        int endMonth=Integer.parseInt(properties.getProperty("endMonth"));//结束的月份
        int dayofweek=Integer.parseInt(properties.getProperty("dayofweek"));//周几
        String subject=properties.getProperty("subject");//会议主题
        String roomId=properties.getProperty("roomId");//会议主题
        String startOclock=properties.getProperty("startOclock");//会议开始时间
        String endOclock=properties.getProperty("endOclock");//会议结束时间
        String employee263=properties.getProperty("employee263");//预定人263
        String username=properties.getProperty("username");//预订人中文名
        String phone=properties.getProperty("phone");//预定人手机号

        Calendar calendar = new GregorianCalendar();//定义一个日历，变量作为年初
        Calendar calendarEnd= new GregorianCalendar();//定义一个日历，变量作为年末
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, startMonth-1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);//设置起始的日期为开始月1日
        calendarEnd.set(Calendar.YEAR, year);
        calendarEnd.set(Calendar.MONTH, endMonth-1);
        calendarEnd.set(Calendar.DAY_OF_MONTH, 31);//设置最后的日期为结束月31日

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

        while(calendar.getTime().getTime()<=calendarEnd.getTime().getTime()){//用一整年的日期循环
            if(calendar.get(Calendar.DAY_OF_WEEK)==dayofweek+1){//判断为周几，打印
                System.out.println("INSERT INTO sd_meeting_room_reserve (meeting_subject, meeting_room_id, begin_time, end_time, participants, remark, create_user_id, delete_flag, create_user_name, user_phone)\n" +
                        "VALUES (\'"+subject+"\',"+roomId+",\'"+sf.format(calendar.getTime()).toString()+" "+startOclock+"\',\'"+sf.format(calendar.getTime()).toString()+" "+endOclock+"\', NULL,\'"+subject+"\',\'"+employee263+"\',"+0+",\'"+username+"\',\'"+phone+"\');");
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);//日期+1
        }


    }


}


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/20
 */
public class PhoneNum {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("E:/9-25.txt");
            List<String> list = new ArrayList<String>();
            InputStreamReader isr  = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);
            String line ;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
            isr.close();
            fis.close();


            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://172.16.100.201:3306/ehr", "ehrDev", "employee");


            for(String l:list) {

                String querySql = String.format("SELECT count(*) FROM t_employee_base_info WHERE tel=%s;",l);
                PreparedStatement ps1 = conn.prepareStatement(querySql);
                ResultSet set1 = ps1.executeQuery();

                while (set1.next()) {
                    int value = set1.getInt(1);
                    if(value==0){
                        System.out.println(l);
                    }
                }
                ps1.close();

            }

            conn.close();




        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

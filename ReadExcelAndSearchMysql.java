import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/26
 */
public class ReadExcelAndSearchMysql {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        FileInputStream stream = new FileInputStream(new File("E:/合同模块需要修改表 (1).xlsx"));
        XSSFWorkbook workBook = new XSSFWorkbook(stream);
        stream.close();
        XSSFSheet sheet = workBook.getSheetAt(0);
        int rownum = sheet.getPhysicalNumberOfRows();

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://172.16.100.201:3306/ehr", "ehrDev", "employee");

        ArrayList<String> idnumList=new ArrayList<>();
        for (int i = 1; i <= rownum; i++) {
            Row row = sheet.getRow(i);
            boolean kong = row.getCell(0).getStringCellValue().equals("");
            if (row == null || kong) {
                break;
            }
            String idnum=row.getCell(0).getStringCellValue();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date=sdf.format(row.getCell(6).getDateCellValue());
            String state=row.getCell(3).getStringCellValue();
            Integer statenum=0;
            if("正式".equals(state)){
                statenum=3;
            }
            else if("实习".equals(state)){
                statenum=1;
            }
            else if("试用".equals(state)){
                statenum=2;
            }
            else if("离职".equals(state)){
                statenum=5;
            }
            String querySql = String.format("SELECT DISTINCT employee_id FROM t_employee_base_info WHERE id_num='%s' and entry_dt='%s' and work_state='%s';",idnum,date,statenum);
            PreparedStatement ps1 = conn.prepareStatement(querySql);
            ResultSet set1 = ps1.executeQuery();
            while (set1.next()) {
                String value = set1.getString(1);
                System.out.println(value);

            }
            ps1.close();
        }






        conn.close();


    }
}

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ReadTxt {
    @Test
    public void read() throws IOException{
        FileInputStream fis = new FileInputStream("E:/8-7.txt");
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

        for(String l:list){
            System.out.println("INSERT INTO t_work_appmarket_white_app(employee263,app_id,app_name) VALUES (\'"+l+"\',27,\'人力成本\');");
        }
    }

}

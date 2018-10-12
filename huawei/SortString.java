package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/12
 */
public class SortString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }
    }
}

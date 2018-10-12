package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/11
 */
public class DiffrentAscII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] chars=s.toCharArray();
        ArrayList<Character> list=new ArrayList<>();
        for(char c:chars){
            if(list.contains(c)){}
            else{
                list.add(c);
            }
        }
        System.out.println(list.size());


    }
}

package huawei;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/11
 */
public class IntFromBack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        while(num!=0){
            int a=num%10;
            if(list.contains(a)){

            }
            else {
                list.add(a);
            }
            num=num/10;
        }
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i));
        }

    }
}

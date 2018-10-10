package huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/10
 */
public class SameIndexSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Map<Integer,Integer> treemap=new TreeMap<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            int val=sc.nextInt();
            if(treemap.containsKey(key)){
                treemap.put(key,treemap.get(key)+val);
            }
            else{
                treemap.put(key,val);
            }
        }
        for(Integer key:treemap.keySet()){
            System.out.println(key+" "+treemap.get(key));
        }
    }
}

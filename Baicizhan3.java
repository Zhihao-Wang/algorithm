import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: wangzhihao
 * @Date: Created in 2018/9/11
 */
public class Baicizhan3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            for(int j=0;j<a;j++){
                list.add(sc.nextInt());
            }
        }

        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }


        Arrays.sort(res);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}

package dp;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Description:
 * @Input:
 * @Output:
 **/
public class MT201701 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  n =sc.nextInt();
        int[] dps =new int[n+1];
        dps[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                dps[j]+=dps[j-i];
            }
        }
        System.out.println(dps[n]);
    }
    @Test
    public void test(){
        String s1="asd@163.com";
        if(s1.contains("@163.com")){
            s1=s1.split("@")[0];
        }
        System.out.println(s1);
    }


}

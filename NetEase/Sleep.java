package NetEase;

import java.util.Scanner;
public class Sleep {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] score = new int[n];
        int[] wakeup = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            score[i]=in.nextInt();
            sum+=score[i];
        }
        for(int i=0;i<n;i++){
            wakeup[i]=in.nextInt();
        }
        if(n<=k) {System.out.println(sum);}
        else{
            sum=0;
            int max=0;
            for(int i=0;i<n;i++){
                if(wakeup[i]==1){
                    sum+=score[i];
                }else{
                    int bound = (i+k-1)>=n?n-1:(i+k-1);
                    int window = 0;
                    for(int j=i;j<=bound;j++){
                        if(wakeup[j]==0){
                            window+=score[j];
                        }
                    }
                    if(window>max){
                        max=window;
                    }
                }
            }
            System.out.println(max+sum);
        }
    }

}
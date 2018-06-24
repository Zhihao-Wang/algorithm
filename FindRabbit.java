import java.util.Scanner;
public class FindRabbit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] right=new int[2*(n-2)];
        if(k<2*(n-2))
            System.out.println("No");
        int[] hole=new int[k];
        for(int i=0;i<k;i++){
            hole[i]=in.nextInt();
        }
        for(int i=0;i<n-2;i++){
            right[i]=i+2;
        }
        for(int i=n-2;i<2*(n-2);i++){
            right[i]=right[2*(n-2)-1-i];
        }
        StringBuffer sbs= new StringBuffer();
        for(int i=0;i<hole.length;i++){
            sbs.append(hole[i]);
        }
        String s=sbs.toString();
        StringBuffer sbr= new StringBuffer();
        for(int i=0;i<right.length;i++){
            sbr.append(right[i]);
        }
        String r=sbr.toString();
        if(s.contains(r))
            System.out.println("YES");
        else
            System.out.println("No");

    }
}
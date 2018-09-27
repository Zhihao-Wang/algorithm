import java.util.Scanner;

public class LengthofLastwords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.next().toLowerCase();
        String s2=sc.next().toLowerCase();
        char c=s2.toCharArray()[0];
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(c==s1.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}

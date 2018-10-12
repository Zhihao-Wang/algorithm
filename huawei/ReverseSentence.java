package huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/11
 */
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        Stack<String> stack=new Stack<>();

            String s=sc.nextLine();
            String[] words=s.split(" ");
        for(String ss:words){
            stack.push(ss);
        }


        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

    }
}

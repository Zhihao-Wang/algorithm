package huawei;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/10/12
 */
public class ChangePassword {
    public static void main(String[] args) {
        char c='X';
        char ch2='a';
        if(Character.isUpperCase(c)){
            if(c=='Z')
                ch2='a';
            else
                ch2= (char) (Character.toLowerCase(c)+1);
        }

        System.out.println(ch2);
    }
}

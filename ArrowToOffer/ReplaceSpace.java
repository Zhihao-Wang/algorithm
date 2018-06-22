package ArrowToOffer;

import org.junit.Test;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        for(int k=0; k<str.length(); k++)  {
            char index = str.charAt(k);
            if(index == ' ')
                str.replace(k, k+1, "%20");
        }
        return str.toString();
    }
    @Test
    public void test(){
        String str="we are the world";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(replaceSpace(sb));
    }
}

import org.junit.Test;

public class IsSubstring {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0, pos = 0; i < s.length(); i++, pos++) {
            char si=s.charAt(i);
            pos = t.indexOf(si, pos);
            if(pos == -1) return false;
        }
        return true;
    }

    @Test
    public void test(){
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}

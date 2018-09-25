import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/12
 */
public class PrintTree {
    public ArrayList<ArrayList<Integer>> printTree(TreeNode head) {
        Stack<TreeNode> nowStack = new Stack<>();
        nowStack.push(head);
        ArrayList<ArrayList<Integer>> listall = new ArrayList<>();
        while (!nowStack.isEmpty()) {
            ArrayList<Integer> listone = new ArrayList<>();
            Stack<TreeNode> nextStack = new Stack<>();
            for(TreeNode node:nowStack) {
                listone.add(node.val);
                if (node.right != null) {
                    nextStack.push(node.right);
                }
                if (node.left != null) {
                    nextStack.push(node.left);
                }

            }
            listall.add(listone);
            nowStack = nextStack;
        }
        return listall;
    }
}

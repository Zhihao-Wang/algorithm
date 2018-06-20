

public class SolutionMaxDepth {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        TreeNode b=new TreeNode(2);
        TreeNode c=new TreeNode(3);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(5);
        TreeNode f=new TreeNode(6);
        a.left=b;
        b.right=c;
        a.right=d;
        d.left=e;
        d.right=f;
        System.out.println(maxDepth(a));
    }

    public static int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        if(root.left==null){
            return maxDepth(root.right)+1;
        }
        if(root.right==null){
            return maxDepth(root.left)+1;
        }
        return  Math.max(maxDepth(root.left),maxDepth(root.right))+1;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
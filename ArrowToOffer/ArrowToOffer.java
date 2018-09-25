package ArrowToOffer;

import org.junit.Test;
import tree.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/12
 */
public class ArrowToOffer {


    static class Singleton {
        private Singleton() {
        }

        private static class SingletonHolder {
            public static final Singleton instance = new Singleton();
        }

        public static Singleton getInstance() {
            return SingletonHolder.instance;
        }
    }

    /**
     * 数组中的重复数字，返回任意一个重复数字，n个数字的范围都在[0,n-1]
     */
    @Test
    public void repetition() {
        int[] nums = {2, 0, 1, 3, 2};
        for (int i = 0; i < nums.length; i++) {
            int now = nums[i];
            if (now != i) {
                if (nums[now] == now) {
                    System.out.println(now);
                } else {
                    int t = now;
                    nums[i] = nums[now];
                    nums[now] = t;
                }
            }
        }
    }

    @Test
    public void findinMatrix() {
        int[][] matrix = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int target = 2;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i <= matrix.length - 1 && j >= 0) {
            if (target > matrix[i][j]) {
                i++;
            } else if (target == matrix[i][j]) {
                System.out.println(true);
                return;
            } else {
                j--;
            }
        }
        System.out.println(false);
    }

    /**
     * 替换空格
     */
    @Test
    public void replaceSpace() {
        String s = "abc de f ";
        String t = s.replace(" ", "%20");
        System.out.println(t);
    }

    /**
     * 从尾到头打印链表
     * @param head
     */
    public void printStackFromTail(ListNode head){
        Stack<Integer> sk=new Stack<>();
        while(head!=null){
            sk.push(head.data);
            head=head.next;
        }
        while(!sk.isEmpty()){
            System.out.println(sk.pop());
        }


    }

    /**
     *
     * @param matrix
     * @return 顺时针打印矩阵
     */
    public ArrayList printMatrix(int[][] matrix){
        int row=0;
        int rowlen=matrix.length-1;
        int col=0;
        int collen=matrix[0].length-1;
        ArrayList list=new ArrayList();

       while(row<=rowlen&&col<=collen){
           for(int i=0;i<=collen;i++){
               list.add(matrix[row][i]);
           }
           for(int j=row+1;j<=rowlen;j++){
               list.add(matrix[j][collen]);
           }
           if(collen>col&&row<rowlen){
               for(int i=collen-1;i>col;i--){
                   list.add(matrix[rowlen][i]);
               }
               for(int j=rowlen;j>row;j--){
                   list.add(matrix[j][row]);
               }
           }
           row++;col++;rowlen--;collen--;
       }
        return list;
    }

    /**
     * @param l1
     * @param l2
     * @return 合并有序链表
     */

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.data < l2.data) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }

    }

    @Test
    public void isPadrome() {
        String s = "aba";
        StringBuilder sb = new StringBuilder(s);
        String sre = sb.reverse().toString();
        if (s.equals(sre)) System.out.println(true);
        else System.out.println(false);
    }

    /**
     * 二叉树的镜像
     * @param root
     */
    public void mirriors(TreeNode root) {
        if(root==null)
            return;
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        mirriors(root.left);
        mirriors(root.right);
    }

    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        if(root.left==null)return maxDepth(root.right)+1;
        if(root.right==null)return maxDepth(root.left)+1;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }


}

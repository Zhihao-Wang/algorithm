package ArrowToOffer;

/**
 * @Author: wangzhihao
 * @Date: Created in  2018/9/21
 */
public class Merge {
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.data<l2.data){
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else{
            l2.next=merge(l1,l2.next);
            return l2;
        }

    }
}

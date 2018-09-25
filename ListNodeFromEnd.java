
public class ListNodeFromEnd {
    public ListNode FindKthToTail(ListNode head,int k){
    if(head == null || k <= 0){
        return null;
    }
    ListNode ANode = head;
    ListNode BNode = null;
    for(int i = 0;i<k-1;i++){
        if(ANode.next != null)
            ANode = ANode.next;
        else
            return null;
    }
    BNode = head;
    while(ANode.next != null){
        ANode = ANode.next;
        BNode = BNode.next;
    }
    return BNode;
}

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = forth;

        ListNodeFromEnd test = new ListNodeFromEnd();
        ListNode result = test.FindKthToTail(head, 2);
        System.out.println(result.data);
    }

}


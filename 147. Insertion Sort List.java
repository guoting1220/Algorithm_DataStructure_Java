public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode n = head;
        ListNode p;
        ListNode nnex;
        ListNode fakeHead = new ListNode(Integer.MIN_VALUE);
        fakeHead.next = head;
        while(n!=null && n.next!=null){
            p = fakeHead;
            while(p!=n){
                if(n.next.val>=p.val && n.next.val>=p.next.val) p = p.next;
                else if(n.next.val>=p.val && n.next.val<p.next.val){
                    nnex = n.next;
                    n.next = nnex.next;
                    nnex.next = p.next;
                    p.next = nnex;
                    break;
                }
            }
            if(p==n) n = n.next;
        }
        return fakeHead.next;
    }
}
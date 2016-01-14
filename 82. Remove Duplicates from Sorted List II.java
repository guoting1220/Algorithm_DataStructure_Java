public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode n = fakeHead;
        ListNode p = head.next;
        while(p!=null){
            if(n.next.val!=p.val){
                n = n.next;
                p = p.next;
            }
            else{
                while(p!=null && p.val==n.next.val) p = p.next;
                n.next = p;
                if(p!=null) p = p.next;
            }
        }
        return fakeHead.next;
    }
}
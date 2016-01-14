public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode p = fakeHead;
        while(p.next!=null){
            if(p.next.val==val) p.next = p.next.next;
            else p = p.next;
        }
        return fakeHead.next;
    }
}
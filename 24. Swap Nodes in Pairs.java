public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        ListNode cur = head;
        ListNode nex = null;
        while(cur!=null && cur.next!=null){
            nex = cur.next.next;
            pre.next = cur.next;
            cur.next.next = cur;
            pre = cur;
            cur = nex;
            pre.next = cur;
        }
        
        return fakeHead.next;
    }
}
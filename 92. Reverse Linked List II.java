public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || head.next==null || m==n) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode p = fakeHead;
        for(int i=0; i<m-1; i++){
            p = p.next;
        }
        ListNode pre = p.next; //stick to it, not move, move nodes after it one by one
        ListNode cur = pre.next;
        ListNode nex = null;
        for(int i=0; i<n-m; i++){
            nex = cur.next;
            cur.next = p.next;
            p.next = cur;
            pre.next = nex;
            cur = nex;
        }
        return fakeHead.next;
    }
}
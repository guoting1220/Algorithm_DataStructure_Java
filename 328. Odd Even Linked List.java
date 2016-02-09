public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode n = head;
        ListNode pre = head.next;
        ListNode cur = pre.next;
        ListNode nex = null;
        while(cur!=null){
            nex = cur.next;
            cur.next = n.next;
            n.next = cur;
            pre.next = nex;
            if(nex==null) break;
            n = cur;
            cur = nex.next;
            pre = nex;
        }
        return head;
    }
}
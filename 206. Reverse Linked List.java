public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode nex = null;
        head.next = null;
        while(null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p2 = reverseList(p1.next);
        p1.next = null;
        p1 = head;
        ListNode p1next = null;
        ListNode p2next = null;
        while(p1!=null && p2!=null){
            p1next = p1.next;
            p2next = p2.next;
            p1.next = p2;
            p2.next = p1next;
            p1 = p1next;
            p2 = p2next;
        }
        return;
    }
    
    
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode nex = null;
        head.next = null;
        while(cur!=null){
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode n = head;
        ListNode p = head.next;
        while(p!=null){
            if(n.val!=p.val){
                n.next = p;
                n = p;
            }
            p = p.next;
        }
        n.next = null;
        return head;
    }
}Puffer
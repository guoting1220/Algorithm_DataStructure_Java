public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n<=0) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode p1 = fakeHead;
        ListNode p2 = fakeHead;
        for(int i=0; i<n; i++){
            if(p2!=null) p2 = p2.next;
        }
        if(p2==null) return head;
        while(p2.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return fakeHead.next;
        
    }
}
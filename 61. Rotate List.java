public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode tail = head;
        int len = 1;
        
        //find the length and the tail node
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        
        k = k % len;
        
        ListNode p1 = head;
        ListNode p2 = head;
        
        for(int i=0; i<k; i++){
            p2 = p2.next;
        }
        
        //find the cut node 
        while(p2.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        tail.next = head;
        head = p1.next;  //new head
        p1.next = null;
        
        return head;
    }
}
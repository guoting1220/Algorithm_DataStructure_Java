public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int lenA = length(headA);
        int lenB = length(headB);
        if(lenA-lenB>0) headA = moveHead(headA, lenA-lenB);
        else if(lenA-lenB<0) headB = moveHead(headB, lenB-lenA);
        while(headA!=null){
            if(headA==headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    
     public int length(ListNode head){
         if(head==null) return 0;
         ListNode n = head;
         int len = 0;
         while(n!=null){
             n = n.next;
             len++;
         }
         return len;
     }
     
     public ListNode moveHead(ListNode head, int n){
         for(int i=0; i<n; i++){
            if(head!=null) head = head.next;
         }
         return head;
     }
}
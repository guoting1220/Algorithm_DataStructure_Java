public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode left = new ListNode(0);
        left.next = head;
        ListNode left2 = left;  //keep it for later use
        ListNode right = new ListNode(0);
        ListNode right2 = right; //keep it for later use
        while(left!=null && left.next!=null){
            if(left.next.val < x) left = left.next;
            else{
                right.next = left.next;
                left.next = left.next.next;
                right = right.next;
            }
        }
        right.next = null;
        left.next = right2.next;
        return left2.next;
    }
}
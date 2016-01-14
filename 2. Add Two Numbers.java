public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //if(l1==null) return l2;
        //if(l2==null) return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode sum = fakeHead;
        int c1 = 0;
        int c2 = 0; 
        int c = 0;
        int digit = 0;
        while(l1!=null || l2!=null){
            c1 = (l1==null)? 0 : l1.val;
            c2 = (l2==null)? 0 : l2.val;
            digit = (c1 + c2 + c) % 10;
            c = (c1 + c2 + c) / 10;
            sum.next = new ListNode(digit);
            sum = sum.next;  //don't forget!!
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(c==1) sum.next = new ListNode(1);
        return fakeHead.next;
    }
}
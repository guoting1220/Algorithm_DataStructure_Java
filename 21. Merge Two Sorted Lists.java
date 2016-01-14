public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode n = fakeHead;
        while(l1!=null || l2!=null){
            if(l2==null || (l1!=null && l1.val<=l2.val)){
                n.next = l1;
                l1 = l1.next;
            }
            else if(l1==null || (l2!=null && l1.val>l2.val)){
                n.next = l2;
                l2 = l2.next;
            }
            n = n.next;
        }
        return fakeHead.next;
    }
}
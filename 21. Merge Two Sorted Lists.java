public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(!l1) return l2;
        if(!l2) return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode n = fakeHead;
        while(l1 || l2){
            if(!l2 || (l1 && l1.val<=l2.val)){
                n.next = l1;
                l1 = l1.next;
            }
            else if(!l1 || (l2 && l1.val>l2.val)){
                n.next = l2;
                l2 = l2.next;
            }
            n = n.next;
        }
        return fakeHead.next;
    }
}
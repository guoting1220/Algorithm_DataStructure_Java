// 2	Add Two Numbers
// You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

// Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
// Output: 7 -> 0 -> 8

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode result = new ListNode(0);
        ListNode p = result;  // need keep result safe!
        int c = 0;
        int x, y;
        while(l1!=null || l2!=null || c==1){
            x = (l1!=null)? l1.val : 0;
            y = (l2!=null)? l2.val : 0;
            p.next = new ListNode((x+y+c)%10);
            p = p.next;     //!!!!!!! dont forget!!!!!!!!!
            c = (x+y+c)/10;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
      //  if(c==1) p.next = new ListNode(1);
        return result.next;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode p1 = head;
        ListNode p2 = head;
        while(p2!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if(p2==null) p2 = head;
        else {
            p1 = p1.next;
            p2 = head;
        }
        
        p1 = reverse(p1);
        
        //p2 may have one more node than p1
        while(p1!=null){
            if(p1.val!=p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head){
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
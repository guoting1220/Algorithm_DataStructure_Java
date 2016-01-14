public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode p1 = head;
        ListNode p2 = head.next.next;
        while(p2!=null && p2.next!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        TreeNode root = new TreeNode(p1.next.val);
        ListNode right = p1.next.next;
        p1.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(right);
        return root;
    }
}
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        root.next = null;
        TreeLinkNode parent = root;
        TreeLinkNode leftN = root.left;
        while(leftN!=null){
            while(parent!=null){
                parent.left.next = parent.right;
                parent.right.next = (parent.next==null)? null : parent.next.left;
                parent = parent.next;
            }
            parent = leftN;
            leftN = parent.left;
        }
        return;
    }
}
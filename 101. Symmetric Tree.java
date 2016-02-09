public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        return n1.val==n2.val && helper(n1.right, n2.left) && helper(n1.left, n2.right);
    }
}
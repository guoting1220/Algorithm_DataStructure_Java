public class Solution {
    public void flatten(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode n = root;
        while(n!=null){
            if(n.right!=null) stack.push(n.right);
            if(n.left!=null){
                n.right = n.left;
                n.left = null;
            }
            else {
                n.right = (stack.isEmpty())? null : stack.pop();
            }
            n = n.right;
        }
        return;
    }
}
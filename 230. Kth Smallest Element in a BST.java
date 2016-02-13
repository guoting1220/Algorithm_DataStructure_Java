//inorder traversal
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        TreeNode n = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        for(int i=0; i<k; i++){
            while(n!=null){
                stack.push(n);
                n = n.left;
            }
            p = stack.pop();
            n = p.right;
        }
        return p.val;
    }
}
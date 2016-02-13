public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode n = root;
        while(n!=null){
            result.add(n.val);
            if(n.right!=null) stack.push(n.right);
            n = (n.left!=null)? n.left : ((stack.isEmpty())? null : stack.pop());
        }
        return result;
    }
}
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode n = root;
        TreeNode poped;
        while(n!=null || !stack.isEmpty()){
            while(n!=null) {
                stack.push(n);
                n = n.left;
            }
            n = stack.pop();
            result.add(n.val);
            n = n.right;
        } 
       return result;
    }
}
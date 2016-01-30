/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(n==0) return result;
        return helper(1,n);
    }
    
    public List<TreeNode> helper(int n1, int n2){
        List<TreeNode> result = new ArrayList<TreeNode>();
        if(n1>n2){
            result.add(null);  // important! used to set null left or right
            return result;
        }
       // if(n1==n2) result.add(new TreeNode(n1));
        List<TreeNode> left, right;
        TreeNode root;
        for(int i=n1; i<=n2; i++){
            root = new TreeNode(i);
            left = helper(n1, i-1);
            right = helper(i+1, n2);
            for(TreeNode k : left){
                for(TreeNode s : right){
                    root = new TreeNode(i);  // don't forget !!!!!!
                    root.left = k;
                    root.right = s;
                    result.add(root); // don't forget
                }
            }
        }
        return result;
    }
}
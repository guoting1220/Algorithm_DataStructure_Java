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
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
       // if(root.left==null && root.right==null) return root.val;
        List<TreeNode> list = new ArrayList<TreeNode>();
        List<TreeNode> copylist;
        list.add(root);
        int result = 0;
        while(list.size()!=0){
            copylist = list;
            list = new ArrayList<TreeNode>();
            for(TreeNode k : copylist){
                if(k.left==null && k.right==null) result += k.val;
                if(k.left!=null) {
                    k.left.val += k.val*10;
                    list.add(k.left);
                }
                if(k.right!=null) {
                    k.right.val += k.val*10;
                    list.add(k.right);
                }
            }
        }
        return result;
    }
}
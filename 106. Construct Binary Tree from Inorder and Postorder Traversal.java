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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
    
    public TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder, int posStart, int posEnd) {
        if(inStart>inEnd || posStart>posEnd) return null;
        TreeNode root = new TreeNode(postorder[posEnd]);
        int index = findIndex(inorder, inStart, inEnd, postorder[posEnd]);
        root.left = helper(inorder, inStart, index-1, postorder, posStart, posStart+index-1-inStart);
        root.right = helper(inorder, index+1, inEnd, postorder, posEnd-1-(inEnd-index-1), posEnd-1);
        return root;
    }
    
    public int findIndex(int[] a, int start, int end, int val){
        for(int i=start; i<=end; i++){
            if(a[i]==val) return i;
        }
        return -1;
    }
}
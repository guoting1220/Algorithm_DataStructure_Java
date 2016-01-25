public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || preorder.length==0 || inorder==null || inorder.length==0) return null;
        if(preorder.length != inorder.length) return null;
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
    
    public TreeNode helper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd){
        if(preStart>preEnd || inStart>inEnd) return null; // used to populate the kids of leaves to null
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = findRootInInorder(inorder, preorder[preStart]);
        root.left = helper(preorder, preStart+1, preStart+index-inStart, inorder, inStart, index-1);
        root.right = helper(preorder, preStart+index-inStart+1, preEnd, inorder, index+1, inEnd);
        return root;
    } 
    
    public int findRootInInorder(int[] a, int value){
            for(int i=0; i<a.length; i++){
                if(a[i]==value) return i;
            }
            return -1; // dont forget!!!
    }    
}

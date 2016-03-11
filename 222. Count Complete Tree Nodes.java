public class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int leftH = height(root.left);
        int rightH = height(root.right);
        if(leftH==rightH) return 1 + (1<<leftH)-1 + countNodes(root.right);  //here: use 1<<h instead of Math.pow(2,h)
        else return 1 + (1<<rightH)-1 + countNodes(root.left);
    }
    
    public int height(TreeNode root){ //complete tree
        if(root==null) return 0;
        TreeNode n = root;
        int h = 0;
        while(n!=null){
            h++;
            n = n.left;
        }
        return h;
    }
}
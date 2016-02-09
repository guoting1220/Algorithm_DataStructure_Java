public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        ArrayList<TreeNode> node = new ArrayList<TreeNode>();
        ArrayList<Integer> value = new ArrayList<Integer>();
        node.add(root);
        ArrayList<TreeNode> copyNode = node;
        while(!node.isEmpty()){
            copyNode = node;
            node = new ArrayList<TreeNode>();
            value = new ArrayList<Integer>();
            for(TreeNode k : copyNode){
                value.add(k.val);
                if(k.left!=null) node.add(k.left);
                if(k.right!=null) node.add(k.right);
            }
            result.add(value);
        }
        return result;
    }
}
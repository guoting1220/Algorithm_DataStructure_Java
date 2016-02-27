public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root==null) return result;
        List<TreeNode> node = new ArrayList<TreeNode>();
        node.add(root);
        List<TreeNode> nodeCopy;
        List<Integer> value = new ArrayList<Integer>();
        boolean c = true;
        while(node.size()!=0){
            nodeCopy = node;
            node = new ArrayList<TreeNode>();
            value = new ArrayList<Integer>();
            for(TreeNode k : nodeCopy){
                if(c) value.add(k.val);
                else value.add(0, k.val);
                if(k.left!=null) node.add(k.left);
                if(k.right!=null) node.add(k.right);
            }
            result.add(value);
            c = !c;
        }
        return result;
    }
}
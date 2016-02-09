public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return result;
        List<TreeNode> node = new ArrayList<TreeNode>();
        node.add(root);
        List<TreeNode> copyNode = node;
        while(node.size()!=0){
            copyNode = node;
            node = new ArrayList<TreeNode>();
            for(TreeNode k : copyNode){
                list.add(k.val);
                if(k.left!=null) node.add(k.left);
                if(k.right!=null) node.add(k.right);
            }
            result.add(0, new ArrayList<Integer>(list));
            list = new ArrayList<Integer>();
        }
        return result;
    }
}
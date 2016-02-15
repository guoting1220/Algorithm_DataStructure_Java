public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root==null) return result;
        List<TreeNode> each = new ArrayList<TreeNode>();
        each.add(root);
        List<TreeNode> copyEach;
        while(each.size()!=0){
            result.add(each.get(each.size()-1).val);
            copyEach = each;
            each = new ArrayList<TreeNode>();
            for(TreeNode k : copyEach){
                if(k.left!=null) each.add(k.left);
                if(k.right!=null) each.add(k.right);
            }
        }
        return result;
    }
}

public class BSTIterator {
    TreeNode n;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        n = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (n!=null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode poped = n;
        while(n!=null){
            stack.push(n);
            n = n.left;
        }
        poped = stack.pop();
        n = poped.right;
        
        return poped.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
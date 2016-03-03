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

public List<List<Integer>> pathSum(TreeNode root, int target) {
    List<List<Integer>> results = new ArrayList<>();
    // Store path as we decend
    List<Integer> path = new ArrayList<>();
    dfs(root, 0, target, path, results);
    return results;
}

/**
 * Node - the current being looked at
 * sum  - the sum for the current path
 * target - the targetted total
 * path - the nodes seen in the current path
 * results - the list of paths that led to the targetted total
 */
public void dfs(TreeNode node, int sum, int target, List<Integer> path, List<List<Integer>> results) {
    if (node == null) return;
    // Add the value of the current node to the sum
    sum += node.val;
    // Add the current node the path
    path.add(node.val);

    // If it's a leaf node and the sum matches what we're targetting
    // add the path to the list of paths that lead to the targetted total
    if(node.left == null && node.right == null && sum == target) {
        results.add(new ArrayList(path));
        return;
    }

    // Visit recursivelly the left branch, but only if it exists :)
    if (node.left != null) {
        dfs(node.left, sum, target, path, results);
        // Remove the last node from the path since we're going to explore other paths when 
        // we return the function
        path.remove(path.size()-1);
    }

    // Same as above, but now for the rigth branch
    if(node.right != null) {
        dfs(node.right, sum, target, path, results);
        path.remove(path.size()-1);
    }
}
}
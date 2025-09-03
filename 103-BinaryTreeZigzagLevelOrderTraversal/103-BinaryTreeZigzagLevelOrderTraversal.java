// Last updated: 9/3/2025, 10:08:50 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        
        dfs(root, 0, results);

        return results;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> results) {
        if (root == null) return;

        if (level >= results.size()) {
            List<Integer> list = new LinkedList<Integer>();
            results.add(list);
        }

        if (level % 2 == 1) {
            results.get(level).addFirst(root.val);
        } else {
            results.get(level).addLast(root.val);
        }

        dfs(root.left, level + 1, results);
        dfs(root.right, level + 1, results);
    }
}
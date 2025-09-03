// Last updated: 9/3/2025, 10:08:00 AM
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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int leftSum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftSum = root.left.val;
        }

        return leftSum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
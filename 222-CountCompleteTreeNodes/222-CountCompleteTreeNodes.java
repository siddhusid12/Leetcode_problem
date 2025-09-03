// Last updated: 9/3/2025, 10:08:18 AM
class Solution {
  public int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    return 1 + countNodes(root.left) + countNodes(root.right);
  }
}
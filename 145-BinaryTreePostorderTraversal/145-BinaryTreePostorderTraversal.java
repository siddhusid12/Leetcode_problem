// Last updated: 9/3/2025, 10:08:33 AM
class Solution {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    postorder(root, ans);
    return ans;
  }

  private void postorder(TreeNode root, List<Integer> ans) {
    if (root == null)
      return;

    postorder(root.left, ans);
    postorder(root.right, ans);
    ans.add(root.val);
  }
}
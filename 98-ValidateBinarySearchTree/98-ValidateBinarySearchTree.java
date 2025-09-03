// Last updated: 9/3/2025, 10:08:56 AM
class Solution {
    private long minVal = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true; 
        if (!isValidBST(root.left)) return false;
        
        if (minVal >= root.val) return false; 

        minVal = root.val;

        if (!isValidBST(root.right)) return false;

        return true;
    } 
}
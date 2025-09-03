// Last updated: 9/3/2025, 10:08:46 AM
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildBST(head, null); 
    }

    private TreeNode buildBST(ListNode head, ListNode stop) {
        if (head == stop) return null; 

        ListNode slow = head, fast = head;
        while (fast != stop && fast.next != stop) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode node = new TreeNode(slow.val);

        node.left = buildBST(head, slow);
        node.right = buildBST(slow.next, stop);

        return node;
    }
}
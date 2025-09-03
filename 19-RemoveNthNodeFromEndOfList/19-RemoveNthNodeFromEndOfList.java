// Last updated: 9/3/2025, 10:09:42 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow = head;
    ListNode fast = head;

    while (n-- > 0)
      fast = fast.next;
    if (fast == null)
      return head.next;

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;

    return head;
  }
}
    

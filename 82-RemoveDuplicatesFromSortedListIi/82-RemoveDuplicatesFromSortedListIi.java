// Last updated: 9/3/2025, 10:09:03 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(1000, head); 
        ListNode cur = ans; 

        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) { 
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) { 
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next; 
            }
        }

        return ans.next; 
    }
}
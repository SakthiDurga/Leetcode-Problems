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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        int maxSum = 0;
        while(head != null && prev != null){
            maxSum = Math.max(head.val+prev.val, maxSum);
            head = head.next;
            prev = prev.next;
        }
        return maxSum;
    }
}

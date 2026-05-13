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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode next_node = current.next;
        while(current != null){
            current.next = prev;
            prev = current;
            current = next_node;
            if(next_node != null) next_node = next_node.next;
        }
        head = prev;
        return head;
    }
}

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
    public ListNode deleteMiddle(ListNode head) {
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        if(len == 1){
            return null;
        }
        curr = head;
        int mid = len / 2;
        for(int i = 0; i < mid-1; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}

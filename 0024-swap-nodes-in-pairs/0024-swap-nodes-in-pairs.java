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
    public ListNode swapPairs(ListNode head) {
        ListNode start = head;
        if (head == null || head.next == null) return head;
        int a = 0;
        int swap = 0;
        while ( head.next != null ){
            if (swap%2 == 0 ){
                a = head.val;
                head.val = head.next.val;
                head.next.val = a;
            }
            swap++;
            head = head.next;
        }
        return start;
    }
}
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
        ListNode currentNode = head;
        int size = 0;
        while (currentNode != null){
            size++;
            currentNode = currentNode.next;
        }
        int a = size - n;
        int size2 = 0;
        ListNode removeNode = head;
        while (removeNode != null){
            size2++;
            if(n == size){
                head = head.next;
                return head;
            }
            if(n == 1 && a == size2){
                removeNode.next = null;
                return head;
            }
            if( a == size2){
                removeNode.next  = removeNode.next.next;
                return head;
            }
            removeNode  = removeNode.next;
        }
        return head;
    }
}
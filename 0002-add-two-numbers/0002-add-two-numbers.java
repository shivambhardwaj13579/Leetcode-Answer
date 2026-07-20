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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int totel = 0;
        int carry = 0;
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while( l1 != null || l2 != null || carry != 0 ){
            if(l1 != null){
                totel = totel + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                totel = totel + l2.val;
                l2 = l2.next;
            }
            totel = totel + carry;
            carry = 0 ;

            carry = totel/10;
            totel = totel%10;

            cur.next = new ListNode(totel);

            totel = 0;
            cur = cur.next;
        }
        return dummy.next;
    }
}
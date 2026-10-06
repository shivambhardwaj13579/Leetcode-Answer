class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0 || head.next == null){
            return head;
        }
        int size = 1;
        ListNode curr = head;
        while (curr.next != null){
            curr = curr.next;
            size++;
        }
        k %= size;
        if(k == 0 ) return head;
        curr.next = head;
        ListNode newCurr = head;
        size -= k;
        for (int i = 1 ; i < size ; i++) {
            newCurr = newCurr.next;
        }
        ListNode newHead = newCurr.next;
        newCurr.next = null;
        return newHead;
    }
}
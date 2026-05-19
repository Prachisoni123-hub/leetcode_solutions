class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; 

        while (even != null && even.next != null) {
            odd.next = even.next;  // odd points to next odd node
            odd = odd.next;        // advance odd pointer

            even.next = odd.next;  // even points to next even node
            even = even.next;      // advance even pointer
        }

        odd.next = evenHead; // connect end of odd list to start of even list
        return head;
    }
}
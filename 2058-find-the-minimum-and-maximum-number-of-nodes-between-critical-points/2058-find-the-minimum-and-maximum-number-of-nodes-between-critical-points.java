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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int pos = 1;
        int first = -1;
        int last = -1;
        int min = Integer.MAX_VALUE;

        while (curr != null && curr.next != null) {

            // Check critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                // First critical point
                if (first == -1) {
                    first = pos;
                } 
                else {
                    // Distance from previous critical point
                    min = Math.min(min, pos - last);
                }

                last = pos;
            }

            prev = curr;
            curr = curr.next;
            pos++;
        }

        // Fewer than 2 critical points
        if (first == -1 || first == last) {
            return ans;
        }

        // Maximum distance
        ans[0] = min;
        ans[1] = last - first;

        return ans;
    }
}
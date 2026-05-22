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
        // created a new node
       ListNode dummy = new ListNode(0);
       // pointer on it called temp // new nodes ko connect krega
       ListNode temp = dummy;
       // carry of sum ,initially zero h
       int carry =0;
       while(l1 != null || l2!=null || carry!=0){
        // eaxh itrration start with carry
         int sum = carry; 

         // for l1
         if(l1!=null){
            sum+=l1.val;
            l1 = l1.next;
         }

         //  for l2
         if(l2 != null){
            sum+=l2.val;
            l2=l2.next;
         }
              // new listnode for lastdigit and store it
            temp.next = new ListNode(sum % 10);
            // calculate carry
             carry = sum / 10;

            temp = temp.next;

        }
         return dummy.next;
    }
}
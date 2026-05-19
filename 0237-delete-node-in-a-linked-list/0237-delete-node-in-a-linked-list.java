/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // we dont have to delete the address from memory itself , only chnage the value
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next= node.next.next;
        
    }
}
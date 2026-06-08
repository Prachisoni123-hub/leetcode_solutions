/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;

        TreeNode newRoot = null;
        TreeNode prev = null;

        while (curr != null || !st.isEmpty()) {

            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }

            curr = st.pop();

            if (newRoot == null) {
                newRoot = curr;   // smallest node
            }

            if (prev != null) {
                prev.right = curr;
            }

            curr.left = null;
            prev = curr;

            curr = curr.right;
        }

        return newRoot;
    }
}
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
       static List<Integer> ans;
     private void preorder(TreeNode root){
        if( root == null)  return ; // Base Case
    // we have to return the list so we add root value instead of printing
    ans.add(root.val);
        preorder(root.left);        // left sub tree
        preorder( root.right);    // right sub tree

    }
    public List<Integer> preorderTraversal(TreeNode root) {
              ans = new ArrayList<>();
      preorder(root);  
      return ans;
    }
}
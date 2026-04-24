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
    private int height(TreeNode root){
        if(root == null) return -1;
        int l =  height(root.left);
        int r = height(root.right);
        return Math.max(l,r)+1;
    }
    public int maxDepth(TreeNode root) {
        return height(root)+1;
    }
}

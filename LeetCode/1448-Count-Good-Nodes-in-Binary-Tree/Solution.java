/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int count = 0;

    public int goodNodes(TreeNode root) {
        traverseTree(root, Integer.MIN_VALUE);
        return count;
    }

    private void traverseTree(TreeNode root, int maxNumSeen) {
        if (root == null)
            return;

        if (maxNumSeen <= root.val)
            count++;
        if (root.val > maxNumSeen)
            maxNumSeen = root.val;

        traverseTree(root.left, maxNumSeen);
        traverseTree(root.right, maxNumSeen);
    }
}
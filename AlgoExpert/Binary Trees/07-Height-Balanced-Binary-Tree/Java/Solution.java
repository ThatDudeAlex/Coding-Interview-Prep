
class Solution {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public boolean heightBalancedBinaryTree(BinaryTree tree) {
    // Write your code here.
    int leftHeight = getHeightDifOfSubtrees(tree.left);
    int rightHeight = getHeightDifOfSubtrees(tree.right);

    if (!isBalanced(leftHeight, rightHeight)) {
      return false;
    }

    return true;
  }

  // performs post order traversal
  private int getHeightDifOfSubtrees(BinaryTree root) {
    if (root == null) {
      return 0;
    }

    System.out.println(root.value);

    int leftSubtreeHeight = getHeightDifOfSubtrees(root.left);
    if (leftSubtreeHeight == Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    int rightSubtreeHeight = getHeightDifOfSubtrees(root.right);
    if (rightSubtreeHeight == Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    }

    // visit
    if (!isBalanced(leftSubtreeHeight, rightSubtreeHeight)) {
      return Integer.MAX_VALUE;
    }

    return Math.max(leftSubtreeHeight, rightSubtreeHeight) + 1;
  }

  private boolean isBalanced(int leftHeight, int rightHeight) {
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return false;
    }

    return true;
  }
}

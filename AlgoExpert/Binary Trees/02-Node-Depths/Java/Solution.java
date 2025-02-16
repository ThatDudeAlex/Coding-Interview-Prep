
class Solution {

  public static int nodeDepths(BinaryTree root) {
    // Write your code here.
    return preOrderTraversal(root, 0, 0);
  }

  private static int preOrderTraversal(BinaryTree root, int currentDepth, int sumOfDepth) {
    if (root == null)
      return sumOfDepth;

    sumOfDepth += currentDepth;
    sumOfDepth = preOrderTraversal(root.left, currentDepth + 1, sumOfDepth);
    sumOfDepth = preOrderTraversal(root.right, currentDepth + 1, sumOfDepth);

    return sumOfDepth;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}

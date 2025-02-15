
class Solution {
  public static boolean validateBst(BST tree) {
    // Write your code here.
    if (tree == null || (tree.left == null && tree.right == null))
      return true;

    boolean left = isValidBst(tree.left, Integer.MIN_VALUE, tree.value - 1);
    boolean right = isValidBst(tree.right, tree.value, Integer.MAX_VALUE);

    return left && right;
  }

  private static boolean isValidBst(BST root, int lowerBound, int upperBound) {
    if (root == null)
      return true;

    if (root.value < lowerBound || root.value > upperBound) {
      return false;
    }

    boolean left = isValidBst(root.left, lowerBound, root.value - 1);
    boolean right = isValidBst(root.right, root.value, upperBound);

    return left && right;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}

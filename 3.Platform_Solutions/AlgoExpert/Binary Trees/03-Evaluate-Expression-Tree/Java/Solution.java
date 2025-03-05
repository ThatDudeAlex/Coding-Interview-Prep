
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

  public int evaluateExpressionTree(BinaryTree tree) {
    // Write your code here.
    if (tree == null) {
      return 0;
    }

    if (tree.left == null && tree.right == null) {
      return tree.value;
    }

    int leftTreeValue = evaluateExpressionTree(tree.left);
    int rightTreeValue = evaluateExpressionTree(tree.right);
    int result = 0;

    switch (tree.value) {
      case -1:
        result = leftTreeValue + rightTreeValue;
        break;
      case -2:
        result = leftTreeValue - rightTreeValue;
        break;
      case -3:
        result = leftTreeValue / rightTreeValue;
        break;
      case -4:
        result = leftTreeValue * rightTreeValue;
        break;
    }

    return result;
  }
}

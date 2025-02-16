class Solution {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  private class TargetInfo {
    BinaryTree target;
    BinaryTree successor;
    boolean targetFound;

    TargetInfo(BinaryTree target) {
      this.target = target;
      this.successor = null;
      this.targetFound = false;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    // Write your code here.
    TargetInfo info = new TargetInfo(node);

    traverseTree(tree, info);

    return info.successor;
  }

  private void traverseTree(BinaryTree root, TargetInfo info) {
    if (root == null) {
      return;
    }

    traverseTree(root.left, info);

    // visit
    if (info.successor != null) {
      return;
    } else if (info.targetFound == true && info.successor == null) {
      info.successor = root;
      return;
    } else if (root == info.target) {
      info.targetFound = true;
    }

    traverseTree(root.right, info);
  }

}

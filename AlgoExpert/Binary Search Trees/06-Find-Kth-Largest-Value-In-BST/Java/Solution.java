
class Solution {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

  static class TreeInfo {
    public int kPosition;
    public int value;

    public TreeInfo(int kPosition, int value) {
      this.kPosition = kPosition;
      this.value = value;
    }
  }

  public int findKthLargestValueInBst(BST tree, int k) {
    // Write your code here.
    TreeInfo info = new TreeInfo(0, 0);
    reversedInorderTraversal(tree, info, k);
    return info.value;
  }

  private void reversedInorderTraversal(BST currNode, TreeInfo info, int k) {
    if (currNode == null) {
      return;
    }

    reversedInorderTraversal(currNode.right, info, k);

    if (info.kPosition == k) {
      return;
    }

    info.kPosition += 1;
    info.value = currNode.value;

    reversedInorderTraversal(currNode.left, info, k);
  }
}

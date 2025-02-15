import java.util.*;

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

  private class TreeInfo {
    int rootIdx;

    public TreeInfo(int rootIdx) {
      this.rootIdx = rootIdx;
    }
  }

  public BST reconstructBst(ArrayList<Integer> preOrderTraversalValues) {
    // Write your code here.
    if (preOrderTraversalValues.size() == 0) {
      return null;
    }

    if (preOrderTraversalValues.size() == 1) {
      return new BST(preOrderTraversalValues.get(0));
    }

    return createBst(preOrderTraversalValues, Integer.MIN_VALUE, Integer.MAX_VALUE, new TreeInfo(0));
  }

  private BST createBst(ArrayList<Integer> preOrderTraversalValues, int lBound, int hBound, TreeInfo info) {
    if (preOrderTraversalValues.size() == info.rootIdx) {
      return null;
    }

    int currValue = preOrderTraversalValues.get(info.rootIdx);
    if (currValue < lBound || currValue >= hBound) {
      return null;
    }

    info.rootIdx += 1;
    BST leftSubtree = createBst(preOrderTraversalValues, lBound, currValue, info);
    BST rightSubtree = createBst(preOrderTraversalValues, currValue, hBound, info);

    BST root = new BST(currValue);
    root.left = leftSubtree;
    root.right = rightSubtree;

    return root;
  }

}

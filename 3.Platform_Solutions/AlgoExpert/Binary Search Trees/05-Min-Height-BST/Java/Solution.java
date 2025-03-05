import java.util.*;

class Solution {
  public static BST minHeightBst(List<Integer> array) {
    return buildSubTree(array, 0, array.size() - 1);
  }

  private static BST buildSubTree(List<Integer> array, int lowerBound, int upperBound) {
    if (upperBound < lowerBound)
      return null;

    int index = (lowerBound + upperBound) / 2;
    BST root = new BST(array.get(index));

    root.left = buildSubTree(array, lowerBound, index - 1);
    root.right = buildSubTree(array, index + 1, upperBound);

    return root;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}

import java.util.*;

class Solution {
  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
    // Write your code here.
    if (arrayOne.get(0) != arrayTwo.get(0)) {
      return false;
    }
    if (arrayOne.size() != arrayTwo.size()) {
      return false;
    }

    int[] bstOne = getBstFullTree(arrayOne);
    int[] bstTwo = getBstFullTree(arrayTwo);

    return areTreesEqual(bstOne, bstTwo);
  }

  private static int[] getBstFullTree(List<Integer> array) {
    int[] fullTree = new int[calcMaxNodes(array.size())];
    Arrays.fill(fullTree, Integer.MIN_VALUE);

    for (Integer nodeValue : array) {
      insertNode(fullTree, nodeValue, 0);
    }

    return fullTree;
  }

  private static void insertNode(int[] fullTree, int value, int rootIndex) {
    if (rootIndex >= fullTree.length) {
      return;
    }

    int currNodeValue = fullTree[rootIndex];

    if (currNodeValue == Integer.MIN_VALUE) {
      fullTree[rootIndex] = value;
    } else if (value < currNodeValue) {
      insertNode(fullTree, value, (2 * rootIndex) + 1);
    } else if (value >= currNodeValue) {
      insertNode(fullTree, value, (2 * rootIndex) + 2);
    }
  }

  private static boolean areTreesEqual(int[] treeOne, int[] treeTwo) {
    for (int i = 0; i < treeOne.length; i++) {
      if (treeOne[i] != treeTwo[i]) {
        return false;
      }
    }

    return true;
  }

  private static int calcMaxNodes(int nodesInTree) {
    return (int) Math.pow(2, getTreeHeight(nodesInTree) + 1) - 1;
  }

  private static int getTreeHeight(int nodesInTree) {
    int height = 0;

    while (nodesInTree > 1) {
      nodesInTree /= 2;
      height += 1;
    }

    return height;
  }
}

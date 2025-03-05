import java.util.*;

class Solution {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;
    
    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }
  
  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
    if (root == null)
    return new ArrayList<Integer>();
    
    List<Integer> branchSum = new ArrayList<>();
    traverse(root, branchSum, 0);
    return branchSum;
  }
  
  private static void traverse(BinaryTree root, List<Integer> branchSum, int currentSum) {
    if (root == null)
    return;
    
    int newCurrentSum = currentSum + root.value;
    
    if (isLeaf(root)) {
      branchSum.add(newCurrentSum);
      return;
    }
    
    traverse(root.left, branchSum, newCurrentSum);
    traverse(root.right, branchSum, newCurrentSum);
  }
  
  private static boolean isLeaf(BinaryTree root) {
    return root.left == null && root.right == null;
  }
}


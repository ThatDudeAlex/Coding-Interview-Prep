import java.util.*;

class Solution {
  public static void invertBinaryTree(BinaryTree tree) {
    // Write your code here.
    if (tree == null)
    return;
    
    invertBinaryTree(tree.left);
    invertBinaryTree(tree.right);
    invertChildren(tree);
  }
  
  private static void invertChildren(BinaryTree tree) {
    BinaryTree tmp = tree.left;
    tree.left = tree.right;
    tree.right = tmp;
  }
  
  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;
    
    public BinaryTree(int value) {
      this.value = value;
    }
  }
}


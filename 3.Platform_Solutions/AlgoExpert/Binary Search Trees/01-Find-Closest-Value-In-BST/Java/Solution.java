
class Solution {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    return tree.binarySearchClosestValue(target);
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public int binarySearchClosestValue(int target) {
      int closestValue = Integer.MAX_VALUE;
      int closestDistance = Integer.MAX_VALUE;
      BST currentNode = this;

      while (currentNode != null) {
        if (isTarget(currentNode.value, target)) {
          return currentNode.value;
        }

        int distanceFromTarget = getDistance(currentNode.value, target);

        if (distanceFromTarget < closestDistance) {
          closestValue = currentNode.value;
          closestDistance = distanceFromTarget;
        }

        currentNode = getNextNode(currentNode, target);
      }

      return closestValue;
    }

    private int getDistance(int value, int target) {
      return Math.abs(value - target);
    }

    private boolean isTarget(int value, int target) {
      return value == target;
    }

    private BST getNextNode(BST currentNode, int target) {
      return currentNode.value < target ? currentNode.right : currentNode.left;
    }
  }
}

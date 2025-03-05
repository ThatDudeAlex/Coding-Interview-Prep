
class Solution {
  static class BST {
    public int value;
    public BST parent = null;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST(int value, BST parent) {
      this.value = value;
      this.parent = parent;
    }

    public BST insert(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      BST currentNode = this;
      boolean valueInserted = false;

      while (currentNode != null && !valueInserted) {
        if (isValueBigger(currentNode.value, value) && !hasRightChild(currentNode)) {
          currentNode.right = new BST(value, currentNode);
          valueInserted = true;
        } else if (!isValueBigger(currentNode.value, value) && !hasLeftChild(currentNode)) {
          currentNode.left = new BST(value, currentNode);
          valueInserted = true;
        } else if (isValueBigger(currentNode.value, value) && hasRightChild(currentNode)) {
          currentNode = currentNode.right;
        } else if (!isValueBigger(currentNode.value, value) && hasLeftChild(currentNode)) {
          currentNode = currentNode.left;
        }
      }

      return this;
    }

    public boolean contains(int value) {
      // Write your code here.
      BST currentNode = this;
      boolean valueFound = false;

      while (currentNode != null && !valueFound) {
        if (currentNode.value == value) {
          valueFound = true;
        } else if (isValueBigger(currentNode.value, value)) {
          currentNode = currentNode.right;
        } else if (!isValueBigger(currentNode.value, value)) {
          currentNode = currentNode.left;
        }
      }

      return valueFound;
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      BST currentNode = this;
      boolean valueRemoved = false;

      if (isLeafNode(this))
        return this;

      while (!valueRemoved && currentNode != null) {
        if (currentNode.value == value) {
          if (isLeafNode(currentNode))
            removeLeafNode(currentNode);
          else if (hasTwoChildren(currentNode))
            removeNodeWithTwoChildren(currentNode);
          else
            removeSingleChildNode(currentNode);

          valueRemoved = true;
        } else if (isValueBigger(currentNode.value, value)) {
          currentNode = currentNode.right;
        } else if (!isValueBigger(currentNode.value, value)) {
          currentNode = currentNode.left;
        }
      }

      return this;
    }

    // helper methods
    private boolean isValueBigger(int currentValue, int value) {
      return value >= currentValue;
    }

    private boolean isBiggerThanParent(BST child) {
      if (child.parent == null)
        return false;
      return child.value >= child.parent.value;
    }

    private boolean hasRightChild(BST currentNode) {
      return currentNode.right != null;
    }

    private boolean hasLeftChild(BST currentNode) {
      return currentNode.left != null;
    }

    private boolean isLeafNode(BST currentNode) {
      return !hasLeftChild(currentNode) && !hasRightChild(currentNode);
    }

    private boolean hasTwoChildren(BST currentNode) {
      return hasLeftChild(currentNode) && hasRightChild(currentNode);
    }

    private boolean isRoot(BST currentNode) {
      return currentNode == this;
    }

    private void removeLeafNode(BST currentNode) {
      if (isBiggerThanParent(currentNode))
        currentNode.parent.right = null;
      else
        currentNode.parent.left = null;
    }

    private void removeSingleChildNode(BST currentNode) {
      boolean isRightChild = isBiggerThanParent(currentNode);

      if (isRoot(currentNode) && hasRightChild(currentNode)) {
        currentNode.value = currentNode.right.value;
        currentNode.right = currentNode.right.right;
        currentNode.left = currentNode.right.left;
      } else if (isRoot(currentNode) && hasLeftChild(currentNode)) {
        currentNode.value = currentNode.left.value;
        currentNode.right = currentNode.left.right;
        currentNode.left = currentNode.left.left;
      } else if (isRightChild && hasRightChild(currentNode)) {
        currentNode.right.parent = currentNode.parent;
        currentNode.parent.right = currentNode.right;
      } else if (isRightChild && hasLeftChild(currentNode)) {
        currentNode.left.parent = currentNode.parent;
        currentNode.parent.right = currentNode.left;
      } else if (!isRightChild && hasRightChild(currentNode)) {
        currentNode.right.parent = currentNode.parent;
        currentNode.parent.left = currentNode.right;

      } else if (!isRightChild && hasLeftChild(currentNode)) {
        currentNode.left.parent = currentNode.parent;
        currentNode.parent.left = currentNode.left;
      }
    }

    private void removeNodeWithTwoChildren(BST currentNode) {
      BST replacementNode = currentNode.right;

      while (replacementNode.left != null)
        replacementNode = replacementNode.left;

      currentNode.value = replacementNode.value;

      if (isLeafNode(replacementNode))
        removeLeafNode(replacementNode);
      else
        removeSingleChildNode(replacementNode);
    }
  }
}

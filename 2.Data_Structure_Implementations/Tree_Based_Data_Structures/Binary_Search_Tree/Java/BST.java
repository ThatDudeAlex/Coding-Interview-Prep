
class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    public BST insert(int value) {
        BST current = this;

        while (true) {
            if (value < current.value) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new BST(value);
                    break;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new BST(value);
                    break;
                }
            }
        }
        return this;
    }

    public boolean contains(int value) {
        BST current = this;

        while (current != null) {
            if (current.value == value) {
                return true;
            } else if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public BST remove(int value) {
        BST parent = null;

        if (isLeafNode(this))
            return this;

        BST current = this;

        while (current != null) {
            if (value > current.value) {
                parent = current;
                current = current.right;
            } else if (value < current.value) {
                parent = current;
                current = current.left;
            } else {
                if (isLeafNode(current)) {
                    removeLeafNode(parent, current);
                    break;
                } else if (hasOneChild(current)) {
                    removeSingleChildNode(parent, current);
                    break;
                } else {
                    removeNodeWithTwoChildren(current);
                    break;
                }
            }
        }

        return this;
    }

    // helper methods
    private boolean isRoot(BST parent) {
        return parent == null;
    }

    private boolean isLeafNode(BST current) {
        return current.left == null && current.right == null;
    }

    private boolean hasOneChild(BST current) {
        return (current.left != null && current.right == null) ||
                (current.right != null && current.left == null);
    }

    private void removeLeafNode(BST parent, BST current) {
        if (current.value >= parent.value)
            parent.right = null;
        else
            parent.left = null;
    }

    private void removeSingleChildNode(BST parent, BST current) {
        if (isRoot(parent)) {
            BST child = (current.right != null) ? current.right : current.left;
            current.value = child.value;
            current.right = child.right;
            current.left = child.left;
            child.left = child.right = null;
        } else if (current.value >= parent.value) {
            parent.right = (current.right != null) ? current.right : current.left;
            current.right = current.left = null;
        } else {
            parent.left = (current.right != null) ? current.right : current.left;
        }
    }

    private void removeNodeWithTwoChildren(BST current) {
        BST parent = current;
        BST replacementNode = current.right;

        // Find left-most node in right subtree
        while (replacementNode.left != null) {
            parent = replacementNode;
            replacementNode = replacementNode.left;
        }

        current.value = replacementNode.value;

        if (isLeafNode(replacementNode))
            removeLeafNode(parent, replacementNode);
        else
            removeSingleChildNode(parent, replacementNode);
    }
}

/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function (root) {
    if (!root)
        return root

    traverseTree(root, root.left, root.right)
    return root
};

const traverseTree = (root, leftChild, rightChild) => {
    let temp = null;

    if (!leftChild && !rightChild)
        return

    root.left = rightChild;
    root.right = leftChild

    if (leftChild)
        traverseTree(leftChild, leftChild.left, leftChild.right);

    if (rightChild)
        traverseTree(rightChild, rightChild.left, rightChild.right);
}
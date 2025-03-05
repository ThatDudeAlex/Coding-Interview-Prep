/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */


var maxDepth = function (root) {
    let leftChild = null;
    let rightChild = null;

    if (root === null)
        return 0

    //     leftChild = maxDepth(root.left)
    //     rightChild = maxDepth(root.right)

    //     return Math.max(leftChild, rightChild) + 1  

    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
};
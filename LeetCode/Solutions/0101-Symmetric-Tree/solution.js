/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function (root) {
    return (root === null) ? true : checkSymmetry(root.left, root.right);
};

const checkSymmetry = (leftRoot, rightRoot) => {

    if (leftRoot === null && rightRoot === null)
        return true
    else if (leftRoot === null && rightRoot !== null)
        return false
    else if (leftRoot !== null && rightRoot === null)
        return false
    else if (leftRoot.val !== rightRoot.val)
        return false

    return checkSymmetry(leftRoot.left, rightRoot.right) && checkSymmetry(leftRoot.right, rightRoot.left);
}
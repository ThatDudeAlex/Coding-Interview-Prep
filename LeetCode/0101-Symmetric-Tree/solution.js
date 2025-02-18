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

    if (root === null)
        return true

    return checkSymmetry(root.left, root.right)
};

const checkSymmetry = (leftRoot, rightRoot) => {
    // let equal = true

    if (leftRoot === null && rightRoot === null)
        return true
    else if (leftRoot === null && rightRoot !== null)
        return false
    else if (leftRoot !== null && rightRoot === null)
        return false
    else if (leftRoot.val !== rightRoot.val)
        return false

    // equal = checkSymmetry(leftRoot.left, rightRoot.right);

    // if(equal)
    //     equal = checkSymmetry(leftRoot.right, rightRoot.left);
    return checkSymmetry(leftRoot.left, rightRoot.right) && checkSymmetry(leftRoot.right, rightRoot.left);
}
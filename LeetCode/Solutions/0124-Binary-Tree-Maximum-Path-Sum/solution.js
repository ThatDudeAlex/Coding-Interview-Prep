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
var maxPathSum = function (root) {
    if (root === null)
        return 0

    const maxSum = [Number.NEGATIVE_INFINITY]
    dfs(root, maxSum)

    return maxSum[maxSum.length - 1]
};

const dfs = (node, maxSum) => {
    if (node === null)
        return 0

    const maxLeftTreeValue = Math.max(dfs(node.left, maxSum), 0)
    const maxRightTreeValue = Math.max(dfs(node.right, maxSum), 0)
    const totalTreeValue = maxLeftTreeValue + maxRightTreeValue + node.val

    if (totalTreeValue > maxSum[maxSum.length - 1])
        maxSum.push(totalTreeValue)

    return node.val + Math.max(maxLeftTreeValue, maxRightTreeValue)
}
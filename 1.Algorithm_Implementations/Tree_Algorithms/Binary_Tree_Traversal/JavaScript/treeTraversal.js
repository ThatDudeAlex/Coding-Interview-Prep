
// Left-Root-Right (In-Order)
function inOrderTraverse(tree, array) {
    if (!tree)
        return array

    inOrderTraverse(tree.left, array)
    array.push(tree.value)
    inOrderTraverse(tree.right, array)

    return array
}

// Root-Left-Right (Pre-Order)
function preOrderTraverse(tree, array) {
    if (!tree)
        return array

    array.push(tree.value)
    preOrderTraverse(tree.left, array)
    preOrderTraverse(tree.right, array)

    return array
}

// Left-Right-Root (Post-Order)
function postOrderTraverse(tree, array) {
    if (!tree)
        return array

    postOrderTraverse(tree.left, array)
    postOrderTraverse(tree.right, array)
    array.push(tree.value)

    return array
}

// Do not edit the lines below. For Testcases
exports.inOrderTraverse = inOrderTraverse;
exports.preOrderTraverse = preOrderTraverse;
exports.postOrderTraverse = postOrderTraverse;

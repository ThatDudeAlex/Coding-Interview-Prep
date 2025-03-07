// Do not edit the class below except for
// the insert, contains, and remove methods.
// Feel free to add new properties and methods
// to the class.
class BST {
    constructor(value) {
        this.value = value
        this.left = null
        this.right = null
    }

    insert(value) {
        let current = this

        while (true) {
            if (value < current.value) {
                if (current.left) {
                    current = current.left
                } else {
                    current.left = new BST(value)
                    break
                }
            } else {
                if (current.right) {
                    current = current.right
                } else {
                    current.right = new BST(value)
                    break
                }
            }
        }
        return this
    }

    contains(value) {
        let current = this

        while (current) {
            if (current.value == value) {
                return true
            } else if (value < current.value) {
                current = current.left
            } else {
                current = current.right
            }
        }

        return false
    }

    remove(value) {
        let parent = null

        if (this.isLeafNode(this))
            return this

        let current = this

        while (current) {
            if (value > current.value) {
                parent = current
                current = current.right
            }
            else if (value < current.value) {
                parent = current
                current = current.left
            }
            else {
                if (this.isLeafNode(current)) {
                    this.removeLeafNode(parent, current)
                    break
                } else if (this.hasOneChild(current)) {
                    this.removeSingleChildNode(parent, current)
                    break
                } else {
                    this.removeNodeWithTwoChildren(current)
                    break
                }
            }
        }

        return this
    }

    isRoot(parent) {
        return !parent
    }

    isLeafNode(currentNode) {
        return !currentNode.left && !currentNode.right
    }

    hasOneChild(currentNode) {
        return (currentNode.left && !currentNode.right) || (currentNode.right && !currentNode.left)
    }

    removeLeafNode(parent, currentNode) {
        if (currentNode.value >= parent.value)
            parent.right = null
        else
            parent.left = null
    }

    removeSingleChildNode(parent, current) {
        if (this.isRoot(parent)) {
            const child = (current.right) ? current.right : current.left
            current.value = child.value
            current.right = child.right
            current.left = child.left
            child.left = child.right = null
        } else if (current.value >= parent.value) {
            parent.right = (current.right) ? current.right : current.left
            current.right = current.left = null
        } else {
            parent.left = (current.right) ? current.right : current.left
        }
    }

    removeNodeWithTwoChildren(current) {
        let parent = current
        let replacementNode = current.right

        // Find left-most node in right subtree
        while (replacementNode.left) {
            parent = replacementNode
            replacementNode = replacementNode.left
        }

        current.value = replacementNode.value

        if (this.isLeafNode(replacementNode))
            this.removeLeafNode(parent, replacementNode)
        else
            this.removeSingleChildNode(parent, replacementNode)
    }
}

// Do not edit the line below.
exports.BST = BST

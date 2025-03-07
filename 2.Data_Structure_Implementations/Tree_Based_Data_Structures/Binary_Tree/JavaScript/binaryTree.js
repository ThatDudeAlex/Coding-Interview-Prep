
class BinaryTree {
    constructor(value) {
        this.value = value
        this.right = null
        this.left = null
    }

    insert(value) {
        // array will behave as a Queue
        const q = []
        q.push(this)

        while (q.length > 0) {
            const current = q.shift()

            if (!current.left) {
                current.left = new BinaryTree(value)
                break
            } else if (!current.right) {
                current.right = new BinaryTree(value)
                break
            }
            q.push(current.left)
            q.push(current.right)
        }
        return this
    }

    contains(value) {
        // array will behave as a Queue
        const q = []
        q.push(this)

        while (q.length > 0) {
            const current = q.shift()

            if (current.value === value)
                return true

            if (current.left)
                q.push(current.left)

            if (current.right)
                q.push(current.right)
        }
        return false
    }

    remove(value) {
        if (this.#isLeadNode(this) && this.value == value) {
            this.value = null
            return this
        }

        let nodeToDelete = null
        let lastNodeParent = null
        let lastNode = null

        // array will behave as a Queue
        const q = []
        q.push(this)

        while (q.length > 0) {
            // after loop is this this will be the deepest
            // node in the tree
            lastNode = q.shift()

            if (lastNode.value == value)
                nodeToDelete = lastNode


            if (lastNode.left) {
                lastNodeParent = lastNode
                q.push(lastNode.left)
            }
            if (lastNode.right) {
                lastNodeParent = lastNode
                q.push(lastNode.right)
            }

        }
        console.log(lastNodeParent.value)
        if (nodeToDelete) {
            // swap node values
            nodeToDelete.value = lastNode.value

            // remove deepest node from the tree
            if (lastNodeParent.right === lastNode)
                lastNodeParent.right = null
            else
                lastNodeParent.left = null
        }
        return this
    }

    // Private method to check if node is a leaf node in the tree
    #isLeafNode(node) {
        return !node.left && !node.right
    }

    print_tree(level = 0, prefix = "Root: ") {
        console.log(" ".repeat(level * 4) + prefix + this.value)
        if (this.left)
            this.left.print_tree(level + 1, "L--- ")

        if (this.right)
            this.right.print_tree(level + 1, "R--- ")
    }
}
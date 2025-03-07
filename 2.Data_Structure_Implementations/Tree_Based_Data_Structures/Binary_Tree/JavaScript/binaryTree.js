/**
 * Binary tree implementation with a queue to achieve O(1) enqueue & dequeue,
 * instead of the O(n) runtime given by the array implementation
 */
class BinaryTree {
    constructor(value) {
        this.value = value
        this.right = null
        this.left = null
    }

    insert(value) {
        const q = new Queue()
        q.enqueue(this)

        while (!q.isEmpty()) {
            const current = q.dequeue()

            if (!current.left) {
                current.left = new BinaryTree(value)
                break
            } else if (!current.right) {
                current.right = new BinaryTree(value)
                break
            }
            q.enqueue(current.left)
            q.enqueue(current.right)
        }
        return this
    }

    contains(value) {
        const q = new Queue()
        q.enqueue(this)

        while (!q.isEmpty()) {
            const current = q.dequeue()

            if (current.value === value)
                return true

            if (current.left)
                q.enqueue(current.left)

            if (current.right)
                q.enqueue(current.right)
        }
        return false
    }

    remove(value) {
        // Check if it's a single-node tree
        if (this.#isLeafNode(this) && this.value == value) {
            this.value = null
            return this
        }

        let nodeToDelete = null
        let lastNodeParent = null
        let lastNode = null

        const q = new Queue()
        q.enqueue(this)

        while (!q.isEmpty()) {
            // after loop is this will be the deepest
            // node in the tree
            lastNode = q.dequeue()

            if (lastNode.value === value)
                nodeToDelete = lastNode


            if (lastNode.left) {
                lastNodeParent = lastNode
                q.enqueue(lastNode.left)
            }
            if (lastNode.right) {
                lastNodeParent = lastNode
                q.enqueue(lastNode.right)
            }

        }

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

    printTree(level = 0, prefix = "Root: ") {
        console.log(" ".repeat(level * 4) + prefix + this.value)
        if (this.left)
            this.left.printTree(level + 1, "L--- ")

        if (this.right)
            this.right.printTree(level + 1, "R--- ")
    }
}

// Queue implementation since JavaScript does not hava a built in data structure
class Queue {
    #front
    #back
    #size

    constructor() {
        this.#front = null
        this.#back = null
        this.#size = 0
    }

    enqueue(data) {
        if (this.isEmpty()) {
            this.#front = this.#back = new Node(data)

            this.#size = 1
            return true
        }

        const newNode = new Node(data)
        this.#back.next = newNode
        this.#back = newNode
        this.#size++
        return true
    }

    dequeue() {
        if (this.isEmpty())
            return null

        const deletedNode = this.#front
        this.#front = this.#front.next

        // If queue becomes empty, reset back
        if (this.#front == null)
            this.#back = null

        this.#size--
        return deletedNode.data
    }

    peek() {
        return this.isEmpty() ? null : this.#front.data;
    }

    // ====================
    //   Utility Methods
    // ====================

    getSize() {
        return this.#size
    }

    isEmpty() {
        return this.getSize() == 0
    }
}

class Node {
    constructor(data) {
        this.data = data
        this.next = null
    }
}
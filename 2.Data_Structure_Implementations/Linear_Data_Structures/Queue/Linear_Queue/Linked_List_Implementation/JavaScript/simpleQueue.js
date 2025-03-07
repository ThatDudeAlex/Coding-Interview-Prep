
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
        this.#back = this.#back.next = newNode
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

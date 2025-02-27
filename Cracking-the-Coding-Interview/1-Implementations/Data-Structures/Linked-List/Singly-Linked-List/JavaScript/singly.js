/**
 * Singly Linked List Node
 * @typedef {Object} Node
 * @property {number} value
 * @property {Node} next
 */
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

/**
 * Singly Linked List
 * @typedef {Object} LinkedList
 * @property {Node} head
 * @property {number} size
 */
class LinkedList {
    constructor(value = null) {
        this.head = (value == null) ? null : new Node(value);
        this.size = (this.head == null) ? 0 : 1;
    }


    /**
     * Inserts a new node as the head of the linked list  
     * `O(1) time`
     * @param {number} value 
     * @returns {boolean}
     */
    insertHead(value) {
        if (value == null || value == undefined) {
            console.warn('Missing value during head insertion');
            return false;
        }

        try {
            const newHead = new Node(value);
            newHead.next = this.head;
            this.head = newHead;
            this.size += 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while inserting a new head node: ${error.message}`)
            throw error;
        }
    }

    
    /**
     * Inserts a new node as the tail of the linked list  
     * `O(n) time`
     * @param {number} value 
     * @returns {boolean}
     */
    insertTail(value) {
        if (value == null || value == undefined) {
            console.warn('Missing value during tail insertion');
            return false;
        }

        try {
            if (this.size == 0) {
                return this.insertHead(value);
            }
            
            let curr = this.head;

            while (curr != null && curr.next != null) {
                curr = curr.next;
            }

            const newTail = new Node(value);
            curr.next = newTail;
            this.size += 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while inserting a new tail node: ${error.message}`)
            throw error;
        }
    }
    
    
    /**
     * Inserts a new node into the given index
     * `O(n) time`
     * @param {number} value 
     * @param {number} index 
     * @returns {boolean}
     */
    insertAtIndex(value, index) {
        if (value == null || value == undefined) {
            console.warn('Missing value during index insertion');
            return false;
        }
        
        if (index == null || index == undefined) {
            console.warn('Missing index during index insertion');
            return false;
        }

        if (index < 0 || index >= this.size) {
            console.warn('Invalid index during index insertion');
            return false;
        }

        try {
            if (index == 0) {
                return this.insertHead(value);
            }

            if (index == this.size - 1) {
                return this.insertTail(value);
            }

            let curr = this.head;

            for (let i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            const newIdxNode = new Node(value);
            const prevIdxNode = curr.next;

            curr.next = newIdxNode;
            newIdxNode.next = prevIdxNode;
            this.size += 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while inserting a new node at index ${index}: ${error.message}`)
            throw error;
        }
    }

    
    /**
     * Deletes the head node
     * `O(1) time`
     * @returns {boolean}
     */
    deleteHead() {
        if (this.head == null) {
            return false;
        }

        try {
            const newHead = this.head.next;
            this.head.next = null;
            this.head = newHead;
            this.size -= 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while deleting head node: ${error.message}`)
            throw error;
        }
    }
    

    /**
     * Deletes the tail node
     * `O(n) time`
     * @returns {boolean}
     */
    deleteTail() {
        if (this.head == null) {
            return false;
        }

        if (this.size == 1) {
            this.head = null;
            this.size -= 1;
            return true;
        }

        try {
            let curr = this.head;

            for (let i = 0; i < this.size - 2; i++) {
                curr = curr.next;
            }

            curr.next = null;
            this.size -= 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while deleting head node: ${error.message}`)
            throw error;
        }
    }


    /**
     * Deletes a node at the given index
     * `O(n) time`
     * @param {number} index 
     * @returns {boolean}
     */
    deleteAtIndex(index) {
        if (index == null || index == undefined) {
            console.warn('Missing index during index deletion');
            return false;
        }

        if (index < 0 || index > this.size - 1) {
            console.warn('Invalid index during index deletion');
            return false;
        }

        try {
            if (index == 0) {
                return this.deleteHead();
            }

            if (index == this.size - 1) {
                return this.deleteTail();
            }

            let curr = this.head;

            for (let i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            const deletedNode = curr.next;
            const nextNode = deletedNode.next;

            deletedNode.next = null;
            curr.next = nextNode;
            this.size -= 1;
            return true;
        } catch (error) {
            console.error(`Error occurred while deleting a node at index ${index}: ${error.message}`)
            throw error;
        }
    }
   

    /**
     * Returns if the list contains the given value
     * `O(n) time`
     * @param {number} value - value to search for
     * @returns {boolean}
     */
    hasValue(value) {
        if (value == null || value == undefined) {
            console.warn('Invalid search value');
            return false;
        }

        if (this.size == 0) {
            return false;
        }

        try {
            let curr = this.head;

            while (curr != null) {
                console.log("Current node value:", curr.value); // Print current value
                if (curr.value == value) {
                    console.log("Value found!"); // Print if value is found
                    return true;
                }
                curr = curr.next;
            }
            console.log("Value not found."); // Print if value is not found
            return false;
        } catch (error) {
            console.error(`Error occurred while searching for value: ${error.message}`)
            throw error;
        }
    }
    

    /**
     * Returns the size of the linked list
     * `O(1) time`
     * @returns {number}
     */
    getSize() {
        return this.size;
    }


    /**
     * Prints the linked list to the console
     * `O(n) time`
     */
    printList() {
        if (this.head === null) {
            console.log("Empty List");
            return;
        }

        let curr = this.head;
        let output = '\nLinked List: ';
        while (curr != null) {
            output += `${curr.value} -> `;
            curr = curr.next;
        }
        output += 'NULL\n';
        console.log(output);
    }
}


module.exports = { LinkedList }


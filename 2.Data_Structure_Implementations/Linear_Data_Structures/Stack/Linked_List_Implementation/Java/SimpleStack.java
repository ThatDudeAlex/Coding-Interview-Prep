/**
 * A Stack implementation using a Singly Linked List
 * 
 * @author Alex Nunez
 * @date April 30, 2022
 */
public class SimpleStack {
    private Node head;
    private int size;

    /**
     * Initializes an empty stack.
     */
    public SimpleStack() {
        this.head = null;
        this.size = 0;
    }

    /**
     * Inserts a new value at the top of the stack.
     *
     * @param data The value that the new node will hold.
     * @return true if the operation is successful.
     * @Runtime O(1) - Constant time operation.
     */
    public boolean push(int data) {
        Node newNode = new Node(data);
        newNode.nextNode = this.head;
        this.head = newNode;
        this.size++;
        return true;
    }

    /**
     * Removes the top element of the stack and returns its value.
     * If the stack is empty, returns null.
     *
     * @return The value of the top element.
     * @Runtime O(1) - Constant time operation.
     */
    public Integer pop() {
        if (isEmpty()) {
            return null;
        }

        int poppedValue = this.head.data;
        this.head = this.head.nextNode;
        this.size--;
        return poppedValue;
    }

    /**
     * Returns the top element without removing it.
     *
     * @return The value of the top element, or null if the stack is empty.
     * @Runtime O(1) - Constant time operation.
     */
    public Integer peek() {
        return isEmpty() ? null : this.head.data;
    }

    /**
     * Returns the current size of the stack.
     *
     * @return Number of elements in the stack.
     * @Runtime O(1)
     */
    public int size() {
        return this.size;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     * @Runtime O(1)
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * A singly linked list node representing an element in the stack.
     */
    private static class Node {
        int data;
        Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
}

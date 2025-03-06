/**
 * An implementation of a Queue using a Singly Linked List.
 * 
 * @author Alex Nunez
 * @date April 30, 2022
 */
public class Queue {
    private Node front;
    private Node back;
    private int size;

    /**
     * Initializes an empty queue
     */
    public Queue() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    /**
     * Initializes a queue with one {@code element} holding the given value.
     * 
     * @param data the value of the first {@code element} in the queue
     */
    public Queue(int data) {
        initFirstNodeInQueue(data);
    }

    /**
     * Inserts a new value at the end of the queue.
     * 
     * @param data The value that the new node will hold
     * @return {@code true} if the enqueue operation was successful
     * 
     * @Runtime {@code O(1)} - Constant time insertion at the back of the queue.
     */
    public boolean enqueue(int data) {
        if (isEmpty())
            return initFirstNodeInQueue(data);

        Node newNode = new Node(data);
        this.back = this.back.nextNode = newNode;
        this.size++;
        return true;
    }

    /**
     * Removes the head of the queue and returns it. If the queue is empty, it
     * returns null.
     * 
     * @return The first {@code element} in the queue, or {@code null} if the queue
     *         is empty
     * 
     * @Runtime {@code O(1)} - Constant time removal from the front.
     */
    public Integer dequeue() {
        if (isEmpty())
            return null;

        Node deletedHead = this.front;
        this.front = this.front.nextNode;

        if (this.front == null) // If queue becomes empty, reset back
            this.back = null;

        this.size--;
        return deletedHead.data;
    }

    /**
     * Returns the head (front) of the queue without removing it.
     * 
     * @return The first {@code element} in the queue, or {@code null} if the queue
     *         is empty
     * 
     * @Runtime {@code O(1)} - Constant time access.
     */
    public Integer peek() {
        return isEmpty() ? null : this.front.data;
    }

    /*
     * =======================
     * Utility Methods
     * =======================
     */

    /**
     * Returns the current size of the queue.
     * 
     * @return the number of {@code elements} currently in the queue
     * 
     * @Runtime {@code O(1)}
     */
    public int size() {
        return this.size;
    }

    /**
     * Checks if the queue is currently empty.
     * 
     * @return {@code true} if the queue is empty, otherwise {@code false}
     * 
     * @Runtime {@code O(1)}
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * Initializes the first node in the queue.
     * 
     * @param data The value of the first node
     * @return {@code true} after initialization
     */
    private boolean initFirstNodeInQueue(int data) {
        this.front = this.back = new Node(data);
        this.size = 1;
        return true;
    }

    /**
     * A standard {@code Singly Linked List Node}, holding an integer value and a
     * reference to the next node.
     */
    private static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }
}

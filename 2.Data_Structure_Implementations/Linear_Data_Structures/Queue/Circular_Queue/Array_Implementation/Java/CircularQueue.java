/**
 * An implementation of a Circular Queue using an integer array.
 * 
 * @author Alex Nunez
 * @date April 30, 2022
 */
public class CircularQueue {
    private int[] queue;
    private int front;
    private int back;
    private int size;

    /**
     * Initializes an empty queue.
     */
    public CircularQueue(int capacity) {
        this.queue = new int[capacity];
        this.front = 0;
        this.back = 0;
        this.size = 0;
    }

    /**
     * Initializes a queue with one {@code element}.
     * 
     * @param data the value of the first {@code element} in the queue
     */
    public CircularQueue(int capacity, int data) {
        this.queue = new int[capacity];
        this.queue[0] = data;
        this.front = 0;
        this.back = (capacity > 1) ? 1 : 0; // Avoid incorrect back pointer if capacity is 1
        this.size = 1;
    }

    /**
     * Inserts a new value at the end of the queue.
     * 
     * @param data The value that the new node will hold
     * @return {@code true} if insertion is successful, {@code false} if queue is
     *         full
     * 
     * @Runtime {@code O(1)}
     */
    public boolean enqueue(int data) {
        if (isFull())
            return false;

        this.queue[this.back] = data;
        this.back = (this.back + 1) % this.queue.length;
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
     * @Runtime {@code O(1)}
     */
    public Integer dequeue() {
        if (isEmpty())
            return null;

        int head = this.queue[this.front];
        this.front = (this.front + 1) % this.queue.length;
        this.size--;

        return head;
    }

    /**
     * Returns the head (front) of the queue without removing it.
     * 
     * @return The first {@code element} in the queue, or {@code null} if the queue
     *         is empty
     * 
     * @Runtime {@code O(1)}
     */
    public Integer peek() {
        return isEmpty() ? null : this.queue[this.front];
    }

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
     * Checks if the queue is empty.
     * 
     * @return {@code true} if the queue is empty, {@code false} otherwise
     * 
     * @Runtime {@code O(1)}
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Checks if the queue is full.
     * 
     * @return {@code true} if the queue is full, {@code false} otherwise
     * 
     * @Runtime {@code O(1)}
     */
    public boolean isFull() {
        return this.size == this.queue.length;
    }
}

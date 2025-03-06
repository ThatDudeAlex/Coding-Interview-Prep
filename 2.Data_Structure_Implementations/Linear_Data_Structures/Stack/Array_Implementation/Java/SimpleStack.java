/**
 * An implementation of a Stack using an integer array
 * 
 * @author Alex Nunez
 * @date April 30, 2022
 */
public class SimpleStack {
    private int[] stack;
    private int top;

    /**
     * Initializes an empty stack with a fixed capacity
     *
     * @param capacity Maximum number of elements the stack can hold
     */
    public SimpleStack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    /**
     * Inserts a new value at the top of the stack
     *
     * @param data The value to be pushed onto the stack
     * @return true if successful, false if the stack is full
     * @Runtime O(1) - Directly updates an index
     */
    public boolean push(int data) {
        if (isFull()) {
            return false;
        }
        this.stack[++this.top] = data;
        return true;
    }

    /**
     * Removes and returns the top value of the stack
     *
     * @return The top element
     * @throws IllegalStateException if the stack is empty
     * @Runtime O(1) - Directly accesses an index
     */
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedValue = this.stack[this.top];
        this.stack[this.top--] = 0;
        return poppedValue;
    }

    /**
     * Returns the top element without removing it
     *
     * @return The top element
     * @throws IllegalStateException if the stack is empty
     * @Runtime O(1)
     */
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.stack[this.top];
    }

    /**
     * Returns the number of elements in the stack
     *
     * @return Current size of the stack
     * @Runtime O(1)
     */
    public int size() {
        return this.top + 1;
    }

    /**
     * Checks if the stack is empty
     *
     * @return true if the stack contains no elements
     * @Runtime O(1)
     */
    public boolean isEmpty() {
        return this.top == -1;
    }

    /**
     * Checks if the stack is full
     *
     * @return true if the stack is at full capacity
     * @Runtime O(1)
     */
    public boolean isFull() {
        return this.top == this.stack.length - 1;
    }
}

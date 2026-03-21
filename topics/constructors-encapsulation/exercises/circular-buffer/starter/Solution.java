public class Solution {
    private int[] buffer;
    private int writePos;
    private int count;

    /**
     * Creates a circular buffer with the given capacity.
     * Throws IllegalArgumentException if capacity <= 0.
     *
     * @param capacity the maximum number of elements
     */
    public Solution(int capacity) {
        // TODO: Validate and initialize
    }

    /**
     * Adds a value to the buffer. If full, overwrites the oldest value.
     *
     * @param value the value to add
     */
    public void add(int value) {
        // TODO: Implement
    }

    /**
     * Returns the element at the given index (0 = oldest).
     * Throws IndexOutOfBoundsException if index is out of range.
     *
     * @param index the index (0-based, 0 = oldest)
     * @return the element
     */
    public int get(int index) {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns the number of elements currently in the buffer.
     *
     * @return the current size
     */
    public int size() {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns true if the buffer is at capacity.
     *
     * @return true if full
     */
    public boolean isFull() {
        // TODO: Implement
        return false;
    }

    /**
     * Returns the maximum capacity of the buffer.
     *
     * @return the capacity
     */
    public int getCapacity() {
        // TODO: Implement
        return 0;
    }
}

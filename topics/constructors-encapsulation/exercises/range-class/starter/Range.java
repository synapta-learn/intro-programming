public class Range {
    private int min;
    private int max;

    /**
     * Creates a range from min to max (inclusive).
     * If min > max, the values are swapped.
     *
     * @param min the lower bound
     * @param max the upper bound
     */
    public Range(int min, int max) {
        // TODO: Handle swapping and set fields
    }

    /**
     * Returns the lower bound of the range.
     *
     * @return the minimum value
     */
    public int getMin() {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns the upper bound of the range.
     *
     * @return the maximum value
     */
    public int getMax() {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns true if the value is within this range (inclusive).
     *
     * @param value the value to check
     * @return true if min <= value <= max
     */
    public boolean contains(int value) {
        // TODO: Implement
        return false;
    }

    /**
     * Returns true if this range overlaps with the other range.
     *
     * @param other the other range
     * @return true if the ranges share at least one value
     */
    public boolean overlaps(Range other) {
        // TODO: Implement
        return false;
    }

    /**
     * Returns the number of integers in this range.
     *
     * @return max - min + 1
     */
    public int getSize() {
        // TODO: Implement
        return 0;
    }
}

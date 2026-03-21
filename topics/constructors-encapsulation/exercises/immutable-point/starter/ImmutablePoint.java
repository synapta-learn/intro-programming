public class ImmutablePoint {
    private final double x;
    private final double y;

    /**
     * Creates an immutable point with the given coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public ImmutablePoint(double x, double y) {
        // TODO: Initialize the fields
        this.x = 0;
        this.y = 0;
    }

    /**
     * Returns the x coordinate.
     *
     * @return x
     */
    public double getX() {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns the y coordinate.
     *
     * @return y
     */
    public double getY() {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns the Euclidean distance to another point.
     *
     * @param other the other point
     * @return the distance
     */
    public double distanceTo(ImmutablePoint other) {
        // TODO: Implement
        return 0;
    }

    /**
     * Returns a NEW point with coordinates shifted by dx and dy.
     * This point is NOT modified.
     *
     * @param dx amount to add to x
     * @param dy amount to add to y
     * @return a new translated point
     */
    public ImmutablePoint translate(double dx, double dy) {
        // TODO: Return a new ImmutablePoint with translated coordinates
        return null;
    }
}

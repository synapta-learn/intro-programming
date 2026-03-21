# Immutable Point

## Problem

Create a `Solution` class that represents an immutable point in 2D space. Once created, its coordinates cannot be changed. It should have:

- **Private final** fields `x` and `y` (both `double`)
- A constructor `Solution(double x, double y)`
- `getX()` and `getY()` — return the coordinates
- `distanceTo(Solution other)` — returns the Euclidean distance to another point
- `translate(double dx, double dy)` — returns a **new** `Solution` with the translated coordinates (does NOT modify this point)

## Examples

```java
Solution p = new Solution(3.0, 4.0);
p.getX();            // 3.0
p.getY();            // 4.0

Solution origin = new Solution(0.0, 0.0);
p.distanceTo(origin); // 5.0

Solution moved = p.translate(1.0, -1.0);
moved.getX();         // 4.0
moved.getY();         // 3.0
p.getX();             // 3.0 (unchanged — immutable!)
```

## Hints

- Declare fields as `private final double x;`
- The `final` keyword means the field can only be assigned once, in the constructor
- `translate` must return `new Solution(this.x + dx, this.y + dy)` — it creates a new point
- Use `Math.sqrt()` for the distance formula

# Point 2D

## Problem

Create a `Solution` class that represents a point in 2D space. It should have:

- Fields `x` and `y` (both `double`)
- `distanceTo(Solution other)` — returns the Euclidean distance to another point
- `translate(double dx, double dy)` — moves the point by adding `dx` to x and `dy` to y
- `distanceToOrigin()` — returns the distance from this point to (0, 0)

The distance formula between two points (x1, y1) and (x2, y2) is:
`sqrt((x2-x1)^2 + (y2-y1)^2)`

## Examples

```java
Solution p1 = new Solution();
p1.x = 3.0;
p1.y = 4.0;

p1.distanceToOrigin();  // 5.0

Solution p2 = new Solution();
p2.x = 0.0;
p2.y = 0.0;

p1.distanceTo(p2);      // 5.0

p1.translate(1.0, -1.0);
// p1.x is now 4.0, p1.y is now 3.0
```

## Hints

- Use `Math.sqrt()` for the square root
- Use `Math.pow(value, 2)` or just `value * value` for squaring
- `distanceToOrigin()` is just the distance to (0, 0) — you could use the same formula with x2=0 and y2=0

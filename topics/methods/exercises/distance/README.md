# Distance

## Problem

Write a method `distance(double x1, double y1, double x2, double y2)` that returns the **Euclidean distance** between two points `(x1, y1)` and `(x2, y2)`.

The formula is:

```
distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
```

## Examples

| Point 1 | Point 2 | Distance |
|---------|---------|----------|
| `(0, 0)` | `(3, 4)` | `5.0` |
| `(1, 1)` | `(1, 1)` | `0.0` |
| `(0, 0)` | `(1, 0)` | `1.0` |
| `(-1, -1)` | `(2, 3)` | `5.0` |

## Hints

- Use `Math.sqrt()` for the square root
- You can compute the square of a difference manually: `double dx = x2 - x1; dx * dx`
- The distance is always non-negative

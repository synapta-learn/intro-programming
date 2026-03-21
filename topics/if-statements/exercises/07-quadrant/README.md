# Quadrant

## Problem

Given (x, y) coordinates, determine where the point lies:

- If both x and y are 0, return `"Origin"`
- If x is 0 or y is 0 (but not both), return `"Axis"`
- Otherwise, return which quadrant the point is in:
  - Quadrant 1: x > 0, y > 0 → return `"Q1"`
  - Quadrant 2: x < 0, y > 0 → return `"Q2"`
  - Quadrant 3: x < 0, y < 0 → return `"Q3"`
  - Quadrant 4: x > 0, y < 0 → return `"Q4"`

## Examples

```
quadrant(0, 0)   → "Origin"
quadrant(3, 0)   → "Axis"
quadrant(0, -5)  → "Axis"
quadrant(1, 1)   → "Q1"
quadrant(-1, 1)  → "Q2"
quadrant(-1, -1) → "Q3"
quadrant(1, -1)  → "Q4"
```

## Hint

Check for the special cases (Origin, Axis) first, then determine the quadrant based on the signs of x and y.

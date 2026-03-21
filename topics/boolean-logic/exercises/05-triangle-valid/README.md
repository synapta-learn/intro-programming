# Triangle Valid

## Problem

Write a method that returns `true` if three given side lengths can form a valid triangle.

The **triangle inequality theorem** states that for any valid triangle, the sum of any two sides must be **strictly greater than** the third side. All three sides must also be positive.

## Examples

```
isValidTriangle(3, 4, 5)  → true   (3+4>5, 3+5>4, 4+5>3)
isValidTriangle(1, 1, 3)  → false  (1+1 is not > 3)
isValidTriangle(5, 5, 5)  → true   (equilateral triangle)
isValidTriangle(0, 1, 1)  → false  (sides must be positive)
isValidTriangle(-1, 2, 3) → false  (sides must be positive)
```

## Hint

You need to check three conditions (one for each pair of sides), and all three must be true. Don't forget that all sides must also be positive.

# GCD (Greatest Common Divisor)

## Problem

Write a method that finds the greatest common divisor (GCD) of two positive integers using the **Euclidean algorithm**.

The GCD is the largest number that divides both `a` and `b` evenly.

The Euclidean algorithm works like this:
1. While `b` is not 0:
   - Compute the remainder: `r = a % b`
   - Set `a = b`
   - Set `b = r`
2. When `b` reaches 0, `a` is the GCD.

## Examples

```
gcd(12, 8)   → 4
gcd(54, 24)  → 6
gcd(7, 3)    → 1    (coprime — no common factor)
gcd(100, 25) → 25
gcd(17, 17)  → 17
```

Let's trace `gcd(54, 24)`:

| Step | a  | b  | r = a % b |
|------|----|----|-----------|
| 1    | 54 | 24 | 6         |
| 2    | 24 | 6  | 0         |
| done | 6  | 0  | —         |

Result: 6

## Hint

Translate the algorithm description directly into a while loop. The condition is `b != 0`.

# Power of Two

## Problem

Write a method that returns the smallest power of 2 that is greater than or equal to `n`.

You can assume `n` is positive (n >= 1).

## Examples

```
powerOfTwo(1)   → 1    (2^0 = 1)
powerOfTwo(2)   → 2    (2^1 = 2)
powerOfTwo(3)   → 4    (2^2 = 4)
powerOfTwo(5)   → 8    (2^3 = 8)
powerOfTwo(8)   → 8    (already a power of 2)
powerOfTwo(9)   → 16   (2^4 = 16)
powerOfTwo(100) → 128  (2^7 = 128)
```

## Hint

Start with `result = 1` and keep doubling it (`result *= 2`) while it's still less than `n`.

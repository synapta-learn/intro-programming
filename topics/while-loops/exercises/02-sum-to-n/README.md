# Sum to N

## Problem

Write a method that returns the sum of all integers from 1 to `n` (inclusive).

If `n` is 0 or negative, return 0.

## Examples

```
sumToN(5)  → 15   (1 + 2 + 3 + 4 + 5)
sumToN(1)  → 1
sumToN(10) → 55   (1 + 2 + 3 + ... + 10)
sumToN(0)  → 0
```

## Hint

Use the accumulator pattern: start with a `sum` of 0, then add each number from 1 to `n` using a while loop.

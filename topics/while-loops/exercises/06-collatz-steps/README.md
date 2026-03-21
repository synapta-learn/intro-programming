# Collatz Steps

## Problem

The **Collatz conjecture** describes a simple sequence: start with any positive integer, and repeatedly apply these rules:

- If the number is **even**, divide it by 2
- If the number is **odd**, multiply by 3 and add 1

The conjecture says this sequence always eventually reaches 1.

Write a method that counts how many steps it takes to reach 1.

## Examples

```
collatzSteps(1)  → 0    (already at 1)
collatzSteps(2)  → 1    (2 → 1)
collatzSteps(3)  → 7    (3 → 10 → 5 → 16 → 8 → 4 → 2 → 1)
collatzSteps(6)  → 8    (6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1)
collatzSteps(7)  → 16
```

## Hint

Use a while loop that continues as long as `n != 1`. In each iteration, apply the appropriate rule (check if `n` is even using `n % 2 == 0`) and increment a step counter.

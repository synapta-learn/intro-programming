# De Morgan's Laws

## Problem

De Morgan's laws let you rewrite boolean expressions:

- `!(A && B)` is equivalent to `!A || !B`
- `!(A || B)` is equivalent to `!A && !B`

Implement three methods that each apply De Morgan's laws. Each method receives boolean inputs and must return the same result as the described expression, but **rewritten using De Morgan's law** (i.e., push the NOT inward and flip the operator).

1. `notBoth(a, b)` — Equivalent to `!(a && b)`. Write it as `!a || !b`.
2. `notEither(a, b)` — Equivalent to `!(a || b)`. Write it as `!a && !b`.
3. `notAllThree(a, b, c)` — Equivalent to `!(a && b && c)`. Write it as `!a || !b || !c`.

## Examples

```
notBoth(true, true)     → false
notBoth(true, false)    → true
notEither(false, false) → true
notEither(true, false)  → false
notAllThree(true, true, false) → true
```

## Hint

The key insight is: negate the whole expression by negating each part and flipping AND to OR (or OR to AND).

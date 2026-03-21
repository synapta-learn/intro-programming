# Validate Input

## Problem

Write three validation methods:

1. `isPositive(int n)` — returns `true` if `n` is greater than 0
2. `isInRange(int n, int min, int max)` — returns `true` if `n` is between `min` and `max` (inclusive)
3. `isNonEmpty(String s)` — returns `true` if `s` is not `null` and has a length greater than 0

## Examples

```java
isPositive(5)      // true
isPositive(0)      // false
isPositive(-3)     // false

isInRange(5, 1, 10)   // true
isInRange(1, 1, 10)   // true  (min is inclusive)
isInRange(10, 1, 10)  // true  (max is inclusive)
isInRange(0, 1, 10)   // false
isInRange(11, 1, 10)  // false

isNonEmpty("hello")   // true
isNonEmpty("")         // false
isNonEmpty(null)       // false
```

## Hints

- `isPositive` is a one-line method
- `isInRange` needs two comparisons combined with `&&`
- `isNonEmpty` must check for `null` first (before calling `.length()`), or you will get a `NullPointerException`

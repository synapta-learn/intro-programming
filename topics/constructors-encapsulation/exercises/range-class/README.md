# Range Class

## Problem

Create a `Solution` class that represents a numeric range [min, max] (inclusive on both ends). It should have:

- A constructor `Solution(int min, int max)` — if `min > max`, swap them so the range is always valid
- `getMin()` and `getMax()` — return the bounds
- `contains(int value)` — returns `true` if value is within the range (inclusive)
- `overlaps(Solution other)` — returns `true` if this range and the other range share at least one value
- `getSize()` — returns the number of integers in the range (max - min + 1)

## Examples

```java
Solution r = new Solution(1, 10);
r.getMin();       // 1
r.getMax();       // 10
r.contains(5);    // true
r.contains(11);   // false
r.getSize();      // 10

Solution r2 = new Solution(5, 15);
r.overlaps(r2);   // true (overlap at 5-10)

Solution r3 = new Solution(20, 30);
r.overlaps(r3);   // false (no overlap)

// Constructor swaps if needed
Solution r4 = new Solution(10, 1);
r4.getMin();      // 1
r4.getMax();      // 10
```

## Hints

- In the constructor, compare min and max. If min > max, swap them.
- `contains(value)` checks `value >= min && value <= max`
- Two ranges overlap if one starts before the other ends: `this.min <= other.max && other.min <= this.max`

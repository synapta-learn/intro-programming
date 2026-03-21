# Counter

## Problem

Create a `Solution` class that acts as a simple counter. The counter starts at 0 and supports the following operations:

- `increment()` — increases the count by 1
- `decrement()` — decreases the count by 1
- `getCount()` — returns the current count

The counter can go negative.

## Examples

```java
Solution counter = new Solution();
counter.getCount();     // 0
counter.increment();
counter.increment();
counter.getCount();     // 2
counter.decrement();
counter.getCount();     // 1
```

## Hints

- You need an `int` field to store the count
- The field starts at 0 by default (Java initializes int fields to 0)
- `increment()` and `decrement()` modify the field
- `getCount()` returns the field's current value

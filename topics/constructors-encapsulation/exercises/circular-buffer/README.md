# Circular Buffer

## Problem

Create a `Solution` class that implements a fixed-capacity circular buffer of integers. A circular buffer has a fixed size. When it is full, adding a new element overwrites the oldest element. It should have:

- A constructor `Solution(int capacity)` — creates a buffer with the given maximum capacity. Throws `IllegalArgumentException` if capacity is <= 0.
- `add(int value)` — adds a value to the buffer. If full, overwrites the oldest value.
- `get(int index)` — returns the element at the given index (0 = oldest element). Throws `IndexOutOfBoundsException` if index is out of range.
- `size()` — returns the number of elements currently in the buffer (up to capacity)
- `isFull()` — returns true if the buffer has reached its capacity
- `getCapacity()` — returns the maximum capacity

## Examples

```java
Solution buf = new Solution(3);
buf.size();        // 0
buf.isFull();      // false

buf.add(10);
buf.add(20);
buf.add(30);
buf.size();        // 3
buf.isFull();      // true
buf.get(0);        // 10 (oldest)
buf.get(2);        // 30 (newest)

buf.add(40);       // overwrites 10
buf.get(0);        // 20 (new oldest)
buf.get(2);        // 40 (newest)
buf.size();        // 3 (still full)
```

## Hints

- Use an `int[]` array of the given capacity
- Track a write position that wraps around using `% capacity`
- Track how many elements have been added (capped at capacity)
- For `get(index)`, calculate the actual array position based on the oldest element's position

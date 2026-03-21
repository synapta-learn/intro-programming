# Linked Counter

## Problem

Create a `Solution` class that represents a counter which can be **linked** to another counter. When linked, incrementing one counter decrements the other, and vice versa. It should support:

- `increment()` — increases this counter by 1. If linked, decrements the linked counter by 1.
- `decrement()` — decreases this counter by 1. If linked, increments the linked counter by 1.
- `getCount()` — returns the current count (starts at 0)
- `linkTo(Solution other)` — links this counter to another counter. The link is **one-directional**: only operations on `this` counter affect `other`, not the reverse (unless `other` is also linked to `this`).
- `unlink()` — removes the link

## Examples

```java
Solution up = new Solution();
Solution down = new Solution();

up.linkTo(down);

up.increment();   // up: 1, down: -1
up.increment();   // up: 2, down: -2
up.decrement();   // up: 1, down: -1

down.increment(); // down: 0 (down is not linked to up, so up is unaffected)
// up: 1, down: 0
```

## Hints

- Store a reference to the linked counter as a field
- When incrementing, check if there is a linked counter and call its internal decrement (be careful not to trigger the link in reverse — infinite loop!)
- One approach: have a private helper that modifies the count directly without triggering the link

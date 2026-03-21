# In Range

## Problem

Write a method that returns `true` if the given number is between 1 and 100, **inclusive** (meaning 1 and 100 both count as in range).

## Examples

```
inRange(50)  → true
inRange(1)   → true
inRange(100) → true
inRange(0)   → false
inRange(101) → false
```

## Hint

You need to check two conditions at the same time: the number must be greater than or equal to 1 **and** less than or equal to 100. Use the `&&` operator to combine them.

# XOR Without XOR

## Problem

XOR (exclusive or) returns `true` when **exactly one** of the two inputs is `true`, and `false` otherwise.

| A       | B       | A XOR B |
|---------|---------|---------|
| `true`  | `true`  | `false` |
| `true`  | `false` | `true`  |
| `false` | `true`  | `true`  |
| `false` | `false` | `false` |

Java has a `^` operator for XOR, but that would be too easy. Your challenge is to implement XOR using **only** `&&`, `||`, and `!`.

## Examples

```
xor(true, true)   → false
xor(true, false)  → true
xor(false, true)  → true
xor(false, false) → false
```

## Hint

Think about what XOR means in words: "one or the other, but not both." Can you translate that phrase directly into `&&`, `||`, and `!`?

# Min of Two

## Problem

Write three overloaded versions of a `min` method:

1. `min(int a, int b)` — returns the smaller `int`
2. `min(double a, double b)` — returns the smaller `double`
3. `min(String a, String b)` — returns the shorter `String` (if equal length, return `a`)

## Examples

```java
min(3, 7)          // returns 3
min(10, 2)         // returns 2
min(5, 5)          // returns 5

min(3.14, 2.71)    // returns 2.71
min(1.0, 1.0)      // returns 1.0

min("hi", "hello") // returns "hi" (length 2 < length 5)
min("cat", "dog")  // returns "cat" (same length, return first)
```

## Hints

- For `int` and `double`, use a simple comparison
- For `String`, compare using `.length()`
- When strings have equal length, return the first parameter `a`
- This is your first exercise with **method overloading** — same name, different parameter types

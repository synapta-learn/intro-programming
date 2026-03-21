# Method Chaining

## Problem

Write a `Solution` class that acts as a simple calculator with **method chaining**. Method chaining means each operation returns the calculator itself, so you can write:

```java
Solution calc = new Solution();
int result = calc.set(10).add(5).sub(3).mul(2).getResult();
// result is 24: (10 + 5 - 3) * 2 = 24
```

Implement these methods:

- `set(int value)` — sets the current value, returns `this`
- `add(int value)` — adds to the current value, returns `this`
- `sub(int value)` — subtracts from the current value, returns `this`
- `mul(int value)` — multiplies the current value, returns `this`
- `getResult()` — returns the current value as an `int`

The calculator starts with a value of `0`.

## Examples

```java
new Solution().set(5).add(3).getResult()          // 8
new Solution().set(10).sub(4).mul(3).getResult()   // 18
new Solution().add(5).add(5).getResult()            // 10
new Solution().getResult()                          // 0
```

## Hints

- Store the current value in an instance variable (field)
- Each method (except `getResult`) should modify the value and `return this;`
- `this` refers to the current object — returning it is what enables chaining

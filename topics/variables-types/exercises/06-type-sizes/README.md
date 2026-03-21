# Exercise: Type Sizes

## Goal

Implement methods that return the minimum and maximum values of the `int` type, and a method that returns the range (difference between max and min) as a `long`.

## Method Signatures

```java
public static int getMinInt()
public static int getMaxInt()
public static long getIntRange()
```

## Instructions

1. Open `Solution.java`
2. `getMinInt()` should return `Integer.MIN_VALUE`
3. `getMaxInt()` should return `Integer.MAX_VALUE`
4. `getIntRange()` should return the total number of possible int values as a `long`

## Expected Behavior

```
getMinInt()  → -2147483648
getMaxInt()  → 2147483647
getIntRange() → 4294967296
```

## Important Note on getIntRange()

The range of `int` is larger than `int` can hold! That is why `getIntRange()` returns a `long`. To calculate it correctly, you need to cast to `long` before subtracting:

```java
(long) Integer.MAX_VALUE - (long) Integer.MIN_VALUE + 1
```

Without the cast, the subtraction would overflow.

## Hints

- `Integer.MIN_VALUE` and `Integer.MAX_VALUE` are built-in constants
- The range includes both endpoints, so it is max - min + 1
- You must cast to `long` first to avoid integer overflow

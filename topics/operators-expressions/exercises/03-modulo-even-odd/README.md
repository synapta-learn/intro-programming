# Exercise: Modulo Even Odd

## Goal

Use the modulo operator `%` to check if a number is even or odd.

## Method Signatures

```java
public static boolean isEven(int number)
public static boolean isOdd(int number)
public static int remainder(int a, int b)
```

## Expected Behavior

```
isEven(4)   → true
isEven(7)   → false
isEven(0)   → true

isOdd(4)    → false
isOdd(7)    → true

remainder(10, 3) → 1
remainder(15, 5) → 0
remainder(7, 2)  → 1
```

## Instructions

1. Open `Solution.java`
2. `isEven` should return `true` if the number is divisible by 2 (remainder is 0)
3. `isOdd` should return `true` if the number is NOT divisible by 2
4. `remainder` should return the remainder when `a` is divided by `b`

## Key Concept

The modulo operator `%` gives the remainder after division:

```java
10 % 3  // → 1 (because 10 / 3 = 3 remainder 1)
8 % 2   // → 0 (because 8 / 2 = 4 remainder 0)
```

A number is even if `number % 2 == 0`.

## Hints

- `number % 2` gives `0` for even numbers and `1` for odd numbers
- A boolean expression like `number % 2 == 0` evaluates to `true` or `false` — you can return it directly

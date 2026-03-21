# Digit Count

## Problem

Write a method that returns how many digits a positive integer has.

The number 0 has 1 digit. You can assume the input is non-negative.

## Examples

```
digitCount(0)      → 1
digitCount(5)      → 1
digitCount(42)     → 2
digitCount(123)    → 3
digitCount(10000)  → 5
```

## Hint

Repeatedly divide the number by 10 and count how many times you do it until the number becomes 0. Handle the special case of 0 separately (or start your count at 1 and divide first).

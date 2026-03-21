# Reverse Number

## Problem

Write a method that reverses the digits of a positive integer.

You can assume the input is positive (n >= 1).

## Examples

```
reverseNumber(123)   → 321
reverseNumber(1000)  → 1      (leading zeros are dropped)
reverseNumber(42)    → 24
reverseNumber(7)     → 7
reverseNumber(12345) → 54321
```

## Hint

Use the digit processing pattern:
- Extract the last digit with `n % 10`
- Remove the last digit with `n / 10`
- Build the reversed number: `reversed = reversed * 10 + digit`

For example, reversing 123:
- Start: reversed = 0
- Extract 3: reversed = 0 * 10 + 3 = 3, n = 12
- Extract 2: reversed = 3 * 10 + 2 = 32, n = 1
- Extract 1: reversed = 32 * 10 + 1 = 321, n = 0

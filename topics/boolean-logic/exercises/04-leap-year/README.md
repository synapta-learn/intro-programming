# Leap Year

## Problem

Write a method that returns `true` if a given year is a leap year.

The rules for leap years are:
1. A year is a leap year if it is **divisible by 4**
2. **EXCEPT** years divisible by 100 are **not** leap years
3. **EXCEPT** years divisible by 400 **are** leap years

## Examples

```
isLeapYear(2024) → true   (divisible by 4, not by 100)
isLeapYear(2023) → false  (not divisible by 4)
isLeapYear(1900) → false  (divisible by 100, but not by 400)
isLeapYear(2000) → true   (divisible by 400)
```

## Hint

Use the modulo operator `%` to check divisibility. For example, `year % 4 == 0` checks if a year is divisible by 4. Think about how to combine the three rules using `&&` and `||`.

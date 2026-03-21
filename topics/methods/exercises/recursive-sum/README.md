# Recursive Sum of Digits

## Problem

Write a method `digitSum(int n)` that returns the sum of the digits of `n` using **recursion** (a method that calls itself).

This is your first exposure to recursion. The idea is:
- **Base case:** If `n` has only one digit (`n < 10`), the sum is `n` itself
- **Recursive case:** The sum of digits of `n` is the last digit (`n % 10`) plus the sum of digits of the remaining number (`n / 10`)

The input `n` will be non-negative.

## Examples

| Input | Output | Explanation |
|-------|--------|-------------|
| `123` | `6` | 1 + 2 + 3 = 6 |
| `9` | `9` | Single digit |
| `0` | `0` | Zero |
| `999` | `27` | 9 + 9 + 9 = 27 |
| `10` | `1` | 1 + 0 = 1 |

## How Recursion Works Here

For `digitSum(123)`:
1. `123 >= 10`, so return `123 % 10 + digitSum(123 / 10)` = `3 + digitSum(12)`
2. `12 >= 10`, so return `12 % 10 + digitSum(12 / 10)` = `2 + digitSum(1)`
3. `1 < 10`, so return `1` (base case)
4. Unwinding: `2 + 1 = 3`, then `3 + 3 = 6`

## Hints

- The method calls itself with a smaller input each time
- Every recursive method needs a **base case** that stops the recursion
- `n % 10` gives the last digit, `n / 10` removes the last digit

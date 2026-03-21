# Count Divisors

## Problem

A **divisor** of `n` is a number that divides `n` evenly (with no remainder).

Write a method `countDivisors(int n)` that returns how many positive divisors `n` has.

## Examples

| Input | Output | Divisors |
|-------|--------|----------|
| `12` | `6` | 1, 2, 3, 4, 6, 12 |
| `7` | `2` | 1, 7 (prime!) |
| `1` | `1` | 1 |
| `16` | `5` | 1, 2, 4, 8, 16 |

## Details

- `n` will be a positive integer (>= 1)
- Every positive integer has at least one divisor (1)

## Hints

- Loop from 1 to `n` and count how many values divide `n` evenly
- A number `i` is a divisor of `n` if `n % i == 0`
- Notice that prime numbers always have exactly 2 divisors

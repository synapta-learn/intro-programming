# Is Prime

## Problem

A **prime number** is a number greater than 1 that has no divisors other than 1 and itself.

Write a method `isPrime(int n)` that returns `true` if `n` is prime, and `false` otherwise.

## Examples

| Input | Output | Reason |
|-------|--------|--------|
| `2` | `true` | Only divisible by 1 and 2 |
| `7` | `true` | Only divisible by 1 and 7 |
| `4` | `false` | Divisible by 2 |
| `1` | `false` | 1 is not prime by definition |
| `0` | `false` | Not prime |
| `-3` | `false` | Negative numbers are not prime |

## Hints

- Numbers less than 2 are not prime
- Check if any number from 2 to `n-1` divides `n` evenly (`n % i == 0`)
- Optimization: you only need to check up to the square root of `n`, but checking up to `n-1` is fine for this exercise
- If you find any divisor, you can return `false` immediately

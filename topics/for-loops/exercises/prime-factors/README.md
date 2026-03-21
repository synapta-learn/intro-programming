# Prime Factors

## Problem

Write a method `primeFactors(int n)` that returns an array containing the prime factors of `n` in ascending order. If a factor appears multiple times, it should appear multiple times in the result.

## Examples

| Input | Output | Explanation |
|-------|--------|-------------|
| `12` | `[2, 2, 3]` | 12 = 2 * 2 * 3 |
| `7` | `[7]` | 7 is prime |
| `100` | `[2, 2, 5, 5]` | 100 = 2 * 2 * 5 * 5 |
| `1` | `[]` | 1 has no prime factors |
| `60` | `[2, 2, 3, 5]` | 60 = 2 * 2 * 3 * 5 |

## Hints

- Start with the smallest possible factor (2) and try to divide `n` by it repeatedly
- When `n` is no longer divisible by that factor, move to the next one
- You can use `i * i <= n` as the loop condition for efficiency
- Since you do not know the array size in advance, you can first count the factors, then fill the array (or use a large temporary array and copy)

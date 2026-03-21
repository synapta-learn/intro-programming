# Power

## Problem

Write a method `power(int base, int exponent)` that returns `base` raised to the power of `exponent`, without using `Math.pow`.

The exponent will be non-negative (>= 0).

## Examples

| Base | Exponent | Output | Explanation |
|------|----------|--------|-------------|
| `2` | `10` | `1024` | 2^10 = 1024 |
| `3` | `4` | `81` | 3^4 = 81 |
| `5` | `0` | `1` | Anything^0 = 1 |
| `7` | `1` | `7` | Anything^1 = itself |
| `0` | `5` | `0` | 0^n = 0 (for n > 0) |

## Hints

- Start with a result of `1`
- Multiply by `base` exactly `exponent` times
- Use `long` as the return type to handle larger results
- Remember: `x^0 = 1` for any `x`

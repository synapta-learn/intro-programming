# Sum Even Numbers

## Problem

Write a method `sumEven(int n)` that returns the sum of all **even** numbers from 1 to `n` (inclusive).

If `n` is less than 2, there are no even numbers in the range, so the sum is `0`.

## Examples

| Input | Output | Explanation |
|-------|--------|-------------|
| `10` | `30` | 2 + 4 + 6 + 8 + 10 = 30 |
| `7` | `12` | 2 + 4 + 6 = 12 |
| `1` | `0` | No even numbers |
| `2` | `2` | Just 2 |

## Hints

- You can loop from 1 to `n` and use `if (i % 2 == 0)` to check for even numbers
- Or you can loop from 2 to `n` stepping by 2: `for (int i = 2; i <= n; i += 2)`
- Both approaches are correct — try whichever feels natural

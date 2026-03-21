# Two Sum

## Problem

Write a method `twoSum(int[] numbers, int target)` that finds two elements in the array that add up to `target`. Return an array containing the two **indices** of those elements.

If no pair is found, return an empty array `{}`.

If there are multiple valid pairs, return the first one found (the pair with the smallest first index, and for the same first index, the smallest second index).

## Examples

| Array | Target | Output | Explanation |
|-------|--------|--------|-------------|
| `{2, 7, 11, 15}` | `9` | `{0, 1}` | numbers[0] + numbers[1] = 2 + 7 = 9 |
| `{3, 2, 4}` | `6` | `{1, 2}` | numbers[1] + numbers[2] = 2 + 4 = 6 |
| `{1, 2, 3}` | `10` | `{}` | No pair sums to 10 |
| `{3, 3}` | `6` | `{0, 1}` | numbers[0] + numbers[1] = 3 + 3 = 6 |

## Hints

- Use two nested loops: the outer picks the first element, the inner picks the second
- The inner loop should start at `i + 1` to avoid using the same element twice
- Return as soon as you find the first valid pair

# Count Occurrences

## Problem

Write a method `countOccurrences(int[] numbers, int target)` that returns how many times `target` appears in the array.

## Examples

| Array | Target | Output |
|-------|--------|--------|
| `{1, 2, 3, 2, 4, 2}` | `2` | `3` |
| `{5, 5, 5, 5}` | `5` | `4` |
| `{1, 2, 3}` | `7` | `0` |
| `{}` | `1` | `0` |

## Hints

- Use a counter variable starting at `0`
- Loop through the array and increment the counter each time you find the target
- An empty array always returns `0`

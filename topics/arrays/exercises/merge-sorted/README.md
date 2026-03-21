# Merge Sorted Arrays

## Problem

Write a method `mergeSorted(int[] a, int[] b)` that takes two arrays that are already sorted in ascending order and returns a **new** array containing all elements from both, also sorted in ascending order.

## Examples

| Array a | Array b | Output |
|---------|---------|--------|
| `{1, 3, 5}` | `{2, 4, 6}` | `{1, 2, 3, 4, 5, 6}` |
| `{1, 2, 3}` | `{4, 5, 6}` | `{1, 2, 3, 4, 5, 6}` |
| `{1, 5}` | `{2, 3, 4}` | `{1, 2, 3, 4, 5}` |
| `{}` | `{1, 2, 3}` | `{1, 2, 3}` |
| `{}` | `{}` | `{}` |

## Hints

- The result array has length `a.length + b.length`
- Use two index variables: one for array `a`, one for array `b`
- Compare the current elements from both arrays and pick the smaller one
- When one array is exhausted, copy the remaining elements from the other
- This is the "merge" step of the merge sort algorithm

# Is Sorted

## Problem

Write a method `isSorted(int[] numbers)` that returns `true` if the array is sorted in **ascending order** (non-decreasing), and `false` otherwise.

An empty array or an array with one element is considered sorted.

## Examples

| Input | Output |
|-------|--------|
| `{1, 2, 3, 4, 5}` | `true` |
| `{1, 3, 2, 4}` | `false` |
| `{5, 4, 3, 2, 1}` | `false` |
| `{1, 1, 2, 2, 3}` | `true` (equal neighbors are ok) |
| `{}` | `true` |
| `{7}` | `true` |

## Hints

- Compare each element with the next one
- If you ever find `numbers[i] > numbers[i + 1]`, the array is not sorted
- Be careful with the loop bound: if you compare `numbers[i]` with `numbers[i + 1]`, stop at `length - 1`

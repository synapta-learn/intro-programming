# Find Maximum

## Problem

Write a method `findMax(int[] numbers)` that returns the maximum (largest) value in the array.

You may assume the array has at least one element.

## Examples

| Input | Output |
|-------|--------|
| `{3, 7, 2, 9, 4}` | `9` |
| `{-5, -2, -8}` | `-2` |
| `{42}` | `42` |
| `{5, 5, 5}` | `5` |

## Hints

- Start by assuming the first element is the maximum
- Compare each subsequent element to your current maximum
- If you find something larger, update the maximum
- Do NOT start with `max = 0` — that breaks for arrays with all negative numbers

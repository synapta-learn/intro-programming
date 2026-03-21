# Remove Duplicates

## Problem

Write a method `removeDuplicates(int[] numbers)` that returns a **new** array containing only the unique elements from the original, in the order they first appeared.

## Examples

| Input | Output |
|-------|--------|
| `{1, 2, 3, 2, 1, 4}` | `{1, 2, 3, 4}` |
| `{5, 5, 5, 5}` | `{5}` |
| `{1, 2, 3}` | `{1, 2, 3}` |
| `{}` | `{}` |

## Hints

- You do not know the final size in advance, so you can use a two-pass approach:
  1. First pass: count how many unique elements there are
  2. Create an array of that size
  3. Second pass: fill the array with unique elements
- To check if a number has appeared before, loop through the elements you have already added
- The order of first appearance must be preserved

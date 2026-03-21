# Reverse Array

## Problem

Write a method `reverse(int[] numbers)` that returns a **new** array with the elements in reverse order. Do not modify the original array.

## Examples

| Input | Output |
|-------|--------|
| `{1, 2, 3, 4, 5}` | `{5, 4, 3, 2, 1}` |
| `{10, 20}` | `{20, 10}` |
| `{42}` | `{42}` |
| `{}` | `{}` |

## Hints

- Create a new array of the same length
- Fill it by reading the original array backwards
- Element at index `i` in the result comes from index `length - 1 - i` in the original

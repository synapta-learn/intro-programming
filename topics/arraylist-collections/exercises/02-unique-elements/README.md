# Unique Elements

## Problem

Write a method `uniqueElements(ArrayList<String> list)` that returns a new `ArrayList<String>` containing only the unique elements from the input list. Preserve the original order — if an element appears more than once, keep only its **first** occurrence.

Do not modify the original list.

## Examples

| Input | Output |
|-------|--------|
| `["apple", "banana", "apple", "cherry"]` | `["apple", "banana", "cherry"]` |
| `["a", "b", "c"]` | `["a", "b", "c"]` |
| `["x", "x", "x"]` | `["x"]` |
| `[]` | `[]` |

## Hints

- Create a new empty ArrayList for the result
- For each element in the input, check if it is already in the result using `contains()`
- Only add the element if it is not already there

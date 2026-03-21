# Filter and Transform

## Problem

Write a method `filterAndDouble(ArrayList<Integer> numbers)` that:

1. **Filters** the list to keep only even numbers
2. **Doubles** each remaining value

Return a new `ArrayList<Integer>` with the results. Do not modify the original list.

## Examples

| Input | Output |
|-------|--------|
| `[1, 2, 3, 4, 5, 6]` | `[4, 8, 12]` |
| `[2, 4, 6]` | `[4, 8, 12]` |
| `[1, 3, 5]` | `[]` |
| `[0, 1, -2, 3]` | `[0, -4]` |
| `[]` | `[]` |

## Hints

- A number is even if `number % 2 == 0`
- Create a new ArrayList, loop through the input, and only add even numbers (doubled) to the result
- Zero is even
- Negative even numbers should be included too

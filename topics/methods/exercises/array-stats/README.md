# Array Stats

## Problem

Write three methods that compute statistics on an `int` array:

1. `min(int[] numbers)` — returns the smallest element
2. `max(int[] numbers)` — returns the largest element
3. `average(int[] numbers)` — returns the average as a `double`

You may assume the array has at least one element.

## Examples

For the array `{3, 7, 1, 9, 4}`:

| Method | Result |
|--------|--------|
| `min(...)` | `1` |
| `max(...)` | `9` |
| `average(...)` | `4.8` |

For the array `{10}`:

| Method | Result |
|--------|--------|
| `min(...)` | `10` |
| `max(...)` | `10` |
| `average(...)` | `10.0` |

## Hints

- For `min` and `max`, start with the first element and compare against the rest
- For `average`, sum all elements and divide by the length
- Cast to `double` before dividing to avoid integer division: `(double) sum / numbers.length`

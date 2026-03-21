# List Statistics

## Problem

Write a method `statistics(ArrayList<Integer> numbers)` that computes basic statistics about a list of integers. Return the results as a `double[]` array with exactly 4 elements:

- `result[0]` — the **minimum** value
- `result[1]` — the **maximum** value
- `result[2]` — the **sum** of all values
- `result[3]` — the **average** (mean) of all values

If the list is empty, return `{0, 0, 0, 0}`.

## Examples

| Input | Output |
|-------|--------|
| `[10, 20, 30]` | `{10.0, 30.0, 60.0, 20.0}` |
| `[5]` | `{5.0, 5.0, 5.0, 5.0}` |
| `[-3, 7, -1, 4]` | `{-3.0, 7.0, 7.0, 1.75}` |
| `[]` | `{0.0, 0.0, 0.0, 0.0}` |

## Hints

- Initialize min and max from the first element, not from 0
- Sum should be computed as a `double` or cast at the end for the average
- The average is `sum / list.size()` — make sure you use floating-point division

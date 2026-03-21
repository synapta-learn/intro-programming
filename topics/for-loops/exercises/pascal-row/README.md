# Pascal's Row

## Problem

Pascal's triangle is a triangular array where each number is the sum of the two numbers directly above it:

```
Row 0:     1
Row 1:    1 1
Row 2:   1 2 1
Row 3:  1 3 3 1
Row 4: 1 4 6 4 1
```

Write a method `pascalRow(int n)` that returns the `n`th row of Pascal's triangle as an array (0-indexed).

## Examples

| Input | Output |
|-------|--------|
| `0` | `[1]` |
| `1` | `[1, 1]` |
| `2` | `[1, 2, 1]` |
| `3` | `[1, 3, 3, 1]` |
| `4` | `[1, 4, 6, 4, 1]` |

## Details

- Row `n` has `n + 1` elements
- The first and last elements are always `1`
- Every other element is the sum of two elements from the previous row

## Hints

- Start by building row 0: `[1]`
- Build each subsequent row from the previous one
- For row `r`, element at position `j` (where `0 < j < r`) equals `previousRow[j-1] + previousRow[j]`
- You can use two arrays: one for the current row and one for the previous row

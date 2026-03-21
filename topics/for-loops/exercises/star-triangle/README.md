# Star Triangle

## Problem

Write a method `starTriangle(int n)` that returns a string representing a right-aligned triangle of stars with `n` rows.

Row `i` (starting from 1) contains exactly `i` stars.

## Examples

`starTriangle(4)` returns:
```
*
**
***
****
```

`starTriangle(1)` returns:
```
*
```

## Details

- Each row contains only `*` characters (no spaces)
- Each row ends with `\n` (including the last row)
- If `n` is 0 or negative, return an empty string `""`

## Hints

- Use a nested loop: the outer loop controls the row, the inner loop prints stars
- Row `i` needs `i` stars
- Build the result as a string using concatenation

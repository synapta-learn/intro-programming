# Diamond Pattern

## Problem

Write a method `diamond(int n)` that returns a diamond pattern of stars. The parameter `n` is the number of rows in the top half (including the middle row).

The diamond is centered using spaces.

## Examples

`diamond(3)` returns:
```
  *
 ***
*****
 ***
  *
```

`diamond(1)` returns:
```
*
```

`diamond(4)` returns:
```
   *
  ***
 *****
*******
 *****
  ***
   *
```

## Details

- The widest row has `2*n - 1` stars
- Each row is padded with leading spaces to center it
- Each row ends with `\n` (no trailing spaces)
- If `n` is 0 or negative, return an empty string `""`

## Hints

- The top half (including middle) has `n` rows. Row `i` (0-indexed) has `2*i + 1` stars and `n - 1 - i` leading spaces.
- The bottom half is a mirror of the top (excluding the middle row)
- Build the string row by row using nested loops

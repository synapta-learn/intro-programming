# Rotate Array

## Problem

Write a method `rotate(int[] numbers, int k)` that returns a **new** array with the elements rotated `k` positions to the **right**.

Rotating right by 1 means the last element moves to the front.

## Examples

| Array | k | Output | Explanation |
|-------|---|--------|-------------|
| `{1, 2, 3, 4, 5}` | `2` | `{4, 5, 1, 2, 3}` | Last 2 elements move to front |
| `{1, 2, 3, 4, 5}` | `1` | `{5, 1, 2, 3, 4}` | Last element moves to front |
| `{1, 2, 3}` | `3` | `{1, 2, 3}` | Full rotation = no change |
| `{1, 2, 3}` | `0` | `{1, 2, 3}` | No rotation |
| `{1, 2, 3}` | `5` | `{2, 3, 1}` | k > length is OK (wraps around) |

## Details

- `k` can be larger than the array length — use `k % length` to handle this
- If the array is empty, return an empty array
- Do not modify the original array

## Hints

- After computing `k % length`, element at position `i` in the original goes to position `(i + k) % length` in the result
- Or equivalently, position `j` in the result comes from position `(j - k + length) % length` in the original

# Countdown

## Problem

Write a method that returns a string counting down from `n` to 1, with numbers separated by spaces.

If `n` is 0 or negative, return an empty string `""`.

## Examples

```
countdown(5) → "5 4 3 2 1"
countdown(3) → "3 2 1"
countdown(1) → "1"
countdown(0) → ""
```

## Hint

Start a loop at `n` and count down. Build up a string by adding each number. Be careful with the spaces — you don't want a trailing space at the end or a leading space at the beginning.

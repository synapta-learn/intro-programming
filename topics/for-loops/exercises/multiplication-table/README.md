# Multiplication Table

## Problem

Write a method `multiplicationTable(int n)` that returns a string containing the multiplication table for `n`, from 1 to 10.

Each line should follow the format: `n x i = result`

## Examples

`multiplicationTable(3)` returns:
```
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
```

`multiplicationTable(1)` returns:
```
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
...
1 x 10 = 10
```

## Details

- Each line ends with `\n` (including the last line)
- The format is exactly: `n x i = product\n`
- There are no leading or trailing spaces beyond what is shown

## Hints

- Build the result using string concatenation in a loop
- Use `"\n"` at the end of each line

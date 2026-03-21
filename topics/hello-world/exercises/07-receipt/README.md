# Exercise: Receipt

## Goal

Print a formatted store receipt. Your output must match this exactly:

```
==============================
        JAVA MART
==============================
Coffee          x2      $5.98
Sandwich        x1      $4.50
Cookie          x3      $2.97
------------------------------
TOTAL                  $13.45
==============================
```

## Instructions

1. Open `Solution.java`
2. Reproduce the receipt exactly using `println` calls
3. Pay close attention to spacing — the columns should be aligned

## Details

- The header and footer lines are 30 `=` characters
- The divider before TOTAL is 30 `-` characters
- "JAVA MART" is centered on the second line (8 spaces before it)
- Item names are left-aligned, quantities are in the middle, prices are right-aligned
- Use spaces to align the columns (not tabs)

## Hints

- Count the characters in each line carefully
- Each line is exactly 30 characters wide
- You can use `print` and `println` in combination, or a single `println` per line — your choice

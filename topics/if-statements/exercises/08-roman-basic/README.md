# Roman Basic

## Problem

Write a method that converts an integer from 1 to 10 into its Roman numeral representation as a string.

| Number | Roman |
|--------|-------|
| 1      | "I"   |
| 2      | "II"  |
| 3      | "III" |
| 4      | "IV"  |
| 5      | "V"   |
| 6      | "VI"  |
| 7      | "VII" |
| 8      | "VIII"|
| 9      | "IX"  |
| 10     | "X"   |

For any number outside the range 1-10, return `"Invalid"`.

## Examples

```
toRoman(1)  → "I"
toRoman(4)  → "IV"
toRoman(9)  → "IX"
toRoman(10) → "X"
toRoman(0)  → "Invalid"
toRoman(11) → "Invalid"
```

## Hint

A switch statement is a natural fit here — one case for each number from 1 to 10.

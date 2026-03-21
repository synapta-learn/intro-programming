# Binary Conversion

## Problem

Write a method that converts a non-negative integer to its binary (base-2) representation as a string.

The input 0 should return `"0"`.

## Examples

```
toBinary(0)   → "0"
toBinary(1)   → "1"
toBinary(2)   → "10"
toBinary(5)   → "101"
toBinary(10)  → "1010"
toBinary(255) → "11111111"
```

## How Binary Works

Binary uses only digits 0 and 1. To convert a decimal number to binary:

1. Divide the number by 2
2. The **remainder** (0 or 1) is the next binary digit (starting from the right)
3. Use the **quotient** as the new number
4. Repeat until the number is 0

Example: converting 13 to binary:

| Step | Number | Number / 2 | Number % 2 (digit) |
|------|--------|------------|---------------------|
| 1    | 13     | 6          | 1                   |
| 2    | 6      | 3          | 0                   |
| 3    | 3      | 1          | 1                   |
| 4    | 1      | 0          | 1                   |

Reading the digits bottom-to-top: **1101**

## Hint

The digits come out in reverse order (least significant first). You can prepend each digit to the front of your result string: `result = digit + result`.

# Count Vowels

## Problem

Write a method `countVowels(String text)` that returns the number of vowels in the given string. Vowels are the letters **a, e, i, o, u** (both uppercase and lowercase should be counted).

## Examples

| Input | Output |
|-------|--------|
| `"hello"` | `2` |
| `"AEIOU"` | `5` |
| `"bcdfg"` | `0` |
| `""` | `0` |
| `"Programming"` | `3` |

## Hints

- Loop through every character using `charAt()`
- Convert each character to lowercase (or uppercase) to simplify the check
- Check if the character is one of `a`, `e`, `i`, `o`, `u`
- Keep a running count

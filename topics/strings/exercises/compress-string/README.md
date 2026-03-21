# Compress String

## Problem

Write a method `compress(String text)` that performs basic string compression using the counts of repeated characters. If the compressed string is not shorter than the original, return the original string.

Consecutive identical characters are replaced by the character followed by the count of consecutive occurrences.

## Examples

| Input | Output |
|-------|--------|
| `"aabcccccaaa"` | `"a2b1c5a3"` |
| `"abcdef"` | `"abcdef"` (compressed would be `"a1b1c1d1e1f1"`, which is longer) |
| `"aaa"` | `"a3"` |
| `"a"` | `"a"` (compressed `"a1"` is not shorter) |
| `""` | `""` |

## Hints

- Walk through the string tracking the current character and its count
- When the character changes (or you reach the end), append the character and its count to the result
- Use `StringBuilder` for building the compressed version
- At the end, compare lengths and return whichever is shorter

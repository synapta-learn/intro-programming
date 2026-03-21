# Capitalize Words

## Problem

Write a method `capitalizeWords(String text)` that returns a new string where the first letter of each word is capitalized and all other letters are lowercase. Words are separated by single spaces.

## Examples

| Input | Output |
|-------|--------|
| `"hello world"` | `"Hello World"` |
| `"java programming"` | `"Java Programming"` |
| `"ALREADY CAPS"` | `"Already Caps"` |
| `"a"` | `"A"` |
| `""` | `""` |

## Hints

- Consider iterating character by character
- A character should be capitalized if it is the first character or if the previous character was a space
- All other characters should be lowercase
- Use `Character.toUpperCase()` and `Character.toLowerCase()`

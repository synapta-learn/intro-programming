# Reverse String

## Problem

Write a method `reverse(String text)` that returns the string reversed. Do **not** use `StringBuilder.reverse()` — build the reversed string yourself.

## Examples

| Input | Output |
|-------|--------|
| `"hello"` | `"olleh"` |
| `"Java"` | `"avaJ"` |
| `"a"` | `"a"` |
| `""` | `""` |
| `"racecar"` | `"racecar"` |

## Hints

- You can iterate through the string from the last character to the first
- Use a `StringBuilder` to build the result (just do not call `.reverse()`)
- Alternatively, iterate forward and prepend each character (but appending in reverse order is more efficient)

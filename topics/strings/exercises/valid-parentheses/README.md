# Valid Parentheses

## Problem

Write a method `isValid(String text)` that returns `true` if every opening parenthesis `(` has a matching closing parenthesis `)` and they are properly nested. Non-parenthesis characters should be ignored.

## Examples

| Input | Output |
|-------|--------|
| `"()"` | `true` |
| `"(())"` | `true` |
| `"()()"` | `true` |
| `"(hello (world))"` | `true` |
| `"("` | `false` |
| `")"` | `false` |
| `"(()))"` | `false` |
| `""` | `true` |
| `"hello"` | `true` |

## Hints

- You do not need a stack data structure — a simple counter works for single-type parentheses
- Walk through the string: increment the counter for `(`, decrement for `)`
- If the counter ever goes negative, there is a `)` without a matching `(` — return `false` immediately
- At the end, the counter should be exactly 0

# Factorial

## Problem

The **factorial** of a non-negative integer `n`, written as `n!`, is the product of all positive integers from 1 to `n`.

- `0! = 1` (by definition)
- `1! = 1`
- `5! = 1 * 2 * 3 * 4 * 5 = 120`

Write a method `factorial(int n)` that returns `n!` using a for loop.

## Examples

| Input | Output |
|-------|--------|
| `0` | `1` |
| `1` | `1` |
| `5` | `120` |
| `10` | `3628800` |

## Hints

- Start with a result variable initialized to `1` (not `0` — why?)
- Multiply by each number from 1 to `n`
- Use `long` as the return type since factorials grow fast

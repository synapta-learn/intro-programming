# FizzBuzz Single

## Problem

Write a method that takes a single number and returns:
- `"FizzBuzz"` if the number is divisible by **both** 3 and 5
- `"Fizz"` if the number is divisible by 3 (but not 5)
- `"Buzz"` if the number is divisible by 5 (but not 3)
- The number itself as a string, if none of the above apply

## Examples

```
fizzBuzz(15) → "FizzBuzz"
fizzBuzz(9)  → "Fizz"
fizzBuzz(10) → "Buzz"
fizzBuzz(7)  → "7"
fizzBuzz(1)  → "1"
fizzBuzz(30) → "FizzBuzz"
```

## Hint

The order of your conditions matters. Check for "FizzBuzz" (divisible by both) **first**, because a number divisible by both 3 and 5 is also divisible by 3 alone and 5 alone.

To convert a number to a string, you can use `String.valueOf(n)` or `"" + n`.

# Number Guessing

## Problem

Imagine a guessing game: someone picks a secret number between 1 and `n` (inclusive), and you guess by always picking the middle of the remaining range. If your guess is too high, you eliminate the upper half; if too low, you eliminate the lower half.

Write a method that simulates this strategy and returns how many guesses it takes to find the `target` number in the range 1 to `n`.

**The strategy (binary search):**
1. Set `low = 1` and `high = n`
2. Guess the midpoint: `guess = (low + high) / 2`
3. If `guess == target`, you found it — return the number of guesses made
4. If `guess < target`, set `low = guess + 1`
5. If `guess > target`, set `high = guess - 1`
6. Repeat from step 2

## Examples

```
guessCount(10, 5)   → 1    (first guess: (1+10)/2 = 5, found it!)
guessCount(10, 1)   → 3    (guesses: 5, 2, 1)
guessCount(100, 73) → 6    (guesses: 50, 75, 62, 68, 71, 73)
guessCount(1, 1)    → 1    (only one possibility)
```

## Hint

This is a direct implementation of **binary search**. Use a while loop that runs as long as `low <= high` (though it should always find the target). Count each guess attempt.

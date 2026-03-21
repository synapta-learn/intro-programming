# Higher Lower Game

## Problem

Implement the logic for a higher/lower number guessing game using well-decomposed methods.

The game has a secret number, and the player makes guesses. For each guess, the game responds with "higher", "lower", or "correct".

Implement these methods:

1. `checkGuess(int secret, int guess)` — returns `"higher"` if the guess is too low (the answer is higher), `"lower"` if the guess is too high (the answer is lower), or `"correct"` if the guess matches.

2. `countGuesses(int secret, int[] guesses)` — returns how many guesses it took to find the secret. If the secret is never guessed, return `-1`.

3. `isValidGuess(int guess, int min, int max)` — returns `true` if the guess is within the valid range `[min, max]` (inclusive).

4. `bestGuess(int min, int max)` — returns the optimal guess (the midpoint): `(min + max) / 2`.

## Examples

```java
checkGuess(42, 30)    // "higher"  (answer is higher than 30)
checkGuess(42, 50)    // "lower"   (answer is lower than 50)
checkGuess(42, 42)    // "correct"

countGuesses(42, new int[]{30, 50, 42})           // 3
countGuesses(42, new int[]{30, 50, 60})            // -1
countGuesses(7, new int[]{7})                       // 1

isValidGuess(5, 1, 10)   // true
isValidGuess(0, 1, 10)   // false

bestGuess(1, 100)   // 50
bestGuess(1, 10)    // 5
```

## Hints

- `checkGuess` uses simple comparisons
- `countGuesses` loops through guesses, calling `checkGuess` for each
- `bestGuess` uses integer division, which automatically floors the result

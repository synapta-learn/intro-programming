# Password Strength

## Problem

Write three methods that check different aspects of password strength, and a fourth method that combines them all.

1. `isLongEnough(password)` — Returns `true` if the password has at least 8 characters.
2. `hasDigit(password)` — Returns `true` if the password contains at least one digit ('0' through '9').
3. `hasUppercase(password)` — Returns `true` if the password contains at least one uppercase letter ('A' through 'Z').
4. `isStrong(password)` — Returns `true` if **all three** criteria above are met.

## Examples

```
isLongEnough("abc")         → false  (only 3 chars)
isLongEnough("abcdefgh")    → true   (8 chars)
hasDigit("hello")           → false
hasDigit("hello1")          → true
hasUppercase("hello")       → false
hasUppercase("Hello")       → true
isStrong("Secret99")        → true   (long enough, has digit, has uppercase)
isStrong("secret99")        → false  (no uppercase)
isStrong("Short1A")         → false  (only 7 chars)
```

## Hint

To check each character in a string, use `password.charAt(i)` to get the character at position `i`, and `password.length()` for the length. A character `ch` is a digit if `ch >= '0' && ch <= '9'`, and uppercase if `ch >= 'A' && ch <= 'Z'`. You will need a loop to scan through the characters — a simple `for` loop with an index will work. (We haven't formally covered loops yet, but you can use: `for (int i = 0; i < password.length(); i++)`)

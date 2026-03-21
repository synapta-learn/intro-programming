# Password Field

## Problem

Create a `Solution` class that stores a password securely. The password can be checked but never retrieved. It should have:

- A constructor `Solution(String password)` — stores the password. Throws `IllegalArgumentException` if the password is shorter than 4 characters.
- `isMatch(String attempt)` — returns `true` if the attempt matches the stored password exactly
- `getMasked()` — returns a string of asterisks `*` with the same length as the password (e.g., a 6-character password returns `"******"`)
- `getLength()` — returns the length of the password

There must be **no** method that returns the actual password text.

## Examples

```java
Solution pw = new Solution("secret");
pw.isMatch("secret");  // true
pw.isMatch("wrong");   // false
pw.getMasked();         // "******"
pw.getLength();         // 6

new Solution("ab");    // throws — too short
```

## Hints

- Store the password in a `private` field with no getter
- `isMatch` just uses `.equals()` to compare
- For `getMasked()`, build a string of `*` characters matching the password length
- This is a great example of encapsulation — the most sensitive data is completely hidden

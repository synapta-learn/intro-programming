# Email Validator

## Problem

Create a `Solution` class that represents an email address. The constructor validates the email format and the class provides methods to extract parts of the email. It should have:

- A constructor `Solution(String email)` that validates the email. An email is valid if:
  - It contains exactly one `@` character
  - There is at least one character before the `@` (the username)
  - There is at least one character after the `@` (the domain)
  - If invalid, throw an `IllegalArgumentException`
- `getUsername()` — returns the part before the `@`
- `getDomain()` — returns the part after the `@`
- `getFullEmail()` — returns the complete email address

## Examples

```java
Solution email = new Solution("alice@example.com");
email.getUsername();   // "alice"
email.getDomain();    // "example.com"
email.getFullEmail(); // "alice@example.com"

new Solution("invalid");        // throws — no @
new Solution("@example.com");   // throws — no username
new Solution("alice@");         // throws — no domain
new Solution("a@b@c");          // throws — multiple @
```

## Hints

- Use `indexOf('@')` to find the position of `@`
- Use `lastIndexOf('@')` to check if there are multiple `@` symbols — if `indexOf` and `lastIndexOf` return different values, there are multiple
- Use `substring()` to extract the parts before and after `@`
- Store the parts as private fields after validation

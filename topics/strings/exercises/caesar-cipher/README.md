# Caesar Cipher

## Problem

Write two methods:

- `encrypt(String text, int shift)` — shifts every letter forward in the alphabet by `shift` positions. Non-letter characters are left unchanged. The shift wraps around: shifting 'z' by 1 gives 'a'. The case of each letter must be preserved.

- `decrypt(String text, int shift)` — reverses the encryption by shifting letters backward.

## Examples

| Method | Input | Shift | Output |
|--------|-------|-------|--------|
| `encrypt` | `"abc"` | `1` | `"bcd"` |
| `encrypt` | `"xyz"` | `3` | `"abc"` |
| `encrypt` | `"Hello, World!"` | `5` | `"Mjqqt, Btwqi!"` |
| `decrypt` | `"Mjqqt, Btwqi!"` | `5` | `"Hello, World!"` |
| `encrypt` | `""` | `10` | `""` |

## Hints

- Only shift letters (a-z, A-Z). Leave spaces, punctuation, and digits unchanged.
- Use character arithmetic: `'a' + ((c - 'a' + shift) % 26)` handles the wrap-around
- Decryption is just encryption with a negative shift (or `26 - shift`)
- Be careful with negative values in modulo — Java's `%` can return negatives

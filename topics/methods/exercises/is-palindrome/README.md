# Is Palindrome

## Problem

A **palindrome** is a string that reads the same forwards and backwards.

Write a method `isPalindrome(String s)` that returns `true` if the string is a palindrome. The check should be **case-insensitive**.

You must also write a helper method `reverseString(String s)` that returns the reversed string. Use it inside `isPalindrome`.

## Examples

| Input | Output | Reason |
|-------|--------|--------|
| `"racecar"` | `true` | Same forwards and backwards |
| `"Racecar"` | `true` | Case-insensitive |
| `"hello"` | `false` | "hello" != "olleh" |
| `"a"` | `true` | Single character |
| `""` | `true` | Empty string is a palindrome |
| `"abba"` | `true` | Even-length palindrome |

## Requirements

- You must implement `reverseString(String s)` and use it in `isPalindrome`
- The palindrome check is case-insensitive (convert to lowercase first)
- Both methods must be `public static`

## Hints

- Use `s.toLowerCase()` to handle case-insensitivity
- To reverse a string, loop through it backwards and build a new string
- Use `s.charAt(i)` to get the character at position `i`
- Use `s.equals(other)` to compare strings (not `==`)

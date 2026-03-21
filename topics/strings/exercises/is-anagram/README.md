# Is Anagram

## Problem

Write a method `isAnagram(String a, String b)` that returns `true` if the two strings are anagrams of each other. Two strings are anagrams if they contain exactly the same characters in any order. The comparison should be **case-insensitive** and should **ignore spaces**.

## Examples

| Input a | Input b | Output |
|---------|---------|--------|
| `"listen"` | `"silent"` | `true` |
| `"hello"` | `"world"` | `false` |
| `"Astronomer"` | `"Moon starer"` | `true` |
| `"aab"` | `"bba"` | `false` |
| `""` | `""` | `true` |

## Hints

- Convert both strings to lowercase first
- One approach: count the frequency of each letter in both strings and compare the counts
- You can use an `int[26]` array to count letter frequencies, where index 0 is 'a', index 1 is 'b', etc.
- To convert a character to an index: `c - 'a'` gives 0 for 'a', 1 for 'b', etc.
- Skip any character that is not a letter

# Word Frequency

## Problem

Write a method `mostFrequentWord(String sentence)` that returns the word that appears most often in the given sentence. The comparison should be **case-insensitive**. Words are separated by single spaces. If there is a tie, return the word that appears **first** in the sentence.

If the sentence is empty, return an empty string.

## Examples

| Input | Output |
|-------|--------|
| `"the cat sat on the mat"` | `"the"` |
| `"hello"` | `"hello"` |
| `"To be or not to be"` | `"to"` |
| `""` | `""` |
| `"a b a b c"` | `"a"` |

## Hints

- Split the sentence into words (you can use a loop with `indexOf` and `substring`, or `split(" ")`)
- Keep track of each word and its count — you can use parallel arrays: one for words and one for counts
- Convert words to lowercase for comparison but return the lowercase version
- Track the word with the highest count as you go

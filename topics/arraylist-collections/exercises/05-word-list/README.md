# Word List

## Problem

Create a `WordList` class that stores words and provides useful operations. The class should have:

### Constructor
- **`WordList()`** — Create an empty word list.

### Methods
- **`addWord(String word)`** — Add a word to the list. Do not add duplicates (if the word is already in the list, do nothing).
- **`contains(String word)`** — Return `true` if the word is in the list, `false` otherwise.
- **`size()`** — Return the number of words in the list.
- **`getWords()`** — Return a **new** `ArrayList<String>` containing all words in **alphabetical order**. The internal list should not be modified.

## Examples

```java
WordList wl = new WordList();
wl.addWord("banana");
wl.addWord("apple");
wl.addWord("cherry");
wl.addWord("banana");  // duplicate, not added

wl.size();              // 3
wl.contains("apple");   // true
wl.contains("grape");   // false
wl.getWords();          // ["apple", "banana", "cherry"]
```

## Hints

- Use an `ArrayList<String>` as your internal storage
- Check `contains()` before adding to prevent duplicates
- To sort a copy, use `java.util.Collections.sort(list)`
- Remember to return a **copy**, not the internal list itself

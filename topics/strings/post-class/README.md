# Working with Strings — Post-Class Review

## What You Learned

In this topic you worked extensively with Java's String class. You practiced:

- **Character-by-character iteration** using `charAt()` and loops
- **Building new strings** with `StringBuilder` and concatenation
- **Comparing strings** with `equals()` instead of `==`
- **Case-insensitive logic** using `toLowerCase()` or `Character.toLowerCase()`
- **String analysis** — counting, searching, and transforming text

## Key Takeaways

**Strings are immutable.** Every operation that "changes" a string actually creates a new one. If you call `str.toUpperCase()` without saving the result, nothing happens to `str`. Always capture the return value.

**Character arithmetic is powerful.** Many string problems become simpler when you remember that characters are numbers. Checking if a character is a vowel, shifting letters for a cipher, or converting case — all of these use the numeric nature of `char`.

**StringBuilder is essential for loops.** If you find yourself doing `result = result + something` inside a loop, switch to `StringBuilder.append()`. The performance difference is dramatic for large inputs.

**Edge cases matter.** Empty strings, single-character strings, strings with all spaces, mixed case — always think about these when solving string problems. A solution that works for `"hello"` but crashes on `""` is not complete.

## Common Patterns to Remember

```java
// Iterate through characters
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    // do something with c
}

// Build a result string
StringBuilder sb = new StringBuilder();
for (int i = 0; i < str.length(); i++) {
    // conditionally append characters
    sb.append(str.charAt(i));
}
String result = sb.toString();

// Case-insensitive character check
char c = Character.toLowerCase(str.charAt(i));

// Split words by spaces (preview — useful to know)
String[] words = str.split(" ");
```

## What Comes Next

Now that you can work with arrays and strings, the next step is **classes and objects** — defining your own types that bundle data and behavior together. This is where Java really starts to shine as an object-oriented language.

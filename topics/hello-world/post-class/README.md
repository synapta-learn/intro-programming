# Hello, World! — Post-Class Summary

## What You Learned

- Every Java program needs a `class` and a `main` method
- `System.out.println()` prints a line of text
- `System.out.print()` prints without moving to the next line
- You compile with `javac` and run with `java`
- Comments help humans read code — the compiler ignores them

## Common Mistakes to Watch For

**Forgetting the semicolon.** Every statement in Java ends with `;`. If you get a mysterious error pointing to the line *after* your code, check if the previous line is missing a semicolon.

**Capital letters matter.** It is `System`, not `system`. It is `String`, not `string`. Java is case-sensitive everywhere.

**Mismatched braces.** Every `{` needs a matching `}`. A good habit: type both braces first, then fill in the code between them.

**Escape characters in strings.** If you need to print a double quote inside a string, you must escape it: `\"`. For example:
```java
System.out.println("She said \"hello\"");
```

## Tips for Success

1. **Type the code yourself.** Do not copy-paste. Your fingers need to learn the patterns.
2. **Read error messages from the top.** The first error is usually the real problem. Later errors are often caused by the first one.
3. **Keep your code tidy.** Indent the contents of each `{}` block with consistent spacing. It makes errors much easier to spot.
4. **Experiment.** After finishing an exercise, try changing things. What happens if you remove a semicolon? What if you use `print` instead of `println`? Breaking things on purpose teaches you how they work.

## Looking Ahead

Now that you can print text, the next topic introduces **variables** — named containers that store data. Instead of printing fixed text, you will store numbers, words, and more, and use them in your programs.

# Working with Strings

## Strings Are Everywhere

Almost every program deals with text. User names, error messages, file paths, search queries, passwords — all of these are strings. Java provides a rich set of tools for working with strings, and mastering them will make you dramatically more productive.

## What Is a String?

A `String` in Java is a sequence of characters. You have been using strings since your first program:

```java
String greeting = "Hello, world!";
```

Under the hood, a string is stored as an array of characters. The string `"Hello"` looks like this in memory:

```
Index:  [0]  [1]  [2]  [3]  [4]
Chars:  | H | e | l | l | o |
```

This means strings are zero-indexed, just like arrays. The first character is at index 0.

## String Immutability

Here is the single most important thing to understand about strings in Java: **strings are immutable**. Once a string is created, it can never be changed. Every method that appears to modify a string actually creates a new string.

```java
String name = "hello";
name.toUpperCase();
System.out.println(name);  // Still "hello" — the original is unchanged

name = name.toUpperCase();
System.out.println(name);  // "HELLO" — name now points to a NEW string
```

This catches everyone at first. When you call a method on a string, you must capture the return value. The original string is untouched.

## Essential String Methods

### length()

Returns the number of characters in the string:

```java
String word = "Java";
System.out.println(word.length());  // 4
System.out.println("".length());    // 0 (empty string)
```

Unlike arrays where you use `.length` (no parentheses), strings use `.length()` (with parentheses). This is a common source of confusion.

### charAt(int index)

Returns the character at a specific position:

```java
String word = "Hello";
System.out.println(word.charAt(0));  // 'H'
System.out.println(word.charAt(4));  // 'o'
// word.charAt(5) would throw StringIndexOutOfBoundsException
```

You can loop through every character in a string:

```java
String word = "Hello";
for (int i = 0; i < word.length(); i++) {
    System.out.println(word.charAt(i));
}
```

### substring(int beginIndex) and substring(int beginIndex, int endIndex)

Extracts a portion of a string. The end index is **exclusive** — the character at that index is not included:

```java
String text = "Hello, world!";
System.out.println(text.substring(7));      // "world!"  (from index 7 to end)
System.out.println(text.substring(0, 5));   // "Hello"   (from 0 up to but not including 5)
System.out.println(text.substring(7, 12));  // "world"   (from 7 up to but not including 12)
```

### indexOf(String str) and indexOf(char ch)

Finds the first occurrence of a character or substring. Returns `-1` if not found:

```java
String text = "Hello, world!";
System.out.println(text.indexOf('o'));       // 4
System.out.println(text.indexOf("world"));  // 7
System.out.println(text.indexOf("Java"));   // -1 (not found)
```

## Comparing Strings

This is one of the most important rules in Java: **never compare strings with `==`**. The `==` operator checks whether two variables point to the exact same object in memory, not whether they contain the same text.

```java
String a = "hello";
String b = "hello";
String c = new String("hello");

System.out.println(a == b);       // true (Java reuses the same string literal)
System.out.println(a == c);       // false (c is a different object!)
System.out.println(a.equals(c));  // true (same content)
```

Always use `.equals()` to compare string content:

```java
String input = scanner.nextLine();
if (input.equals("yes")) {
    System.out.println("Confirmed!");
}
```

For case-insensitive comparison, use `.equalsIgnoreCase()`:

```java
if (input.equalsIgnoreCase("YES")) {
    // matches "yes", "Yes", "YES", "yEs", etc.
}
```

## Case Conversion

```java
String text = "Hello World";
System.out.println(text.toUpperCase());  // "HELLO WORLD"
System.out.println(text.toLowerCase());  // "hello world"
```

Remember, these return new strings. The original is unchanged.

## Trimming Whitespace

The `trim()` method removes leading and trailing whitespace (spaces, tabs, newlines):

```java
String input = "   hello   ";
System.out.println(input.trim());         // "hello"
System.out.println(input.trim().length()); // 5
```

This is especially useful when processing user input.

## String Concatenation and Performance

You already know how to join strings with `+`:

```java
String full = "Hello" + " " + "World";  // "Hello World"
```

This works well for small operations. But inside a loop, concatenation creates a new string every iteration, which is very slow for large amounts of text:

```java
// SLOW — creates a new string object every iteration
String result = "";
for (int i = 0; i < 10000; i++) {
    result = result + i + " ";  // copies everything each time
}
```

### StringBuilder — The Fast Alternative

`StringBuilder` is a mutable text buffer. It lets you build up a string efficiently:

```java
// FAST — modifies the same buffer
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
    sb.append(i);
    sb.append(" ");
}
String result = sb.toString();
```

Key `StringBuilder` methods:
- `append(value)` — adds text to the end (works with strings, chars, ints, etc.)
- `toString()` — converts the buffer to a regular `String`
- `length()` — returns the current length

Use `StringBuilder` whenever you are building a string in a loop.

## Working with Characters

Individual characters in Java have the type `char` and are written with single quotes:

```java
char letter = 'A';
char digit = '7';
```

Characters are actually numbers underneath. Every character has a numeric code. The letter `'A'` is 65, `'B'` is 66, `'a'` is 97, and so on. This means you can do arithmetic with characters:

```java
char c = 'A';
System.out.println(c + 1);        // 66 (the number)
System.out.println((char)(c + 1)); // 'B' (cast back to char)
```

Useful character checks:

```java
char c = 'A';
System.out.println(Character.isLetter(c));     // true
System.out.println(Character.isDigit(c));      // false
System.out.println(Character.isUpperCase(c));  // true
System.out.println(Character.toLowerCase(c));  // 'a'
```

## Quick Reference

| Method | Returns | Example |
|--------|---------|---------|
| `length()` | int | `"hello".length()` → `5` |
| `charAt(i)` | char | `"hello".charAt(1)` → `'e'` |
| `substring(begin, end)` | String | `"hello".substring(1, 4)` → `"ell"` |
| `indexOf(str)` | int | `"hello".indexOf("ll")` → `2` |
| `equals(other)` | boolean | `"hi".equals("hi")` → `true` |
| `equalsIgnoreCase(other)` | boolean | `"Hi".equalsIgnoreCase("hi")` → `true` |
| `toUpperCase()` | String | `"hello".toUpperCase()` → `"HELLO"` |
| `toLowerCase()` | String | `"Hello".toLowerCase()` → `"hello"` |
| `trim()` | String | `"  hi  ".trim()` → `"hi"` |
| `contains(str)` | boolean | `"hello".contains("ell")` → `true` |
| `startsWith(str)` | boolean | `"hello".startsWith("he")` → `true` |
| `isEmpty()` | boolean | `"".isEmpty()` → `true` |

## Summary

- Strings are **immutable** — methods return new strings, never modify the original
- Use `.length()` (with parentheses) to get the size
- Use `.charAt(i)` to access individual characters (zero-indexed)
- **Always** compare strings with `.equals()`, never `==`
- Use `StringBuilder` when building strings in a loop
- Characters are numbers — you can do arithmetic with them
- `substring()`, `indexOf()`, `toUpperCase()`, `toLowerCase()`, and `trim()` are your everyday tools

The exercises will give you hands-on practice with all of these. Many of them involve iterating through characters one at a time — a pattern that combines your loop skills with string access.

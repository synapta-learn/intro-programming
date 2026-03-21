# Exercise: Char to Int

## Goal

Explore how Java characters are secretly numbers. Every `char` has an underlying integer value (its ASCII/Unicode code point).

Implement these three methods:

## Method Signatures

```java
public static int charToAscii(char c)
public static char asciiToChar(int code)
public static char shiftChar(char c, int offset)
```

## Expected Behavior

```
charToAscii('A')     → 65
charToAscii('a')     → 97
charToAscii('0')     → 48

asciiToChar(65)      → 'A'
asciiToChar(97)      → 'a'
asciiToChar(48)      → '0'

shiftChar('A', 1)    → 'B'
shiftChar('A', 25)   → 'Z'
shiftChar('a', 3)    → 'd'
```

## Instructions

1. Open `Solution.java`
2. `charToAscii`: simply assign the `char` to an `int` — Java converts automatically
3. `asciiToChar`: cast the `int` to a `char` using `(char)`
4. `shiftChar`: add the offset to the character and cast back to `char`

## Key Insight

In Java, a `char` is actually a number. You can assign a `char` to an `int` to see its numeric value:

```java
int value = 'A';  // value is 65
```

And you can cast an `int` back to a `char`:

```java
char letter = (char) 66;  // letter is 'B'
```

## Hints

- `(int) c` converts a char to its ASCII code (or just assign it to an int variable)
- `(char) code` converts an int to the corresponding character
- For `shiftChar`, think of it as: `(char)(c + offset)`

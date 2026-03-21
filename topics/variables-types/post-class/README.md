# Variables and Types — Post-Class Summary

## What You Learned

- Variables are named containers with a fixed type
- `int` for whole numbers, `double` for decimals, `boolean` for true/false, `char` for single characters
- `String` for text (capital S, double quotes, can concatenate with `+`)
- Java is statically typed — the compiler catches type mismatches before your program runs
- `camelCase` naming convention makes code readable

## Common Mistakes to Watch For

**Using `=` vs `==`.** A single `=` is assignment (put a value in a variable). Double `==` is comparison (check if two values are equal). You will learn about `==` soon, but be aware of this now:
```java
int x = 5;   // assignment: x now holds 5
// x == 5    // comparison: is x equal to 5? (used in conditions)
```

**Integer division surprise.** When you divide two `int` values, Java gives you an `int` result — it throws away the decimal part:
```java
int result = 7 / 2;  // result is 3, not 3.5
```
This is a preview of the next topic (Operators). Keep it in mind when doing math with `int` variables.

**String comparison.** Do not use `==` to compare Strings. It does not do what you expect. Use `.equals()` instead:
```java
String a = "hello";
// if (a == "hello")      // WRONG — don't do this
// if (a.equals("hello")) // CORRECT — we'll cover this later
```

**Concatenation order.** When mixing `+` with numbers and Strings, the order matters:
```java
System.out.println("Sum: " + 3 + 4);   // prints "Sum: 34" (string concat)
System.out.println("Sum: " + (3 + 4)); // prints "Sum: 7" (math first)
```

## Tips for Success

1. **Always initialize variables** when you declare them. `int x = 0;` is better than `int x;` because you know exactly what it contains.
2. **Choose meaningful names.** `numberOfStudents` is worth the extra typing compared to `n`. You will read your code far more than you write it.
3. **Use the right type.** If a value will never have decimals (like a count), use `int`. If it might have decimals (like money or measurements), use `double`.

## Looking Ahead

Next up: **Operators and Expressions**. You will learn to do math with your variables — addition, subtraction, multiplication, division, and the mysterious modulo operator `%`. You will also learn about integer division, type casting, and why `7 / 2` is not `3.5` in Java.

# Making Decisions with If-Statements — Pre-Class Reading

## Why Decisions Matter

So far, your programs run every line of code from top to bottom, no exceptions. But real programs need to make choices: *if* the user enters a wrong password, show an error; *if* the temperature is below freezing, display a warning.

The `if` statement is how you tell Java: "Only run this code **if** a condition is true."

---

## The if Statement

The simplest form:

```java
if (condition) {
    // code that runs only when condition is true
}
```

The `condition` must be a `boolean` expression — something that evaluates to `true` or `false`.

```java
int temperature = 35;

if (temperature > 30) {
    System.out.println("It's hot outside!");
}
// Output: It's hot outside!
```

If the condition is `false`, the code inside the braces is simply skipped:

```java
int temperature = 20;

if (temperature > 30) {
    System.out.println("It's hot outside!");
}
// No output — the condition was false
```

---

## The else Clause

What if you want to do one thing when the condition is true, and a *different* thing when it's false?

```java
int temperature = 20;

if (temperature > 30) {
    System.out.println("It's hot outside!");
} else {
    System.out.println("It's not too hot.");
}
// Output: It's not too hot.
```

Think of it as a fork in the road: Java always takes exactly one path.

---

## else-if Chains

When you have more than two possibilities, chain them with `else if`:

```java
int score = 85;

if (score >= 90) {
    System.out.println("Excellent!");
} else if (score >= 80) {
    System.out.println("Great job!");
} else if (score >= 70) {
    System.out.println("Not bad.");
} else {
    System.out.println("Keep trying.");
}
// Output: Great job!
```

Java checks each condition **in order** and runs the **first** one that is true. Once a match is found, it skips all remaining `else if` and `else` blocks. This means the order matters: always put the most specific (or highest threshold) conditions first.

---

## Nested if Statements

You can put an `if` inside another `if`:

```java
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Welcome in!");
    } else {
        System.out.println("You need an ID.");
    }
} else {
    System.out.println("You must be 18 or older.");
}
```

Nesting works, but don't go too deep — more than 2-3 levels becomes hard to read. Often you can simplify with `&&`:

```java
if (age >= 18 && hasID) {
    System.out.println("Welcome in!");
}
```

---

## The switch Statement

When you're comparing one variable against many specific values, a `switch` can be cleaner than a long `else if` chain:

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
        break;
}
// Output: Wednesday
```

Key points:
- Each `case` must end with `break;` — otherwise Java "falls through" to the next case
- The `default` case handles any value not explicitly listed
- `switch` works with `int`, `char`, `String`, and a few other types

---

## Common Mistakes

### Mistake 1: Using `=` instead of `==`

```java
int x = 5;
// WRONG: This assigns 10 to x, not a comparison
// if (x = 10) { ... }  // Won't compile for int

// RIGHT: Use == for comparison
if (x == 10) { ... }
```

### Mistake 2: The "dangling else"

```java
// Which if does this else belong to?
if (x > 0)
    if (x > 100)
        System.out.println("Big");
else
    System.out.println("Not positive?");  // WRONG — this goes with the inner if!
```

Always use braces `{}` to make your intent clear:

```java
if (x > 0) {
    if (x > 100) {
        System.out.println("Big");
    }
} else {
    System.out.println("Not positive.");
}
```

### Mistake 3: Unnecessary comparisons with true/false

```java
// Unnecessary:
if (isReady == true) { ... }
// Better:
if (isReady) { ... }

// Unnecessary:
if (isReady == false) { ... }
// Better:
if (!isReady) { ... }
```

### Mistake 4: Forgetting break in switch

```java
switch (day) {
    case 1:
        System.out.println("Monday");
        // Missing break! Falls through to case 2
    case 2:
        System.out.println("Tuesday");
        break;
}
// If day is 1, this prints BOTH "Monday" AND "Tuesday"
```

---

## Returning from Conditions

When writing methods, you can `return` directly from an `if`:

```java
public static String classify(int n) {
    if (n > 0) {
        return "positive";
    } else if (n < 0) {
        return "negative";
    } else {
        return "zero";
    }
}
```

Since `return` exits the method immediately, you can also write this without `else`:

```java
public static String classify(int n) {
    if (n > 0) return "positive";
    if (n < 0) return "negative";
    return "zero";
}
```

Both styles are valid. Use whichever feels clearer to you.

---

## Quick Summary

- `if (condition) { ... }` runs code only when the condition is true
- `else { ... }` handles the false case
- `else if` chains handle multiple possibilities in order
- `switch` is handy when comparing one value against many options
- Always use braces `{}` to avoid ambiguity
- Common traps: `=` vs `==`, forgetting `break`, dangling else

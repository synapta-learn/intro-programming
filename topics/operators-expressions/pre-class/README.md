# Operators and Expressions — Doing Math in Java

## Arithmetic Operators

Java can do math. Here are the five arithmetic operators:

| Operator | Meaning | Example | Result |
|---|---|---|---|
| `+` | Addition | `3 + 4` | `7` |
| `-` | Subtraction | `10 - 3` | `7` |
| `*` | Multiplication | `5 * 6` | `30` |
| `/` | Division | `15 / 4` | `3` (see below!) |
| `%` | Modulo (remainder) | `15 % 4` | `3` |

These work on both `int` and `double` values. But there is one critical difference in how division works.

## Integer Division — The Biggest Beginner Trap

When you divide two `int` values, Java gives you an `int` result. It does not round — it **truncates** (throws away the decimal part):

```java
int result = 7 / 2;  // result is 3, not 3.5
```

This surprises almost everyone the first time. Java does not round to 4. It does not give you 3.5. It just chops off the `.5` and gives you `3`.

More examples:

```java
System.out.println(10 / 3);   // 3  (not 3.333...)
System.out.println(1 / 2);    // 0  (not 0.5)
System.out.println(99 / 100); // 0  (not 0.99)
```

### Double Division — Getting the Decimal

If *either* operand is a `double`, Java performs double division and keeps the decimal:

```java
System.out.println(7.0 / 2);    // 3.5
System.out.println(7 / 2.0);    // 3.5
System.out.println(7.0 / 2.0);  // 3.5
```

It only takes one `double` to switch the behavior.

## The Modulo Operator (%)

The modulo operator gives you the **remainder** after division:

```java
System.out.println(10 % 3);  // 1  (10 / 3 = 3 remainder 1)
System.out.println(15 % 5);  // 0  (15 / 5 = 3 remainder 0)
System.out.println(7 % 2);   // 1  (7 / 2 = 3 remainder 1)
```

### Why Modulo Is Useful

**Checking even/odd:**
```java
if (number % 2 == 0) {
    // number is even
} else {
    // number is odd
}
```

**Extracting digits:**
```java
int lastDigit = 1234 % 10;  // 4
```

**Wrapping around (like a clock):**
```java
int hour = 25 % 24;  // 1 (25 hours = 1 hour past midnight)
```

## Operator Precedence

Java follows the same order of operations you learned in math class:

1. Parentheses `()` — evaluated first
2. Multiplication `*`, Division `/`, Modulo `%` — left to right
3. Addition `+`, Subtraction `-` — left to right

```java
int a = 2 + 3 * 4;      // 14  (not 20 — multiplication first)
int b = (2 + 3) * 4;    // 20  (parentheses force addition first)
int c = 10 - 4 / 2;     // 8   (division first: 4/2=2, then 10-2=8)
int d = 10 / 2 + 3 * 4; // 17  (10/2=5, 3*4=12, then 5+12=17)
```

**When in doubt, use parentheses.** They make your code clearer and prevent mistakes:

```java
// Clear intent — no guessing about precedence
int average = (score1 + score2 + score3) / 3;
```

## Type Casting

Sometimes you need to convert between types. This is called **casting**.

### Widening (automatic) — int to double

Java automatically converts `int` to `double` because no information is lost:

```java
int count = 5;
double result = count;  // result is 5.0 — automatic
```

### Narrowing (manual) — double to int

Converting `double` to `int` loses the decimal part, so Java requires you to be explicit:

```java
double price = 9.99;
int rounded = (int) price;  // rounded is 9 — decimal chopped off
```

The `(int)` before the value is the **cast operator**. It tells Java: "I know I'm losing the decimal part, and that's fine."

### Casting to Fix Integer Division

A common pattern: you have two `int` values but want a `double` result:

```java
int correct = 17;
int total = 20;

// WRONG — integer division gives 0
double percentage = correct / total;

// RIGHT — cast one operand to double
double percentage = (double) correct / total;  // 0.85
```

Casting `correct` to `double` makes it `17.0`, and `17.0 / 20` gives `0.85`.

## Compound Assignment Operators

These are shortcuts for updating a variable:

| Shortcut | Equivalent to |
|---|---|
| `x += 5` | `x = x + 5` |
| `x -= 3` | `x = x - 3` |
| `x *= 2` | `x = x * 2` |
| `x /= 4` | `x = x / 4` |
| `x %= 3` | `x = x % 3` |

Example:
```java
int score = 100;
score += 10;  // score is now 110
score -= 5;   // score is now 105
score *= 2;   // score is now 210
```

These are convenient and widely used. They do exactly the same thing as the long form.

## Increment and Decrement

The `++` and `--` operators add or subtract 1:

```java
int count = 10;
count++;  // count is now 11 (same as count = count + 1)
count--;  // count is now 10 (same as count = count - 1)
```

You will see `++` constantly in loops (coming soon). For now, just know it exists.

## Putting It Together — Expressions

An **expression** is any combination of values, variables, and operators that produces a result:

```java
int total = price * quantity + tax;
double average = (double)(a + b + c) / 3;
int lastDigit = number % 10;
boolean isEven = number % 2 == 0;
```

Java evaluates the expression according to precedence rules and produces a single value.

## Common Mistakes

| Mistake | Example | What goes wrong |
|---|---|---|
| Integer division surprise | `1 / 2` gives `0` | Need to use `1.0 / 2` or cast |
| Precedence mistake | `2 + 3 * 4` gives `14`, not `20` | Use parentheses |
| Division by zero | `x / 0` | Runtime crash (ArithmeticException) |
| Forgetting to cast | `(double)(a / b)` — too late! | Cast *before* dividing: `(double)a / b` |

## Summary

- Five arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Integer division truncates: `7 / 2` is `3`, not `3.5`
- Modulo gives the remainder: `7 % 2` is `1`
- Parentheses override precedence
- Cast with `(double)` or `(int)` to convert between types
- Compound operators (`+=`, `-=`, etc.) are shortcuts
- `++` and `--` add or subtract 1

The exercises will test all of these concepts. Pay special attention to integer division and modulo — they come up everywhere in programming.

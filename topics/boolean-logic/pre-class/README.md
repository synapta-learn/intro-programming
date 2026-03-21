# Boolean Logic — Pre-Class Reading

## What is a Boolean?

Every decision your program makes boils down to a single question: **true or false?**

In Java, the type `boolean` holds exactly one of two values: `true` or `false`. That's it — no maybes, no sometimes. Just yes or no.

```java
boolean isRaining = true;
boolean isSunny = false;
```

These tiny true/false values are the engine behind every decision your program will ever make.

---

## Comparison Operators

You already know how to compare numbers in math. Java gives you six comparison operators that each produce a `boolean` result:

| Operator | Meaning                  | Example      | Result  |
|----------|--------------------------|--------------|---------|
| `==`     | equal to                 | `5 == 5`     | `true`  |
| `!=`     | not equal to             | `5 != 3`     | `true`  |
| `<`      | less than                | `3 < 5`      | `true`  |
| `>`      | greater than             | `3 > 5`      | `false` |
| `<=`     | less than or equal to    | `5 <= 5`     | `true`  |
| `>=`     | greater than or equal to | `3 >= 5`     | `false` |

Here's how you use them in code:

```java
int age = 20;
boolean isAdult = age >= 18;    // true
boolean isTeenager = age < 20;  // false
boolean isExactly20 = age == 20; // true
```

**Common mistake:** Writing `=` when you mean `==`. Remember: one `=` *assigns* a value, two `==` *compares* values.

```java
int x = 5;      // assigns 5 to x
boolean b = x == 5;  // compares x to 5, result is true
```

---

## Logical Operators

What if you need to combine conditions? Java provides three logical operators:

### AND (`&&`) — Both must be true

```java
boolean hasTicket = true;
boolean hasID = true;
boolean canEnter = hasTicket && hasID;  // true — both are true

hasID = false;
canEnter = hasTicket && hasID;  // false — one is false
```

Think of `&&` as "both": you need a ticket **and** an ID to enter.

### OR (`||`) — At least one must be true

```java
boolean hasCard = false;
boolean hasCash = true;
boolean canPay = hasCard || hasCash;  // true — at least one is true

hasCash = false;
canPay = hasCard || hasCash;  // false — neither is true
```

Think of `||` as "either": you can pay with a card **or** cash.

### NOT (`!`) — Flips true to false and vice versa

```java
boolean isOpen = true;
boolean isClosed = !isOpen;  // false

boolean isEmpty = false;
boolean hasItems = !isEmpty;  // true
```

---

## Truth Tables

A truth table shows every possible combination of inputs and the resulting output. These are worth memorizing:

### AND (`&&`)

| A       | B       | A && B  |
|---------|---------|---------|
| `true`  | `true`  | `true`  |
| `true`  | `false` | `false` |
| `false` | `true`  | `false` |
| `false` | `false` | `false` |

**Key insight:** AND is only true when *both* inputs are true.

### OR (`||`)

| A       | B       | A \|\| B |
|---------|---------|----------|
| `true`  | `true`  | `true`   |
| `true`  | `false` | `true`   |
| `false` | `true`  | `true`   |
| `false` | `false` | `false`  |

**Key insight:** OR is only false when *both* inputs are false.

### NOT (`!`)

| A       | !A      |
|---------|---------|
| `true`  | `false` |
| `false` | `true`  |

---

## Short-Circuit Evaluation

Java is lazy in a smart way. When evaluating `&&` and `||`, it stops as soon as the answer is known:

- **`&&` (AND):** If the left side is `false`, Java doesn't even look at the right side. Why? Because `false && anything` is always `false`.
- **`||` (OR):** If the left side is `true`, Java skips the right side. Because `true || anything` is always `true`.

This matters when the right side has a side effect or could cause an error:

```java
int x = 0;
// Without short-circuit, the division would crash!
boolean safe = (x != 0) && (10 / x > 2);  // false, and no crash
```

Since `x != 0` is `false`, Java never attempts `10 / x`, avoiding a division-by-zero error.

---

## Combining Conditions

Real programs often need to check multiple things at once. You can chain operators together:

```java
int temperature = 22;
boolean isComfortable = temperature >= 18 && temperature <= 26;  // true
```

```java
int score = 85;
boolean isB = score >= 80 && score < 90;  // true — it's a B grade
```

```java
char ch = 'A';
boolean isUppercase = ch >= 'A' && ch <= 'Z';  // true
```

When things get complex, use parentheses to make your intent clear:

```java
int age = 25;
boolean hasLicense = true;
boolean hasInsurance = true;

boolean canDrive = (age >= 16) && (hasLicense && hasInsurance);
```

---

## Operator Precedence

When you mix comparison and logical operators, Java follows this order (highest to lowest):

1. `!` (NOT)
2. `<`, `<=`, `>`, `>=` (comparisons)
3. `==`, `!=` (equality)
4. `&&` (AND)
5. `||` (OR)

So `a || b && c` means `a || (b && c)`, not `(a || b) && c`. When in doubt, add parentheses — your future self will thank you.

---

## Quick Summary

- `boolean` holds `true` or `false`
- Six comparison operators: `==`, `!=`, `<`, `>`, `<=`, `>=`
- Three logical operators: `&&` (AND), `||` (OR), `!` (NOT)
- Java short-circuits: it stops evaluating as soon as the result is determined
- Use parentheses to make complex conditions readable

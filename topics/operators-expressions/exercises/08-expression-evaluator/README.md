# Exercise: Expression Evaluator

## Goal

Each method asks you to compute a value that tests your understanding of operator precedence, integer division, and type casting. Read the expression carefully and return the correct result.

## Method Signatures

```java
public static int expression1()
public static int expression2()
public static double expression3()
public static int expression4()
public static double expression5()
```

## What Each Method Should Return

### expression1
Evaluate: `2 + 3 * 4 - 1`

Think carefully about precedence. Multiplication happens before addition and subtraction.

### expression2
Evaluate: `(2 + 3) * (4 - 1)`

Same numbers, but parentheses change the order.

### expression3
Evaluate the **double** result of: `7 / 2 + 3.0`

Watch out: `7 / 2` is integer division (it happens before adding 3.0).

### expression4
Evaluate: `17 % 5 + 10 / 3`

Both `%` and `/` happen before `+`.

### expression5
Evaluate the **double** result of: `(double)(10 + 3) / 4`

The cast applies to the parenthesized sum, then divides by 4.

## Instructions

1. Open `Solution.java`
2. Work out each expression on paper first
3. Return the correct value from each method
4. Do NOT just type the expression into Java and return it — compute it yourself to test your understanding

## Hints

- Precedence: `*`, `/`, `%` happen before `+`, `-`
- Parentheses override precedence
- Integer division: `7 / 2` is `3`, not `3.5`
- Casting: `(double)` converts the value it is applied to

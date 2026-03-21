# Exercise: Integer Division

## Goal

Implement two methods that demonstrate the difference between integer division and double division.

## Method Signatures

```java
public static int intDivide(int a, int b)
public static double doubleDivide(int a, int b)
```

## Expected Behavior

```
intDivide(7, 2)       → 3       (integer division, decimal discarded)
doubleDivide(7, 2)    → 3.5     (double division, decimal kept)

intDivide(1, 3)       → 0
doubleDivide(1, 3)    → 0.3333333333333333

intDivide(10, 5)      → 2
doubleDivide(10, 5)   → 2.0
```

## Instructions

1. Open `Solution.java`
2. `intDivide` should perform normal integer division using `/`
3. `doubleDivide` should cast one operand to `double` before dividing to get a decimal result

## Key Concept

Both methods receive `int` parameters. The difference is how they divide:

```java
// Integer division — truncates
int result = a / b;

// Double division — cast first, then divide
double result = (double) a / b;
```

## Hints

- For `doubleDivide`, cast `a` to `double` before dividing: `(double) a / b`
- Do NOT cast the result after dividing — that is too late. The integer division already happened.

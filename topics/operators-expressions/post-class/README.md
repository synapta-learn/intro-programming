# Operators and Expressions — Post-Class Summary

## What You Learned

- The five arithmetic operators: `+`, `-`, `*`, `/`, `%`
- Integer division truncates the decimal part (`7 / 2` is `3`)
- The modulo operator `%` gives the remainder
- Operator precedence follows standard math rules (use parentheses when in doubt)
- Type casting converts between `int` and `double`
- Compound assignment (`+=`, `-=`, etc.) and increment/decrement (`++`, `--`)

## Common Mistakes to Watch For

**Integer division when you wanted decimals.** This is the single most common beginner mistake in Java math. If you need a decimal result, make sure at least one operand is a `double`:
```java
// WRONG
double half = 1 / 2;          // half is 0.0 (int division happened first)

// RIGHT
double half = 1.0 / 2;        // half is 0.5
double half = (double) 1 / 2; // half is 0.5
```

**Casting too late.** The cast must happen *before* the division, not after:
```java
int a = 7, b = 2;

// WRONG — integer division already happened
double bad = (double)(a / b);   // 3.0

// RIGHT — casting a to double forces double division
double good = (double) a / b;   // 3.5
```

**Modulo with negative numbers.** In Java, the result of `%` has the same sign as the dividend (left operand):
```java
System.out.println(7 % 3);    //  1
System.out.println(-7 % 3);   // -1
System.out.println(7 % -3);   //  1
```
This rarely matters for beginners, but if you see unexpected negative remainders, now you know why.

**Division by zero.** Dividing an `int` by zero crashes your program:
```java
int x = 10 / 0;  // ArithmeticException — program crashes
```
Dividing a `double` by zero gives `Infinity` or `NaN` instead of crashing — another reason types matter.

## Tips for Success

1. **Use parentheses freely.** Even if you remember the precedence rules, parentheses make your code easier to read. `(a + b) * c` is clearer than `a + b * c`.
2. **Think about edge cases.** What happens when the input is 0? What about negative numbers? Integer boundaries?
3. **Test with small numbers.** Before using a formula, verify it with numbers you can check in your head.

## Looking Ahead

Next up: **Conditional Logic** with `if`, `else`, and comparison operators. You will learn how to make your programs make decisions — different code runs depending on the values of your variables. The modulo operator you just learned will be immediately useful for checking even/odd!

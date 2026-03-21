# Exercise: Compound Interest

## Goal

Calculate the final amount after compound interest is applied.

## The Formula

**A = P * (1 + r/n)^(n*t)**

Where:
- **P** = principal (initial amount of money)
- **r** = annual interest rate (as a decimal, e.g., 0.05 for 5%)
- **n** = number of times interest is compounded per year
- **t** = number of years
- **A** = the final amount

## Method Signature

```java
public static double compoundInterest(double principal, double rate, int timesPerYear, int years)
```

## Expected Behavior

```
compoundInterest(1000.0, 0.05, 12, 10)  → 1647.01 (approximately)
compoundInterest(5000.0, 0.08, 4, 5)    → 7429.74 (approximately)
compoundInterest(1000.0, 0.10, 1, 1)    → 1100.00
```

## Instructions

1. Open `Solution.java`
2. Implement the compound interest formula
3. Use `Math.pow(base, exponent)` to compute the power

## New Tool: Math.pow()

`Math.pow(base, exponent)` raises `base` to the power of `exponent`:

```java
Math.pow(2, 3)    // 8.0  (2^3)
Math.pow(10, 2)   // 100.0 (10^2)
Math.pow(1.05, 3) // 1.157625 (1.05^3)
```

## Hints

- Break the formula into parts:
  1. Calculate `rate / timesPerYear`
  2. Add 1: `1 + rate / timesPerYear`
  3. Calculate the exponent: `timesPerYear * years`
  4. Use `Math.pow()` to raise the base to the exponent
  5. Multiply by the principal
- Make sure `timesPerYear` is used as a `double` in the division (Java will auto-convert since `rate` is already a double)

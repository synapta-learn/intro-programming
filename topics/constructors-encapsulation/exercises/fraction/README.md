# Fraction

## Problem

Create a `Solution` class that represents a fraction (numerator/denominator). The fraction must always be stored in its simplest form. It should have:

- A constructor `Solution(int numerator, int denominator)` — stores the fraction in simplified form. Throws `IllegalArgumentException` if denominator is 0. Negative fractions should have the negative sign on the numerator only.
- `getNumerator()` — returns the numerator (after simplification)
- `getDenominator()` — returns the denominator (always positive after simplification)
- `add(Solution other)` — returns a **new** `Solution` representing the sum of the two fractions
- `multiply(Solution other)` — returns a **new** `Solution` representing the product
- `toString()` — returns the fraction as `"numerator/denominator"` (e.g., `"1/2"`)

## Examples

```java
Solution half = new Solution(1, 2);
Solution third = new Solution(1, 3);

Solution sum = half.add(third);
sum.toString();      // "5/6"

Solution product = half.multiply(third);
product.toString();  // "1/6"

Solution reduced = new Solution(4, 8);
reduced.toString();  // "1/2"

new Solution(1, 0);  // throws IllegalArgumentException
```

## Hints

- To simplify a fraction, divide both numerator and denominator by their GCD (Greatest Common Divisor)
- GCD can be computed with the Euclidean algorithm:
  ```java
  int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
  ```
- Use `Math.abs()` when computing GCD to handle negatives
- Addition: `a/b + c/d = (a*d + c*b) / (b*d)` — then simplify
- Multiplication: `a/b * c/d = (a*c) / (b*d)` — then simplify
- Handle negative denominators in the constructor: if denominator is negative, negate both numerator and denominator

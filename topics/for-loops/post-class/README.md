# For Loops — Post-Class Review

## What You Learned

In this topic you practiced the core for-loop patterns:

- **Simple counting** — iterating from a start value to an end value
- **Accumulation** — building up a sum, product, or string across iterations
- **Nested loops** — using one loop inside another to work with 2D patterns
- **Searching and checking** — testing numbers for properties like primality

## Key Takeaways

**Choose the right loop bounds.** The difference between `i < n` and `i <= n` is just one iteration, but it can completely change the correctness of your program. When in doubt, trace through the first and last iterations by hand.

**Initialize your accumulator before the loop.** Whether it is `int sum = 0`, `int product = 1`, or `String result = ""`, the starting value matters. A product that starts at 0 will always be 0. A sum that starts at 1 will always be off by one.

**Nested loops multiply.** If your outer loop runs `n` times and your inner loop runs `m` times, the body of the inner loop runs `n * m` times total. For a 10x10 multiplication table, that is 100 iterations — manageable. But if both loops go up to 1,000,000, you are looking at a trillion operations.

## Common Patterns to Remember

**Factorial:**
```java
int product = 1;
for (int i = 1; i <= n; i++) {
    product *= i;
}
```

**Divisor checking:**
```java
for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        // i is a divisor of n
    }
}
```

**Building string output row by row:**
```java
String result = "";
for (int row = 1; row <= n; row++) {
    // build this row
    result += rowContent + "\n";
}
```

## What Comes Next

Now that you can iterate with loops, you are ready for **arrays** — a way to store and work with collections of values. Loops and arrays are natural partners: you will use for loops to walk through arrays, search them, sort them, and transform them.

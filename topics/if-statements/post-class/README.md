# Making Decisions with If-Statements — Post-Class Review

## What We Covered

Today you learned how to make your programs take different paths based on conditions:

- **`if`** — Execute code only when a condition is true
- **`else`** — Provide an alternative when the condition is false
- **`else if`** — Chain multiple conditions together
- **`switch`** — Match a single value against many options
- **Nested conditions** — Put decisions inside other decisions

## Key Patterns

### Guard clauses
Handle edge cases early, then write the main logic:
```java
public static double divide(int a, int b) {
    if (b == 0) {
        return 0;  // handle the special case first
    }
    return (double) a / b;
}
```

### Classifying into ranges
Use else-if chains with conditions ordered from highest to lowest:
```java
if (score >= 90) return "A";
else if (score >= 80) return "B";
else if (score >= 70) return "C";
else return "F";
```

### Mapping discrete values
Use switch for clean one-to-one mappings:
```java
switch (month) {
    case 1: return "January";
    case 2: return "February";
    // ...
}
```

## Common Mistakes to Avoid

1. **Overlapping conditions** — Check else-if order carefully
2. **Missing break in switch** — Each case needs its own `break`
3. **Using `=` instead of `==`** — Assignment vs. comparison
4. **Overly deep nesting** — If you're nested 3+ levels, consider refactoring

## What's Next

You can now make decisions, but your programs still run each decision only once. Next up: **while loops** — making your programs repeat actions.

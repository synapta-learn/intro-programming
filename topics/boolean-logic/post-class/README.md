# Boolean Logic — Post-Class Review

## What We Covered

Today you learned how to make your programs reason about the world using boolean logic:

- **Comparison operators** (`==`, `!=`, `<`, `>`, `<=`, `>=`) turn values into `true`/`false`
- **Logical operators** (`&&`, `||`, `!`) combine boolean values
- **Short-circuit evaluation** makes Java skip unnecessary work
- **Truth tables** describe every possible outcome of a logical operation

## Key Patterns to Remember

### Range Checking
```java
// Is x between 10 and 20 (inclusive)?
boolean inRange = x >= 10 && x <= 20;
```

### Multiple Conditions
```java
// Can this person vote?
boolean canVote = age >= 18 && isCitizen;
```

### Negation
```java
// Instead of !(a && b), consider: !a || !b  (De Morgan's Law)
boolean notBothTrue = !a || !b;
```

## Common Mistakes to Avoid

1. **Using `=` instead of `==`** — Assignment vs. comparison
2. **Forgetting operator precedence** — When in doubt, use parentheses
3. **Writing `== true` or `== false`** — Just use the variable directly:
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

## De Morgan's Laws

These let you simplify boolean expressions. They will come up again and again:

- `!(A && B)` is the same as `!A || !B`
- `!(A || B)` is the same as `!A && !B`

## What's Next

Now that you can evaluate conditions, you're ready to make your programs *do different things* based on those conditions. Next up: **if-statements**.

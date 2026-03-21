# While Loops — Post-Class Review

## What We Covered

Today you learned how to make your programs repeat actions:

- **`while` loops** check the condition first, then execute the body
- **`do-while` loops** execute the body first, then check the condition
- **`break`** exits a loop immediately
- **`continue`** skips to the next iteration
- Common patterns: counting, accumulating, digit processing

## Key Patterns

### Counting down
```java
while (n > 0) {
    // use n
    n--;
}
```

### Summing / accumulating
```java
int sum = 0;
while (i <= n) {
    sum += i;
    i++;
}
```

### Processing digits
```java
while (n > 0) {
    int digit = n % 10;  // last digit
    n /= 10;             // remove last digit
}
```

### Searching for a condition
```java
while (!found) {
    // check something
    // set found = true when condition is met
}
```

## Common Mistakes to Avoid

1. **Infinite loops** — Forgetting to update the loop variable
2. **Off-by-one errors** — Using `<` when you mean `<=`, or vice versa
3. **Wrong initialization** — Starting your counter or accumulator at the wrong value
4. **Modifying the loop variable incorrectly** — Make sure you're moving toward the exit condition

## Debugging Loops

When a loop isn't working right:
1. **Trace through it by hand** for a small input (2 or 3 iterations)
2. **Check the first iteration** — Is the initial value correct?
3. **Check the last iteration** — Does it stop at the right time?
4. **Add print statements** to see variable values at each step

## What's Next

Now you can repeat actions, but you're still working with single values. Coming up: **for loops** and then **arrays** — where you'll work with collections of data.

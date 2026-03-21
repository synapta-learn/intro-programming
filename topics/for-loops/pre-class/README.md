# For Loops — Counted Iteration

## When You Know How Many Times

In the previous topic you learned about `while` loops. A `while` loop is great when you do not know in advance how many times you need to repeat something. But very often, you *do* know — you want to count from 1 to 10, or process each character in a string, or repeat something exactly 5 times.

For these situations, Java has the **for loop**.

## The For Loop Syntax

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Step " + i);
}
```

Output:
```
Step 0
Step 1
Step 2
Step 3
Step 4
```

A for loop packs three things into one line, separated by semicolons:

```
for (initialization; condition; update) {
    body
}
```

| Part | What it does | Example |
|---|---|---|
| **Initialization** | Runs once before the loop starts | `int i = 0` |
| **Condition** | Checked before each iteration — loop continues while `true` | `i < 5` |
| **Update** | Runs after each iteration | `i++` |

The execution order is:
1. Run the initialization
2. Check the condition — if `false`, stop
3. Run the body
4. Run the update
5. Go back to step 2

## For Loop vs While Loop

Any for loop can be rewritten as a while loop, and vice versa. They are two ways of expressing the same idea.

**For loop:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

**Equivalent while loop:**
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

Both print the numbers 1 through 5. The for loop is more compact because it keeps the initialization, condition, and update together in one place. Use a for loop when you have a clear start, end, and step. Use a while loop when the number of iterations is unpredictable.

## Counting Patterns

**Counting up from 1:**
```java
for (int i = 1; i <= 10; i++) {
    System.out.print(i + " ");
}
// Output: 1 2 3 4 5 6 7 8 9 10
```

**Counting down:**
```java
for (int i = 5; i >= 1; i--) {
    System.out.print(i + " ");
}
// Output: 5 4 3 2 1
```

**Counting by twos:**
```java
for (int i = 0; i <= 10; i += 2) {
    System.out.print(i + " ");
}
// Output: 0 2 4 6 8 10
```

The loop variable does not have to be called `i`. Use a descriptive name when it makes the code clearer — `row`, `col`, `attempt`, etc. But `i` is a very common convention for simple counting loops.

## Accumulation Pattern

One of the most important loop patterns is **accumulation** — building up a result as you go.

**Summing numbers:**
```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;
}
System.out.println("Sum: " + sum);
// Output: Sum: 5050
```

**Building a string:**
```java
String result = "";
for (int i = 1; i <= 5; i++) {
    result += i + " ";
}
System.out.println(result.trim());
// Output: 1 2 3 4 5
```

The pattern is always the same:
1. Create a variable *before* the loop to hold the accumulated result
2. Update that variable inside the loop
3. Use the result *after* the loop

## Counting Pattern

A close relative of accumulation is **counting** — how many items match a condition?

```java
int count = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        count++;
    }
}
System.out.println("Multiples of 7: " + count);
// Output: Multiples of 7: 14
```

## Searching Pattern

Sometimes you want to find out whether *any* value in a range satisfies a condition:

```java
boolean found = false;
for (int i = 2; i < 20; i++) {
    if (i * i == 49) {
        found = true;
        break;
    }
}
System.out.println("Found: " + found);
// Output: Found: true
```

The `break` statement exits the loop immediately. Once you have found what you are looking for, there is no reason to keep going.

## Nested Loops

You can put a loop inside another loop. The inner loop runs completely for each iteration of the outer loop.

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

Output:
```
* * * *
* * * *
* * * *
```

This prints a grid with 3 rows and 4 columns. For each value of `row`, the inner loop runs 4 times (once for each `col`), then `println()` moves to the next line.

**Multiplication table (partial):**
```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print(row * col + "\t");
    }
    System.out.println();
}
```

Output:
```
1	2	3
2	4	6
3	6	9
```

**Triangle pattern:**
```java
for (int row = 1; row <= 4; row++) {
    for (int col = 1; col <= row; col++) {
        System.out.print("*");
    }
    System.out.println();
}
```

Output:
```
*
**
***
****
```

Notice that the inner loop's limit (`col <= row`) depends on the outer loop variable. This is what creates the growing pattern.

## Break and Continue

You already saw `break` — it exits the loop entirely. Java also has `continue`, which skips the rest of the current iteration and jumps to the next one.

```java
for (int i = 1; i <= 10; i++) {
    if (i % 3 == 0) {
        continue; // skip multiples of 3
    }
    System.out.print(i + " ");
}
// Output: 1 2 4 5 7 8 10
```

Use `break` and `continue` sparingly. They can make loops harder to follow if overused.

## Common Mistakes

| Mistake | What happens |
|---|---|
| Off-by-one error: `i < 5` vs `i <= 5` | Loop runs one time too few or too many |
| Forgetting the update (`i++`) | Infinite loop |
| Modifying the loop variable inside the body | Confusing behavior — avoid this |
| Semicolon right after the for line: `for (...);` | The loop body becomes empty; the block below runs once |

That last one is a sneaky bug:

```java
for (int i = 0; i < 5; i++);  // <-- stray semicolon!
{
    System.out.println("This prints only once");
}
```

## Summary

- `for (init; condition; update)` is ideal when the number of iterations is known
- The **accumulation** pattern builds a result across iterations
- The **counting** pattern counts how many values meet a condition
- The **searching** pattern finds whether a value exists
- **Nested loops** let you work with two-dimensional patterns
- `break` exits the loop; `continue` skips to the next iteration
- Watch out for off-by-one errors — they are the most common loop bug

Time to practice. The exercises will take you from simple counting all the way to building patterns with nested loops.

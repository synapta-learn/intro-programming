# Loops

Loops are fundamental control structures that allow you to repeat a block of code multiple times.

## For Loops

A for-loop is used when you know in advance how many times you want to iterate:

```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```

The for-loop has three parts:
1. **Initialization** (`int i = 0`) — runs once at the start
2. **Condition** (`i < 10`) — checked before each iteration
3. **Update** (`i++`) — runs after each iteration

## While Loops

A while-loop is used when you want to repeat until a condition becomes false:

```java
int count = 0;
while (count < 10) {
    System.out.println(count);
    count++;
}
```

## When to Use Which?

- **For-loop**: when you know the number of iterations (counting, iterating arrays)
- **While-loop**: when the termination depends on a condition (reading input, searching)

## Common Pitfalls

- **Infinite loops**: forgetting to update the loop variable
- **Off-by-one errors**: using `<=` when you should use `<` (or vice versa)
- **Modifying collections while iterating**: this can cause unexpected behavior
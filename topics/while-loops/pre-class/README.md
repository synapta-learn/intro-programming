# While Loops — Pre-Class Reading

## Why Loops?

Imagine you need to print numbers from 1 to 1000. Would you write 1000 `println` statements? Of course not. Loops let you tell Java: "Keep doing this **while** a condition is true."

Loops are one of the most powerful ideas in programming. They let a 10-line program do the work of a million lines.

---

## The while Loop

The simplest loop in Java:

```java
while (condition) {
    // code to repeat
}
```

Java checks the condition **before** each iteration. If it's `true`, the body runs. If it's `false`, Java skips the body and moves on.

```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    count++;
}
```

Output:
```
1
2
3
4
5
```

Let's trace through it step by step:

| Iteration | count | count <= 5 | Action           |
|-----------|-------|------------|------------------|
| 1         | 1     | true       | print 1, count→2 |
| 2         | 2     | true       | print 2, count→3 |
| 3         | 3     | true       | print 3, count→4 |
| 4         | 4     | true       | print 4, count→5 |
| 5         | 5     | true       | print 5, count→6 |
| 6         | 6     | false      | stop             |

---

## The Loop Condition

The condition is checked **before** each iteration, including the first one. This means if the condition is already `false`, the loop body never runs:

```java
int x = 10;
while (x < 5) {
    System.out.println("This never prints");
    x++;
}
```

---

## Infinite Loops

If the condition never becomes `false`, the loop runs forever:

```java
// DON'T DO THIS — infinite loop!
while (true) {
    System.out.println("Help!");
}
```

The most common cause: forgetting to update the variable that the condition checks:

```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    // Oops! Forgot count++ — this prints 1 forever
}
```

Always make sure something in your loop body moves you closer to making the condition `false`.

---

## break and continue

### break — Exit the loop immediately

```java
int i = 1;
while (true) {
    if (i > 5) {
        break;  // exits the loop
    }
    System.out.println(i);
    i++;
}
// Output: 1 2 3 4 5
```

### continue — Skip to the next iteration

```java
int i = 0;
while (i < 10) {
    i++;
    if (i % 2 == 0) {
        continue;  // skip even numbers
    }
    System.out.println(i);
}
// Output: 1 3 5 7 9
```

Use `break` and `continue` sparingly. They can make loops harder to understand if overused.

---

## The do-while Loop

Sometimes you want the body to run **at least once**, even if the condition is false. The `do-while` loop checks the condition **after** each iteration:

```java
do {
    // code to repeat
} while (condition);
```

Example:

```java
int number = 1;
do {
    System.out.println(number);
    number *= 2;
} while (number <= 100);
// Output: 1 2 4 8 16 32 64
```

The key difference: a `do-while` always executes the body at least once.

---

## Common Loop Patterns

### The Counting Pattern

Count from a start value to an end value:

```java
int i = 1;
while (i <= n) {
    // do something with i
    i++;
}
```

### The Accumulator Pattern

Build up a result by adding to it each iteration:

```java
int sum = 0;
int i = 1;
while (i <= n) {
    sum += i;    // add i to the running total
    i++;
}
// sum now holds 1 + 2 + 3 + ... + n
```

### The Sentinel Pattern

Keep going until you hit a special "stop" value:

```java
int total = 0;
int value = getInput();
while (value != -1) {    // -1 is the sentinel
    total += value;
    value = getInput();
}
```

### The Digit Processing Pattern

Process digits of a number one at a time:

```java
int n = 12345;
while (n > 0) {
    int digit = n % 10;   // get the last digit
    // do something with digit
    n = n / 10;            // remove the last digit
}
```

This is a very useful pattern. `% 10` extracts the last digit, and `/ 10` removes it.

---

## Building Strings in a Loop

You can build up a string result piece by piece:

```java
String result = "";
int i = 1;
while (i <= 5) {
    if (!result.isEmpty()) {
        result += " ";    // add space before each number (except the first)
    }
    result += i;
    i++;
}
// result is "1 2 3 4 5"
```

---

## Quick Summary

- `while (condition) { ... }` repeats as long as the condition is true
- The condition is checked **before** each iteration
- `do { ... } while (condition);` runs at least once, checks **after**
- `break` exits the loop, `continue` skips to the next iteration
- Always ensure the loop condition will eventually become false
- Common patterns: counting, accumulating, sentinel values, digit processing

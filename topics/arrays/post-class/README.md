# Arrays — Post-Class Review

## What You Learned

In this topic you worked with arrays — Java's simplest data structure. You practiced:

- **Creating arrays** with initial values and with a specified size
- **Iterating** through arrays with for loops
- **Accumulation** patterns: sum, count, find min/max
- **Building new arrays** from existing ones
- **Checking properties** of arrays (sorted, contains duplicates)

## Key Takeaways

**Always start max/min from the first element.** If you initialize your `max` to `0` or `Integer.MIN_VALUE`, it works for many cases but creates subtle bugs. Starting from `array[0]` is correct for all inputs.

**Off-by-one errors are the main source of bugs.** When working with arrays, always double-check:
- Does the loop start at `0` or `1`?
- Does it end at `< length` or `<= length`?
- Am I accessing `array[i - 1]` when `i` might be `0`?

**Creating new arrays preserves the original.** Whenever the problem says "return a new array," create a fresh array with `new int[...]` and fill it. Do not modify the input array.

**Watch for empty arrays.** Many algorithms need special handling when the input array has zero elements. Always consider this case.

## Common Patterns to Remember

```java
// Standard iteration
for (int i = 0; i < array.length; i++) { ... }

// Comparing adjacent elements
for (int i = 0; i < array.length - 1; i++) {
    // array[i] and array[i + 1]
}

// Building a result array of known size
int[] result = new int[array.length];
for (int i = 0; i < array.length; i++) {
    result[i] = /* something based on array[i] */;
}

// Building a result array of unknown size
// Step 1: count how many elements you need
// Step 2: create array of that size
// Step 3: fill it in a second pass
```

## What Comes Next

Now that you can store data in arrays and process it with loops, the next step is **methods** — reusable blocks of code that you can call by name. Methods will let you organize your array-processing logic into clean, testable pieces.

# Arrays — Storing Multiple Values

## The Problem with Individual Variables

Imagine you need to store the grades of 30 students. With what you know so far, you would need 30 separate variables:

```java
int grade1 = 85;
int grade2 = 92;
int grade3 = 78;
// ... 27 more lines
```

This is painful to write, impossible to loop over, and breaks completely if the number of students changes. What you need is a single container that holds many values of the same type. That container is an **array**.

## What Is an Array?

An array is a fixed-size, ordered collection of values, all of the same type. You can think of it as a row of numbered boxes:

```
Index:   [0]   [1]   [2]   [3]   [4]
Values:  | 85 | 92 | 78 | 95 | 88 |
```

Each box has an **index** (its position) and a **value** (what is stored there). The first index is always **0**, not 1. This is called **zero-based indexing** and it is one of the most important things to remember.

## Declaring and Creating Arrays

There are several ways to create an array in Java.

**Declare and initialize with values:**
```java
int[] grades = {85, 92, 78, 95, 88};
```

This creates an array of 5 integers and fills it immediately.

**Declare and specify size (values default to 0):**
```java
int[] grades = new int[5];
```

This creates an array of 5 integers, all set to `0`. You fill in the values later.

**Declare and create on separate lines:**
```java
int[] grades;
grades = new int[]{85, 92, 78, 95, 88};
```

The type is always written as `type[]` — for example, `int[]`, `double[]`, `String[]`, `boolean[]`.

## Accessing Elements

Use square brackets with an index to read or write a specific element:

```java
int[] grades = {85, 92, 78, 95, 88};

System.out.println(grades[0]);  // 85 (first element)
System.out.println(grades[2]);  // 78 (third element)
System.out.println(grades[4]);  // 88 (last element)

grades[1] = 100;  // change the second element to 100
System.out.println(grades[1]);  // 100
```

**Warning:** If you try to access an index that does not exist, your program crashes with an `ArrayIndexOutOfBoundsException`:

```java
System.out.println(grades[5]);  // CRASH — valid indices are 0 to 4
```

## Array Length

Every array knows its own size. Use `.length` (no parentheses) to get it:

```java
int[] grades = {85, 92, 78, 95, 88};
System.out.println(grades.length);  // 5
```

The last valid index is always `length - 1`. This is a key relationship:

| Array size | Valid indices | Last index |
|------------|-------------|------------|
| 5 | 0, 1, 2, 3, 4 | 4 |
| 10 | 0, 1, 2, 3, ..., 9 | 9 |
| 1 | 0 | 0 |

## Iterating Over Arrays

The for loop is the natural partner of arrays. Use the loop variable as the index:

```java
int[] grades = {85, 92, 78, 95, 88};

for (int i = 0; i < grades.length; i++) {
    System.out.println("Student " + (i + 1) + ": " + grades[i]);
}
```

Output:
```
Student 1: 85
Student 2: 92
Student 3: 78
Student 4: 95
Student 5: 88
```

Notice the pattern: `for (int i = 0; i < array.length; i++)`. This is the standard way to walk through every element of an array. It starts at 0, goes up to (but not including) `length`, and accesses `array[i]` each time.

## Common Array Patterns

### Sum All Elements

```java
int[] numbers = {10, 20, 30, 40, 50};

int sum = 0;
for (int i = 0; i < numbers.length; i++) {
    sum += numbers[i];
}
System.out.println("Sum: " + sum);
// Output: Sum: 150
```

### Find the Maximum

```java
int[] numbers = {34, 12, 89, 56, 23};

int max = numbers[0];  // start with the first element
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
System.out.println("Max: " + max);
// Output: Max: 89
```

Starting with `numbers[0]` is important — if you start with `0`, your code breaks for arrays with all negative values.

### Search for a Value

```java
int[] numbers = {34, 12, 89, 56, 23};
int target = 89;

boolean found = false;
int position = -1;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == target) {
        found = true;
        position = i;
        break;
    }
}

if (found) {
    System.out.println("Found at index " + position);
} else {
    System.out.println("Not found");
}
// Output: Found at index 2
```

### Count Matches

```java
int[] numbers = {1, 2, 3, 2, 4, 2, 5};

int count = 0;
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == 2) {
        count++;
    }
}
System.out.println("2 appears " + count + " times");
// Output: 2 appears 3 times
```

## Arrays and Methods

You can pass arrays to methods and return arrays from methods:

```java
public static int sum(int[] numbers) {
    int total = 0;
    for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }
    return total;
}

public static void main(String[] args) {
    int[] data = {10, 20, 30};
    System.out.println(sum(data));  // 60
}
```

**Important:** When you pass an array to a method, you are not passing a copy. The method receives a reference to the *same* array. If the method modifies the array, the changes are visible to the caller:

```java
public static void doubleAll(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] *= 2;
    }
}

public static void main(String[] args) {
    int[] data = {1, 2, 3};
    doubleAll(data);
    System.out.println(data[0]);  // 2 — the original array was modified!
}
```

This is different from `int` and `double`, which are copied when passed. Arrays are **passed by reference** (technically, the reference is passed by value, but the practical effect is the same: the method can modify your array).

## Creating New Arrays from Old Ones

Sometimes you want to create a new array based on an existing one without modifying the original:

```java
public static int[] doubled(int[] original) {
    int[] result = new int[original.length];
    for (int i = 0; i < original.length; i++) {
        result[i] = original[i] * 2;
    }
    return result;
}
```

This pattern — create a new array, fill it, return it — is very common and keeps the original array safe.

## Common Mistakes

| Mistake | What happens |
|---|---|
| `array[array.length]` | Crash — last valid index is `length - 1` |
| Starting max/min at `0` instead of `array[0]` | Wrong result for negative-only arrays |
| Forgetting that arrays are 0-indexed | Off-by-one errors |
| Using `array.length()` with parentheses | Compile error — it is `array.length` (no parens) |
| Comparing arrays with `==` | Compares references, not contents |

## Summary

- Arrays store multiple values of the same type in a fixed-size container
- Indices start at **0** and go up to `length - 1`
- Use `.length` to get the size of an array
- Use a for loop with `i < array.length` to iterate
- Common patterns: sum, max/min, search, count
- Arrays are passed by reference — methods can modify the original
- Create new arrays when you want to avoid modifying the original

The exercises will give you practice with all of these patterns. Take your time — arrays are one of the most fundamental building blocks in programming.

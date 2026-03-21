# Exercise: Swap Values

## Goal

Implement a method that takes two integers and returns them in swapped order.

Since Java methods can only return one value, we will return the two values as a two-element array: `new int[]{b, a}`.

## Method Signature

```java
public static int[] swap(int a, int b)
```

Given `a = 3` and `b = 7`, return `{7, 3}`.

## Instructions

1. Open `Solution.java`
2. Inside the `swap` method, use a temporary variable to swap the values
3. Return the swapped values as an array

## The Trick

You cannot just write:
```java
a = b;
b = a;  // WRONG — a has already been overwritten!
```

You need a **temporary variable** to hold one value while you overwrite it:
```java
int temp = a;
a = b;
b = temp;
```

## Hints

- Create the temp variable *before* you start swapping
- Return `new int[]{a, b}` after the swap is done

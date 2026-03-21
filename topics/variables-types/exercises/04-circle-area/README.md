# Exercise: Circle Area

## Goal

Calculate the area of a circle given its radius.

The formula is: **area = pi * radius * radius**

Java provides the value of pi as `Math.PI`.

## Method Signature

```java
public static double circleArea(double radius)
```

## Instructions

1. Open `Solution.java`
2. Implement `circleArea` using the formula `Math.PI * radius * radius`
3. Return the result as a `double`

## Expected Behavior

```
circleArea(1.0)  → 3.141592653589793
circleArea(5.0)  → 78.53981633974483
circleArea(0.0)  → 0.0
```

## Hints

- `Math.PI` is a built-in constant — you don't need to define pi yourself
- In Java, `*` is the multiplication operator
- `radius * radius` gives you radius-squared (we haven't learned `Math.pow()` yet)

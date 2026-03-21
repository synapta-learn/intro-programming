# Exercise: BMI Calculator

## Goal

Calculate Body Mass Index (BMI) from a person's weight and height.

The formula is: **BMI = weight / (height * height)**

Where weight is in kilograms and height is in meters.

## Method Signature

```java
public static double calculateBMI(double weightKg, double heightM)
```

## Instructions

1. Open `Solution.java`
2. Implement `calculateBMI` using the formula above
3. Return the BMI as a `double`

## Expected Behavior

```
calculateBMI(70.0, 1.75)  → 22.857142857142858
calculateBMI(90.0, 1.80)  → 27.777777777777775
calculateBMI(55.0, 1.65)  → 20.202020202020204
```

## Hints

- Multiply height by itself to get height-squared
- Make sure you divide weight by the *squared* height, not just height
- Use parentheses to control order of operations: `weight / (height * height)`

# BMI Category

## Problem

Write a method that takes a BMI (Body Mass Index) value as a `double` and returns the corresponding category as a string:

| BMI Range          | Category       |
|--------------------|----------------|
| Below 18.5         | "Underweight"  |
| 18.5 to 24.9       | "Normal"       |
| 25.0 to 29.9       | "Overweight"   |
| 30.0 and above     | "Obese"        |

## Examples

```
bmiCategory(16.0) → "Underweight"
bmiCategory(22.5) → "Normal"
bmiCategory(27.3) → "Overweight"
bmiCategory(35.0) → "Obese"
bmiCategory(18.5) → "Normal"
bmiCategory(25.0) → "Overweight"
```

## Hint

Use an else-if chain, checking conditions from lowest to highest (or highest to lowest). Since these are `double` values, use `<` and `>=` rather than integer equality checks.

# Exercise: Temperature Conversion

## Goal

Convert temperatures between Fahrenheit and Celsius.

## Method Signatures

```java
public static double fahrenheitToCelsius(double fahrenheit)
public static double celsiusToFahrenheit(double celsius)
```

## Formulas

- Fahrenheit to Celsius: **C = (F - 32) * 5.0 / 9.0**
- Celsius to Fahrenheit: **F = C * 9.0 / 5.0 + 32**

## Expected Behavior

```
fahrenheitToCelsius(32.0)   → 0.0
fahrenheitToCelsius(212.0)  → 100.0
fahrenheitToCelsius(98.6)   → 37.0

celsiusToFahrenheit(0.0)    → 32.0
celsiusToFahrenheit(100.0)  → 212.0
celsiusToFahrenheit(37.0)   → 98.6
```

## Instructions

1. Open `Solution.java`
2. Implement both conversion methods using the formulas above
3. Use `double` arithmetic (5.0 and 9.0, not 5 and 9)

## Hints

- Using `5.0 / 9.0` ensures double division (keeping the decimal part)
- Using `5 / 9` would give `0` because of integer division — a common mistake!
- Use parentheses to match the formula exactly

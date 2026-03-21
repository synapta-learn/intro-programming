# Exercise: Temperature Message

## Goal

Implement a method that takes a temperature in Celsius (as a `double`) and returns a formatted message.

## Method Signature

```java
public static String formatTemperature(double celsius)
```

Given `celsius = 23.5`, return `"The temperature is 23.5 degrees Celsius."`.

## Instructions

1. Open `Solution.java`
2. Implement `formatTemperature` to build and return the message string
3. Use string concatenation (`+`) to combine the text and the number

## Expected Behavior

```
formatTemperature(23.5) → "The temperature is 23.5 degrees Celsius."
formatTemperature(0.0)  → "The temperature is 0.0 degrees Celsius."
formatTemperature(-15.0) → "The temperature is -15.0 degrees Celsius."
```

## Hints

- Use `+` to concatenate a String with a double: `"Value: " + celsius`
- Don't forget the period at the end of the sentence

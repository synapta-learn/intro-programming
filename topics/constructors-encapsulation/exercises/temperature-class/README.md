# Temperature Class

## Problem

Create a `Solution` class that represents a temperature. It should have:

- A **private** `double` field `celsius`
- A constructor `Solution(double celsius)` that sets the temperature. If the value is below **-273.15** (absolute zero), throw an `IllegalArgumentException`.
- `getCelsius()` — returns the temperature in Celsius
- `getFahrenheit()` — returns the temperature in Fahrenheit: `celsius * 9/5 + 32`
- `getKelvin()` — returns the temperature in Kelvin: `celsius + 273.15`

## Examples

```java
Solution boiling = new Solution(100.0);
boiling.getCelsius();     // 100.0
boiling.getFahrenheit();  // 212.0
boiling.getKelvin();      // 373.15

Solution freezing = new Solution(0.0);
freezing.getFahrenheit(); // 32.0

new Solution(-300.0);     // throws IllegalArgumentException
```

## Hints

- The field must be `private` — only the getter can expose it
- Check the value in the constructor before assigning it
- Conversion formulas: F = C * 9/5 + 32, K = C + 273.15
- Absolute zero is exactly -273.15 degrees Celsius

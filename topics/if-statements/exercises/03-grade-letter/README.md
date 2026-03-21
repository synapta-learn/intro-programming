# Grade Letter

## Problem

Write a method that converts a numeric score (0-100) to a letter grade:

| Score Range | Grade |
|-------------|-------|
| 90 - 100    | "A"   |
| 80 - 89     | "B"   |
| 70 - 79     | "C"   |
| 60 - 69     | "D"   |
| 0 - 59      | "F"   |

## Examples

```
gradeLetter(95) → "A"
gradeLetter(85) → "B"
gradeLetter(72) → "C"
gradeLetter(65) → "D"
gradeLetter(50) → "F"
gradeLetter(90) → "A"
gradeLetter(0)  → "F"
```

## Hint

Use an else-if chain. Start with the highest grade and work your way down. Remember that once Java finds a matching condition, it skips the rest.

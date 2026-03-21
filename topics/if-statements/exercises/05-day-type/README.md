# Day Type

## Problem

Write a method that takes a day number (1-7, where 1 = Monday and 7 = Sunday) and returns `"Weekday"` or `"Weekend"`.

Use a **switch statement** to solve this.

- Days 1-5 (Monday through Friday) are `"Weekday"`
- Days 6-7 (Saturday and Sunday) are `"Weekend"`
- Any other number should return `"Invalid"`

## Examples

```
dayType(1) → "Weekday"   (Monday)
dayType(5) → "Weekday"   (Friday)
dayType(6) → "Weekend"   (Saturday)
dayType(7) → "Weekend"   (Sunday)
dayType(0) → "Invalid"
```

## Hint

You can group multiple `case` labels together by letting them fall through (without a `break`):

```java
switch (value) {
    case 1:
    case 2:
    case 3:
        return "result";
}
```

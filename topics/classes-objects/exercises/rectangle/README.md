# Rectangle

## Problem

Create a `Solution` class that represents a rectangle. It should have:

- Fields `width` and `height` (both `double`), accessible for setting values
- `area()` — returns the area (width * height)
- `perimeter()` — returns the perimeter (2 * (width + height))
- `isSquare()` — returns `true` if width equals height

## Examples

```java
Solution rect = new Solution();
rect.width = 5.0;
rect.height = 3.0;
rect.area();       // 15.0
rect.perimeter();  // 16.0
rect.isSquare();   // false

Solution square = new Solution();
square.width = 4.0;
square.height = 4.0;
square.isSquare();  // true
```

## Hints

- Declare `width` and `height` as `double` fields
- `area()` and `perimeter()` are simple formulas using those fields
- For `isSquare()`, compare width and height with `==` (this works fine for exact doubles set by the user)

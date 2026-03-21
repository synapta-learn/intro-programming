# Shape Hierarchy

## Problem

Create an abstract `Shape` class with two concrete subclasses: `Circle` and `Rectangle`.

### Shape (abstract)
- Abstract method `area()` — returns `double`
- Abstract method `perimeter()` — returns `double`

### Circle
- Constructor: `Circle(double radius)`
- `getRadius()` — returns the radius
- Implements `area()`: pi * r^2
- Implements `perimeter()`: 2 * pi * r

### Rectangle
- Constructor: `Rectangle(double width, double height)`
- `getWidth()` — returns the width
- `getHeight()` — returns the height
- Implements `area()`: width * height
- Implements `perimeter()`: 2 * (width + height)

## Examples

```java
Circle c = new Circle(5);
c.area();       // 78.539... (25 * pi)
c.perimeter();  // 31.415... (10 * pi)

Rectangle r = new Rectangle(3, 4);
r.area();       // 12.0
r.perimeter();  // 14.0
```

## Hints

- Use `Math.PI` for pi
- Remember to use `@Override` on the implemented methods
- The `Shape` class and its methods should be `abstract`

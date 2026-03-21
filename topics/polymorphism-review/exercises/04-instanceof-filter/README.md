# Instanceof Filter

## Problem

Work with a mixed collection of shapes and use `instanceof` to filter by type.

### Shape hierarchy (provided)
- `Shape` — abstract class with `abstract double area()`
- `Circle` — constructor `Circle(double radius)`, area = pi * r^2, has `getRadius()`
- `Rectangle` — constructor `Rectangle(double width, double height)`, area = w * h
- `Triangle` — constructor `Triangle(double base, double height)`, area = 0.5 * b * h

### Methods to implement (static in Solution)

1. **`filterCircles(ArrayList<Shape> shapes)`** — return a new `ArrayList<Circle>` containing only the Circle objects from the input list
2. **`totalCircleArea(ArrayList<Shape> shapes)`** — return the total area of only the Circle objects
3. **`largestCircle(ArrayList<Shape> shapes)`** — return the Circle with the largest radius, or `null` if there are no circles
4. **`describeAll(ArrayList<Shape> shapes)`** — return an `ArrayList<String>` where each entry is:
   - For Circle: `"Circle with radius [r]"` (r formatted to 1 decimal place)
   - For Rectangle: `"Rectangle [w]x[h]"` (both formatted to 1 decimal place)
   - For Triangle: `"Triangle with base [b] and height [h]"` (both formatted to 1 decimal place)

## Examples

```java
ArrayList<Shape> shapes = new ArrayList<>();
shapes.add(new Circle(5));
shapes.add(new Rectangle(3, 4));
shapes.add(new Circle(2));
shapes.add(new Triangle(6, 3));

Solution.filterCircles(shapes);       // [Circle(5), Circle(2)]
Solution.totalCircleArea(shapes);     // ~90.80 (25*pi + 4*pi)
Solution.largestCircle(shapes);       // Circle with radius 5

Solution.describeAll(shapes);
// ["Circle with radius 5.0", "Rectangle 3.0x4.0",
//  "Circle with radius 2.0", "Triangle with base 6.0 and height 3.0"]
```

## Hints

- Use `if (shape instanceof Circle)` to check the type
- Cast with `Circle c = (Circle) shape` after the instanceof check
- For `largestCircle`, track the largest radius seen so far

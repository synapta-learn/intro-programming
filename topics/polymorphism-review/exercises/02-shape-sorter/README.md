# Shape Sorter

## Problem

Create a `Shape` hierarchy where shapes can be sorted by area, then write utility methods that work on mixed collections of shapes.

### Shape (abstract, implements Comparable<Shape>)
- Abstract method `area()` — returns the area as a double
- Abstract method `name()` — returns the shape name (e.g., "Circle", "Rectangle")
- `compareTo(Shape other)` — sort by area **ascending** (smallest first)
- `toString()` — returns `"[name]: area=[area]"` with area formatted to 2 decimal places

### Circle (extends Shape)
- Constructor: `Circle(double radius)`
- `area()` = pi * r^2
- `name()` = `"Circle"`

### Rectangle (extends Shape)
- Constructor: `Rectangle(double width, double height)`
- `area()` = width * height
- `name()` = `"Rectangle"`

### Triangle (extends Shape)
- Constructor: `Triangle(double base, double height)`
- `area()` = 0.5 * base * height
- `name()` = `"Triangle"`

### Utility methods (static in Solution)
- **`Solution.sortByArea(ArrayList<Shape> shapes)`** — sorts the list by area (in place) and returns it
- **`Solution.totalArea(ArrayList<Shape> shapes)`** — returns the total area of all shapes

## Examples

```java
ArrayList<Shape> shapes = new ArrayList<>();
shapes.add(new Rectangle(10, 5));  // area 50
shapes.add(new Circle(3));          // area ~28.27
shapes.add(new Triangle(8, 6));     // area 24

Solution.sortByArea(shapes);
// shapes is now: [Triangle (24), Circle (28.27), Rectangle (50)]

Solution.totalArea(shapes);  // ~102.27
```

## Hints

- `Collections.sort(list)` sorts an ArrayList of Comparable objects
- `Double.compare(this.area(), other.area())` is the cleanest way to implement `compareTo`
